package domain;

public class Persona {
    private int identificacion;
    private String nombre;
    private  String direccion;

    public Persona(int identificacion, String nombre, String direccion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Persona(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }


    public String getNombre() {
        return nombre;
    }



    public String getDireccion() {
        return direccion;
    }


}
