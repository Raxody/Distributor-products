package domain;

import java.time.LocalDate;

public class Conductor{
    private int identificacionPersonaConductor;
    private LocalDate fechaIngreso;
    private boolean disponibilidad;
    private int idRutaDistribucion;

    public Conductor(int identificacionPersonaConductor, LocalDate fechaIngreso, boolean disponibilidad, int idRutaDistribucion) {
        this.identificacionPersonaConductor = identificacionPersonaConductor;
        this.fechaIngreso = fechaIngreso;
        this.disponibilidad = disponibilidad;
        this.idRutaDistribucion = idRutaDistribucion;
    }

    public Conductor(int identificacionPersonaConductor) {
        this.identificacionPersonaConductor = identificacionPersonaConductor;
    }

    public int getIdRutaDistribucion() {
        return idRutaDistribucion;
    }

    public int getIdentificacionPersonaConductor() {
        return identificacionPersonaConductor;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }
}
