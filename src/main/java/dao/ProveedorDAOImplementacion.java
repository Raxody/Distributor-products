package dao;

import dao.interfaces.IProveedorDAO;
import domain.Proveedor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDAOImplementacion extends Conexion implements IProveedorDAO {
    private final String INSERT_PROVEEDOR = "INSERT INTO proveedor VALUES (?,?,?,?)";
    private final String UPDATE_PROVEEDOR = "UPDATE proveedor SET persona_contacto=?, nombre=?, direccion=?  WHERE nit=?";
    private final String DELETE_PROVEEDOR = "DELETE FROM proveedor WHERE nit=?";
    private final String SELECT_ALL_PROVEEDOR = "SELECT nit, persona_contacto, nombre, direccion FROM proveedor";
    private final String SELECT_PROVEEDOR = "SELECT nit, persona_contacto, nombre, direccion FROM proveedor WHERE nit=?";
    @Override
    public void registrar(Proveedor proveedor) throws SQLException {

        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.INSERT_PROVEEDOR);
            statement.setInt(1, proveedor.getNit());
            statement.setString(2, proveedor.getPersonaContacto());
            statement.setString(3, proveedor.getNombre());
            statement.setString(4, proveedor.getDireccion());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }

    @Override
    public void actualizar(Proveedor proveedor) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.UPDATE_PROVEEDOR);
            statement.setString(1, proveedor.getPersonaContacto());
            statement.setString(2, proveedor.getNombre());
            statement.setString(3, proveedor.getDireccion());
            statement.setInt(4, proveedor.getNit());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }

    @Override
    public void eliminar(Proveedor proveedor) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.DELETE_PROVEEDOR);
            statement.setInt(1, proveedor.getNit());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

    }

    @Override
    public Proveedor obtener(Proveedor proveedor) throws SQLException {
        Proveedor proveedorObtener =null;
        try {
            setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_PROVEEDOR);
            statement.setInt(1, proveedor.getNit());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                proveedorObtener = new Proveedor(resultSet.getInt("nit"),
                                    resultSet.getString("persona_contacto"),
                                    resultSet.getString("nombre"),
                                    resultSet.getString("direccion"));
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return proveedorObtener;
    }

    @Override
    public List<Proveedor> listar() throws SQLException {
        List<Proveedor> lista = new ArrayList<>();
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_ALL_PROVEEDOR);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Proveedor proveedor = new Proveedor(resultSet.getInt("nit"),
                        resultSet.getString("persona_contacto"),
                        resultSet.getString("nombre"),
                        resultSet.getString("direccion"));
                lista.add(proveedor);
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
