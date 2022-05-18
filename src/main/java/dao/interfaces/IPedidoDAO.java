package dao.interfaces;
import domain.Pedido;
import java.sql.SQLException;

public interface IPedidoDAO {
    void registrar(Pedido pedido) throws SQLException;
    void eliminar(Pedido pedido) throws SQLException;
    Pedido obtener(Pedido pedido) throws SQLException;
    Pedido obtenerIngresar() throws SQLException;
}
