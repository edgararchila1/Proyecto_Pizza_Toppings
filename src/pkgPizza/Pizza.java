package pkgPizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nombre;
    public double precioBase;
    private List<Topping> toppings = new ArrayList<>();

    // Constructor
    public Pizza(String Nombre, double PrecioBase) {
        this.nombre = Nombre;
        this.precioBase = PrecioBase;
        for (Topping to : toppings) {
            this.toppings.add(to);
        }
    }
    public double calculateTotalPrice() {
        double totalPrice = precioBase;
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }
    @Override
    public String toString() {
        return "Pizza a nombre de: " + nombre + "Total a Cancelar: " + calculateTotalPrice();
    }

    public <A> List<A> getToppings() {
        return (List<A>) toppings;
    }
}
