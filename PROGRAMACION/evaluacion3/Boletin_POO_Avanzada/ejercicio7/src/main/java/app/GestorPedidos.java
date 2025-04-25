package app;

import java.util.LinkedList;
import java.util.Queue;

public class GestorPedidos {
    private Queue<Pedido> cola = new LinkedList<>();

    public void agregarPedido(Pedido pedido) {
        cola.offer(pedido);
    }

    public Pedido despacharPedido() {
        return cola.poll();
    }

    public void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("No hay pedidos en la cola.");
        } else {
            int i = 1;
            for (Pedido p : cola) {
                System.out.println(i++ + ". Código: " + p.getCodigo() + " | Tipo de Venta: " + p.getTipoVenta());
            }
        }
    }
}


