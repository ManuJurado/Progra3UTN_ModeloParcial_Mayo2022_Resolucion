import java.util.ArrayList;

public class Pedido {
    private Usuario cliente;
    private Local local;
    private ArrayList<Plato> platos;
    private ArrayList<Integer> cantidades; // Lista para las cantidades
    private MetodoDePago metodoPago;
    private TipoEntrega tipoEntrega;

    public Pedido(Usuario cliente, Local local, ArrayList<Plato> platos, ArrayList<Integer> cantidades, MetodoDePago metodoPago, TipoEntrega tipoEntrega) {
        this.cliente = cliente;
        this.local = local;
        this.platos = platos;
        this.cantidades = cantidades;
        this.metodoPago = metodoPago;
        this.tipoEntrega = tipoEntrega;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Integer> getCantidades() {
        return cantidades;
    }

    public void setCantidades(ArrayList<Integer> cantidades) {
        this.cantidades = cantidades;
    }

    public MetodoDePago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoDePago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public TipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(TipoEntrega tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (int i = 0; i < platos.size(); i++) {
            Plato plato = platos.get(i);
            int cantidad = cantidades.get(i);
            total += plato.getPrecio() * cantidad;
        }
        return total + (total * metodoPago.getRecargo());
    }

    @Override
    public String toString() {
        StringBuilder detalle = new StringBuilder();
        detalle.append("Pedido:\n");
        detalle.append("Cliente: ").append(cliente.toString()).append("\n");
        detalle.append("Local: ").append(local.toString()).append("\n");
        detalle.append("Platos:\n");

        for (int i = 0; i < platos.size(); i++) {
            Plato plato = platos.get(i);
            int cantidad = cantidades.get(i);
            detalle.append("- ").append(plato.getNombre()).append(" (Cantidad: ").append(cantidad).append(")\n");
        }

        detalle.append("Metodo de Pago: ").append(metodoPago).append("\n");
        detalle.append("Entrega: ").append(tipoEntrega).append("\n");
        detalle.append("Total: $").append(calcularTotal()).append("\n");

        return detalle.toString();
    }
}
