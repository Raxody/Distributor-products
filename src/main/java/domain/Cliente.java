package domain;

import java.time.LocalDate;

public class Cliente {
    private int identificacionPersonaCliente;
    private int idCiudad;
    private LocalDate fechaEntregaProductos;

    public Cliente(int identificacionPersonaCliente, int idCiudad, LocalDate fechaEntregaProductos) {
        this.identificacionPersonaCliente = identificacionPersonaCliente;
        this.idCiudad = idCiudad;
        this.fechaEntregaProductos = fechaEntregaProductos;
    }


    public Cliente(int identificacionPersonaCliente) {
        this.identificacionPersonaCliente = identificacionPersonaCliente;
    }

    public int getIdentificacionPersonaCliente() {
        return identificacionPersonaCliente;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public LocalDate getFechaEntregaProductos() {
        return fechaEntregaProductos;
    }
}
