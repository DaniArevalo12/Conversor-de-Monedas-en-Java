package com.conversor;

import com.google.gson.Gson;
import java.util.Scanner;

public class ConversorMonedas {

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        ClienteApi cliente = new ClienteApi();
        Gson gson = new Gson();

        System.out.println("===========================================");
        System.out.println("      💱 CONVERSOR DE MONEDAS JAVA 💱");
        System.out.println("===========================================");

        try {
            System.out.print("Ingrese moneda base (ej: USD, EUR, COP): ");
            String base = scanner.nextLine().toUpperCase();

            // Consumimos la API
            String json = cliente.obtenerDatos(base);
            Moneda datos = gson.fromJson(json, Moneda.class);

            System.out.print("Ingrese moneda destino (ej: COP, MXN, ARS): ");
            String destino = scanner.nextLine().toUpperCase();

            System.out.print("Ingrese cantidad a convertir: ");
            double cantidad = scanner.nextDouble();

            Double tasa = datos.getConversion_rates().get(destino);

            if (tasa != null) {
                double resultado = cantidad * tasa;
                System.out.println("\n===========================================");
                System.out.println("   " + cantidad + " " + base + " = " + resultado + " " + destino);
                System.out.println("===========================================");
            } else {
                System.out.println("⚠️ Moneda destino no encontrada en la lista de tasas.");
            }

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
