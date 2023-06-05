package paquete03;
import java.io.Serializable;
public class Barrio implements Serializable {
    private String nombre;
    private String referencia;
    public Barrio(String nombre, String referencia) {
        this.nombre = nombre;
        this.referencia = referencia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("╔═══════════════════════════════════════════╗\n");
        sb.append("║            INFORMACIÓN DEL                ║\n");
        sb.append("║                 BARRIO                    ║\n");
        sb.append("╠═══════════════════════════════════════════╣\n");
        sb.append("║   Barrio:     "                            ).append(nombre).append(getSpaces(19 - nombre.length())).append("\n");
        sb.append("╠═══════════════════════════════════════════╣\n");
        sb.append("║   Referencia: "                            ).append(referencia).append(getSpaces(19 - referencia.length())).append("\n");
        sb.append("╚═══════════════════════════════════════════╝\n");
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