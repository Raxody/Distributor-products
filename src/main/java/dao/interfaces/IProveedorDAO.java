package dao.interfaces;


import domain.Proveedor;

import java.sql.SQLException;
import java.util.List;

public interface IProveedorDAO {
     void registrar(Proveedor proveedor) throws SQLException;
     void actualizar(Proveedor proveedor) throws SQLException;
     void eliminar(Proveedor proveedor) throws SQLException;
     Proveedor obtener(Proveedor proveedor) throws SQLException;
     List<Proveedor> listar() throws SQLException;
}
