/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author zaval
 */
public class AprobacionAutomatica extends Aprobador{
    public void manejarSolicitud(double monto, String cliente) {
        if (monto < 500) {
            System.out.println("Aprobado automáticamente para el cliente " + cliente);
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(monto, cliente);
        }
    }
}
