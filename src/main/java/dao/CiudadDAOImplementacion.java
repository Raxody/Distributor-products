package dao;

import dao.interfaces.ICiudadDAO;
import domain.Ciudad;
import domain.Conductor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CiudadDAOImplementacion extends Conexion implements ICiudadDAO {

    private final String SELECT_ALL_CIUDAD = "SELECT id, ciudad FROM ciudad";

    @Override
    public List<Ciudad> listar() throws SQLException {
        List<Ciudad> lista = new ArrayList<>();
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_ALL_CIUDAD);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Ciudad ciudad = new Ciudad(resultSet.getInt("id"), resultSet.getString("ciudad"));
                lista.add(ciudad);
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
