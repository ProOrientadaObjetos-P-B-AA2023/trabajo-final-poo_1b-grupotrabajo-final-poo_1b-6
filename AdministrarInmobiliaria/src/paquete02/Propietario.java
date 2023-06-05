package paquete01;
import java.io.*;
public class Propietario implements Serializable {
    private String nombres;
    private String apellidos;
    private String identificacion;
    public Propietario(String nombres, String apellidos, String identificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("╔══════════════════════════════════╗\n");
        sb.append("║           PROPIETARIO            ║\n");
        sb.append("╠══════════════════════════════════╣\n");
        sb.append("║   Nombres:        "               ).append(nombres).append(getSpaces(19 - nombres.length())).append("\n");
        sb.append("╠══════════════════════════════════╣\n");
        sb.append("║   Apellidos:      "               ).append(apellidos).append(getSpaces(19 - apellidos.length())).append("\n");
        sb.append("╠══════════════════════════════════╣\n");
        sb.append("║   Identificación:  "              ).append(identificacion).append(getSpaces(19 - identificacion.length())).append("\n");
        sb.append("╚══════════════════════════════════╝\n");
        return sb.toString();
    }
    private String getSpaces(int count) {
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < count; i++) {
            spaces.append(" ");
        }
        return spaces.toString();
    }
}