package domain;

public class Proveedor {
    private int nit;
    private String personaContacto;
    private String nombre;
    private String direccion;

    public Proveedor(int nit, String personaContacto, String nombre, String direccion) {
        this.nit = nit;
        this.personaContacto = personaContacto;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Proveedor(int nit) {
        this.nit = nit;
    }

    public int getNit() {
        return nit;
    }

    public String getPersonaContacto() {
        return personaContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
