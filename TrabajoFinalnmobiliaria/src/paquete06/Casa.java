package paquete06;
import paquete01.Ejecutor1;
import paquete01.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import java.io.Serializable;
public class Casa implements Serializable {
    private Propietario propietario;
    private double precioMetroCuadrado;
    private double metrosCuadrados;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private int numeroCuartos;
    private Constructora constructora;

    public Casa(Propietario propietario, double precioMetroCuadrado, double metrosCuadrados, Barrio barrio,
                Ciudad ciudad, int numeroCuartos, Constructora constructora) {
        this.propietario = propietario;
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.metrosCuadrados = metrosCuadrados;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.numeroCuartos = numeroCuartos;
        this.constructora = constructora;
        this.costoFinal = metrosCuadrados * precioMetroCuadrado;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }
    public void setPrecioMetroCuadrado(double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public double getCostoFinal() {
        return costoFinal;
    }
    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }
    public Barrio getBarrio() {
        return barrio;
    }
    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }
    public Ciudad getCiudad() {
        return ciudad;
    }
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    public int getNumeroCuartos() {
        return numeroCuartos;
    }
    public void setNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }
    public Constructora getConstructora() {
        return constructora;
    }
    public String GetIdEmpresa() {
        String valor1 = constructora.getIdEmpresa();
        return valor1;
    }
    public void setConstructora(Constructora constructora) {
        this.constructora = constructora;
    }
    public void calcularCostoFinal(double costoFinal){
        this.costoFinal=(this.metrosCuadrados*this.precioMetroCuadrado);
    }
    public double getCalcularCostoFinal(){
        return costoFinal;
    }
}
