package dao;

import dao.interfaces.IConductorDAO;
import domain.Conductor;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ConductorDAOImplementacion extends Conexion implements IConductorDAO {
    private final String INSERT_CONDUCTOR = "INSERT INTO conductor VALUES (?,?,?,?)";
    private final String INSERT_CONDUCTOR_SIN_RUTA = "INSERT INTO conductor(identicacion_persona_conductor,fecha_ingreso, disponibilidad) VALUES (?,?,?)";
    private final String UPDATE_CONDUCTOR = "UPDATE conductor SET fecha_ingreso=?, disponibilidad=?,id_ruta_distribucion=? WHERE identicacion_persona_conductor=?";
    private final String UPDATE_CONDUCTOR_SIN_RUTA = "UPDATE conductor SET fecha_ingreso=?,disponibilidad=?, id_ruta_distribucion=null WHERE identicacion_persona_conductor=?";
    private final String DELETE_CONDUCTOR = "DELETE FROM conductor WHERE identicacion_persona_conductor=?";
    private final String SELECT_ALL_CONDUCTOR = "SELECT identicacion_persona_conductor,fecha_ingreso,disponibilidad,id_ruta_distribucion FROM conductor";
    private final String SELECT_CONDUCTOR = "SELECT identicacion_persona_conductor,fecha_ingreso,disponibilidad,id_ruta_distribucion FROM conductor WHERE identicacion_persona_conductor=?";
    @Override
    public void registrar(Conductor conductor) throws SQLException {
        if(conductor.getIdRutaDistribucion() == -1){
            registrarSinRuta(conductor);
        }else{
            try {
                this.setConexion();
                PreparedStatement statement = this.conexion.prepareStatement(this.INSERT_CONDUCTOR);
                statement.setInt(1, conductor.getIdentificacionPersonaConductor());
                statement.setDate(2, Date.valueOf(conductor.getFechaIngreso()));
                statement.setBoolean(3, false);
                statement.setInt(4, conductor.getIdRutaDistribucion());
                statement.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                this.closeConexion();
            }
        }

    }

    private void registrarSinRuta(Conductor conductor) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.INSERT_CONDUCTOR_SIN_RUTA);
            statement.setInt(1, conductor.getIdentificacionPersonaConductor());
            statement.setDate(2, Date.valueOf(conductor.getFechaIngreso()));
            statement.setBoolean(3, true);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }

    @Override
    public void actualizar(Conductor conductor) throws SQLException {
        if(conductor.getIdRutaDistribucion() == -1){
            actualizarSinRuta(conductor);
        }else {
            try {
                this.setConexion();
                PreparedStatement statement = this.conexion.prepareStatement(this.UPDATE_CONDUCTOR);
                statement.setDate(1, Date.valueOf(conductor.getFechaIngreso()));
                statement.setBoolean(2, false);
                statement.setInt(3, conductor.getIdRutaDistribucion());
                statement.setInt(4, conductor.getIdentificacionPersonaConductor());
                statement.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                this.closeConexion();
            }
        }
    }


    private void actualizarSinRuta(Conductor conductor) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.UPDATE_CONDUCTOR_SIN_RUTA);
            statement.setDate(1, Date.valueOf(conductor.getFechaIngreso()));
            statement.setBoolean(2, true);
            statement.setInt(3, conductor.getIdentificacionPersonaConductor());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }
    }



    @Override
    public void eliminar(Conductor conductor) throws SQLException {
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.DELETE_CONDUCTOR);
            statement.setInt(1, conductor.getIdentificacionPersonaConductor());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

    }

    @Override
    public Conductor obtener(Conductor conductor) throws SQLException {
        Conductor conductorObtener =null;
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_CONDUCTOR);
            statement.setInt(1, conductor.getIdentificacionPersonaConductor());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                conductorObtener = new Conductor(resultSet.getInt("identicacion_persona_conductor"),
                        LocalDate.parse(resultSet.getDate("fecha_ingreso").toLocalDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        resultSet.getBoolean("disponibilidad"),
                        resultSet.getInt("id_ruta_distribucion"));
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return conductorObtener;
    }

    @Override
    public List<Conductor> listar() throws SQLException {
        List<Conductor> lista = new ArrayList<>();
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_ALL_CONDUCTOR);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Conductor conductor = new Conductor(resultSet.getInt("identicacion_persona_conductor"),
                        resultSet.getDate("fecha_ingreso").toLocalDate(),
                        resultSet.getBoolean("disponibilidad"),
                        resultSet.getInt("id_ruta_distribucion"));
                lista.add(conductor);
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return lista;
    }
}
