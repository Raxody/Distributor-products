package dao;


import dao.interfaces.ITelefonoPersona;
import domain.Persona;
import domain.TelefonoPersona;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TelefonoPersonaDAOImplementacion extends Conexion implements ITelefonoPersona {
    private final String INSERT_TELEFONO_PERSONA = "INSERT INTO telefonos_persona VALUES (?,?)";
    private final String UPDATE_TELEFONO_PERSONA = "UPDATE telefonos_persona SET telefono=? WHERE identificacion_persona=? AND telefono=? ";
    private final String DELETE_TELEFONO_PERSONA = "DELETE FROM telefonos_persona WHERE identificacion_persona=?";
    private final String SELECT_TELEFONO_ALL_PERSONA = "SELECT identificacion_persona,telefono FROM telefonos_persona WHERE identificacion_persona=?";
    private final String SELECT_TELEFONO_PERSONA = "SELECT identificacion_persona,telefono FROM telefonos_persona WHERE identificacion_persona=? AND telefono=?";

    @Override
    public void registrar(TelefonoPersona telefonoPersona) throws SQLException {

        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.INSERT_TELEFONO_PERSONA);
            statement.setInt(1, telefonoPersona.getIdentificacionPersona());
            statement.setString(2, telefonoPersona.getTelefono());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }

    @Override
    public void actualizar(TelefonoPersona telefonoPersona) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.UPDATE_TELEFONO_PERSONA);
            statement.setString(1, telefonoPersona.getTelefono());
            statement.setInt(2, telefonoPersona.getIdentificacionPersona());
            statement.setString(3, telefonoPersona.getTelefono());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }

    @Override
    public void eliminar(TelefonoPersona telefonoPersona) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.DELETE_TELEFONO_PERSONA);
            statement.setInt(1, telefonoPersona.getIdentificacionPersona());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

    }

    @Override
    public List<TelefonoPersona> obtenerTelefonos(TelefonoPersona telefonoPersona) throws SQLException {
        List<TelefonoPersona> lista = new ArrayList<>();
        try {
            setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_TELEFONO_ALL_PERSONA);
            statement.setInt(1, telefonoPersona.getIdentificacionPersona());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                TelefonoPersona telefono = new TelefonoPersona(resultSet.getInt("identificacion_persona"), resultSet.getString("telefono"));
                lista.add(telefono);
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

    @Override
    public TelefonoPersona obtener(TelefonoPersona telefonoPersona) throws SQLException {
        TelefonoPersona telefonoPersonaObtener = null;
        try {
            setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_TELEFONO_PERSONA);
            statement.setInt(1, telefonoPersona.getIdentificacionPersona());
            statement.setString(2, telefonoPersona.getTelefono());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                telefonoPersonaObtener = new TelefonoPersona(resultSet.getInt("identificacion_persona"), resultSet.getString("telefono"));
            }


            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return telefonoPersonaObtener;

    }


}
