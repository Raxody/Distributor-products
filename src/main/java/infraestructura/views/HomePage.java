/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package infraestructura.views;

import domain.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felip
 */
public class HomePage extends javax.swing.JFrame {

    public JButton getBtnAgregarTelefonoCliente() {
        return btnAgregarTelefonoCliente;
    }

    public JPanel getPanelReportes() {
        return panelReportes;
    }

    public JComboBox<String> getCmbConductoresAsignados() {
        return cmbConductoresAsignados;
    }

    public JLabel getLblGastos() {
        return lblGastos;
    }

    public JLabel getLblVentas() {
        return lblVentas;
    }

    public JButton getBtnAgregarTelefonoProveedor() {
        return btnAgregarTelefonoProveedor;
    }

    public JButton getBtnClienteDelete() {
        return btnClienteDelete;
    }

    public JButton getBtnClienteUpdate() {
        return btnClienteUpdate;
    }

    public JButton getBtnConductorDelete() {
        return btnConductorDelete;
    }

    public JButton getBtnConductorUpdate() {
        return btnConductorUpdate;
    }

    public JButton getBtnProveedorDelete() {
        return btnProveedorDelete;
    }

    public JButton getBtnProveedorUpdate() {
        return btnProveedorUpdate;
    }

    public JButton getBtnRegistarConductor() {
        return btnRegistarConductor;
    }

    public JButton getBtnRegistarRuta() {
        return btnRegistarRuta;
    }

    public JButton getBtnRegistrarCliente() {
        return btnRegistrarCliente;
    }

    public JButton getBtnRegistrarProveedor() {
        return btnRegistrarProveedor;
    }

    public JButton getBtnRutaDelete() {
        return btnRutaDelete;
    }

    public JButton getBtnRutaUpdate() {
        return btnRutaUpdate;
    }

    //  public JButton getBtnTelefonoConductorUpdate() {
    //     return btnTelefonoConductorUpdate;
    // }
    public JButton getBtnTelefonosConductor() {
        return btnTelefonosConductor;
    }

    public JComboBox<String> getCmbCiudadCliente() {
        return cmbCiudadCliente;
    }

    public JComboBox<String> getCmbCiudadClienteUpdate() {
        return cmbCiudadClienteUpdate;
    }

    public JComboBox<String> getCmbCiudadRuta() {
        return cmbCiudadRuta;
    }

    public JComboBox<String> getCmbCiudadRutaUpdate() {
        return cmbCiudadRutaUpdate;
    }

    public JComboBox<String> getCmbIdRutaUpdate() {
        return cmbIdRutaUpdate;
    }

    public JComboBox<String> getCmbIdentificacionUpdate() {
        return cmbIdentificacionUpdate;
    }

    public JComboBox<String> getCmbIdentificacionUpdateCliente() {
        return cmbIdentificacionUpdateCliente;
    }

    public JComboBox<String> getCmbNitProveedorUpdate() {
        return cmbNitProveedorUpdate;
    }

    public JComboBox<String> getCmbRutaConductor() {
        return cmbRutaConductor;
    }

    public JComboBox<String> getCmbRutaConductorUpdate() {
        return cmbRutaConductorUpdate;
    }

    public JTable getTbConductorTelefonoUpdate() {
        return tbConductorTelefonoUpdate;
    }

    public JTable getTblTelefonosConductor() {
        return tblTelefonosConductor;
    }

    public JTable getTbtTelefonoCliente() {
        return tbtTelefonoCliente;
    }

    public JTable getTbtTelefonoClienteUpdate() {
        return tbtTelefonoClienteUpdate;
    }

    public JTable getTbtTelefonoProveedor() {
        return tbtTelefonoProveedor;
    }

    public JTable getTbtTelefonoProveedorUpdate() {
        return tbtTelefonoProveedorUpdate;
    }

    public JFormattedTextField getTxtCostoRuta() {
        return txtCostoRuta;
    }

    public JFormattedTextField getTxtCostoRutaUpdate() {
        return txtCostoRutaUpdate;
    }

    public JTextField getTxtDireccionCliente() {
        return txtDireccionCliente;
    }

    public JTextField getTxtDireccionClienteUpdate() {
        return txtDireccionClienteUpdate;
    }

    public JTextField getTxtDireccionConductor() {
        return txtDireccionConductor;
    }

    public JTextField getTxtDireccionConductorUpdate() {
        return txtDireccionConductorUpdate;
    }

    public JTextField getTxtDireccionProveedor() {
        return txtDireccionProveedor;
    }

    public JTextField getTxtDireccionProveedorUpdate() {
        return txtDireccionProveedorUpdate;
    }

    public JFormattedTextField getTxtFechaAperturaRuta() {
        return txtFechaAperturaRuta;
    }

    public JFormattedTextField getTxtFechaAperturaRutaUpdate() {
        return txtFechaAperturaRutaUpdate;
    }

    public JFormattedTextField getTxtFechaCambioCostoRuta() {
        return txtFechaCambioCostoRuta;
    }

    public JFormattedTextField getTxtFechaCambioCostoRutaUpdate() {
        return txtFechaCambioCostoRutaUpdate;
    }

    public JFormattedTextField getTxtFechaEntregaProductoCliente() {
        return txtFechaEntregaProductoCliente;
    }

    public JFormattedTextField getTxtFechaEntregaProductoClienteUpdate() {
        return txtFechaEntregaProductoClienteUpdate;
    }

    public JFormattedTextField getTxtFechaIngresoConductor() {
        return txtFechaIngresoConductor;
    }

    public JFormattedTextField getTxtFechaIngresoConductorUpdate() {
        return txtFechaIngresoConductorUpdate;
    }

    public JComboBox<String> getCmbClienteVentas() {
        return cmbClienteVentas;
    }

    public void setCmbClienteVentas(JComboBox<String> cmbClienteVentas) {
        this.cmbClienteVentas = cmbClienteVentas;
    }

