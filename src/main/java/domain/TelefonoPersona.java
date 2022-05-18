package domain;

public class TelefonoPersona {
    private int identificacionPersona;
    private String telefono;

    public TelefonoPersona(int identificacionPersona, String telefono) {
        this.identificacionPersona = identificacionPersona;
        this.telefono = telefono;
    }

    public TelefonoPersona(int identificacionPersona) {
        this.identificacionPersona = identificacionPersona;
    }

    public TelefonoPersona(String telefono) {
        this.telefono = telefono;
    }

    public int getIdentificacionPersona() {
        return identificacionPersona;
    }

    public String getTelefono() {
        return telefono;
    }
}
