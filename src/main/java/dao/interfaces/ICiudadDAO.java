package dao.interfaces;


import domain.Ciudad;

import java.sql.SQLException;
import java.util.List;

public interface ICiudadDAO {
    List<Ciudad> listar() throws SQLException;
}
