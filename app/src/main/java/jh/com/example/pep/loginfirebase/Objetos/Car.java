package jh.com.example.pep.loginfirebase.Objetos;

/**
 * Created by Pishi on 25/07/2017.
 */

public class Car {
    String marca;
    String propietario;
    int puertas;
    int pasajeros;

    public Car(){

    }

    public Car(String marca, String propietario, int puertas, int pasajeros) {
        this.marca = marca;
        this.propietario = propietario;
        this.puertas = puertas;
        this.pasajeros = pasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
}
