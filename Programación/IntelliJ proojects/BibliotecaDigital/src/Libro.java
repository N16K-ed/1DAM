public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int paginasLeidas;
    private boolean disponibleEnEbook;
    private final int precioFisico = 20;
    private final int precioEbook = 10;

    public Libro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        paginasLeidas = 0;
        disponibleEnEbook = false;
    }

    public int getPrecioEbook() {
        return precioEbook;
    }

    public int getPrecioFisico() {
        return precioFisico;
    }

    public boolean getDisponibleEnEbook() {
        return disponibleEnEbook;
    }

    public int getPaginasLeidas() {
        return paginasLeidas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setPaginasLeidas(int paginasLeidas) {
        if((paginasLeidas >= 0) && paginasLeidas <= numeroPaginas) {
            this.paginasLeidas = paginasLeidas;
        } else {
            System.out.println("Tu eres tonto.");
        }
    }

    public void setDisponibleEnEbook(boolean disponibleEnEbook) {
        this.disponibleEnEbook = disponibleEnEbook;
    }

    public int calcularProgresolectura() {
        int porcentaje;
        porcentaje = (paginasLeidas * 100) / numeroPaginas;
        return porcentaje;
    }
    
    public String mostrarEstadoLectura() {
        if (calcularProgresolectura()< 25) {
            String progreso1;
            progreso1 = "¡Estás comenzando el libro, ¡sigue leyendo!";
            return progreso1;
        } else if ((calcularProgresolectura() >= 25) && (calcularProgresolectura() < 75)) {
            String progreso2;
            progreso2 = "Vas a buen ritmo, ¡sigue así!";
            return progreso2;
        } else if ((calcularProgresolectura() >= 75) && (calcularProgresolectura() <100)) {
            String progreso3;
            progreso3 = "Casi terminas el libro, ¡no te rindas!";
            return progreso3;
        } else if (calcularProgresolectura() == 100) {
            String progreso4;
            progreso4 = "Has completado el libro.";
            return progreso4;
        } else {
            return "Error";
        }
    }

    public int calcularPrecioTotal() {
        if (disponibleEnEbook) {
            return precioEbook;
        } else {
            return precioFisico;
        }
    }

    public void anyadirPaginasLeidas (int paginas){
        if ((paginasLeidas + paginas) <= numeroPaginas){
            paginasLeidas = paginasLeidas + paginas;
        } else if (paginasLeidas + paginas < paginasLeidas){
            System.out.println("Error. Introduce un número de páginas positivo.");
        } else if (paginasLeidas + paginas > numeroPaginas){
            paginasLeidas = numeroPaginas;
            //setPaginasLeidas(getNumeroPaginas()); es lo mismo
        }
    }
        
}
