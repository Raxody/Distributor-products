package dao.interfaces;

import domain.Persona;

import java.sql.SQLException;
import java.util.List;

public interface IPersonaDAO {
     void registrar(Persona persona) throws SQLException;
     void actualizar(Persona persona) throws SQLException;
     void eliminar(Persona persona) throws SQLException;
     Persona obtener(Persona persona) throws SQLException;
     List<Persona> listar() throws SQLException;
}
