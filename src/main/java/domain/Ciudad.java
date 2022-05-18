package domain;

public class Ciudad {
    private int id;
    private String ciudad;

    public Ciudad(int id, String ciudad) {
        this.id = id;
        this.ciudad = ciudad;
    }

    public int getId() {
        return id;
    }

    public String getCiudad() {
        return ciudad;
    }
}
