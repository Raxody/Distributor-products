package dao.interfaces;

import domain.RutaDistribucion;

import java.sql.SQLException;
import java.util.List;

public interface IRutaDistribucionDAO {
     void registrar(RutaDistribucion rutaDistribucion) throws SQLException;
     void actualizar(RutaDistribucion rutaDistribucion) throws SQLException;
     void eliminar(RutaDistribucion rutaDistribucion) throws SQLException;
     RutaDistribucion obtener(RutaDistribucion rutaDistribucion) throws SQLException;
     List<RutaDistribucion> listar() throws SQLException;
}