    public JFormattedTextField getTxtIdRuta() {
        return txtIdRuta;
    }

    public JFormattedTextField getTxtIdentificacionCliente() {
        return txtIdentificacionCliente;
    }

    public JFormattedTextField getTxtIdentificacionConductor() {
        return txtIdentificacionConductor;
    }

    public JFormattedTextField getTxtNitProveedor() {
        return txtNitProveedor;
    }

    public JTextField getTxtNombreCliente() {
        return txtNombreCliente;
    }

    public JTextField getTxtNombreClienteUpdate() {
        return txtNombreClienteUpdate;
    }

    public JTextField getTxtNombreConductor() {
        return txtNombreConductor;
    }

    public JTextField getTxtNombreConductorUpdate() {
        return txtNombreConductorUpdate;
    }

    public JTextField getTxtNombreContactoProveedorUpdate() {
        return txtNombreContactoProveedorUpdate;
    }

    public JTextField getTxtNombreProveedor() {
        return txtNombreProveedor;
    }

    public JTextField getTxtNombreProveedorUpdate() {
        return txtNombreProveedorUpdate;
    }

    public JTextField getTxtNombreRuta() {
        return txtNombreRuta;
    }

    public JTextField getTxtNombreRutaUpdate() {
        return txtNombreRutaUpdate;
    }

    public JTextField getTxtPersonaContactoProveedor() {
        return txtPersonaContactoProveedor;
    }

    public JFormattedTextField getTxtTelefonoCliente() {
        return txtTelefonoCliente;
    }

    public JButton getBtnRefreshCambios() {
        return btnRefreshCambios;
    }

    public JTable getTbtRutaConductor() {
        return tbtRutaConductor;
    }

    public JFormattedTextField getTxtTelefonoConductor() {
        return txtTelefonoConductor;
    }

    //   public JFormattedTextField getTxtTelefonoConductorUpdate() {
    //      return txtTelefonoConductorUpdate;
    // }
    public JFormattedTextField getTxtTelefonoProveedor() {
        return txtTelefonoProveedor;
    }

    public JButton getBtnAgregarProductoVentas() {
        return btnAgregarProductoVentas;
    }

    public void setBtnAgregarProductoVentas(JButton btnAgregarProductoVentas) {
        this.btnAgregarProductoVentas = btnAgregarProductoVentas;
    }

    public JButton getBtnGenerarVentaVentas() {
        return btnGenerarVentaVentas;
    }

    public void setBtnGenerarVentaVentas(JButton btnGenerarVentaVentas) {
        this.btnGenerarVentaVentas = btnGenerarVentaVentas;
    }

    public JComboBox<String> getCmbProductoVentas() {
        return cmbProductoVentas;
    }

    public void setCmbProductoVentas(JComboBox<String> cmbProductoVentas) {
        this.cmbProductoVentas = cmbProductoVentas;
    }

    public JComboBox<String> getCmbRutaDistribuiconVentas() {
        return cmbRutaDistribuiconVentas;
    }

    public void setCmbRutaDistribuiconVentas(JComboBox<String> cmbRutaDistribuiconVentas) {
        this.cmbRutaDistribuiconVentas = cmbRutaDistribuiconVentas;
    }

    public JTable getTbtProductosVentas() {
        return tbtProductosVentas;
    }

    public void setTbtProductosVentas(JTable tbtProductosVentas) {
        this.tbtProductosVentas = tbtProductosVentas;
    }

    public JFormattedTextField getTxtCantidadProductoVentas() {
        return txtCantidadProductoVentas;
    }

    public void setTxtCantidadProductoVentas(JFormattedTextField txtCantidadProductoVentas) {
        this.txtCantidadProductoVentas = txtCantidadProductoVentas;
    }

    public JFormattedTextField getTxtValorVentas() {
        return txtValorVentas;
    }

    public void setTxtValorVentas(JFormattedTextField txtValorVentas) {
        this.txtValorVentas = txtValorVentas;
    }

    public void borrarDatosTablaTelefonoConductores() {
        DefaultTableModel tb = (DefaultTableModel) this.tblTelefonosConductor.getModel();
        int a = tb.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
        this.tblTelefonosConductor.setModel(tb);
    }

    public JComboBox<String> getCmbVentasPorCiudad() {
        return cmbVentasPorCiudad;
    }

    public JComboBox<String> getCmbVentasPorCliente() {
        return cmbVentasPorCliente;
    }

    public JTable getTbtTablaVentasPorCiudad() {
        return tbtTablaVentasPorCiudad;
    }

    public JTable getTbtTablaVentasPorCliente() {
        return tbtTablaVentasPorCliente;
    }

    public void borrarDatosVentasPorCiudad() {
        DefaultTableModel tb = (DefaultTableModel) this.tbtTablaVentasPorCiudad.getModel();
        int a = tb.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
        this.tbtTablaVentasPorCiudad.setModel(tb);
    }

    public void borrarDatosVentasPorCliente() {
        DefaultTableModel tb = (DefaultTableModel) this.tbtTablaVentasPorCliente.getModel();
        int a = tb.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
        this.tbtTablaVentasPorCliente.setModel(tb);
    }

    public void borrarDatosRutaConductor() {
        DefaultTableModel tb = (DefaultTableModel) this.tbtRutaConductor.getModel();
        int a = tb.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
        this.tbtRutaConductor.setModel(tb);
    }

    public void borrarDatosTablaTelefonoProveedores() {
        DefaultTableModel tb = (DefaultTableModel) this.tbtTelefonoProveedor.getModel();
        int a = tb.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
        this.tbtTelefonoProveedor.setModel(tb);
    }

