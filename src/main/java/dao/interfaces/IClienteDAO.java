package dao.interfaces;



import domain.Cliente;

import java.sql.SQLException;
import java.util.List;

public interface IClienteDAO {
     void registrar(Cliente cliente) throws SQLException;
     void actualizar(Cliente cliente) throws SQLException;
     void eliminar(Cliente cliente) throws SQLException;
     Cliente obtener(Cliente cliente) throws SQLException;
     List<Cliente> listar() throws SQLException;
}
