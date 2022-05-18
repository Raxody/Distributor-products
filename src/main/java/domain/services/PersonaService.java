package domain.services;

import dao.PersonaDAOImplementacion;
import dao.TelefonoPersonaDAOImplementacion;
import dao.interfaces.IPersonaDAO;
import dao.interfaces.ITelefonoPersona;
import domain.Conductor;
import domain.Persona;
import domain.TelefonoPersona;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaService {
    private final IPersonaDAO personaDAO;
    private final ITelefonoPersona telefonoPersonaDAO;

    public PersonaService() {
        this.personaDAO = new PersonaDAOImplementacion();
        this.telefonoPersonaDAO = new TelefonoPersonaDAOImplementacion();
    }

    public Persona consultarPersona(Persona persona) {

        try {
            return personaDAO.obtener(persona);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<TelefonoPersona> telefonoPerson(Persona persona){
        try {
           return telefonoPersonaDAO.obtenerTelefonos(new TelefonoPersona(persona.getIdentificacion()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
