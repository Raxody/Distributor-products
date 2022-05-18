package dao.interfaces;

import domain.Conductor;


import java.sql.SQLException;
import java.util.List;

public interface IConductorDAO {
     void registrar(Conductor conductor) throws SQLException;
     void actualizar(Conductor conductor) throws SQLException;
     void eliminar(Conductor conductor) throws SQLException;
     Conductor obtener(Conductor conductor) throws SQLException;
     List<Conductor> listar() throws SQLException;
}
