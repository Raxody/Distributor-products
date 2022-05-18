package dao.interfaces;


import domain.TelefonoProveedor;

import java.sql.SQLException;
import java.util.List;

public interface ITelefonoProveedor {
     void registrar(TelefonoProveedor telefonoProveedor) throws SQLException;
     void actualizar(TelefonoProveedor telefonoProveedor) throws SQLException;
     void eliminar(TelefonoProveedor telefonoProveedor) throws SQLException;
     List<TelefonoProveedor> obtenerTelefonos(TelefonoProveedor telefonoProveedor) throws SQLException;
     TelefonoProveedor obtener(TelefonoProveedor telefonoProveedor) throws SQLException;
}
