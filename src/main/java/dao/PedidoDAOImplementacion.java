package dao;

import com.sun.jdi.PrimitiveValue;
import dao.interfaces.IPedidoDAO;
import domain.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PedidoDAOImplementacion extends Conexion implements IPedidoDAO {
    private final String INSERT_PEDIDO = "INSERT INTO pedido (subtotal,id_ruta_distribucion,identicacion_persona_cliente) VALUES (?,?,?)";
    private final String DELETE_PEDIDO = "DELETE FROM pedido WHERE id=?";
    private final String SELECT_PEDIDO = "SELECT * FROM pedido WHERE id=?";
    private final String SELECT_ULTIMO = "SELECT * FROM pedido ORDER BY id DESC LIMIT 1";

    @Override
    public void registrar(Pedido pedido) throws SQLException {

        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.INSERT_PEDIDO);
            statement.setDouble(1, pedido.getSubtotal());
            statement.setInt(2, pedido.getIdentificacionRutaDistribucion());
            statement.setInt(3, pedido.getIdentificacionPersonaCliente());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

    }
    @Override
    public Pedido obtenerIngresar() throws SQLException{
        Pedido pedid = null;
        try {
            setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_ULTIMO);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                pedid = new Pedido(resultSet.getInt("id"), resultSet.getDouble("subtotal"),
                        resultSet.getDouble("total"),resultSet.getInt("id_ruta_distribucion"),
                        resultSet.getInt("identicacion_persona_cliente"));
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return pedid;
    }

    @Override
    public void eliminar(Pedido pedido) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.DELETE_PEDIDO);
            statement.setInt(1, pedido.getId());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

    }

    @Override
    public Pedido obtener(Pedido pedido) throws SQLException {
        Pedido pedid = null;
        try {
            setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_PEDIDO);
            statement.setInt(1, pedido.getId());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                pedid = new Pedido(resultSet.getInt("id"), resultSet.getDouble("subtotal"),
                        resultSet.getDouble("total"),resultSet.getInt("id_ruta_distribucion"),
                        resultSet.getInt("identificacion_persona_cliente"));
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return pedid;
    }



}
