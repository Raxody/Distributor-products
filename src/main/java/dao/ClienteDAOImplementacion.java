package dao;


import dao.interfaces.IClienteDAO;
import domain.Cliente;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImplementacion extends Conexion implements IClienteDAO {
    private final String INSERT_CLIENTE = "INSERT INTO cliente VALUES (?,?,?)";
    private final String UPDATE_CLIENTE = "UPDATE cliente SET id_ciudad=?, fecha_entrega_productos=? WHERE identicacion_persona_cliente=?";
    private final String DELETE_CLIENTE = "DELETE FROM cliente WHERE identicacion_persona_cliente=?";
    private final String SELECT_ALL_CLIENTE = "SELECT identicacion_persona_cliente,id_ciudad,fecha_entrega_productos FROM cliente";
    private final String SELECT_CLIENTE = "SELECT identicacion_persona_cliente,id_ciudad,fecha_entrega_productos FROM cliente WHERE identicacion_persona_cliente=?";
    @Override
    public void registrar(Cliente cliente) throws SQLException {

        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.INSERT_CLIENTE);
            statement.setInt(1, cliente.getIdentificacionPersonaCliente());
            statement.setInt(2, cliente.getIdCiudad());
            statement.setDate(3, Date.valueOf(cliente.getFechaEntregaProductos()));
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }

    @Override
    public void actualizar(Cliente cliente) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.UPDATE_CLIENTE);
            statement.setInt(1, cliente.getIdCiudad());
            statement.setDate(2, Date.valueOf(cliente.getFechaEntregaProductos()));
            statement.setInt(3, cliente.getIdentificacionPersonaCliente());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }

    @Override
    public void eliminar(Cliente cliente) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.DELETE_CLIENTE);
            statement.setInt(1, cliente.getIdentificacionPersonaCliente());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

    }

    @Override
    public Cliente obtener(Cliente cliente) throws SQLException {
        Cliente clienteObtener =null;
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_CLIENTE);
            statement.setInt(1, cliente.getIdentificacionPersonaCliente());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                clienteObtener = new Cliente(resultSet.getInt("identicacion_persona_cliente"),
                        resultSet.getInt("id_ciudad"),
                        resultSet.getDate("fecha_entrega_productos").toLocalDate());
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return clienteObtener;
    }

    @Override
    public List<Cliente> listar() throws SQLException {
        List<Cliente> lista = new ArrayList<>();
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_ALL_CLIENTE);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Cliente cliente = new Cliente(resultSet.getInt("identicacion_persona_cliente"),
                        resultSet.getInt("id_ciudad"),
                        resultSet.getDate("fecha_entrega_productos").toLocalDate());
                lista.add(cliente);
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
