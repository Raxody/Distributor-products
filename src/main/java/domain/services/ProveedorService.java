package domain.services;

import dao.*;
import dao.interfaces.*;
import domain.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProveedorService {
    private final IProveedorDAO proveedorDAO;
    private final ITelefonoProveedor telefonoDAO;

    public ProveedorService() {
        this.proveedorDAO = new ProveedorDAOImplementacion();
        this.telefonoDAO = new TelefonoProveedorDAOImplementacion();
    }

    public void registrarProveedor(Proveedor proveedor, List<TelefonoProveedor> telefonos) throws Exception {
        try {
            if (proveedorDAO.obtener(proveedor) == null) {
                proveedorDAO.registrar(proveedor);
                for (TelefonoProveedor tel :
                        telefonos) {
                    if (telefonoDAO.obtener(tel) == null) telefonoDAO.registrar(tel);
                }


            }else{
                throw new Exception("Revisa la informacion proporcionada, puede que se encuetre en el sistema");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarProveedor(Proveedor proveedor) {
        try {
            if (proveedorDAO.obtener(proveedor) != null) {
                proveedorDAO.actualizar(proveedor);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Proveedor> obtenerProveedores() {
        List<Proveedor> proveedores = new ArrayList<>();

        try {

            return proveedorDAO.listar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return proveedores;
    }

    public Proveedor consultarProveedor(Proveedor proveedor) {

        try {
            return proveedorDAO.obtener(proveedor);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    public void eliminarProveedor(Proveedor proveedor) {
        try {

            if (proveedorDAO.obtener(proveedor) != null) {
                telefonoDAO.eliminar(new TelefonoProveedor(proveedor.getNit()));
                proveedorDAO.eliminar(proveedor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<TelefonoProveedor> telefonoProvedor(Proveedor proveedor){
        try {
            return telefonoDAO.obtenerTelefonos(new TelefonoProveedor(proveedor.getNit()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
