package domain.services;

import dao.PedidoDAOImplementacion;
import dao.RutaDistribucionDAOImplementacion;
import dao.interfaces.IPedidoDAO;
import dao.interfaces.IRutaDistribucionDAO;
import domain.Pedido;
import domain.RutaDistribucion;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PedidoService {
    private final IPedidoDAO pedidoDAO;

    public PedidoService() {
        this.pedidoDAO = new PedidoDAOImplementacion();
    }

    public void registrarPedido(Pedido pedido) throws Exception {
        if (pedidoDAO.obtener(pedido) == null) {
            pedidoDAO.registrar(pedido);
        }else{
            throw new Exception("Revisa la informacion proporcionada, puede que ya exista");
        }
    }


    public Pedido consultarPedido(Pedido pedido) {

        try {
            return pedidoDAO.obtener(pedido);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Pedido obtenerUltimoPedido(){
        try {
            return pedidoDAO.obtenerIngresar();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
        }



    public void eliminarPedido(Pedido pedido) {
        try {
            if (pedidoDAO.obtener(pedido) != null) {
                pedidoDAO.eliminar(pedido);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
