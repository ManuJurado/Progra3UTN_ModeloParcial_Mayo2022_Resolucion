public enum MetodoDePago {
    EFECTIVO(0.0),
    TARJETA(0.05), // 5% de recargo
    TRANSFERENCIA(0.02); // 2% de recargo

    private final double recargo;

    MetodoDePago(double recargo) {
        this.recargo = recargo;
    }

    public double getRecargo() {
        return recargo;
    }

    @Override
    public String toString() {
        return this.name() + " (Recargo: " + recargo * 100 + "%)";
    }
}
