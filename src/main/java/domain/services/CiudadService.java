package domain.services;

import dao.CiudadDAOImplementacion;
import dao.interfaces.ICiudadDAO;
import domain.Ciudad;

import java.sql.SQLException;
import java.util.List;

public class CiudadService {
    private final ICiudadDAO ciudadDAO;

    public CiudadService() {
        this.ciudadDAO = new CiudadDAOImplementacion();
    }

    public List<Ciudad> listarCiudades(){
        try {
            return ciudadDAO.listar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
