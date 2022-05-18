package dao;

import dao.interfaces.IPersonaDAO;
import domain.Persona;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImplementacion extends Conexion implements IPersonaDAO {
    private final String INSERT_PERSONA = "INSERT INTO persona VALUES (?,?,?)";
    private final String UPDATE_PERSONA = "UPDATE persona SET nombre=?, direccion=? WHERE identificacion=?";
    private final String DELETE_PERSONA = "DELETE FROM persona WHERE identificacion=?";
    private final String SELECT_ALL_PERSONA = "SELECT identificacion,nombre,direccion FROM persona";
    private final String SELECT_PERSONA = "SELECT identificacion,nombre,direccion FROM persona WHERE identificacion=?";
    @Override
    public void registrar(Persona persona) throws SQLException {

        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.INSERT_PERSONA);
            statement.setInt(1, persona.getIdentificacion());
            statement.setString(2, persona.getNombre());
            statement.setString(3, persona.getDireccion());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }

    @Override
    public void actualizar(Persona persona) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.UPDATE_PERSONA);
            statement.setString(1, persona.getNombre());
            statement.setString(2, persona.getDireccion());
            statement.setInt(3, persona.getIdentificacion());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }

    @Override
    public void eliminar(Persona persona) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.DELETE_PERSONA);
            statement.setInt(1, persona.getIdentificacion());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

    }

    @Override
    public Persona obtener(Persona persona) throws SQLException {
        Persona personaObtener = null;
        try {
            setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_PERSONA);
            statement.setInt(1, persona.getIdentificacion());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                personaObtener = new Persona(resultSet.getInt("identificacion"), resultSet.getString("nombre"), resultSet.getString("direccion"));
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return personaObtener;
    }

    @Override
    public List<Persona> listar() throws SQLException {
        List<Persona> lista = new ArrayList<>();
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_ALL_PERSONA);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Persona persona = new Persona(resultSet.getInt("identificacion"), resultSet.getString("nombre"), resultSet.getString("direccion"));
                lista.add(persona);
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return lista;
    }
}
