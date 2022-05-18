package dao;

import dao.interfaces.IPersonaDAO;
import dao.interfaces.IProductoDAO;
import domain.Persona;
import domain.Producto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImplemetacion extends Conexion implements IProductoDAO {

    private final String SELECT_ALL_PRODUCTOS = "SELECT id,nombre,precio FROM articulo";



    @Override
    public List<Producto> listar() throws SQLException {
        List<Producto> lista = new ArrayList<>();
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_ALL_PRODUCTOS);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                lista.add(new Producto(resultSet.getInt("id"), resultSet.getString("nombre"), resultSet.getDouble("precio")));
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
