package pkgPizza;

public class Topping {
    private String nombre;
    private double precio;

    public Topping(String Nombre, double Precio) {
        this.nombre = Nombre;
        this.precio = Precio;
    }
    public String getName() {
        return nombre;
    }
    public double getPrice() {
        return precio;
    }
}
