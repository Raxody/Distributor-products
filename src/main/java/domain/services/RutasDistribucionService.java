package domain.services;

import dao.RutaDistribucionDAOImplementacion;
import dao.interfaces.IRutaDistribucionDAO;
import domain.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RutasDistribucionService {
    private final IRutaDistribucionDAO rutaDistribucionDAO;

    public RutasDistribucionService() {
        this.rutaDistribucionDAO = new RutaDistribucionDAOImplementacion();
    }

    public List<RutaDistribucion> listarRutasDistribucion() {
        try {
            return rutaDistribucionDAO.listar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void registrarRutaDistribucion(RutaDistribucion rutaDistribucion) throws Exception {

            if (rutaDistribucionDAO.obtener(rutaDistribucion) == null) {


                rutaDistribucionDAO.registrar(rutaDistribucion);


            }else{
                throw new Exception("Revisa la informacion proporcionada, puede que ya exista");
            }


    }

    public void actualizarRutaDistribucion(RutaDistribucion rutaDistribucion) {
        try {
            if (rutaDistribucionDAO.obtener(rutaDistribucion) != null) {
                rutaDistribucionDAO.actualizar(rutaDistribucion);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<RutaDistribucion> obtenerRutasDistribucion() {
        List<RutaDistribucion> rutas = new ArrayList<>();

        try {
            return rutaDistribucionDAO.listar();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rutas;
    }

    public RutaDistribucion consultarRutaDistribucion(RutaDistribucion rutaDistribucion) {

        try {
            return rutaDistribucionDAO.obtener(rutaDistribucion);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    public void eliminarRutaDistribucion(RutaDistribucion rutaDistribucion) {
        try {

            if (rutaDistribucionDAO.obtener(rutaDistribucion) != null) {

                rutaDistribucionDAO.eliminar(rutaDistribucion);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
