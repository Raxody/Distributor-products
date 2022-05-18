package dao.interfaces;

import domain.Persona;
import domain.Producto;

import java.sql.SQLException;
import java.util.List;

public interface IProductoDAO {

    List<Producto> listar() throws SQLException;
}
