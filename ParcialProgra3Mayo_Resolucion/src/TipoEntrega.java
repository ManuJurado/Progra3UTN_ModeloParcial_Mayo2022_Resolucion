public enum TipoEntrega {
    TAKEAWAY("Retirado en el local"),
    DOMICILIO("Entregado a domicilio");

    private final String descripcion;

    TipoEntrega(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
