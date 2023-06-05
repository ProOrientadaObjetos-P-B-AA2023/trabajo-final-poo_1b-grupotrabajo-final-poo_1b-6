package paquete07;
import paquete01.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;
import java.io.*;
import java.util.*;
public class Inmobiliaria {
    public static final String PROPIETARIOS_FILE = "C:\\intellij\\BetyPOOOOOOO\\src\\paquete07\\data\\propietarios.dat";
    public static final String BARRIOS_FILE = "C:\\intellij\\BetyPOOOOOOO\\src\\paquete07\\data\\barrios.dat";
    public static final String CIUDADES_FILE = "C:\\intellij\\BetyPOOOOOOO\\src\\paquete07\\data\\ciudades.dat";
    public static final String CONSTRUCTORAS_FILE = "C:\\intellij\\BetyPOOOOOOO\\src\\paquete07\\data\\constructoras.dat";
    public static final String CASAS_FILE = "C:\\intellij\\BetyPOOOOOOO\\src\\paquete07\\data\\casas.dat";
    public static final String DEPARTAMENTOS_FILE = "C:\\intellij\\BetyPOOOOOOO\\src\\paquete07\\data\\departamentos.dat";
    private static Scanner scanner = new Scanner(System.in);
    public static Propietario ingresarPropietario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngresar datos del propietario:");
        System.out.print("Nombres: ");
        String nombres = null;
        boolean nombresValidos = false;
        while (!nombresValidos) {
            nombres = scanner.nextLine();
            if (nombres.matches("[a-zA-Z ]+")) {
                nombresValidos = true;
            } else {
                System.out.println("Error: los nombres deben contener solo letras y espacios.");
                System.out.print("Vuelve a ingresar los nombres: ");
            }
        }
        System.out.print("Apellidos: ");
        String apellidos = null;
        boolean apellidosValidos = false;
        while (!apellidosValidos) {
            apellidos = scanner.nextLine();
            if (apellidos.matches("[a-zA-Z ]+")) {
                apellidosValidos = true;
            } else {
                System.out.println("Error: los apellidos deben contener solo letras y espacios.");
                System.out.print("Vuelve a ingresar los apellidos: ");
            }
        }
        System.out.print("Identificación: ");
        String identificacion = scanner.nextLine();
        System.out.print("DESEAS SALIR O CORREGIR LA INFORMACION(1/CORREGIR)PRESIONA ENTER PARA SALIR: ");
        String opcionIdentificacion = scanner.nextLine();
        if (opcionIdentificacion.equalsIgnoreCase("1")) {
            System.out.println("\n");
            System.out.println("PRESIONA ENTER \n");
            String opcionIdentificacion2 = scanner.nextLine();
            return ingresarPropietario();
        } else if (opcionIdentificacion.equalsIgnoreCase("salir")) {
        }
        return new Propietario(nombres, apellidos, identificacion);
    }
    public static Barrio ingresarBarrio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngresar datos del barrio:");
        System.out.print("Nombre: ");
        String nombre = null;
        boolean nombreValido = false;
        while (!nombreValido) {
            nombre = scanner.nextLine();
            if (nombre.matches("[a-zA-Z ]+")) {
                nombreValido = true;
            } else {
                System.out.println("Error: el nombre debe contener solo letras y espacios.");
                System.out.print("Vuelve a ingresar el nombre: ");
            }
        }
        System.out.print("Referencia: ");
        String referencia = null;
        boolean referenciaValida = false;
        while (!referenciaValida) {
            referencia = scanner.nextLine();
            if (referencia.matches("[a-zA-Z ]+")) {
                referenciaValida = true;
            } else {
                System.out.println("Error: la referencia debe contener solo letras y espacios.");
                System.out.print("Vuelve a ingresar la referencia: ");
            }
        }
        return new Barrio(nombre, referencia);
    }
    public static Ciudad ingresarCiudad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngresar datos de la ciudad:");
        System.out.print("Nombre: ");
        String nombre = null;
        boolean nombreValido = false;
        while (!nombreValido) {
            nombre = scanner.nextLine();
            if (nombre.matches("[a-zA-Z ]+")) {
                nombreValido = true;
            } else {
                System.out.println("Error: el nombre debe contener solo letras y espacios.");
                System.out.print("Vuelve a ingresar el nombre: ");
            }
        }
        System.out.print("Provincia: ");
        String provincia = null;
        boolean provinciaValida = false;
        while (!provinciaValida) {
            provincia = scanner.nextLine();
            if (provincia.matches("[a-zA-Z ]+")) {
                provinciaValida = true;
            } else {
                System.out.println("Error: la provincia debe contener solo letras y espacios.");
                System.out.print("Vuelve a ingresar la provincia: ");
            }
        }
        return new Ciudad(nombre, provincia);
    }
    public static Constructora ingresarConstructora() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngresar datos de la constructora:");
        String nombre = validarCampo("Nombre: ", "[a-zA-Z ]+", "Error: El nombre debe contener solo letras y espacios.", scanner);
        System.out.print("ID de la empresa: ");
        String idEmpresa = scanner.nextLine();
        return new Constructora(nombre, idEmpresa);
    }
    private static String validarCampo(String mensaje, String patron, String mensajeError, Scanner scanner) {
        String campo = null;
        boolean campoValido = false;
        while (!campoValido) {
            System.out.print(mensaje);
            campo = scanner.nextLine();
            if (campo.matches(patron)) {
                campoValido = true; // El campo es válido
            } else {
                System.out.println(mensajeError);
            }
        }
        return campo;
    }
    private static boolean autenticarUsuario(Scanner scanner) {
        while (true) {
            System.out.println("Ingrese su nombre de usuario:");
            String nombreUsuario = scanner.nextLine();
            System.out.println("Ingrese su contraseña:");
            String contraseña = scanner.nextLine();
            if (nombreUsuario.equalsIgnoreCase("Llilet") && contraseña.equals("1104301062")) {
                System.out.println("Autenticación exitosa.");
                return true;
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectas. Vuelva a intentarlo o ");
                System.out.println("¿Desea volver al menú anterior? (S/N)");
                String opcion = scanner.nextLine();
                if (opcion.equalsIgnoreCase("S")) {
                    return false;
                }
            }
        }
    }
    public static Casa ingresarCasa(List<Propietario> propietarios,
                                    List<Barrio> barrios, List<Ciudad> ciudades,
                                    List<Constructora> constructoras) {
        Scanner scanner = new Scanner(System.in);
        boolean autenticado = autenticarUsuario(scanner);
        if (!autenticado) {
            return null;
        }
        System.out.println("\nIngresar datos de la casa:");
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║                                          ║");
        System.out.println("║      BIENVENIDO AL SISTEMA DE CASAS      ║");
        System.out.println("║             INMOBILIARIO                 ║");
        System.out.println("║                                          ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║                                          ║");
        System.out.println("║    Seleccione una opción:                ║");
        System.out.println("║                                          ║");
        System.out.println("║    1. Registrar casa con información     ║");
        System.out.println("║       actual                             ║");
        System.out.println("║                                          ║");
        System.out.println("║    2. Registrar casa con información     ║");
        System.out.println("║       anterior                           ║");
        System.out.println("║                                          ║");
        System.out.println("╚══════════════════════════════════════════╝");
        int opcion = validarEntero("Ingrese la opción deseada: ", scanner);
        if (opcion == 1) {
            System.out.println("Registrar casa con información actual:");
            Propietario propietario = propietarios.get(propietarios.size() - 1);
            double precioMetroCuadrado = validarNumero("Precio por metro cuadrado: ", scanner);
            double metrosCuadrados = validarNumero("Número de metros cuadrados: ", scanner);
            Barrio barrio = barrios.get(barrios.size() - 1);
            Ciudad ciudad = ciudades.get(ciudades.size() - 1);
            int numeroCuartos = validarEntero("Número de cuartos: ", scanner);
            Constructora constructora = constructoras.get(constructoras.size() - 1);
            return new Casa(propietario, precioMetroCuadrado, metrosCuadrados, barrio, ciudad, numeroCuartos, constructora);
        } else if (opcion == 2) {
            System.out.println("Registrar casa con información anterior:");
            System.out.println("Seleccione el propietario:");
            for (int i = 0; i < propietarios.size(); i++) {
                Propietario propietario = propietarios.get(i);
                System.out.println((i + 1) + ". " + propietario.getNombres());
            }
            int propietarioIndex = validarEntero("Ingrese el número de propietario: ", scanner);
            Propietario propietario = propietarios.get(propietarioIndex - 1);
            double precioMetroCuadrado = validarNumero("Precio por metro cuadrado: ", scanner);
            double metrosCuadrados = validarNumero("Número de metros cuadrados: ", scanner);
            System.out.println("Seleccione el barrio:");
            for (int i = 0; i < barrios.size(); i++) {
                Barrio barrio = barrios.get(i);
                System.out.println((i + 1) + ". " + barrio.getNombre());
            }
            int barrioIndex = validarEntero("Ingrese el número de barrio: ", scanner);
            Barrio barrio = barrios.get(barrioIndex - 1);
            System.out.println("Seleccione la ciudad:");
            for (int i = 0; i < ciudades.size(); i++) {
                Ciudad ciudad = ciudades.get(i);
                System.out.println((i + 1) + ". " + ciudad.getNombre());
            }
            int ciudadIndex = validarEntero("Ingrese el número de ciudad: ", scanner);
            Ciudad ciudad = ciudades.get(ciudadIndex - 1);
            int numeroCuartos = validarEntero("Número de cuartos: ", scanner);
            System.out.println("Seleccione la constructora:");
            for (int i = 0; i < constructoras.size(); i++) {
                Constructora constructora = constructoras.get(i);
                System.out.println((i + 1) + ". " + constructora.getIdEmpresa());
            }
            int constructoraIndex = validarEntero("Ingrese el número de constructora: ", scanner);
            Constructora constructora = constructoras.get(constructoraIndex - 1);
            return new Casa(propietario, precioMetroCuadrado, metrosCuadrados, barrio, ciudad, numeroCuartos, constructora);
        } else {
            System.out.println("Opción inválida");
            return null;
        }
    }
    private static double validarNumero(String mensaje, Scanner scanner) {
        double numero = 0.0;
        boolean numeroValido = false;
        while (!numeroValido) {
            System.out.print(mensaje);
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                scanner.nextLine(); // Consumir nueva línea
                numeroValido = true;
            } else {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine();
            }
        }
        return numero;
    }
    private static int validarEntero(String mensaje, Scanner scanner) {
        int numero = 0;
        boolean numeroValido = false;
        while (!numeroValido) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                scanner.nextLine(); // Consumir nueva línea
                numeroValido = true;
            } else {
                System.out.println("Error: Ingrese un número entero válido.");
                scanner.nextLine();
            }
        }
        return numero;
    }
    public static Departamento ingresarDepartamento(List<Propietario> propietarios,
                                                    List<Barrio> barrios, List<Ciudad> ciudades,
                                                    List<Constructora> constructoras) {
        Scanner scanner = new Scanner(System.in);
        boolean autenticado = autenticarUsuario(scanner);
        if (!autenticado) {
            return null;
        }
        System.out.println("\nIngresar datos de la casa:");
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║                                          ║");
        System.out.println("║   BIENVENIDO AL SISTEMA DEPARTAMENTO     ║");
        System.out.println("║             INMOBILIARIO                 ║");
        System.out.println("║                                          ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║                                          ║");
        System.out.println("║    Seleccione una opción:                ║");
        System.out.println("║                                          ║");
        System.out.println("║ 1. Registrar Departamento con información║");
        System.out.println("║     actual                               ║");
        System.out.println("║                                          ║");
        System.out.println("║ 2. Registrar Departamento con información║");
        System.out.println("║     anterior                             ║");
        System.out.println("║                                          ║");
        System.out.println("╚══════════════════════════════════════════╝");
        int opcion = validarEntero1("Ingrese una opción: ", scanner);
        if (opcion == 1) {
            System.out.println("Registrar departamento con información actual:");
            Propietario propietario = propietarios.get(propietarios.size() - 1);
            double precioMetroCuadrado = validarNumero1("Precio por metro cuadrado: ", scanner);
            double metrosCuadrados = validarNumero1("Número de metros cuadrados: ", scanner);
            double valorAlicuotaMensual = validarNumero1("Valor de la alícuota mensual: ", scanner);
            Barrio barrio = barrios.get(barrios.size() - 1);
            Ciudad ciudad = ciudades.get(ciudades.size() - 1);
            String nombreEdificio = validarTexto("Nombre del edificio: ", scanner);
            String ubicacionDepartamento = validarTexto("Ubicación del departamento en el edificio: ", scanner);
            Constructora constructora = constructoras.get(constructoras.size() - 1);
            return new Departamento(propietario, precioMetroCuadrado, metrosCuadrados, valorAlicuotaMensual, barrio, ciudad, nombreEdificio, ubicacionDepartamento, constructora);
        } else if (opcion == 2) {
            System.out.println("Registrar departamento con información anterior:");
            System.out.println("Seleccione el propietario:");
            for (int i = 0; i < propietarios.size(); i++) {
                Propietario propietario = propietarios.get(i);
                System.out.println((i + 1) + ". " + propietario.getNombres());
            }
            int propietarioIndex = validarEntero1("Ingrese el número de propietario: ", scanner);
            Propietario propietario = propietarios.get(propietarioIndex - 1);
            double precioMetroCuadrado = validarNumero1("Precio por metro cuadrado: ", scanner);
            double metrosCuadrados = validarNumero1("Número de metros cuadrados: ", scanner);
            double valorAlicuotaMensual = validarNumero1("Valor de la alícuota mensual: ", scanner);
            System.out.println("Seleccione el barrio:");
            for (int i = 0; i < barrios.size(); i++) {
                Barrio barrio = barrios.get(i);
                System.out.println((i + 1) + ". " + barrio.getNombre());
            }
            int barrioIndex = validarEntero1("Ingrese el número de barrio: ", scanner);
            Barrio barrio = barrios.get(barrioIndex - 1);
            System.out.println("Seleccione la ciudad:");
            for (int i = 0; i < ciudades.size(); i++) {
                Ciudad ciudad = ciudades.get(i);
                System.out.println((i + 1) + ". " + ciudad.getNombre());
            }
            int ciudadIndex = validarEntero1("Ingrese el número de ciudad: ", scanner);
            Ciudad ciudad = ciudades.get(ciudadIndex - 1);
            String nombreEdificio = validarTexto("Nombre del edificio: ", scanner);
            String ubicacionDepartamento = validarTexto("Ubicación del departamento en el edificio: ", scanner);
            System.out.println("Seleccione la constructora:");
            for (int i = 0; i < constructoras.size(); i++) {
                Constructora constructora = constructoras.get(i);
                System.out.println((i + 1) + ". " + constructora.getIdEmpresa());
            }
            int constructoraIndex = validarEntero1("Ingrese el número de constructora: ", scanner);
            Constructora constructora = constructoras.get(constructoraIndex - 1);
            return new Departamento(propietario, precioMetroCuadrado, metrosCuadrados, valorAlicuotaMensual, barrio, ciudad, nombreEdificio, ubicacionDepartamento, constructora);
        } else {
            System.out.println("Opción inválida. No se pudo registrar el departamento.");
            return null;
        }
    }
    private static String validarTexto(String mensaje, Scanner scanner) {
        String texto = "";
        boolean textoValido = false;
        while (!textoValido) {
            System.out.print(mensaje);
            texto = scanner.nextLine();
            if (texto.matches("^[a-zA-Z ]+$")) {
                textoValido = true;
            } else {
                System.out.println("Error: Ingrese un texto válido.");
            }
        }
        return texto;
    }
    private static double validarNumero1(String mensaje, Scanner scanner) {
        double numero = 0.0;
        boolean numeroValido = false;
        while (!numeroValido) {
            System.out.print(mensaje);
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                scanner.nextLine();
                numeroValido = true;
            } else {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine();
            }
        }
        return numero;
    }
    private static int validarEntero1(String mensaje, Scanner scanner) {
        int numero = 0;
        boolean numeroValido = false;
        while (!numeroValido) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                scanner.nextLine(); // Consumir nueva línea
                numeroValido = true;
            } else {
                System.out.println("Error: Ingrese un número entero válido.");
                scanner.nextLine();
            }
        }
        return numero;
    }
    public static void guardarObjetos(List<?> objetos, String fileName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DATOS INGRESADOS¿Desea guardarlos(1/Si o 2/No?");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("1")) {
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
                objectOutputStream.writeObject(objetos);
                objectOutputStream.close();
                System.out.println("Los datos se han guardado correctamente en el archivo " + fileName);
            } catch (IOException e) {
                System.out.println("Error al guardar los datos en el archivo " + fileName);
                e.printStackTrace();
            }
        } else {
            System.out.println("No se guardarán los objetos en el archivo.");
        }
    }
    public static List<?> cargarObjetos(String fileName) {
        List<?> objetos = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            objetos = (List<?>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos desde el archivo " + fileName);
            e.printStackTrace();
        }
        return objetos;
    }
}