    public void establecerRutasConductor(List<ConductorRuta> conductorRuta) {
        DefaultTableModel tb = (DefaultTableModel) this.tbtRutaConductor.getModel();
        conductorRuta.stream().forEach(rutaCond -> tb.addRow(new Object[]{rutaCond.getNombre(), rutaCond.getRuta()}));
        this.tbtRutaConductor.setModel(tb);
    }

    public void establecerProductosVentas(List<Articulo> articulo) {
        DefaultTableModel tb = (DefaultTableModel) this.tbtProductosVentas.getModel();
        articulo.stream().forEach(arti -> tb.addRow(new Object[]{arti.getNombre(), arti.getCantidad(), arti.getPrecio(),
            (arti.getPrecio() * arti.getCantidad())}));
        this.tbtProductosVentas.setModel(tb);
    }

    public void establecerVentasPorCiudad(List<Double> totales) {
        DefaultTableModel tb = (DefaultTableModel) this.tbtTablaVentasPorCiudad.getModel();

        totales.forEach(number -> tb.addRow(new Object[]{number}));
        this.tbtTablaVentasPorCiudad.setModel(tb);
    }

    public void establecerVentasPorCliente(List<VentasCliente> ventas) {
        DefaultTableModel tb = (DefaultTableModel) this.tbtTablaVentasPorCliente.getModel();

        ventas.forEach(vent -> tb.addRow(new Object[]{vent.getNombre(), vent.getTotal()}));
        this.tbtTablaVentasPorCliente.setModel(tb);
    }

    public void establecerTelefonosConductor(List<TelefonoPersona> telefonos) {
        DefaultTableModel tb = (DefaultTableModel) this.tblTelefonosConductor.getModel();

        telefonos.stream().map(tel -> tel.getTelefono()).distinct().forEach(tele -> tb.addRow(new Object[]{tele}));
        this.tblTelefonosConductor.setModel(tb);
    }

    public void establecerTelefonosProveedor(List<TelefonoProveedor> telefonos) {
        DefaultTableModel tb = (DefaultTableModel) this.tbtTelefonoProveedor.getModel();

        telefonos.stream().map(tel -> tel.getTelefono()).distinct().forEach(tele -> tb.addRow(new Object[]{tele}));
        this.tbtTelefonoProveedor.setModel(tb);
    }

    public void borrarDatosTablaTelefonoCliente() {
        DefaultTableModel tb = (DefaultTableModel) this.tbtTelefonoCliente.getModel();
        int a = tb.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
        this.tbtTelefonoCliente.setModel(tb);
    }

    public void borrarDatosTablaProductosVentas() {
        DefaultTableModel tb = (DefaultTableModel) this.tbtProductosVentas.getModel();
        int a = tb.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
        this.tbtProductosVentas.setModel(tb);
    }

    public void establecerTelefonosCliente(List<TelefonoPersona> telefonos) {
        DefaultTableModel tb = (DefaultTableModel) this.tbtTelefonoCliente.getModel();

        telefonos.stream().map(tel -> tel.getTelefono()).distinct().forEach(tele -> tb.addRow(new Object[]{tele}));
        this.tbtTelefonoCliente.setModel(tb);
    }

    public void borrarDatosTablaTelefonoConductoresUpdate() {
        DefaultTableModel tb = (DefaultTableModel) this.tbConductorTelefonoUpdate.getModel();
        int a = tb.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
        this.tbConductorTelefonoUpdate.setModel(tb);
    }

    public void borrarDatosTablaTelefonoProveedoresUpdate() {
        DefaultTableModel tb = (DefaultTableModel) this.tbtTelefonoProveedorUpdate.getModel();
        int a = tb.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
        this.tbtTelefonoProveedorUpdate.setModel(tb);
    }

    public void borrarDatosTablaTelefonoClientesUpdate() {
        DefaultTableModel tb = (DefaultTableModel) this.tbtTelefonoClienteUpdate.getModel();
        int a = tb.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
        this.tbtTelefonoClienteUpdate.setModel(tb);
    }

    public List<TelefonoPersona> obtenerDatosTelefonosConductorUpdate() {
        List<TelefonoPersona> telefonos = new ArrayList<>();
        for (int i = 0; i < tbConductorTelefonoUpdate.getRowCount(); i++) {
            telefonos.add(new TelefonoPersona(Integer.valueOf((String) cmbIdentificacionUpdate.getSelectedItem()), (String) tbConductorTelefonoUpdate.getValueAt(i, 0)));
        }
        return telefonos;
    }

    public void establecerTelefonosConductorUpdate(List<TelefonoPersona> telefonos) {
        DefaultTableModel tb = (DefaultTableModel) this.tbConductorTelefonoUpdate.getModel();

        telefonos.stream().map(tel -> tel.getTelefono()).distinct().forEach(tele -> tb.addRow(new Object[]{tele}));
        this.tbConductorTelefonoUpdate.setModel(tb);
    }

    public void establecerTelefonosProveedorUpdate(List<TelefonoProveedor> telefonos) {
        DefaultTableModel tb = (DefaultTableModel) this.tbtTelefonoProveedorUpdate.getModel();

        telefonos.stream().map(tel -> tel.getTelefono()).distinct().forEach(tele -> tb.addRow(new Object[]{tele}));
        this.tbtTelefonoProveedorUpdate.setModel(tb);
    }

    public void establecerTelefonosClienteUpdate(List<TelefonoPersona> telefonos) {
        DefaultTableModel tb = (DefaultTableModel) this.tbtTelefonoClienteUpdate.getModel();

        telefonos.stream().map(tel -> tel.getTelefono()).distinct().forEach(tele -> tb.addRow(new Object[]{tele}));
        this.tbtTelefonoClienteUpdate.setModel(tb);
    }

    public void establecerRutasCondutor(List<RutaDistribucion> rutas) {
        this.cmbRutaConductor.removeAllItems();
        cmbRutaConductor.addItem("Sin ruta");
        rutas.forEach(ruta -> cmbRutaConductor.addItem(ruta.getNombre()));
    }

