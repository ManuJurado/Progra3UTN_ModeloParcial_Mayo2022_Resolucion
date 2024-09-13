import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear platos
        Plato plato1 = new Plato("Pizza", 5500.0);
        Plato plato2 = new Plato("Hamburguesa", 7500.0);
        Plato plato3 = new Plato("Pasta", 4500.0);

        // Crear local
        Local local1 = new Local("Local A");
        local1.agregarPlato(plato1);
        local1.agregarPlato(plato2);
        local1.agregarMetodoPago(MetodoDePago.EFECTIVO);
        local1.agregarMetodoPago(MetodoDePago.TARJETA);

        // Crear cliente
        Usuario cliente1 = new Usuario("Manuel", "Calle Falsa 123","2236234397");

        // Crear listas de platos y cantidades
        ArrayList<Plato> platosPedido1 = new ArrayList<>();
        ArrayList<Integer> cantidadesPedido1 = new ArrayList<>();
        platosPedido1.add(plato1); // 2 pizzas
        platosPedido1.add(plato2); // 1 hamburguesa
        cantidadesPedido1.add(2);
        cantidadesPedido1.add(1);
        Pedido pedido1 = new Pedido(cliente1, local1, platosPedido1, cantidadesPedido1, MetodoDePago.EFECTIVO, TipoEntrega.TAKEAWAY);

        ArrayList<Plato> platosPedido2 = new ArrayList<>();
        ArrayList<Integer> cantidadesPedido2 = new ArrayList<>();
        platosPedido2.add(plato3); // 1 pasta
        cantidadesPedido2.add(1);
        Pedido pedido2 = new Pedido(cliente1, local1, platosPedido2, cantidadesPedido2, MetodoDePago.TARJETA, TipoEntrega.DOMICILIO);

        // Agregar pedidos a ArrayList
        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        // Mostrar información de pedidos
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
