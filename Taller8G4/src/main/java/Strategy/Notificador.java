/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author zaval
 */
public class Notificador {
    private MecanismoNotificacion mecanismo;

    public Notificador(MecanismoNotificacion mecanismo) {
        this.mecanismo = mecanismo;
    }

    public void setMecanismo(MecanismoNotificacion mecanismo) {
        this.mecanismo = mecanismo;
    }

    public void notificarCliente(String mensaje) {
        mecanismo.notificar(mensaje);
    }
}
