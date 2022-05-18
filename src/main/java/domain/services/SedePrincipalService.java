package domain.services;

import dao.PedidoDAOImplementacion;
import dao.SedePrincipalDAOImplementacion;
import dao.interfaces.IPedidoDAO;
import dao.interfaces.ISedePrincipal;
import domain.Pedido;
import domain.SedePrincipal;

import java.sql.SQLException;

public class SedePrincipalService {
    private final ISedePrincipal sedePrincipalDAO;

    public SedePrincipalService() {
        this.sedePrincipalDAO = new SedePrincipalDAOImplementacion();
    }

    public void registrarSedePrincipal(SedePrincipal sedePrincipal) throws Exception {
            sedePrincipalDAO.registrar(sedePrincipal);
    }


    public SedePrincipal consultarSedePrincipal(SedePrincipal sedePrincipal) {

        try {
            return sedePrincipalDAO.obtener(sedePrincipal);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    public void eliminarSedePrincipal(SedePrincipal sedePrincipal) {
        try {
            if (sedePrincipalDAO.obtener(sedePrincipal) != null) {
                sedePrincipalDAO.eliminar(sedePrincipal);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
