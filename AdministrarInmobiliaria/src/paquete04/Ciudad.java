package paquete04;
import java.io.Serializable;
public class Ciudad implements Serializable {
    private String nombre;
    private String provincia;
    public Ciudad(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("╔═══════════════════════════════════════════╗\n");
        sb.append("║           INFORMACIÓN DE LA               ║\n");
        sb.append("║                  CIUDAD                   ║\n");
        sb.append("╠═══════════════════════════════════════════╣\n");
        sb.append("║   Ciudad:     "                            ).append(nombre).append(getSpaces(18 - nombre.length())).append("\n");
        sb.append("║   Provincia:  "                            ).append(provincia).append(getSpaces(18 - provincia.length())).append("\n");
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