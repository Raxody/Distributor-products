package domain;

public class TelefonoProveedor {
    private int nitProveedor;
    private String telefono;

    public TelefonoProveedor(int nitProveedor, String telefono) {
        this.nitProveedor = nitProveedor;
        this.telefono = telefono;
    }

    public TelefonoProveedor(String telefono) {
        this.telefono = telefono;
    }

    public TelefonoProveedor(int nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public int getNitProveedor() {
        return nitProveedor;
    }

    public String getTelefono() {
        return telefono;
    }
}
