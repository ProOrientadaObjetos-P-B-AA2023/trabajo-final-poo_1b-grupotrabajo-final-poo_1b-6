package paquete01;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;
import java.io.*;
import java.util.*;
import static paquete07.Inmobiliaria.*;
public class Ejecutor1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
        List<paquete01.Propietario> propietarios = new ArrayList<>();
        List<Barrio> barrios = new ArrayList<>();
        List<Ciudad> ciudades = new ArrayList<>();
        List<Constructora> constructoras = new ArrayList<>();
        List<Casa> casas = new ArrayList<>();
        List<Departamento> departamentos = new ArrayList<>();
        File propietariosFile = new File(PROPIETARIOS_FILE);
        if (propietariosFile.exists()) {
            propietarios = (List<paquete01.Propietario>) cargarObjetos(PROPIETARIOS_FILE);
        }
        File barriosFile = new File(BARRIOS_FILE);
        if (barriosFile.exists()) {
            barrios = (List<Barrio>) cargarObjetos(BARRIOS_FILE);
        }
        File ciudadesFile = new File(CIUDADES_FILE);
        if (ciudadesFile.exists()) {
            ciudades = (List<Ciudad>) cargarObjetos(CIUDADES_FILE);
        }
        File constructorasFile = new File(CONSTRUCTORAS_FILE);
        if (constructorasFile.exists()) {
            constructoras = (List<Constructora>) cargarObjetos(CONSTRUCTORAS_FILE);
        }
        File casasFile = new File(CASAS_FILE);
        if (casasFile.exists()) {
            casas = (List<Casa>) cargarObjetos(CASAS_FILE);
        }
        File departamentosFile = new File(DEPARTAMENTOS_FILE);
        if (departamentosFile.exists()) {
            departamentos = (List<Departamento>) cargarObjetos(DEPARTAMENTOS_FILE);
        }
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("╭──────────────────────────────────────────╮");
            System.out.println("│                BIENVENIDO                │");
            System.out.println("├──────────────────────────────────────────┤");
            System.out.println("│    1. INGRESAR PROPIETARIO               │");
            System.out.println("│    2. INGRESAR BARRIO                    │");
            System.out.println("│    3. INGRESAR CIUDAD                    │");
            System.out.println("│    4. INGRESAR CONSTRUCTORA              │");
            System.out.println("│    5. INGRESAR CASA                      │");
            System.out.println("│    6. INGRESAR DEPARTAMENTO              │");
            System.out.println("│    7. MENU/INFORMACION                   │");
            System.out.println("│    8. SALIR                              │");
            System.out.println("│                                          │");
            System.out.println("│                                          │");
            System.out.println("╰──────────────────────────────────────────╯");
            System.out.println("SELECCIONE UNA OPCION:  ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    paquete01.Propietario propietario = ingresarPropietario();
                    propietarios.add(propietario);
                    guardarObjetos(propietarios, PROPIETARIOS_FILE);
                    animateOption("Propietario ingresado exitosamente.");
                    break;
                case 2:
                    Barrio barrio = ingresarBarrio();
                    barrios.add(barrio);
                    guardarObjetos(barrios, BARRIOS_FILE);
                    animateOption("Barrio ingresado exitosamente.");
                    break;
                case 3:
                    Ciudad ciudad = ingresarCiudad();
                    ciudades.add(ciudad);
                    guardarObjetos(ciudades, CIUDADES_FILE);
                    animateOption("Ciudad ingresada exitosamente.");
                    break;
                case 4:
                    Constructora constructora = ingresarConstructora();
                    constructoras.add(constructora);
                    guardarObjetos(constructoras, CONSTRUCTORAS_FILE);
                    animateOption("Constructora ingresada exitosamente.");
                    break;
                case 5:
                    Casa casa = ingresarCasa(propietarios, barrios, ciudades, constructoras);
                    casas.add(casa);
                    guardarObjetos(casas, CASAS_FILE);
                    animateOption("Casa ingresada exitosamente.");
                    break;
                case 6:
                    Departamento departamento = ingresarDepartamento(propietarios, barrios, ciudades, constructoras);
                    departamentos.add(departamento);
                    guardarObjetos(departamentos, DEPARTAMENTOS_FILE);
                    animateOption("Departamento ingresado exitosamente.");
                    break;
                case 7:
                    animateOption("Mostrando información...");
                    Ejecutor2.main(args);
                    break;
                case 8:
                    System.out.println("PROGRAMA FINALIZADO...");
                    System.exit(1);
                    break;
                default:
                    animateOption("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
    private static void animateOption(String message) {
        System.out.println();
        System.out.println("Realizando operación...");
        System.out.print(" ");
        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            delay(200);
        }
        System.out.println();
        System.out.println(message);
        System.out.println();
        System.out.print("Presione Enter para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
    private static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
        }
    }
}


