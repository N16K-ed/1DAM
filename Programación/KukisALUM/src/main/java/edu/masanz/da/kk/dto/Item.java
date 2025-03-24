package edu.masanz.da.kk.dto;

public class Item {
    private String id;
    private String nombre;
    private int precio;

    public Item(String id, String nombre, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Item() {
        this("", "", 0);
    }

    public static Item fromCsv(String csv) {
        String[] partes = csv.split(",");
        return new Item(partes[0], partes[1], Integer.parseInt(partes[2]));
    }

    // region Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    // endregion

    public String toCsv() {
        return id + "," + nombre + "," + precio;
    }

    @Override
    public String toString() {
        return toCsv();
    }

}
