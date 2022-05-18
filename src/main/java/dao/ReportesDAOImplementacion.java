package dao;

import domain.Ciudad;
import domain.Cliente;
import domain.ConductorRuta;
import domain.VentasCliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReportesDAOImplementacion extends Conexion{
    private final String SELECT_VISTA_GASTOS = "SELECT * FROM vista_gastos";
    private final String SELECT_VISTA_VENTAS = "SELECT * FROM vista_venta";
    private final String SELECT_VENTAS_CLIENTE = "SELECT * FROM ventas_cliente(?)";
    private final String SELECT_VENTAS_CIUDAD = " SELECT * FROM ventas_ciudad(?)";

    private final String SELECT_CONDUCTORES_ASIGNADOS = "SELECT * FROM conductores_asignados(?)";


    public String obtenerGastos() throws SQLException {
        String gastos="";
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_VISTA_GASTOS);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                gastos = resultSet.getString("gastos_de_la_empresa");
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return gastos;
    }

    public String obtenerVentas() throws SQLException {
        String ventas="";
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_VISTA_VENTAS);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                ventas = resultSet.getString("venta_total_de_pedidos");
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return ventas;
    }


    public List<VentasCliente> obtenerVentasCliente(Cliente cliente) throws SQLException {
        List<VentasCliente> ventas = new ArrayList<>();
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_VENTAS_CLIENTE);
            statement.setInt(1, cliente.getIdentificacionPersonaCliente());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){

                ventas.add(new VentasCliente(resultSet.getString("nombre"), resultSet.getDouble("total")));
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return ventas;
    }

    public List<Double> obtenerVentasCiudad(Ciudad ciudad) throws SQLException {
        List<Double> ventas = new ArrayList<>();
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_VENTAS_CIUDAD);
            statement.setString(1, ciudad.getCiudad());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){

                ventas.add(new Double(resultSet.getDouble("total")));
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return ventas;
    }


    public List<ConductorRuta> obtenerRutasyConductores(boolean estado) throws SQLException {
        List<ConductorRuta> rutaConductor = new ArrayList<>();
        try {
            this.setConexion();
            PreparedStatement statement = this.conexion.prepareStatement(this.SELECT_CONDUCTORES_ASIGNADOS);
            statement.setBoolean(1, estado);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                rutaConductor.add(new ConductorRuta( resultSet.getString("nombre_persona"), resultSet.getString("nombre_ruta_distribucion") ));
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeConexion();
        }

        return rutaConductor;
    }
}
