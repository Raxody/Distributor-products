package domain;

public class ConductorRuta {
    private String nombre;
    private String ruta;

    public ConductorRuta(String nombre, String ruta) {
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuta() {
        return ruta;
    }
}
