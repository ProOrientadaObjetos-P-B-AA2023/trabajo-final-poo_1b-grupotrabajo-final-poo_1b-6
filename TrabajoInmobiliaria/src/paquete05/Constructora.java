package paquete05;
import java.io.Serializable;
public class Constructora implements Serializable {
    private String nombre;
    private String idEmpresa;
    public Constructora(String nombre, String idEmpresa) {
        this.nombre = nombre;
        this.idEmpresa = idEmpresa;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdEmpresa() {
        return idEmpresa;
    }
    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("╔═══════════════════════════════════════╗\n");
        sb.append("║         INFORMACIÓN DE LA             ║\n");
        sb.append("║            CONSTRUCTORA               ║\n");
        sb.append("╠═══════════════════════════════════════╣\n");
        sb.append("║   Constructora: "                     ).append(nombre).append(getSpaces(16 - nombre.length())).append("\n");
        sb.append("║   ID de Empresa: "                    ).append(idEmpresa).append(getSpaces(15 - String.valueOf(idEmpresa).length())).append("\n");
        sb.append("╚═══════════════════════════════════════╝\n");
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