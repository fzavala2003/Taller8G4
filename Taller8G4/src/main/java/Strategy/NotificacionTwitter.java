/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author zaval
 */
public class NotificacionTwitter implements MecanismoNotificacion {
    public void notificar(String mensaje) {
        System.out.println("Notificación por Twitter: " + mensaje);
    }
}
