import java.util.ArrayList;

public class Local {
    private String nombre;
    private ArrayList<Plato> platos;
    private ArrayList<MetodoDePago> metodosPago;

    public Local(String nombre) {
        this.nombre = nombre;
        this.platos = new ArrayList<>();
        this.metodosPago = new ArrayList<>();
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void agregarMetodoPago(MetodoDePago metodoPago) {
        if (!metodosPago.contains(metodoPago)) {
            metodosPago.add(metodoPago);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public ArrayList<MetodoDePago> getMetodosPago() {
        return metodosPago;
    }

    @Override
    public String toString() {
        return "Local: " + nombre + ", Platos: " + platos.toString() + ", Metodos de Pago: " + metodosPago.toString();
    }
}
