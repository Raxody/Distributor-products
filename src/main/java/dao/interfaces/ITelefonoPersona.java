package dao.interfaces;

import domain.TelefonoPersona;

import java.sql.SQLException;
import java.util.List;

public interface ITelefonoPersona {
     void registrar(TelefonoPersona TelefonoPersona) throws SQLException;
     void actualizar(TelefonoPersona TelefonoPersona) throws SQLException;
     void eliminar(TelefonoPersona TelefonoPersona) throws SQLException;
     List<TelefonoPersona> obtenerTelefonos(TelefonoPersona TelefonoPersona) throws SQLException;
    TelefonoPersona obtener(TelefonoPersona telefonoPersona) throws SQLException;
}
