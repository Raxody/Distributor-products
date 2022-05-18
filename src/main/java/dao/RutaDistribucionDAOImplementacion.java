package dao;


import dao.interfaces.IRutaDistribucionDAO;
import domain.RutaDistribucion;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RutaDistribucionDAOImplementacion extends Conexion implements IRutaDistribucionDAO {
    private final String INSERT_RUTA = "INSERT INTO ruta_distribucion VALUES (?,?,?,?,?,?)";
    private final String UPDATE_RUTA = "UPDATE ruta_distribucion SET id_ciudad_destino=?, nombre=?, fecha_apertura=?, fecha_cambio_costo=?, costo_ruta=? WHERE id=?";
    private final String DELETE_RUTA = "DELETE FROM ruta_distribucion WHERE id=?";
    private final String SELECT_ALL_RUTA = "SELECT id,id_ciudad_destino,nombre,fecha_apertura,fecha_cambio_costo,costo_ruta FROM ruta_distribucion";
    private final String SELECT_RUTA = "SELECT id,id_ciudad_destino,nombre,fecha_apertura,fecha_cambio_costo,costo_ruta FROM ruta_distribucion WHERE id=?";

    @Override
    public void registrar(RutaDistribucion rutaDistribucion) throws SQLException {

        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.INSERT_RUTA);
            statement.setInt(1, rutaDistribucion.getId());
            statement.setInt(2, rutaDistribucion.getIdCiudadDestino());
            statement.setString(3, rutaDistribucion.getNombre());
            statement.setDate(4, Date.valueOf(rutaDistribucion.getFechaApertura()));
            statement.setDate(5, Date.valueOf(rutaDistribucion.getFechaCambioCosto()));
            statement.setDouble(6, rutaDistribucion.getCostoRuta());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }

    @Override
    public void actualizar(RutaDistribucion rutaDistribucion) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.UPDATE_RUTA);
            statement.setInt(1, rutaDistribucion.getIdCiudadDestino());
            statement.setString(2, rutaDistribucion.getNombre());
            statement.setDate(3, Date.valueOf(rutaDistribucion.getFechaApertura()));
            statement.setDate(4, Date.valueOf(rutaDistribucion.getFechaCambioCosto()));
            statement.setDouble(5, rutaDistribucion.getCostoRuta());
            statement.setInt(6, rutaDistribucion.getId());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }

    @Override
    public void eliminar(RutaDistribucion rutaDistribucion) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.DELETE_RUTA);
            statement.setInt(1, rutaDistribucion.getId());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

    }

    @Override
    public RutaDistribucion obtener(RutaDistribucion rutaDistribucion) throws SQLException {
        RutaDistribucion rutaDistribucionObtener = null;
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_RUTA);
            statement.setInt(1, rutaDistribucion.getId());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                rutaDistribucionObtener = new RutaDistribucion(resultSet.getInt("id"),
                        resultSet.getInt("id_ciudad_destino"),
                        resultSet.getString("nombre"),
                        resultSet.getDate("fecha_apertura").toLocalDate(),
                        resultSet.getDate("fecha_cambio_costo").toLocalDate(),
                        resultSet.getDouble("costo_ruta")
                );
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return rutaDistribucionObtener;
    }

    @Override
    public List<RutaDistribucion> listar() throws SQLException {
        List<RutaDistribucion> lista = new ArrayList<>();
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_ALL_RUTA);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                RutaDistribucion rutaDistribucion = new RutaDistribucion(resultSet.getInt("id"),
                        resultSet.getInt("id_ciudad_destino"),
                        resultSet.getString("nombre"),
                        resultSet.getDate("fecha_apertura").toLocalDate(),
                        resultSet.getDate("fecha_cambio_costo").toLocalDate(),
                        resultSet.getDouble("costo_ruta")
                );
                lista.add(rutaDistribucion);
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
