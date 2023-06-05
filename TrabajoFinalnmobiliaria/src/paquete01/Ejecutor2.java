package paquete01;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static paquete07.Inmobiliaria.*;
//import Inmobiliaria.*;
public class Ejecutor2 {
    private static final Scanner scanner = new Scanner(System.in);
    private final List<paquete01.Propietario> propietarios;
    private final List<Barrio> barrios;
    private final List<Ciudad> ciudades;
    private final List<Constructora> constructoras;
    private final List<Casa> casas;
    private final List<Departamento> departamentos;
    public Ejecutor2(List<paquete01.Propietario> propietarios, List<Barrio> barrios, List<Ciudad> ciudades,
                     List<Constructora> constructoras, List<Casa> casas, List<Departamento> departamentos) {
        this.propietarios = propietarios;
        this.barrios = barrios;
        this.ciudades = ciudades;
        this.constructoras = constructoras;
        this.casas = casas;
        this.departamentos = departamentos;
    }
    public static void main(String[] args) throws InterruptedException {
        List<paquete01.Propietario> propietarios = cargarPropietarios();
        List<Barrio> barrios = cargarBarrios();
        List<Ciudad> ciudades = cargarCiudades();
        List<Constructora> constructoras = cargarConstructoras();
        List<Casa> casas = cargarCasas();
        List<Departamento> departamentos = cargarDepartamentos();
        Ejecutor2 menu = new Ejecutor2(propietarios, barrios, ciudades, constructoras, casas, departamentos);
        menu.mostrarMenu(args);
    }
    private static List<paquete01.Propietario> cargarPropietarios() {
        List<paquete01.Propietario> propietarios = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PROPIETARIOS_FILE))) {
            propietarios = (List<paquete01.Propietario>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de propietarios no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de propietarios.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar la clase Propietario.");
        }
        return propietarios;
    }
    private static List<Barrio> cargarBarrios() {
        List<Barrio> barrios = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(BARRIOS_FILE))) {
            barrios = (List<Barrio>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de barrios no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de barrios.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar la clase Barrio.");
        }
        return barrios;
    }
    private static List<Ciudad> cargarCiudades() {
        List<Ciudad> ciudades = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CIUDADES_FILE))) {
            ciudades = (List<Ciudad>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de ciudades no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de ciudades.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar la clase Ciudad.");
        }
        return ciudades;
    }
    private static List<Constructora> cargarConstructoras() {
        List<Constructora> constructoras = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CONSTRUCTORAS_FILE))) {
            constructoras = (List<Constructora>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de constructoras no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de constructoras.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar la clase Constructora.");
        }
        return constructoras;
    }
    private static List<Casa> cargarCasas() {
        List<Casa> casas = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CASAS_FILE))) {
            casas = (List<Casa>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de casas no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de casas.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar la clase Casa.");
        }
        return casas;
    }
    private static List<Departamento> cargarDepartamentos() {
        List<Departamento> departamentos = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DEPARTAMENTOS_FILE))) {
            departamentos = (List<Departamento>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de departamentos no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de departamentos.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar la clase Departamento.");
        }
        return departamentos;
    }
    public void mostrarMenu(String[] args) throws InterruptedException {
        boolean salir = false;
        while (!salir) {
            System.out.println("   /\\");
            System.out.println("  /  \\");
            System.out.println(" /    \\");
            System.out.println("/      \\");
            System.out.println("--------");
            System.out.println("╔══════════════════════════════╗");
            System.out.println("║       MENÚ DE OPCIONES       ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║ 1. Mostrar propietarios      ║");
            System.out.println("║ 2. Mostrar barrios           ║");
            System.out.println("║ 3. Mostrar ciudades          ║");
            System.out.println("║ 4. Mostrar constructoras     ║");
            System.out.println("║ 5. Mostrar casas             ║");
            System.out.println("║ 6. Mostrar departamentos     ║");
            System.out.println("║ 7. Volver al Menú Ingresar   ║");
            System.out.println("║ 0. Salir                     ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    mostrarPropietarios();
                    break;
                case 2:
                    mostrarBarrios();
                    break;
                case 3:
                    mostrarCiudades();
                    break;
                case 4:
                    mostrarConstructoras();
                    break;
                case 5:
                   mostrarInformacionCasa();
                    break;
                case 6:
                    mostrarDepartamentos();
                    break;
                case 7:
                    Ejecutor1.main(args);
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
    }
    private void mostrarPropietarios() {
        boolean autenticado = autenticarUsuario();
        if (autenticado) {
            System.out.println("----- LISTA DE PROPIETARIOS -----");
            for (paquete01.Propietario propietario : propietarios) {
                System.out.println(propietario);
            }
        }
    }
    private void mostrarBarrios() {
        System.out.println("----- LISTA DE BARRIOS -----");
        for (Barrio barrio : barrios) {
            System.out.println(barrio);
        }
    }
    private void mostrarCiudades() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║               LISTA DE CIUDADES               ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        for (Ciudad ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }
    private void mostrarConstructoras() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║              LISTA DE CONSTRUCTORAS           ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        for (Constructora constructora : constructoras) {
            System.out.println(constructora);
        }
    }
    private void mostrarInformacionCasa() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║                LISTA DE CASAS                 ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println("INGRESA EL NUMERO DE IDENTIFICACION DE LA CASA: ");
        String identificacionCasa = scanner.nextLine();
        Casa casaEncontrada = buscarCasa(identificacionCasa);
        if (casaEncontrada != null) {
            paquete01.Propietario propietarioEncontrado = buscarPropietario(casaEncontrada.getPropietario().getIdentificacion());
            Barrio barrioEncontrado = buscarBarrio(casaEncontrada.getBarrio().getNombre());
            Ciudad ciudadEncontrada = buscarCiudad(casaEncontrada.getCiudad().getNombre());
            Constructora constructoraEncontrada = buscarConstructora(casaEncontrada.GetIdEmpresa());
            if (propietarioEncontrado != null && barrioEncontrado != null && ciudadEncontrada != null && constructoraEncontrada != null) {
                System.out.println("╔════════════════════════════════════════╗");
                System.out.println("║           INFORMACION DE CASA          ║");
                System.out.println("╠════════════════════════════════════════╣");
                System.out.println("║ Propietario: "                         + propietarioEncontrado.getIdentificacion());
                System.out.println("╠════════════════════════════════════════╣");
                System.out.println("║ Nombres: "                              + propietarioEncontrado.getNombres());
                System.out.println("╠════════════════════════════════════════╣");
                System.out.println("║ Apellidos: "                            + propietarioEncontrado.getApellidos());
                System.out.println("╠════════════════════════════════════════╣");
                System.out.println("║ Barrio: "                              + barrioEncontrado.getNombre());
                System.out.println("╠════════════════════════════════════════╣");
                System.out.println("║ Ciudad: "                              + ciudadEncontrada.getNombre());
                System.out.println("╠════════════════════════════════════════╣");
                System.out.println("║ El precio del Metro Cudrado: "         + casaEncontrada.getPrecioMetroCuadrado());
                System.out.println("╠════════════════════════════════════════╣");
                System.out.println("║ Numero de Metros: "                    + casaEncontrada.getMetrosCuadrados());
                System.out.println("╠════════════════════════════════════════╣");
                System.out.println("║ Numero de Cuartos: "                   + casaEncontrada.getNumeroCuartos());
                System.out.println("╠════════════════════════════════════════╣");
                System.out.println("║ Nombre de la Constructora: "           + constructoraEncontrada.getNombre());
                System.out.println("╠════════════════════════════════════════╣");
                System.out.println("║ Constructora: "                        + constructoraEncontrada.getIdEmpresa());
                System.out.println("╠════════════════════════════════════════╣");
                System.out.println("║ Costo Final: $"                        + casaEncontrada.getCalcularCostoFinal());
                System.out.println("╚════════════════════════════════════════╝");
            } else {
                System.out.println("No se encontró la información necesaria para la casa.");
            }
        } else {
            System.out.println("La casa no está registrada.");
        }
    }
    private void mostrarDepartamentos() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║            LISTA DE DEPARTAMENTOS             ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        for (Departamento departamento : departamentos) {
            System.out.println("INGRESA EL NUMERO DE IDENTIFICACION DEL DEPARTAMENTO  \n");
            System.out.println("Ingrese el número de identificación del propietario:");
            String ideDepartamento = scanner.nextLine();
            Departamento departamentoEncontrado =buscarDepartamento(ideDepartamento);
            if ( departamentoEncontrado!= null) {
                paquete01.Propietario propietarioEncontrado = buscarPropietario(departamentoEncontrado.getPropietario().getIdentificacion());
                Barrio barrioEncontrado = buscarBarrio(departamentoEncontrado.getBarrio().getNombre());
                Ciudad ciudadEncontrada = buscarCiudad(departamentoEncontrado.getCiudad().getNombre());
                Constructora constructoraEncontrada = buscarConstructora(departamentoEncontrado.getConstructora().getIdEmpresa());
                if (propietarioEncontrado != null && barrioEncontrado != null && ciudadEncontrada != null && constructoraEncontrada != null) {
                    System.out.println("╔══════════════════════════════════════════════════════╗");
                    System.out.println("║             INFORMACION DEL DEPARTAMENTO             ║");
                    System.out.println("╠══════════════════════════════════════════════════════╣");
                    System.out.println("║                                                      ║");
                    System.out.println("║   ┌────────────────────────────────────────────┐     ║");
                    System.out.println("║   │                                            │     ║");
                    System.out.println("║   │Propietario: "                                     +propietarioEncontrado.getIdentificacion());
                    System.out.println("║   ┌────────────────────────────────────────────┐     ║");
                    System.out.println("║   │Nombres:  "                                        + propietarioEncontrado.getNombres());
                    System.out.println("║   ┌────────────────────────────────────────────┐     ║");
                    System.out.println("║   │Apellidos: "                                       + propietarioEncontrado.getApellidos());
                    System.out.println("║   ┌────────────────────────────────────────────┐     ║");
                    System.out.println("║   │Barrio: "                                          + barrioEncontrado.getNombre());
                    System.out.println("║   ┌────────────────────────────────────────────┐     ║");
                    System.out.println("║   │Ciudad: "                                          + ciudadEncontrada.getNombre());
                    System.out.println("║   ┌────────────────────────────────────────────┐     ║");
                    System.out.println("║   │Nombre de la Constructora : "                      +constructoraEncontrada.getNombre());
                    System.out.println("║   ┌────────────────────────────────────────────┐     ║");
                    System.out.println("║   │Constructora: "                                    + constructoraEncontrada.getIdEmpresa());
                    System.out.println("║   ┌────────────────────────────────────────────┐     ║");
                    System.out.println("║   │Numero de Metros Cuadrados: "                      +departamentoEncontrado.getMetrosCuadrados());
                    System.out.println("║   │Valor Mensual: "                                   +departamentoEncontrado.getValorAlicuotaMensual());
                    System.out.println("║   │Nombre Del Edificio: "                             +departamentoEncontrado.getNombreEdificio());
                    System.out.println("║   │Ubicacion del departamento: "                      +departamentoEncontrado.getUbicacionDepartamento());
                    System.out.println("║   │Costo Final:  "                                    +departamentoEncontrado.getCalcularCostoDepartamento());
                    System.out.println("║   │                                            │     ║");
                    System.out.println("║   └────────────────────────────────────────────┘     ║");
                    System.out.println("║                                                      ║");
                    System.out.println("║                  Inmobiliaria UTPL                   ║");
                    System.out.println("║                                                      ║");
                    System.out.println("╚══════════════════════════════════════════════════════╝");
                } else {
                    System.out.println("No se encontró la información necesaria para el departamento.");
                }
            } else {
                System.out.println("el departamento no está registrada.");
            }
        }
    }
    private Casa buscarCasa(String identificacionCasa) {
        for (Casa casa : casas) {
            if (casa.getPropietario().getIdentificacion().equals(identificacionCasa)) {
                return casa;
            }
        }
        return null;
    }
    private Departamento buscarDepartamento(String identificacionDepartamento) {
        for (Departamento departamento: departamentos) {
            if (departamento.getPropietario().getIdentificacion().equals(identificacionDepartamento)) {
                return departamento;
            }
        }
        return null;
    }
    private paquete01.Propietario buscarPropietario(String identificacion) {
        for (paquete01.Propietario propietario : propietarios) {
            if (propietario.getIdentificacion().equals(identificacion)) {
                return propietario;
            }
        }
        return null;
    }
    private Barrio buscarBarrio(String nombreBarrio) {
        for (Barrio barrio : barrios) {
            if (barrio.getNombre().equals(nombreBarrio)) {
                return barrio;
            }
        }
        return null;
    }
    private Ciudad buscarCiudad(String nombreCiudad) {
        for (Ciudad ciudad : ciudades) {
            if (ciudad.getNombre().equals(nombreCiudad)) {
                return ciudad;
            }
        }
        return null;
    }
    private Constructora buscarConstructora(String idConstructora) {
        for (Constructora constructora : constructoras) {
            if (constructora.getIdEmpresa().equals(idConstructora)) {
                return constructora;
            }
        }
        return null;
    }
    private static boolean autenticarUsuario() {
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
}