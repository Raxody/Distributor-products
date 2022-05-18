package domain;

public class SedePrincipal {
    private int idPedido;
    private int idArticulo;
    private int cantidad;
    private double valor;

    public SedePrincipal(int idPedido, int idArticulo, int cantidad, double valor) {
        this.idPedido = idPedido;
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public SedePrincipal() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "SedePrincipal{" +
                "idPedido=" + idPedido +
                ", idArticulo=" + idArticulo +
                ", cantidad=" + cantidad +
                ", valor=" + valor +
                '}';
    }
}
