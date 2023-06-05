package Interfaz;
import paquete01.Ejecutor1;
import paquete01.Ejecutor2;
import java.util.Scanner;
public class Interfaz {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        if (!autenticarUsuario()) {
            System.out.println("Autenticación fallida. Saliendo del programa.");
            return;
        }
        //LICEN ANTES DE INGRESAR DEBERA PONER USUARIO Y CONTRASEÑA ESTAN AQUI "ADMIN" Y "12345"
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║                  UTPL                    ║");
        System.out.println("╠══════════════════════════════════════════╣");
        animateText("UTPL Universidad Tecnica Particular de Loja");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println("Cargando opciones...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║                 MENU                     ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║ 1. Desea ingresar datos                  ║");
        System.out.println("║ 2. Desea listar los datos / mostrar      ║");
        System.out.println("║ 3. Salir                                 ║");
        System.out.println("╚══════════════════════════════════════════╝");
        int opcion;
        do {
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("╔══════════════════════════════════════════╗");
                    System.out.println("║   EJECUTANDO OPCION 1 INGRESAR DATOS     ║");
                    System.out.println("╚══════════════════════════════════════════╝");
                    System.out.println("Cargando...");
                    animateLoading();
                    Ejecutor1.main(args);
                    break;
                case 2:
                    System.out.println("╔══════════════════════════════════════════╗");
                    System.out.println("║   EJECUTANDO OPCION 2 LISTAR DATOS       ║");
                    System.out.println("╚══════════════════════════════════════════╝");
                    System.out.println("Cargando...");
                    animateLoading();
                    Ejecutor2.main(args);
                    break;
                case 3:
                    System.out.println("\nSaliendo del programa");
                    break;
                default:
                    System.out.println("\nOpción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
            System.out.print("\nPresione Enter para continuar...");
            scanner.nextLine();
        } while (opcion != 3);
    }
    private static boolean autenticarUsuario() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese su nombre de usuario:");
            String nombreUsuario = scanner.nextLine();
            System.out.println("Ingrese su contraseña:");
            String contraseña = scanner.nextLine();
            if (nombreUsuario.equalsIgnoreCase("Admin") && contraseña.equals("12345")) {
                System.out.println("Autenticación exitosa.");
                return true;
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectas. Vuelva a intentarlo presionando ENTER o ");
                System.out.println("¿Desea Salir presione (S)");
                String opcion = scanner.nextLine();
                if (opcion.equalsIgnoreCase("S")) {
                    return false;
                }
            }
        }
    }
    private static void animateText(String text) {
        for (int i = 0; i < text.length(); i++) {
            try {
                Thread.sleep(100); // Esperar 0.1 segundos
                System.out.print(text.charAt(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
    private static void animateLoading() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(350);
                System.out.print(".");
                Thread.sleep(350);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