    public void establecerRutasVentas(List<RutaDistribucion> rutas) {
        this.cmbRutaDistribuiconVentas.removeAllItems();
        rutas.forEach(ruta -> cmbRutaDistribuiconVentas.addItem(ruta.getNombre()));
    }


     public void establecerClientesVentas(List<Cliente> clientes){
        this.cmbClienteVentas.removeAllItems();
         clientes.forEach(salesperson -> cmbClienteVentas.addItem(""+salesperson.getIdentificacionPersonaCliente()));
    }
    public void establecerVentasPorClienteCmb(List<Persona> clientes) {
        this.cmbVentasPorCliente.removeAllItems();
        clientes.forEach(client -> cmbVentasPorCliente.addItem(client.getIdentificacion() + ""));
    }

    public void establecerVentasPorCiudadCmb(List<Ciudad> ciudades) {
        this.cmbVentasPorCiudad.removeAllItems();
        ciudades.forEach(city -> cmbVentasPorCiudad.addItem(city.getCiudad()));
    }

    public void establecerRutasCondutorUpdate(List<RutaDistribucion> rutas) {
        this.cmbRutaConductorUpdate.removeAllItems();
        cmbRutaConductorUpdate.addItem("Sin ruta");
        rutas.forEach(ruta -> cmbRutaConductorUpdate.addItem(ruta.getNombre()));
    }

    public void establecerIdentificacionesCondutorUpdate(List<Persona> conductores) {
        this.cmbIdentificacionUpdate.removeAllItems();
        conductores.forEach(conductor -> cmbIdentificacionUpdate.addItem(String.valueOf(conductor.getIdentificacion())));
    }

    public void establecerIdentificacionesClienteUpdate(List<Persona> clientes) {
        this.cmbIdentificacionUpdateCliente.removeAllItems();
        clientes.forEach(cliente -> cmbIdentificacionUpdateCliente.addItem(String.valueOf(cliente.getIdentificacion())));
    }

    public void establecerNitProveedorUpdate(List<Proveedor> proveedores) {
        this.cmbNitProveedorUpdate.removeAllItems();
        proveedores.forEach(proveedor -> cmbNitProveedorUpdate.addItem(String.valueOf(proveedor.getNit())));
    }

    public void establecerIdRutaUpdate(List<RutaDistribucion> rutas) {
        this.cmbIdRutaUpdate.removeAllItems();
        rutas.forEach(ruta -> cmbIdRutaUpdate.addItem(String.valueOf(ruta.getId())));
    }

    public void establecerCiudades(List<Ciudad> ciudades) {
        this.cmbCiudadCliente.removeAllItems();
        ciudades.forEach(city -> cmbCiudadCliente.addItem(city.getCiudad()));
    }

    public void establecerProductosParaVentas(List<Producto> productos) {
        this.cmbProductoVentas.removeAllItems();
        productos.forEach(product -> cmbProductoVentas.addItem(product.getNombre() + ""));
    }

    public void establecerCiudadesRutasDistribucion(List<Ciudad> ciudades) {
        this.cmbCiudadRuta.removeAllItems();
        ciudades.forEach(city -> cmbCiudadRuta.addItem(city.getCiudad()));
    }

    public void establecerCiudadesRutasDistribucionUpdate(List<Ciudad> ciudades) {
        this.cmbCiudadRutaUpdate.removeAllItems();
        ciudades.forEach(city -> cmbCiudadRutaUpdate.addItem(city.getCiudad()));
    }

    public void establecerCiudadesUpdate(List<Ciudad> ciudades) {
        this.cmbCiudadClienteUpdate.removeAllItems();
        ciudades.forEach(city -> cmbCiudadClienteUpdate.addItem(city.getCiudad()));
    }

    public void limpiarRegistrarConductor() {
        this.borrarDatosTablaTelefonoConductores();
        this.txtIdentificacionConductor.setText("");
        this.txtDireccionConductor.setText("");
        this.txtNombreConductor.setText("");
        this.txtFechaIngresoConductor.setText("");
    }

    public void limpiarRegistrarConductorUpdate() {
        this.borrarDatosTablaTelefonoConductoresUpdate();
        this.txtDireccionConductorUpdate.setText("");
        this.txtNombreConductorUpdate.setText("");
        this.txtFechaIngresoConductorUpdate.setText("");
    }

    public void limpiarRegistrarClienteUpdate() {
        this.borrarDatosTablaTelefonoClientesUpdate();
        this.txtDireccionClienteUpdate.setText("");
        this.txtNombreClienteUpdate.setText("");
        this.txtFechaEntregaProductoClienteUpdate.setText("");
    }

    public void limpiarRegistrarCliente() {
        this.borrarDatosTablaTelefonoCliente();
        this.txtIdentificacionCliente.setText("");
        this.txtDireccionCliente.setText("");
        this.txtNombreCliente.setText("");
        this.txtFechaEntregaProductoCliente.setText("");
    }

    public void limpiarRegistrarProveedor() {
        this.borrarDatosTablaTelefonoProveedores();
        this.txtNitProveedor.setText("");
        this.txtPersonaContactoProveedor.setText("");
        this.txtNombreProveedor.setText("");
        this.txtDireccionProveedor.setText("");
    }

    public void limpiarRegistrarProveedorUpdate() {
        this.borrarDatosTablaTelefonoProveedoresUpdate();
        this.txtNombreContactoProveedorUpdate.setText("");
        this.txtNombreProveedorUpdate.setText("");
        this.txtDireccionProveedorUpdate.setText("");
    }

    public void limpiarRegistrarRuta() {

        this.txtCostoRuta.setText("");
        this.txtIdRuta.setText("");
        this.txtFechaAperturaRuta.setText("");
        this.txtFechaCambioCostoRuta.setText("");
        this.txtNombreRuta.setText("");
    }

