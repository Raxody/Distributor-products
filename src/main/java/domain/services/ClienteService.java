package domain.services;

import dao.ClienteDAOImplementacion;
import dao.PersonaDAOImplementacion;
import dao.TelefonoPersonaDAOImplementacion;
import dao.interfaces.IClienteDAO;
import dao.interfaces.IPersonaDAO;
import dao.interfaces.ITelefonoPersona;
import domain.Cliente;
import domain.Conductor;
import domain.Persona;
import domain.TelefonoPersona;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    private final IPersonaDAO personaDAO;
    private final IClienteDAO clienteDAO;
    private final ITelefonoPersona telefonoDAO;

    public ClienteService() {
        this.personaDAO = new PersonaDAOImplementacion();
        this.clienteDAO = new ClienteDAOImplementacion();
        this.telefonoDAO = new TelefonoPersonaDAOImplementacion();
    }

    public void registrarCliente(Persona persona, Cliente cliente, List<TelefonoPersona> telefonos) throws Exception {
        try {
            if (personaDAO.obtener(persona) == null) {
                personaDAO.registrar(persona);

                clienteDAO.registrar(cliente);

                for (TelefonoPersona tel :
                        telefonos) {
                    if (telefonoDAO.obtener(tel) == null) telefonoDAO.registrar(tel);
                }

            }else{
                throw new Exception("Revise la informacion proporcionada, puede que ya exista");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarCliente(Persona persona, Cliente cliente) {
        try {
            if (personaDAO.obtener(persona) != null) {
                personaDAO.actualizar(persona);

                clienteDAO.actualizar(cliente);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Persona> obtenerPersonasClientes() {
        List<Persona> personas = new ArrayList<>();

        try {
            for (Cliente cliente :
                    clienteDAO.listar()) {
                Persona person = personaDAO.obtener(new Persona(cliente.getIdentificacionPersonaCliente()));
                if (person != null) personas.add(person);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personas;
    }

    public List<Cliente> obtenerClientes() {
        List<Cliente> clientes = new ArrayList<>();

        try {
                return  clienteDAO.listar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }




    public Cliente consultarCliente(Cliente cliente) {

        try {
            return clienteDAO.obtener(cliente);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    public void eliminarCliente(Cliente cliente){
        try {

            if(clienteDAO.obtener(cliente)  != null){
                clienteDAO.eliminar(cliente);
            }
            Persona person = new Persona(cliente.getIdentificacionPersonaCliente());
            if(personaDAO.obtener(person) != null){
                telefonoDAO.eliminar(new TelefonoPersona(cliente.getIdentificacionPersonaCliente()));
                personaDAO.eliminar(person);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
