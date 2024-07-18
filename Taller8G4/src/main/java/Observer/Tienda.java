/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zaval
 */
public class Tienda {
    private List<ClienteObservador> clientes = new ArrayList<>();

    public void agregarCliente(ClienteObservador cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente(ClienteObservador cliente) {
        clientes.remove(cliente);
    }

    public void notificarClientes(String mensaje) {
        for (ClienteObservador cliente : clientes) {
            cliente.actualizar(mensaje);
        }
    }

    public void nuevoBeneficio(String beneficio) {
        notificarClientes("Nuevo beneficio: " + beneficio);
    }

    public void nuevaPromocion(String promocion) {
        notificarClientes("Nueva promoción: " + promocion);
    }
}
