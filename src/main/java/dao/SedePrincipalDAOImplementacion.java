package dao;

import dao.interfaces.IPedidoDAO;
import dao.interfaces.ISedePrincipal;
import domain.SedePrincipal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SedePrincipalDAOImplementacion extends Conexion implements ISedePrincipal {
    private final String INSERT_SEDE_PRINCIPAL = "INSERT INTO sede_principal(id_pedido,id_articulo,cantidad,valor)  VALUES (?,?,?,?)";
    private final String DELETE_SEDE_PRINCIPAL = "DELETE FROM sede_principal WHERE id_pedido=?";
    private final String SELECT_SEDE_PRINCIPAL = "SELECT * FROM sede_principal WHERE id_pedido=?";

    @Override
    public void registrar(SedePrincipal sedePrincipal) throws SQLException {

        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.INSERT_SEDE_PRINCIPAL);
            statement.setInt(1, sedePrincipal.getIdPedido());
            statement.setInt(2, sedePrincipal.getIdArticulo());
            statement.setInt(3, sedePrincipal.getCantidad());
            statement.setDouble(4, sedePrincipal.getValor());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }


    @Override
    public void eliminar(SedePrincipal sedePrincipal) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.DELETE_SEDE_PRINCIPAL);
            statement.setInt(1, sedePrincipal.getIdPedido());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

    }

    @Override
    public SedePrincipal obtener(SedePrincipal sedePrincipal) throws SQLException {
        SedePrincipal sedePrincipa = null;
        try {
            setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_SEDE_PRINCIPAL);
            statement.setInt(1, sedePrincipal.getIdPedido());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                sedePrincipa = new SedePrincipal(resultSet.getInt("id_pedido"), resultSet.getInt("id_articulo"),
                        resultSet.getInt("cantidad"),resultSet.getDouble("valor"));
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return sedePrincipa;
    }



}

