public class Coche {
    String marca;
    String modelo;
    int kms;
    int precio;
    int anyo;

    public Coche(String marca, String modelo, int kms, int precio, int anyo){
        this.marca= marca;
        this.modelo= modelo;
        this.kms = kms;
        this.precio= precio;
        this.anyo= anyo;
    }
    public void aumentarKilometraje(int kilometros){
        kms = kms + kilometros;
    }
    public void Descuento (int descuento){
                precio = precio - precio * descuento / 100;
    }
}