    public void limpiarRegistrarRutaUpdate() {

        this.txtCostoRutaUpdate.setText("");
        this.txtFechaAperturaRutaUpdate.setText("");
        this.txtFechaCambioCostoRutaUpdate.setText("");
        this.txtNombreRutaUpdate.setText("");
    }

    public void alert(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Alerta", JOptionPane.ERROR_MESSAGE);
    }

    public void info(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneMain = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        txtIdentificacionConductor = new javax.swing.JFormattedTextField();
        txtNombreConductor = new javax.swing.JTextField();
        txtDireccionConductor = new javax.swing.JTextField();
        txtFechaIngresoConductor = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTelefonosConductor = new javax.swing.JTable();
        txtTelefonoConductor = new javax.swing.JFormattedTextField();
        btnTelefonosConductor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbRutaConductor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnRegistarConductor = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreConductorUpdate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDireccionConductorUpdate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbConductorTelefonoUpdate = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFechaIngresoConductorUpdate = new javax.swing.JFormattedTextField();
        cmbRutaConductorUpdate = new javax.swing.JComboBox<>();
        btnConductorDelete = new javax.swing.JButton();
        cmbIdentificacionUpdate = new javax.swing.JComboBox<>();
        btnConductorUpdate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtIdentificacionCliente = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbtTelefonoCliente = new javax.swing.JTable();
        txtTelefonoCliente = new javax.swing.JFormattedTextField();
        btnAgregarTelefonoCliente = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        txtFechaEntregaProductoCliente = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        cmbCiudadCliente = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtNombreClienteUpdate = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtDireccionClienteUpdate = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbtTelefonoClienteUpdate = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtFechaEntregaProductoClienteUpdate = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        cmbCiudadClienteUpdate = new javax.swing.JComboBox<>();
        cmbIdentificacionUpdateCliente = new javax.swing.JComboBox<>();
        btnClienteUpdate = new javax.swing.JButton();
        btnClienteDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        txtNitProveedor = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtPersonaContactoProveedor = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        txtDireccionProveedor = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        btnRegistrarProveedor = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbtTelefonoProveedor = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        txtTelefonoProveedor = new javax.swing.JFormattedTextField();
        btnAgregarTelefonoProveedor = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtNombreContactoProveedorUpdate = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtNombreProveedorUpdate = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtDireccionProveedorUpdate = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbtTelefonoProveedorUpdate = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        btnProveedorDelete = new javax.swing.JButton();
        btnProveedorUpdate = new javax.swing.JButton();
        cmbNitProveedorUpdate = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtIdRuta = new javax.swing.JFormattedTextField();
        cmbCiudadRuta = new javax.swing.JComboBox<>();
        txtNombreRuta = new javax.swing.JTextField();
        txtFechaCambioCostoRuta = new javax.swing.JFormattedTextField();
        txtFechaAperturaRuta = new javax.swing.JFormattedTextField();
        txtCostoRuta = new javax.swing.JFormattedTextField();
        btnRegistarRuta = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        txtCostoRutaUpdate = new javax.swing.JFormattedTextField();
        txtFechaCambioCostoRutaUpdate = new javax.swing.JFormattedTextField();
        txtFechaAperturaRutaUpdate = new javax.swing.JFormattedTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtNombreRutaUpdate = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        cmbCiudadRutaUpdate = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        cmbIdRutaUpdate = new javax.swing.JComboBox<>();
        btnRutaUpdate = new javax.swing.JButton();
        btnRutaDelete = new javax.swing.JButton();
        panelReportes = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbtRutaConductor = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cmbConductoresAsignados = new javax.swing.JComboBox<>();
        btnRefreshCambios = new javax.swing.JButton();
        lblGastos = new javax.swing.JLabel();
        lblVentas = new javax.swing.JLabel();
        cmbVentasPorCliente = new javax.swing.JComboBox<>();
        cmbVentasPorCiudad = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbtTablaVentasPorCiudad = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbtTablaVentasPorCliente = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        txtCantidadProductoVentas = new javax.swing.JFormattedTextField();
        jLabel59 = new javax.swing.JLabel();
        txtValorVentas = new javax.swing.JFormattedTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbtProductosVentas = new javax.swing.JTable();
        btnAgregarProductoVentas = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        cmbProductoVentas = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        cmbRutaDistribuiconVentas = new javax.swing.JComboBox<>();
        btnGenerarVentaVentas = new javax.swing.JButton();
        cmbClienteVentas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALIMENTAMOS APP");

        txtIdentificacionConductor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        txtFechaIngresoConductor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel1.setText("Identificacion");

        jLabel2.setText("Nombre ");

        jLabel3.setText("Direccion");

        jLabel4.setText("Fecha ingreso");

        tblTelefonosConductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Telefono"
            }
        ));
        jScrollPane1.setViewportView(tblTelefonosConductor);

        txtTelefonoConductor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        btnTelefonosConductor.setText("Agregar Telefono");

        jLabel5.setText("Telefonos*");

        cmbRutaConductor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbRutaConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRutaConductorActionPerformed(evt);
            }
        });

        jLabel7.setText("Ruta de distribucion*");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel8.setText("Las entradas con (*) son opcionales, por defecto");

        btnRegistarConductor.setBackground(new java.awt.Color(102, 204, 255));
        btnRegistarConductor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistarConductor.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistarConductor.setText("Guardar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdentificacionConductor, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(txtNombreConductor)
                            .addComponent(txtDireccionConductor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaIngresoConductor)
                            .addComponent(cmbRutaConductor, 0, 164, Short.MAX_VALUE))
                        .addGap(55, 55, 55))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtTelefonoConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnTelefonosConductor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                                .addComponent(btnRegistarConductor)
                                .addGap(89, 89, 89))))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacionConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtFechaIngresoConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(cmbRutaConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefonoConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTelefonosConductor)
                            .addComponent(btnRegistarConductor)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar conductor", jPanel5);

        jLabel9.setText("Identificacion");

        jLabel10.setText("Nombre ");

        jLabel11.setText("Direccion");

        tbConductorTelefonoUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Telefono"
            }
        ));
        jScrollPane2.setViewportView(tbConductorTelefonoUpdate);

        jLabel12.setText("Telefonos");

        jLabel13.setText("Ruta de distribucion");

        jLabel15.setText("Fecha ingreso");

        txtFechaIngresoConductorUpdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        cmbRutaConductorUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnConductorDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnConductorDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConductorDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnConductorDelete.setText("Eliminar");

        cmbIdentificacionUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnConductorUpdate.setBackground(new java.awt.Color(102, 204, 255));
        btnConductorUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConductorUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnConductorUpdate.setText("Actualizar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(402, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConductorUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConductorDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbRutaConductorUpdate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(cmbIdentificacionUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombreConductorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDireccionConductorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(18, 18, 18)
                    .addComponent(txtFechaIngresoConductorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(cmbIdentificacionUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRutaConductorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnConductorUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnConductorDelete)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtFechaIngresoConductorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreConductorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDireccionConductorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addContainerGap(226, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Actualizar, Eliminar y consultar", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPaneMain.addTab("Conductores", jPanel1);

        jLabel16.setText("Identificacion");

        txtIdentificacionCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel17.setText("Nombre ");

        jLabel18.setText("Direccion");

        jLabel19.setText("Telefonos*");

        tbtTelefonoCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Telefono"
            }
        ));
        jScrollPane3.setViewportView(tbtTelefonoCliente);

        txtTelefonoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#########"))));

        btnAgregarTelefonoCliente.setText("Agregar Telefono");

        btnRegistrarCliente.setBackground(new java.awt.Color(102, 204, 255));
        btnRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setText("Guardar");

        txtFechaEntregaProductoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel20.setText("Fecha entrega producto");

        cmbCiudadCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel21.setText("Ciudad");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel50.setText("Las entradas con (*) son opcionales, por defecto");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(cmbCiudadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarTelefonoCliente)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarCliente)
                .addGap(77, 77, 77))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel50))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17)
                                .addComponent(jLabel18))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIdentificacionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addComponent(txtNombreCliente)
                                .addComponent(txtDireccionCliente))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(txtFechaEntregaProductoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(69, 486, Short.MAX_VALUE)))
                    .addGap(48, 48, 48)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addGap(53, 53, 53)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCiudadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarTelefonoCliente)
                        .addContainerGap(108, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarCliente)
                        .addGap(110, 110, 110))))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdentificacionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(txtFechaEntregaProductoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Registrar cliente", jPanel7);

        jLabel22.setText("Identificacion");

        jLabel23.setText("Nombre ");

        jLabel24.setText("Direccion");

        tbtTelefonoClienteUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Telefono"
            }
        ));
        jScrollPane4.setViewportView(tbtTelefonoClienteUpdate);

        jLabel25.setText("Telefonos");

        jLabel26.setText("Fecha entrega producto");

        txtFechaEntregaProductoClienteUpdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel27.setText("Ciudad");

        cmbCiudadClienteUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbIdentificacionUpdateCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnClienteUpdate.setBackground(new java.awt.Color(102, 204, 255));
        btnClienteUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClienteUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnClienteUpdate.setText("Actualizar");

        btnClienteDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnClienteDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClienteDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnClienteDelete.setText("Eliminar");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbIdentificacionUpdateCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreClienteUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionClienteUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaEntregaProductoClienteUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCiudadClienteUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnClienteDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(btnClienteUpdate)
                        .addGap(118, 118, 118))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cmbIdentificacionUpdateCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txtFechaEntregaProductoClienteUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCiudadClienteUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel23)
                    .addComponent(txtNombreClienteUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel24))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccionClienteUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnClienteUpdate)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(btnClienteDelete)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))))
        );

        jTabbedPane2.addTab("Actualizar, Eliminar y consultar", jPanel8);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPaneMain.addTab("Clientes", jPanel2);

        txtNitProveedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel28.setText("Nit");

        jLabel29.setText("Persona contacto");

        jLabel30.setText("Nombre");

        jLabel31.setText("Direccion");

        btnRegistrarProveedor.setBackground(new java.awt.Color(102, 204, 255));
        btnRegistrarProveedor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarProveedor.setText("Guardar");

        tbtTelefonoProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Telefono"
            }
        ));
        jScrollPane5.setViewportView(tbtTelefonoProveedor);

        jLabel32.setText("Telefonos proveedor*");

        txtTelefonoProveedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#########"))));

        btnAgregarTelefonoProveedor.setText("Agregar Telefono");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel51.setText("Las entradas con (*) son opcionales, por defecto");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPersonaContactoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarTelefonoProveedor)
                            .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(btnRegistrarProveedor)
                        .addGap(249, 249, 249))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addGap(19, 19, 19)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtNitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtPersonaContactoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarTelefonoProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnRegistrarProveedor)
                .addGap(29, 29, 29))
        );

        jTabbedPane3.addTab("Registrar proveedor", jPanel9);

        jLabel33.setText("Nit");

        jLabel34.setText("Persona contacto");

        jLabel35.setText("Nombre");

        jLabel36.setText("Direccion");

        tbtTelefonoProveedorUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Telefono"
            }
        ));
        jScrollPane6.setViewportView(tbtTelefonoProveedorUpdate);

        jLabel37.setText("Telefonos proveedor*");

        btnProveedorDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnProveedorDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnProveedorDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedorDelete.setText("Eliminar");

        btnProveedorUpdate.setBackground(new java.awt.Color(102, 204, 255));
        btnProveedorUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnProveedorUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedorUpdate.setText("Actualizar");

        cmbNitProveedorUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionProveedorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreContactoProveedorUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(txtNombreProveedorUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(cmbNitProveedorUpdate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnProveedorUpdate)
                        .addGap(70, 70, 70)
                        .addComponent(btnProveedorDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap(565, Short.MAX_VALUE)
                        .addComponent(jLabel37)))
                .addGap(68, 68, 68))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(cmbNitProveedorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(txtNombreContactoProveedorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreProveedorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txtDireccionProveedorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProveedorUpdate)
                    .addComponent(btnProveedorDelete))
                .addGap(31, 31, 31))
        );

        jTabbedPane3.addTab("Actualizar, Eliminar y consultar", jPanel10);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPaneMain.addTab("Proveedores", jPanel3);

        jLabel38.setText("ID");

        jLabel39.setText("Ciudad destino");

        jLabel40.setText("Nombre");

        jLabel41.setText("Fecha Apertura");

        jLabel42.setText("Fecha cambio costo");

        jLabel43.setText("Costo ruta");

        txtIdRuta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        cmbCiudadRuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtFechaCambioCostoRuta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        txtFechaAperturaRuta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        txtCostoRuta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####0.###"))));

        btnRegistarRuta.setBackground(new java.awt.Color(102, 204, 255));
        btnRegistarRuta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistarRuta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistarRuta.setText("Guardar");
        btnRegistarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarRutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel42)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addGap(52, 52, 52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCiudadRuta, 0, 164, Short.MAX_VALUE)
                                    .addComponent(txtIdRuta))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel41)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addGap(18, 18, 18)))))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFechaAperturaRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaCambioCostoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(btnRegistarRuta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtIdRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaAperturaRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(cmbCiudadRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaCambioCostoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtNombreRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnRegistarRuta)
                .addGap(45, 45, 45))
        );

        jTabbedPane4.addTab("Registrar ruta de distribucion", jPanel11);

        txtCostoRutaUpdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####0.###"))));

        txtFechaCambioCostoRutaUpdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        txtFechaAperturaRutaUpdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel44.setText("Fecha Apertura");

        jLabel45.setText("Fecha cambio costo");

        jLabel46.setText("Costo ruta");

        jLabel47.setText("Nombre");

        jLabel48.setText("Ciudad");

        cmbCiudadRutaUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel49.setText("ID");

        cmbIdRutaUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRutaUpdate.setBackground(new java.awt.Color(102, 204, 255));
        btnRutaUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRutaUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnRutaUpdate.setText("Actualizar");

        btnRutaDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnRutaDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRutaDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnRutaDelete.setText("Eliminar");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(cmbIdRutaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btnRutaUpdate)
                        .addGap(70, 70, 70)
                        .addComponent(btnRutaDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(250, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel48)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel45)
                            .addGap(12, 12, 12))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(jLabel47)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombreRutaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(jLabel49)
                                    .addGap(52, 52, 52)
                                    .addComponent(cmbCiudadRutaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addComponent(jLabel44)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                    .addComponent(jLabel46)
                                    .addGap(18, 18, 18)))))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtFechaAperturaRutaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFechaCambioCostoRutaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCostoRutaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(53, 53, 53)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(cmbIdRutaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRutaUpdate)
                    .addComponent(btnRutaDelete))
                .addGap(38, 38, 38))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel49)
                        .addComponent(txtFechaAperturaRutaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44))
                    .addGap(21, 21, 21)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel48)
                        .addComponent(cmbCiudadRutaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFechaCambioCostoRutaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel45))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47)
                        .addComponent(txtNombreRutaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCostoRutaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel46))
                    .addContainerGap(165, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("Actualizar, Eliminar y consultar", jPanel12);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPaneMain.addTab("Rutas", jPanel4);

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel53.setText("Ventas:");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel54.setText("Gastos:");

        tbtRutaConductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre conductor", "Nombre ruta"
            }
        ));
        jScrollPane9.setViewportView(tbtRutaConductor);

        jLabel6.setText("Conductores ");

        cmbConductoresAsignados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ruta asignada", "Ruta sin asignar" }));

        btnRefreshCambios.setText("Refrescar cambios");

        cmbVentasPorCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbVentasPorCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setText("Ventas por cliente");

        jLabel52.setText("Ventas por ciudad");

        tbtTablaVentasPorCiudad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total"
            }
        ));
        jScrollPane7.setViewportView(tbtTablaVentasPorCiudad);

        tbtTablaVentasPorCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Total"
            }
        ));
        jScrollPane8.setViewportView(tbtTablaVentasPorCliente);

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReportesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRefreshCambios)
                        .addGap(54, 54, 54))
                    .addGroup(panelReportesLayout.createSequentialGroup()
                        .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelReportesLayout.createSequentialGroup()
                                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel14))
                                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelReportesLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReportesLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel52)
                                        .addGap(95, 95, 95))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReportesLayout.createSequentialGroup()
                                .addComponent(cmbVentasPorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbVentasPorCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)))
                        .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelReportesLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbConductoresAsignados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
            .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelReportesLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(534, Short.MAX_VALUE)))
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbConductoresAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefreshCambios)
                .addGap(34, 34, 34))
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(lblGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel53)
                    .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel52))
                .addGap(7, 7, 7)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbVentasPorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVentasPorCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReportesLayout.createSequentialGroup()
                    .addContainerGap(210, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPaneMain.addTab("Reportes", panelReportes);

        jLabel58.setText("Cantidad");

        txtCantidadProductoVentas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel59.setText("Valor");

        txtValorVentas.setEditable(false);
        txtValorVentas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        tbtProductosVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Valor unitario", "Valor total"
            }
        ));
        jScrollPane10.setViewportView(tbtProductosVentas);

        btnAgregarProductoVentas.setText("Agregar producto");

        jLabel55.setText("Producto");

        cmbProductoVentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel60.setText("Identificacion persona");

        jLabel56.setText("Ruta de distribucion");

        cmbRutaDistribuiconVentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGenerarVentaVentas.setText("Generar venta");

        cmbClienteVentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(29, 29, 29)
                        .addComponent(cmbClienteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel56)
                        .addGap(18, 18, 18)
                        .addComponent(cmbRutaDistribuiconVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGenerarVentaVentas)
                        .addGap(332, 332, 332))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(18, 18, 18)
                                .addComponent(cmbProductoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel59))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCantidadProductoVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(txtValorVentas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(btnAgregarProductoVentas)
                                .addGap(9, 9, 9)))
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(cmbProductoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(txtCantidadProductoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarProductoVentas))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(txtValorVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel56)
                    .addComponent(cmbRutaDistribuiconVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbClienteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(btnGenerarVentaVentas)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Generar venta", jPanel14);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPaneMain.addTab("Ventas", jPanel15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneMain)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneMain)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRutaConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRutaConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRutaConductorActionPerformed

    private void btnRegistarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistarRutaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProductoVentas;
    private javax.swing.JButton btnAgregarTelefonoCliente;
    private javax.swing.JButton btnAgregarTelefonoProveedor;
    private javax.swing.JButton btnClienteDelete;
    private javax.swing.JButton btnClienteUpdate;
    private javax.swing.JButton btnConductorDelete;
    private javax.swing.JButton btnConductorUpdate;
    private javax.swing.JButton btnGenerarVentaVentas;
    private javax.swing.JButton btnProveedorDelete;
    private javax.swing.JButton btnProveedorUpdate;
    private javax.swing.JButton btnRefreshCambios;
    private javax.swing.JButton btnRegistarConductor;
    private javax.swing.JButton btnRegistarRuta;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarProveedor;
    private javax.swing.JButton btnRutaDelete;
    private javax.swing.JButton btnRutaUpdate;
    private javax.swing.JButton btnTelefonosConductor;
    private javax.swing.JComboBox<String> cmbCiudadCliente;
    private javax.swing.JComboBox<String> cmbCiudadClienteUpdate;
    private javax.swing.JComboBox<String> cmbCiudadRuta;
    private javax.swing.JComboBox<String> cmbCiudadRutaUpdate;
    private javax.swing.JComboBox<String> cmbClienteVentas;
    private javax.swing.JComboBox<String> cmbConductoresAsignados;
    private javax.swing.JComboBox<String> cmbIdRutaUpdate;
    private javax.swing.JComboBox<String> cmbIdentificacionUpdate;
    private javax.swing.JComboBox<String> cmbIdentificacionUpdateCliente;
    private javax.swing.JComboBox<String> cmbNitProveedorUpdate;
    private javax.swing.JComboBox<String> cmbProductoVentas;
    private javax.swing.JComboBox<String> cmbRutaConductor;
    private javax.swing.JComboBox<String> cmbRutaConductorUpdate;
    private javax.swing.JComboBox<String> cmbRutaDistribuiconVentas;
    private javax.swing.JComboBox<String> cmbVentasPorCiudad;
    private javax.swing.JComboBox<String> cmbVentasPorCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPaneMain;
    private javax.swing.JLabel lblGastos;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JTable tbConductorTelefonoUpdate;
    private javax.swing.JTable tblTelefonosConductor;
    private javax.swing.JTable tbtProductosVentas;
    private javax.swing.JTable tbtRutaConductor;
    private javax.swing.JTable tbtTablaVentasPorCiudad;
    private javax.swing.JTable tbtTablaVentasPorCliente;
    private javax.swing.JTable tbtTelefonoCliente;
    private javax.swing.JTable tbtTelefonoClienteUpdate;
    private javax.swing.JTable tbtTelefonoProveedor;
    private javax.swing.JTable tbtTelefonoProveedorUpdate;
    private javax.swing.JFormattedTextField txtCantidadProductoVentas;
    private javax.swing.JFormattedTextField txtCostoRuta;
    private javax.swing.JFormattedTextField txtCostoRutaUpdate;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDireccionClienteUpdate;
    private javax.swing.JTextField txtDireccionConductor;
    private javax.swing.JTextField txtDireccionConductorUpdate;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtDireccionProveedorUpdate;
    private javax.swing.JFormattedTextField txtFechaAperturaRuta;
    private javax.swing.JFormattedTextField txtFechaAperturaRutaUpdate;
    private javax.swing.JFormattedTextField txtFechaCambioCostoRuta;
    private javax.swing.JFormattedTextField txtFechaCambioCostoRutaUpdate;
    private javax.swing.JFormattedTextField txtFechaEntregaProductoCliente;
    private javax.swing.JFormattedTextField txtFechaEntregaProductoClienteUpdate;
    private javax.swing.JFormattedTextField txtFechaIngresoConductor;
    private javax.swing.JFormattedTextField txtFechaIngresoConductorUpdate;
    private javax.swing.JFormattedTextField txtIdRuta;
    private javax.swing.JFormattedTextField txtIdentificacionCliente;
    private javax.swing.JFormattedTextField txtIdentificacionConductor;
    private javax.swing.JFormattedTextField txtNitProveedor;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreClienteUpdate;
    private javax.swing.JTextField txtNombreConductor;
    private javax.swing.JTextField txtNombreConductorUpdate;
    private javax.swing.JTextField txtNombreContactoProveedorUpdate;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtNombreProveedorUpdate;
    private javax.swing.JTextField txtNombreRuta;
    private javax.swing.JTextField txtNombreRutaUpdate;
    private javax.swing.JTextField txtPersonaContactoProveedor;
    private javax.swing.JFormattedTextField txtTelefonoCliente;
    private javax.swing.JFormattedTextField txtTelefonoConductor;
    private javax.swing.JFormattedTextField txtTelefonoProveedor;
    private javax.swing.JFormattedTextField txtValorVentas;
    // End of variables declaration//GEN-END:variables
}
