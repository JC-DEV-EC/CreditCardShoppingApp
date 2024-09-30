package ui;

import models.CreditCard;
import models.Purchase;
import services.PurchaseService;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    private CreditCard creditCard;
    private PurchaseService purchaseService;

    public MainMenu(double limit) {
        creditCard = new CreditCard(limit);
        purchaseService = new PurchaseService();
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Diseño del menú
            System.out.println("\n===============================");
            System.out.println("       MENÚ DE COMPRAS       ");
            System.out.println("===============================\n");
            System.out.println("1. Realizar Compra");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: \n");
            System.out.println("===============================\n");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer

            if (option == 1) {
                // Reiniciar las variables de descripción y monto
                String description = "";
                double amount = 0.0;

                // Solicitar descripción de la compra
                System.out.println("\n===============================");
                System.out.print("Descripción de la compra: ");
                description = scanner.nextLine(); // Usa nextLine() correctamente

                // Solicitar monto de la compra
                System.out.print("Monto de la compra: ");

                try {
                    amount = scanner.nextDouble();
                    scanner.nextLine(); // Limpia el buffer nuevamente

                    // Verificar si el monto es menor o igual a 0
                    if (amount <= 0) {
                        throw new IllegalArgumentException("Por favor, introduce un número válido para el monto.");
                    }

                    // Verificar si la compra se puede realizar
                    if (creditCard.makePurchase(amount)) {
                        purchaseService.addPurchase(new Purchase(description, amount));
                        System.out.println("\n===============================");
                        System.out.println("Compra realizada exitosamente.");
                        System.out.println("===============================\n");
                    } else {
                        System.out.println("\n===============================");
                        System.out.println("No hay suficiente saldo en la tarjeta.");
                        System.out.println("===============================\n");
                        break; // Detener la aplicación si no hay suficiente saldo
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("\n========================================================");
                    System.out.println(e.getMessage());
                    System.out.println("========================================================\n");
                    continue;
                }
            } else if (option == 2) {
                System.out.println("\n==============================================");
                System.out.println("Saliendo de la aplicación. ¡Gracias por usarla!");
                System.out.println("==============================================\n");
                break; // Salir de la aplicación
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        displaySummary();
    }

    private void displaySummary() {
        System.out.println("\n------------- Resumen de Compras -------------");
        System.out.printf("%-30s %10s%n", "Descripción", "Monto");
        System.out.println("----------------------------------------------");

        // Mostrar cada compra en un formato tabular
        for (Purchase purchase : purchaseService.getSortedPurchases()) {
            System.out.printf("%-30s $%9.2f%n", purchase.getDescription(), purchase.getAmount());
        }

        // Mostrar saldo restante
        System.out.println("----------------------------------------------");
        System.out.printf("%-30s $%9.2f%n", "Saldo restante", creditCard.getBalance());
        System.out.println("==============================================");
    }

    // Método main para ejecutar la aplicación
    public static void main(String[] args) {
        MainMenu menu = new MainMenu(1000.0); // Establece un límite de tarjeta
        menu.displayMenu();
    }
}
