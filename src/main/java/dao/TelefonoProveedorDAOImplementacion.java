package dao;


import dao.interfaces.ITelefonoPersona;
import dao.interfaces.ITelefonoProveedor;
import domain.TelefonoPersona;
import domain.TelefonoProveedor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TelefonoProveedorDAOImplementacion extends Conexion implements ITelefonoProveedor {
    private final String INSERT_TELEFONO_PROVEEDOR = "INSERT INTO telefonos_proveedor VALUES (?,?)";
    private final String UPDATE_TELEFONO_PROVEEDOR = "UPDATE telefonos_proveedor SET telefono=? WHERE nit_proveedor=?";
    private final String DELETE_TELEFONO_PROVEEDOR = "DELETE FROM telefonos_proveedor WHERE nit_proveedor=?";
    private final String SELECT_TELEFONO_PROVEEDOR_ALL = "SELECT nit_proveedor,telefono FROM telefonos_proveedor WHERE nit_proveedor=?";
    private final String SELECT_TELEFONO_PROVEEDOR = "SELECT nit_proveedor,telefono FROM telefonos_proveedor WHERE nit_proveedor=? AND telefono=?";
    @Override
    public void registrar(TelefonoProveedor telefonoProveedor) throws SQLException {

        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.INSERT_TELEFONO_PROVEEDOR);
            statement.setInt(1, telefonoProveedor.getNitProveedor());
            statement.setString(2, telefonoProveedor.getTelefono());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }

    @Override
    public void actualizar(TelefonoProveedor telefonoProveedor) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.UPDATE_TELEFONO_PROVEEDOR);
            statement.setString(1, telefonoProveedor.getTelefono());
            statement.setInt(2, telefonoProveedor.getNitProveedor());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }

    @Override
    public void eliminar(TelefonoProveedor telefonoProveedor) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.DELETE_TELEFONO_PROVEEDOR);
            statement.setInt(1, telefonoProveedor.getNitProveedor());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

    }

    @Override
    public List<TelefonoProveedor> obtenerTelefonos(TelefonoProveedor telefonoProveedor) throws SQLException {
        List<TelefonoProveedor> lista = new ArrayList<>();
        try {
            setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_TELEFONO_PROVEEDOR_ALL);
            statement.setInt(1, telefonoProveedor.getNitProveedor());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                TelefonoProveedor telefono = new TelefonoProveedor(resultSet.getInt("nit_proveedor"), resultSet.getString("telefono"));
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
    public TelefonoProveedor obtener(TelefonoProveedor telefonoProveedor) throws SQLException {
        TelefonoProveedor telefonoProveedorObtener = null;
        try {
            setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_TELEFONO_PROVEEDOR);
            statement.setInt(1, telefonoProveedor.getNitProveedor());
            statement.setString(2, telefonoProveedor.getTelefono());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                telefonoProveedorObtener = new TelefonoProveedor(resultSet.getInt("nit_proveedor"), resultSet.getString("telefono"));
            }


            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return telefonoProveedorObtener;

    }



}
