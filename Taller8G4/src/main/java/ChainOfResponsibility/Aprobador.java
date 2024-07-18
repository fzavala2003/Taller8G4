/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author zaval
 */
public abstract class Aprobador {
    protected Aprobador siguiente;

    public void establecerSiguiente(Aprobador aprobador) {
        this.siguiente = aprobador;
    }

    public abstract void manejarSolicitud(double monto, String cliente);
}
