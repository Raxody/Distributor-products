package domain.services;

import dao.ConductorDAOImplementacion;
import dao.PersonaDAOImplementacion;
import dao.ProductoDAOImplemetacion;
import dao.TelefonoPersonaDAOImplementacion;
import dao.interfaces.IConductorDAO;
import dao.interfaces.IPersonaDAO;
import dao.interfaces.IProductoDAO;
import dao.interfaces.ITelefonoPersona;
import domain.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoService {

    private final IProductoDAO productoDAO;

    public ProductoService() {
        this.productoDAO = new ProductoDAOImplemetacion();
    }


    public List<Producto> obtenerProductosArticulo() {
        List<Producto> productos = new ArrayList<>();
            try {
                return productoDAO.listar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return productos;
    }



}
