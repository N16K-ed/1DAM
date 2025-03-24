
package edu.masanz.da.kk.dao;

import java.util.*;
import edu.masanz.da.kk.dto.*;
import edu.masanz.da.kk.utils.Security;

import static edu.masanz.da.kk.conf.Ini.*;

/**
 *
 * @author Francisco Javier San Nicolás
 */
public class Dao {

    // region Colecciones que simulan la base de datos
    private static Map<String, Usuario> mapaUsuarios = new HashMap<>();;
    private static Map<String, Kuki> mapaKukis = new HashMap<>();
    private static Map<String, Item> mapaItems = new HashMap<>();
    private static Map<String, Map<String, Object>> mapaSesiones = new HashMap<>();;
    // endregion

    // region Inicialización de las colecciones con ini()
    public static void ini() {
        iniMapaUsuarios();
        iniMapaKukis();
        iniMapaItems();
        iniMapaSesiones();
    }

    private static void iniMapaUsuarios() {
        for (String txt : USUARIOS) {
            String[] campos = txt.split(",");
            Usuario usuario = new Usuario(
                    campos[0],
                    campos[1],
                    campos[2],
                    campos[3].equals("null")?null:campos[3]
            );
            mapaUsuarios.put(campos[0], usuario);
        }
    }

    private static void iniMapaKukis() {
        for (String txt : KUKIS) {
            String[] campos = txt.split(",");
            Kuki kuki = new Kuki(
                    campos[0],
                    Long.parseLong(campos[1]),
                    Long.parseLong(campos[2])
            );
            mapaKukis.put(campos[0], kuki);
        }
    }

    private static void iniMapaItems() {
        for (String txt : ITEMS) {
            String[] campos = txt.split(",");
            Item item = new Item(
                    campos[0],
                    campos[1],
                    Integer.parseInt(campos[2])
            );
            mapaItems.put(item.getId(), item);
        }
    }


    private static void iniMapaSesiones() {
        // NO HAY QUE HACER NADA AQUÍ
    }
    // endregion


    public static String obtenerIdSesionUsuario(String idUsuario) {
        // TODO 1. obtenerIdSesionUsuario
        Set<String> idUsuariosKeys = mapaUsuarios.keySet();
        Usuario aIdentificar = null;
        for(String ids : idUsuariosKeys){
            if (ids.equalsIgnoreCase(idUsuario)){
                aIdentificar = mapaUsuarios.get(ids);
            }
        }
        if (aIdentificar == null){
            System.out.println("Usuario no encontrado");
            return null;
        }
        System.out.println("Id de sesión de " + aIdentificar.getNombre() + ": " + aIdentificar.getIdSesion());
        return aIdentificar.getIdSesion();
    }

    public static String crearKukiSesionUsuario(String idUsuario) {
        // TODO 2. crearKukiSesionUsuario
        Set<String> idUsuariosKeys = mapaUsuarios.keySet();
        Usuario aManipular = null;
        for(String ids : idUsuariosKeys){
            if (ids.equalsIgnoreCase(idUsuario)){
                aManipular = mapaUsuarios.get(ids);
            }
        }
        if (aManipular == null){
            System.out.println("Usuario no encontrado");
            return null;
        }

        String nuevaSesion = Security.generateRandomId();

        System.out.println("La nueva kuki: " + nuevaSesion);

        aManipular.setIdSesion(nuevaSesion);

        Kuki newKuki = new Kuki(nuevaSesion, System.currentTimeMillis(),432000000 ); //sin fecha ni tiempo de vida;
        mapaKukis.put(nuevaSesion, newKuki);


        Map<String, Object> nuevaSesionUsuario = new HashMap<>();
        nuevaSesionUsuario.put("quiereSugerencias",true);
        nuevaSesionUsuario.put("idUsuario",idUsuario);
        nuevaSesionUsuario.put("nombreUsuario", aManipular.getNombre());
        mapaSesiones.put(nuevaSesion, nuevaSesionUsuario);


        return nuevaSesion;
    }

    public static int eliminarInfoCaducada() {
        // TODO 3. eliminarInfoCaducada
        Set<String> keys = mapaKukis.keySet();
        int contador = 0;
        long ahora = System.currentTimeMillis();
        for(String idKuki : keys){
            if(mapaKukis.get(idKuki).getFecha() + mapaKukis.get(idKuki).getVida() > ahora){ //Elimina la kuki
                mapaKukis.remove(idKuki);
                for(String idUser : mapaUsuarios.keySet()){ //Elimina la sesion del usuario y lo hace si la kuki no es huerfana
                    if (mapaUsuarios.get(idUser).getIdSesion().equals(idKuki)){
                        mapaUsuarios.get(idUser).setIdSesion(null);
                        contador++; //cuenta las eliminadas
                    }
                }
            }
        }
        return contador;
    }

    public static List<String> obtenerIdsNombresItems() {
        // TODO 4.1 obtenerIdsNombresItems
        List<String> lista = new ArrayList<>();
        String linea;
        for(String iditem : mapaItems.keySet()){
            linea = iditem + " - " +  mapaItems.get(iditem).getNombre();
            lista.add(linea);
        }
        Collections.sort(lista);

        return lista;
    }

    public static boolean filtrarListadoIdNombres(List<String> listado, String filtro) {
        // TODO 4.2 filtrarListadoIdNombres
        boolean quitar = false;

        for (Iterator<String> it = listado.iterator(); it.hasNext(); ) {
            String s = it.next();
            if (!s.contains(filtro)) {
                it.remove();
                quitar = true;
            }
        }
        return quitar;
    }

    public static boolean meterItemInteresesUsuario(String idSesion, String idItem) {
        // TODO 5. meterItemInteresesUsuario
        for(String id : mapaSesiones.keySet()){
            if(id.equals(idSesion)){
                Item aAnadir = mapaItems.get(idItem);
                List<String> intereses = new ArrayList<>();
                intereses.add(aAnadir.toString());
                mapaSesiones.get(idSesion).put("intereses", intereses);
                return true;
            }
        }


        //Siempre devuleve false creo que comprueba mal la sesion
        return false;
    }

    public static List<String> obtenerItemsInteresantes() {
        // TODO 6. obtenerItemsInteresantes


        // mapaSesiones.get(todas las keys con un for).get("intereses").toString();
        //Tiempo
        return null; //el string resultante
    }

    public static List<String> obtenerItemsNoInteresantes() {
        // TODO 7. obtenerItemsNoInteresantes

        //Tiempo
        return null;
    }

}
