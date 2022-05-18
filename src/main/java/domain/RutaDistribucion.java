package domain;

import java.time.LocalDate;

public class RutaDistribucion {
    private int id;
    private int idCiudadDestino;
    private String nombre;
    private LocalDate fechaApertura;
    private LocalDate fechaCambioCosto;
    private double costoRuta;

    public RutaDistribucion(int id, int idCiudadDestino, String nombre, LocalDate fechaApertura, LocalDate fechaCambioCosto, double costoRuta) {
        this.id = id;
        this.idCiudadDestino = idCiudadDestino;
        this.nombre = nombre;
        this.fechaApertura = fechaApertura;
        this.fechaCambioCosto = fechaCambioCosto;
        this.costoRuta = costoRuta;
    }

    public RutaDistribucion(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getIdCiudadDestino() {
        return idCiudadDestino;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public LocalDate getFechaCambioCosto() {
        return fechaCambioCosto;
    }

    public double getCostoRuta() {
        return costoRuta;
    }
}
