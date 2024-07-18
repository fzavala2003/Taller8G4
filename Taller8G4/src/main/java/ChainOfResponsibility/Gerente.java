/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author zaval
 */
public class Gerente extends Aprobador{
    public void manejarSolicitud(double monto, String cliente) {
        if (monto >= 2000) {
            System.out.println("Aprobado por el gerente para el cliente " + cliente);
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(monto, cliente);
        }
    }
}
