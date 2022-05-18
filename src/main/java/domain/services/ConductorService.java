package domain.services;

import dao.ConductorDAOImplementacion;
import dao.PersonaDAOImplementacion;
import dao.TelefonoPersonaDAOImplementacion;
import dao.interfaces.IClienteDAO;
import dao.interfaces.IConductorDAO;
import dao.interfaces.IPersonaDAO;
import dao.interfaces.ITelefonoPersona;
import domain.Conductor;
import domain.Persona;
import domain.TelefonoPersona;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipError;

public class ConductorService {
    private final IPersonaDAO personaDAO;
    private final IConductorDAO conductorDAO;
    private final ITelefonoPersona telefonoDAO;

    public ConductorService() {
        this.personaDAO = new PersonaDAOImplementacion();
        this.conductorDAO = new ConductorDAOImplementacion();
        this.telefonoDAO = new TelefonoPersonaDAOImplementacion();
    }

    public void registrarConductor(Persona persona, Conductor conductor, List<TelefonoPersona> telefonos) throws Exception {
        try {
            if (personaDAO.obtener(persona) == null) {
                personaDAO.registrar(persona);

                conductorDAO.registrar(conductor);

                for (TelefonoPersona tel :
                        telefonos) {
                    if (telefonoDAO.obtener(tel) == null) telefonoDAO.registrar(tel);
                }

            }else{
                throw new Exception("Revisar la informacion de la persona, puede estar repetida");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarConductor(Persona persona, Conductor conductor, List<TelefonoPersona> telefonos) {
        try {
            if (personaDAO.obtener(persona) != null) {
                personaDAO.actualizar(persona);

                conductorDAO.actualizar(conductor);

              /*  for (TelefonoPersona tel :
                        telefonos) {
                    if (telefonoDAO.obtener(tel) != null) telefonoDAO.actualizar(tel);
                }
*/
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Persona> obtenerPersonasConductoras() {
        List<Persona> personas = new ArrayList<>();

        try {
            for (Conductor con :
                    conductorDAO.listar()) {
                Persona person = personaDAO.obtener(new Persona(con.getIdentificacionPersonaConductor()));
                if (person != null) personas.add(person);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personas;
    }

    public Conductor consultarConductor(Conductor conductor) {

        try {
            return conductorDAO.obtener(conductor);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    public void eliminarConductor(Conductor conductor){
        try {

            if(conductorDAO.obtener(conductor)  != null){
                conductorDAO.eliminar(conductor);
            }

            Persona person = new Persona(conductor.getIdentificacionPersonaConductor());
            if(personaDAO.obtener(person) != null){
                telefonoDAO.eliminar(new TelefonoPersona(conductor.getIdentificacionPersonaConductor()));
                personaDAO.eliminar(person);
            }




        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
