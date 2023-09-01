import pkgPizza.Pizza;
import pkgPizza.Topping;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        Topping jamon = new Topping("Jamón", 12);
        Topping cebolla = new Topping("Cebolla", 15);
        Topping pepperoni = new Topping("Peperoni", 10);
        Topping extraQueso = new Topping("Queso Extra", 5);
        Topping pollo = new Topping("Pollo", 15);
        Topping pina = new Topping("Piña", 10.25);
        Topping salchicha = new Topping("Salchica", 5);
        Topping tocino = new Topping("Tocino", 10.25);
        Topping chileDulce = new Topping("Chile Dulce", 5.75);
        Topping aceituna = new Topping("Aceituna", 7);
        Topping champinones = new Topping("Champiñones", 10);

        String nombreCliente;
        System.out.println("\n*** Bienvenido a Pizzeria ARCHILA'S ***");
        System.out.println("******* INGRESE DATOS PARA LA ORDEN *******");
        System.out.print("\nIngrese el Nombre y Apellido: ");
        nombreCliente = sc.nextLine();

        Pizza pizza = new Pizza(nombreCliente + "\n", 25);
        System.out.println("\nEl precio de la Pizza es: Q." + pizza.precioBase);
        System.out.println("La Pizza Normal contiene MASA, QUESO Y SALSA DE TOMATE.");
        System.out.println("\n*** ELIGE TUS TOPPING ***");
        System.out.println("1. Jamón.");
        System.out.println("2. Cebolla.");
        System.out.println("3. Peperoni.");
        System.out.println("4. Queso Extra.");
        System.out.println("5. Pollo.");
        System.out.println("6. Piña.");
        System.out.println("7. Salchicha.");
        System.out.println("8. Tocino.");
        System.out.println("9. Chile Dulce.");
        System.out.println("10. Aceituna.");
        System.out.println("11. Champiñones.");
        System.out.println("0. CREAR PIZZA");
        System.out.print("Ingrese el numero: ");

        List<Topping> selectedToppings = new ArrayList<>();
        while (true) {
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            } else if (choice >= 1 && choice <= 11) {
                Topping selectedTopping = null;
                switch (choice) {
                    case 1:
                        selectedTopping = jamon;
                        break;
                    case 2:
                        selectedTopping = cebolla;
                        break;
                    case 3:
                        selectedTopping = pepperoni;
                        break;
                    case 4:
                        selectedTopping = extraQueso;
                        break;
                    case 5:
                        selectedTopping = pollo;
                        break;
                    case 6:
                        selectedTopping = pina;
                        break;
                    case 7:
                        selectedTopping = salchicha;
                        break;
                    case 8:
                        selectedTopping = tocino;
                        break;
                    case 9:
                        selectedTopping = chileDulce;
                        break;
                    case 10:
                        selectedTopping = aceituna;
                        break;
                    case 11:
                        selectedTopping = champinones;
                        break;
                }
                selectedToppings.add(selectedTopping);
                System.out.println("\n" + selectedTopping.getName() + " AGREGAD@.");
                System.out.println("\n*** AGREGA OTRO TOPPING ***");
                System.out.println("1. Jamón.");
                System.out.println("2. Cebolla.");
                System.out.println("3. Peperoni.");
                System.out.println("4. Queso Extra.");
                System.out.println("5. Pollo.");
                System.out.println("6. Piña.");
                System.out.println("7. Salchicha.");
                System.out.println("8. Tocino.");
                System.out.println("9. Chile Dulce.");
                System.out.println("10. Aceituna.");
                System.out.println("11. Champiñones.");
                System.out.println("0. CREAR PIZZA");
                System.out.print("Ingrese el numero: ");
            } else {
                System.out.println("\n********* ELECCION INVALIDA *********.");
                System.out.println("**** INGRESE UN TOPPING CORRECTO ****.");
                System.out.println("\n*** AGREGA OTRO TOPPING ***");
                System.out.println("1. Jamón.");
                System.out.println("2. Cebolla.");
                System.out.println("3. Peperoni.");
                System.out.println("4. Queso Extra.");
                System.out.println("5. Pollo.");
                System.out.println("6. Piña.");
                System.out.println("7. Salchicha.");
                System.out.println("8. Tocino.");
                System.out.println("9. Chile Dulce.");
                System.out.println("10. Aceituna.");
                System.out.println("11. Champiñones.");
                System.out.println("0. CREAR PIZZA");
                System.out.print("Ingrese el numero: ");
            }
        }

        pizza.getToppings().addAll(selectedToppings);

        System.out.println("\n*** ESTA ES TU ORDEN ***");
        System.out.println(pizza);

        System.out.print("\nINGRESA TU CANTIDAD DE PAGO: ");
        double paymentAmount = sc.nextDouble();
        double totalPrice = pizza.calculateTotalPrice();

        if (paymentAmount > totalPrice) {
            double change = paymentAmount - totalPrice;
            System.out.println("*** PAGO COMPLETADO ***");
            System.out.println("**** CAMBIO/VUELTO ****");
            System.out.println("     " + change + "     ");
            System.out.println("\n\nPREPARANDO PIZZA...");

            sleep(5000);
            System.out.println("*** TU PIZZA ESTA LISTA ***");
            // LA SIMULACION DE LA CREACION DE LA PIZZA ESTA AQUI.
        }
        else if (paymentAmount == totalPrice)
        {
            double change = paymentAmount - totalPrice;
            System.out.println("*** PAGO COMPLETADO ***");
            System.out.println("\n\nPREPARANDO PIZZA...");

            sleep(5000);
            System.out.println("*** TU PIZZA ESTA LISTA ***");
            // LA SIMULACION DE LA CREACION DE LA PIZZA ESTA AQUI.
        }
        else
        {
            System.out.println("********** PAGO INSUFICIENTE **********");
            System.out.println("*** TU PIZZA NO PUEDE SER PREPARADA ***");
        }
    }
}