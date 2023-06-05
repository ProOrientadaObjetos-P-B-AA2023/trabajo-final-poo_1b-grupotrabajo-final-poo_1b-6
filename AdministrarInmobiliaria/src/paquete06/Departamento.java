package paquete06;
import paquete01.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import java.io.Serializable;
public class Departamento implements Serializable {
    private Propietario propietario;
    private double precioMetroCuadrado;
    private double metrosCuadrados;
    private double valorAlicuotaMensual;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private String nombreEdificio;
    private String ubicacionDepartamento;
    private Constructora constructora;
    public Departamento(Propietario propietario, double precioMetroCuadrado, double metrosCuadrados,
                        double valorAlicuotaMensual, Barrio barrio, Ciudad ciudad, String nombreEdificio,
                        String ubicacionDepartamento, Constructora constructora) {
        this.propietario = propietario;
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.metrosCuadrados = metrosCuadrados;
        this.valorAlicuotaMensual = valorAlicuotaMensual;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.nombreEdificio = nombreEdificio;
        this.ubicacionDepartamento = ubicacionDepartamento;
        this.constructora = constructora;
        this.costoFinal = ((metrosCuadrados * precioMetroCuadrado) + (valorAlicuotaMensual * 12));
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
    public double getValorAlicuotaMensual() {
        return valorAlicuotaMensual;
    }
    public void setValorAlicuotaMensual(double valorAlicuotaMensual) {
        this.valorAlicuotaMensual = valorAlicuotaMensual;
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
    public String getNombreEdificio() {
        return nombreEdificio;
    }
    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }
    public String getUbicacionDepartamento() {
        return ubicacionDepartamento;
    }
    public void setUbicacionDepartamento(String ubicacionDepartamento) {
        this.ubicacionDepartamento = ubicacionDepartamento;
    }
    public Constructora getConstructora() {
        return constructora;
    }
    public void setConstructora(Constructora constructora) {
        this.constructora = constructora;
    }
    public void calcularCostoDepartamento(){
        this.costoFinal = ((metrosCuadrados * precioMetroCuadrado) + (valorAlicuotaMensual * 12));
    }
    public double getCalcularCostoDepartamento(){
        return costoFinal;
    }
}