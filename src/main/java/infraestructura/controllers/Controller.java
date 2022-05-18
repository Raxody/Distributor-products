package infraestructura.controllers;

import dao.ReportesDAOImplementacion;
import domain.*;
import domain.services.*;
import infraestructura.views.HomePage;
import javax.swing.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Controller {
    private final ConductorService conductorService;
    private final HomePage homePage;
    private List<TelefonoPersona> telefonoPersonasConductor;
    private List<TelefonoPersona> telefonoPersonasConductorUpdate;
    private List<TelefonoPersona> telefonoPersonasCliente;
    private List<TelefonoPersona> telefonoPersonasClienteUpdate;
    private List<Articulo> articuloVentas;
    private List<Integer> ids;
    private final RutasDistribucionService rutasDistribucionService;
    private final PersonaService personaService;
    private final SedePrincipalService sedePrincipalService;
    private final PedidoService pedidoService;
    private final CiudadService ciudadService;
    private final ProductoService productoService;
    private final ClienteService clienteService;
    private final ProveedorService proveedorService;
    private List<TelefonoProveedor> telefonoProveedores;
    private List<TelefonoProveedor> telefonoProveedoresUpdate;
    private final ReportesDAOImplementacion reportesDAOImplementacion;



    public Controller()  {
        this.articuloVentas = new ArrayList<>();
        this.telefonoPersonasConductor = new ArrayList<>();
        this.telefonoPersonasConductorUpdate = new ArrayList<>();
        this.telefonoPersonasCliente = new ArrayList<>();
        this.telefonoPersonasClienteUpdate = new ArrayList<>();
        this.telefonoProveedores = new ArrayList<>();
        this.telefonoProveedoresUpdate = new ArrayList<>();
        this.conductorService = new ConductorService();
        this.ids = new ArrayList<>();
        this.clienteService = new ClienteService();
        this.rutasDistribucionService = new RutasDistribucionService();
        this.proveedorService = new ProveedorService();
        this.personaService = new PersonaService();
        this.ciudadService = new CiudadService();
        this.productoService = new ProductoService();
        this.sedePrincipalService = new SedePrincipalService();
         this.pedidoService = new PedidoService();
        reportesDAOImplementacion= new ReportesDAOImplementacion();
        this.homePage = new HomePage();
        this.homePage.establecerCiudades(ciudadService.listarCiudades());
        this.homePage.establecerProductosParaVentas(productoService.obtenerProductosArticulo());
        this.homePage.establecerCiudadesRutasDistribucion(ciudadService.listarCiudades());
        this.homePage.establecerCiudadesRutasDistribucionUpdate(ciudadService.listarCiudades());
        this.homePage.establecerCiudadesUpdate(ciudadService.listarCiudades());
        this.homePage.establecerRutasCondutor(rutasDistribucionService.listarRutasDistribucion());
        this.homePage.establecerRutasCondutorUpdate(rutasDistribucionService.listarRutasDistribucion());
        this.homePage.establecerIdRutaUpdate(rutasDistribucionService.listarRutasDistribucion());
        this.homePage.establecerIdentificacionesCondutorUpdate(conductorService.obtenerPersonasConductoras());
        this.homePage.establecerIdentificacionesClienteUpdate(clienteService.obtenerPersonasClientes());
        this.homePage.establecerNitProveedorUpdate(proveedorService.obtenerProveedores());
        this.homePage.establecerVentasPorCiudadCmb(ciudadService.listarCiudades());
        this.homePage.establecerVentasPorClienteCmb(clienteService.obtenerPersonasClientes());
        this.homePage.establecerRutasVentas(rutasDistribucionService.listarRutasDistribucion());
        this.homePage.establecerClientesVentas(clienteService.obtenerClientes());
        System.out.println("holaaaaa"+clienteService.obtenerClientes().toString());


        try {
            homePage.getLblGastos().setText(reportesDAOImplementacion.obtenerGastos());
            homePage.getLblVentas().setText(reportesDAOImplementacion.obtenerVentas());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        this.homePage.getBtnTelefonosConductor().addActionListener(e -> {
            if (!homePage.getTxtTelefonoConductor().getText().equals("")) {
                this.telefonoPersonasConductor.add(new TelefonoPersona(homePage.getTxtTelefonoConductor().getText()));
                homePage.borrarDatosTablaTelefonoConductores();
                homePage.establecerTelefonosConductor(this.telefonoPersonasConductor);
                homePage.getTxtTelefonoConductor().setText("");
            }else{
                homePage.alert("Telefono no ingresado");
            }

        });

        this.homePage.getBtnRegistarConductor().addActionListener(e -> {
            if(!this.homePage.getTxtIdentificacionConductor().getText().equals("")
                && !this.homePage.getTxtNombreConductor().getText().equals("")
                && !this.homePage.getTxtDireccionConductor().getText().equals("")
                && !this.homePage.getTxtFechaIngresoConductor().getText().equals("")){
                boolean disponibilidad = true;
                 int idRuta =-1;
                if(this.homePage.getCmbRutaConductor().getSelectedIndex() != 0){
                    disponibilidad = false;
                    idRuta = rutasDistribucionService.listarRutasDistribucion().get(this.homePage.getCmbRutaConductor().getSelectedIndex() -1).getId();
                }

                try {
                    conductorService.registrarConductor(new Persona(Integer.parseInt(homePage.getTxtIdentificacionConductor().getText()), homePage.getTxtNombreConductor().getText(), homePage.getTxtDireccionConductor().getText() ),
                                                        new Conductor(Integer.parseInt(homePage.getTxtIdentificacionConductor().getText()), LocalDate.parse(homePage.getTxtFechaIngresoConductor().getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")), disponibilidad, idRuta),
                            telefonoPersonasConductor.stream().map(TelefonoPersona::getTelefono).distinct().map(telefono -> new TelefonoPersona(Integer.parseInt(homePage.getTxtIdentificacionConductor().getText()), telefono)).collect(Collectors.toList())
                    );
                    this.homePage.info("Se registro el conductor correctamente");
                    this.homePage.limpiarRegistrarConductor();
                    this.homePage.establecerIdentificacionesCondutorUpdate(conductorService.obtenerPersonasConductoras());
                    this.telefonoPersonasConductor.clear();
                } catch (Exception ex) {
                    this.homePage.alert(ex.getMessage());
                }

            }else{
                this.homePage.alert("Rellene los campos necesarios");
            }
        });

        this.homePage.getCmbIdentificacionUpdate().addActionListener(e-> {
            Conductor conductor=null;
            if (!(this.homePage.getCmbIdentificacionUpdate().getSelectedItem() == null)) {
                conductor = conductorService.consultarConductor(new Conductor(Integer.parseInt((String) this.homePage.getCmbIdentificacionUpdate().getSelectedItem())));
            }


            if(conductor != null){
                Persona persona = personaService.consultarPersona(new Persona(conductor.getIdentificacionPersonaConductor()));
                this.homePage.getTxtNombreConductorUpdate().setText(persona.getNombre());
                this.homePage.getTxtDireccionConductorUpdate().setText(persona.getDireccion());
                this.homePage.getTxtFechaIngresoConductorUpdate().setText(conductor.getFechaIngreso().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

                if(conductor.getIdRutaDistribucion() ==0){
                    this.homePage.getCmbRutaConductorUpdate().setSelectedIndex(0);
                }else{
                    List<RutaDistribucion> rutas =  rutasDistribucionService.listarRutasDistribucion();
                    int index =0;
                    for(int i=0; i< rutas.size(); i++){
                        if(rutas.get(i).getId() == conductor.getIdRutaDistribucion()){
                            index = i;
                        }
                    }
                    this.homePage.getCmbRutaConductorUpdate().setSelectedIndex(index+1);
                }
                this.homePage.borrarDatosTablaTelefonoConductoresUpdate();
                this.homePage.establecerTelefonosConductorUpdate(personaService.telefonoPerson(persona));
                this.telefonoPersonasConductorUpdate.addAll(personaService.telefonoPerson(persona));
            }

        });

    /*    homePage.getBtnTelefonoConductorUpdate().addActionListener(e->{
            if (!homePage.getTxtTelefonoConductorUpdate().getText().equals("")) {
                this.telefonoPersonasConductorUpdate.add(new TelefonoPersona(homePage.getTxtTelefonoConductorUpdate().getText()));
                homePage.borrarDatosTablaTelefonoConductoresUpdate();
                homePage.establecerTelefonosConductorUpdate(this.telefonoPersonasConductorUpdate);
                homePage.getTxtTelefonoConductorUpdate().setText("");
            }else{
                homePage.alert("Telefono no ingresado");
            }
        });*/

        homePage.getBtnConductorUpdate().addActionListener(e->{

            if(!this.homePage.getTxtNombreConductorUpdate().getText().equals("")
                    && !this.homePage.getTxtDireccionConductorUpdate().getText().equals("")
                    && !this.homePage.getTxtFechaIngresoConductorUpdate().getText().equals("")) {

                this.telefonoPersonasConductorUpdate.clear();
                this.telefonoPersonasConductorUpdate.addAll(this.homePage.obtenerDatosTelefonosConductorUpdate());
                int idPersona = 0;
                if(!(this.homePage.getCmbIdentificacionUpdate().getSelectedItem() == null)){
                    idPersona = Integer.parseInt((String) this.homePage.getCmbIdentificacionUpdate().getSelectedItem());
                }
                boolean disponibilidad = true;
                int idRuta =-1;
                if(this.homePage.getCmbRutaConductorUpdate().getSelectedIndex() != 0){
                    disponibilidad = false;
                    idRuta = rutasDistribucionService.listarRutasDistribucion().get(this.homePage.getCmbRutaConductorUpdate().getSelectedIndex() -1).getId();
                }


                conductorService.actualizarConductor(new Persona(idPersona, this.homePage.getTxtNombreConductorUpdate().getText(), this.homePage.getTxtDireccionConductorUpdate().getText()),
                                                    new Conductor(idPersona, LocalDate.parse(homePage.getTxtFechaIngresoConductorUpdate().getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")), disponibilidad, idRuta),
                                                    homePage.obtenerDatosTelefonosConductorUpdate());
                homePage.info("Se actualizo correctamente");
                this.homePage.limpiarRegistrarConductorUpdate();
                this.telefonoPersonasConductorUpdate.clear();
            }

        });

        homePage.getBtnConductorDelete().addActionListener(e->{
            Conductor conductor=null;
            if(!(this.homePage.getCmbIdentificacionUpdate().getSelectedItem() == null)){
                conductor=  conductorService.consultarConductor(new Conductor(Integer.parseInt((String) this.homePage.getCmbIdentificacionUpdate().getSelectedItem())));
            }

            if(conductor != null){
                conductorService.eliminarConductor(conductor);
                homePage.info("Se elimino el conductor");
                this.homePage.establecerIdentificacionesCondutorUpdate(conductorService.obtenerPersonasConductoras());

            }else{
                homePage.alert("No se pudo eliminar al conductor");
            }
        });


        this.homePage.getBtnAgregarTelefonoCliente().addActionListener(e -> {
            if (!homePage.getTxtTelefonoCliente().getText().equals("")) {
                this.telefonoPersonasCliente.add(new TelefonoPersona(homePage.getTxtTelefonoCliente().getText()));
                homePage.borrarDatosTablaTelefonoCliente();
                homePage.establecerTelefonosCliente(this.telefonoPersonasCliente);
                homePage.getTxtTelefonoCliente().setText("");
            }else{
                homePage.alert("Telefono no ingresado");
            }

        });

        homePage.getBtnRegistrarCliente().addActionListener(e->{
           if( !this.homePage.getTxtIdentificacionCliente().getText().equals("")
                    && !this.homePage.getTxtNombreCliente().getText().equals("")
                    && !this.homePage.getTxtDireccionCliente().getText().equals("")
                    && !this.homePage.getTxtFechaEntregaProductoCliente().getText().equals("")){

            int idCiudad = ciudadService.listarCiudades().get(this.homePage.getCmbCiudadCliente().getSelectedIndex()).getId();
               try {
                   clienteService.registrarCliente(new Persona(Integer.parseInt(this.homePage.getTxtIdentificacionCliente().getText()), this.homePage.getTxtNombreCliente().getText(), this.homePage.getTxtDireccionCliente().getText()),
                                                new Cliente(Integer.parseInt(this.homePage.getTxtIdentificacionCliente().getText()),idCiudad, LocalDate.parse(homePage.getTxtFechaEntregaProductoCliente().getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
                           telefonoPersonasCliente.stream().map(TelefonoPersona::getTelefono).distinct().map(telefono -> new TelefonoPersona(Integer.parseInt(homePage.getTxtIdentificacionCliente().getText()), telefono)).collect(Collectors.toList()));
                   this.homePage.info("Se registro el cliente correctamente");
                   this.homePage.limpiarRegistrarCliente();
                   this.homePage.establecerIdentificacionesClienteUpdate(clienteService.obtenerPersonasClientes());
                   this.homePage.establecerVentasPorClienteCmb(clienteService.obtenerPersonasClientes());
                   this.telefonoPersonasCliente.clear();
               } catch (Exception ex) {
                   homePage.alert(ex.getMessage());
               }

            }else{
               homePage.alert("No se puedo registrar al conductor");
           }

        });



        this.homePage.getCmbIdentificacionUpdateCliente().addActionListener(e-> {
            Cliente cliente =null;
            if(!(this.homePage.getCmbIdentificacionUpdateCliente().getSelectedItem()==null)){
                cliente=  clienteService.consultarCliente(new Cliente(Integer.parseInt((String) this.homePage.getCmbIdentificacionUpdateCliente().getSelectedItem())));
            }


            if(cliente != null){
                Persona persona = personaService.consultarPersona(new Persona(cliente.getIdentificacionPersonaCliente()));
                this.homePage.getTxtNombreClienteUpdate().setText(persona.getNombre());
                this.homePage.getTxtDireccionClienteUpdate().setText(persona.getDireccion());
                this.homePage.getTxtFechaEntregaProductoClienteUpdate().setText(cliente.getFechaEntregaProductos().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));


                    List<Ciudad> ciudades =  ciudadService.listarCiudades();
                    int index =0;
                    for(int i=0; i< ciudades.size(); i++){
                        if(ciudades.get(i).getId() == cliente.getIdCiudad()){
                            index = i;
                        }
                    }
                    this.homePage.getCmbCiudadClienteUpdate().setSelectedIndex(index);

                this.homePage.borrarDatosTablaTelefonoClientesUpdate();
                this.homePage.establecerTelefonosClienteUpdate(personaService.telefonoPerson(persona));
                this.telefonoPersonasClienteUpdate.addAll(personaService.telefonoPerson(persona));
            }

        });

        homePage.getBtnClienteUpdate().addActionListener(e->{

            if(!this.homePage.getTxtNombreClienteUpdate().getText().equals("")
                    && !this.homePage.getTxtDireccionClienteUpdate().getText().equals("")
                    && !this.homePage.getTxtFechaEntregaProductoClienteUpdate().getText().equals("")) {

                this.telefonoPersonasClienteUpdate.clear();
                this.telefonoPersonasClienteUpdate.addAll(this.homePage.obtenerDatosTelefonosConductorUpdate());
                int idPersona=0;
                if(!(this.homePage.getCmbIdentificacionUpdateCliente().getSelectedItem() ==null)){
                    idPersona = Integer.parseInt((String) this.homePage.getCmbIdentificacionUpdateCliente().getSelectedItem());
                }



                int idCiudad = ciudadService.listarCiudades().get(this.homePage.getCmbCiudadClienteUpdate().getSelectedIndex()).getId();

                clienteService.actualizarCliente(new Persona(idPersona, this.homePage.getTxtNombreClienteUpdate().getText(), this.homePage.getTxtDireccionClienteUpdate().getText()),
                        new Cliente(idPersona, idCiudad,LocalDate.parse(homePage.getTxtFechaEntregaProductoClienteUpdate().getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                        );
                homePage.info("Se actualizo correctamente");
                this.homePage.limpiarRegistrarClienteUpdate();
                this.telefonoPersonasClienteUpdate.clear();
            }


        });


        homePage.getBtnClienteDelete().addActionListener(e->{
            Cliente cliente=null;
            if(!(this.homePage.getCmbIdentificacionUpdateCliente().getSelectedItem()==null)){
                cliente=  clienteService.consultarCliente(new Cliente(Integer.parseInt((String) this.homePage.getCmbIdentificacionUpdateCliente().getSelectedItem())));
            }

            if(cliente != null){
                clienteService.eliminarCliente(cliente);
                homePage.info("Se elimino el cliente");
                this.homePage.establecerIdentificacionesClienteUpdate(clienteService.obtenerPersonasClientes());
                this.homePage.establecerIdentificacionesClienteUpdate(clienteService.obtenerPersonasClientes());
                this.homePage.establecerVentasPorClienteCmb(clienteService.obtenerPersonasClientes());
            }else{
                homePage.alert("No se pudo eliminar al cliente");
            }
        });

        this.homePage.getBtnAgregarTelefonoProveedor().addActionListener(e -> {
            if (!homePage.getTxtTelefonoProveedor().getText().equals("")) {
                this.telefonoProveedores.add(new TelefonoProveedor(homePage.getTxtTelefonoProveedor().getText()));
                homePage.borrarDatosTablaTelefonoProveedores();
                homePage.establecerTelefonosProveedor(this.telefonoProveedores);
                homePage.getTxtTelefonoProveedor().setText("");
            }else{
                homePage.alert("Telefono no ingresado");
            }

        });

        homePage.getBtnRegistrarProveedor().addActionListener(e->{
            if( !this.homePage.getTxtNitProveedor().getText().equals("")
                    && !this.homePage.getTxtPersonaContactoProveedor().getText().equals("")
                    && !this.homePage.getTxtNombreProveedor().getText().equals("")
                    && !this.homePage.getTxtDireccionProveedor().getText().equals("")){


                try {
                    proveedorService.registrarProveedor(new Proveedor(Integer.parseInt(this.homePage.getTxtNitProveedor().getText()),this.homePage.getTxtPersonaContactoProveedor().getText(), this.homePage.getTxtNombreProveedor().getText(), this.homePage.getTxtDireccionProveedor().getText() ),
                            telefonoProveedores.stream().map(TelefonoProveedor::getTelefono).distinct().map(telefono -> new TelefonoProveedor(Integer.parseInt(homePage.getTxtNitProveedor().getText()), telefono)).collect(Collectors.toList()));
                    this.homePage.info("Se registro el proveedor correctamente");
                    this.homePage.limpiarRegistrarProveedor();
                    this.homePage.establecerNitProveedorUpdate(proveedorService.obtenerProveedores());
                    this.telefonoProveedores.clear();
                } catch (Exception ex) {
                    homePage.alert(ex.getMessage());
                }


            }else{
                homePage.alert("No se puedo registrar al conductor");
            }
        });



        this.homePage.getCmbNitProveedorUpdate().addActionListener(e-> {
            Proveedor proveedor =null;
            if(!(this.homePage.getCmbNitProveedorUpdate().getSelectedItem() == null)){
                proveedor=  proveedorService.consultarProveedor(new Proveedor(Integer.parseInt((String) this.homePage.getCmbNitProveedorUpdate().getSelectedItem())));
            }


            if(proveedor != null){
                this.homePage.getTxtNombreProveedorUpdate().setText(proveedor.getNombre());
                this.homePage.getTxtDireccionProveedorUpdate().setText(proveedor.getDireccion());
                this.homePage.getTxtNombreContactoProveedorUpdate().setText(proveedor.getPersonaContacto());


                this.homePage.borrarDatosTablaTelefonoProveedoresUpdate();
                this.homePage.establecerTelefonosProveedorUpdate(proveedorService.telefonoProvedor(proveedor));
                this.telefonoProveedoresUpdate.addAll(proveedorService.telefonoProvedor(proveedor));
            }

        });

        homePage.getBtnProveedorUpdate().addActionListener(e->{

            if(!this.homePage.getTxtNombreProveedorUpdate().getText().equals("")
                    && !this.homePage.getTxtDireccionProveedorUpdate().getText().equals("")
                    && !this.homePage.getTxtNombreContactoProveedorUpdate().getText().equals("")) {
                int nitProveedor =0;
                if(!(this.homePage.getCmbNitProveedorUpdate().getSelectedItem() == null)){
                     nitProveedor = Integer.parseInt((String) this.homePage.getCmbNitProveedorUpdate().getSelectedItem());
                }



                proveedorService.actualizarProveedor(new Proveedor(nitProveedor, this.homePage.getTxtNombreContactoProveedorUpdate().getText(), this.homePage.getTxtNombreProveedorUpdate().getText(), this.homePage.getTxtDireccionProveedorUpdate().getText()));

                homePage.info("Se actualizo correctamente");
                this.homePage.limpiarRegistrarProveedorUpdate();
                this.telefonoProveedoresUpdate.clear();
            }

        });


        homePage.getBtnProveedorDelete().addActionListener(e->{
            Proveedor proveedor= null;
            if(!(this.homePage.getCmbNitProveedorUpdate().getSelectedItem() == null)) {
                proveedor= proveedorService.consultarProveedor(new Proveedor(Integer.parseInt((String) this.homePage.getCmbNitProveedorUpdate().getSelectedItem())));
            }
            if(proveedor != null){
                proveedorService.eliminarProveedor(proveedor);
                homePage.info("Se elimino el proveedor");
                this.homePage.establecerNitProveedorUpdate(proveedorService.obtenerProveedores());
            }else{
                homePage.alert("No se pudo eliminar al proveedor");
            }
        });

        homePage.getBtnRegistarRuta().addActionListener(e -> {
            if(!homePage.getTxtIdRuta().getText().equals("")
                && !homePage.getTxtNombreRuta().getText().equals("")
                    && !homePage.getTxtFechaAperturaRuta().getText().equals("")
                    && !homePage.getTxtFechaCambioCostoRuta().getText().equals("")
                    && !homePage.getTxtCostoRuta().getText().equals("")
                ){

                try {
                    rutasDistribucionService.registrarRutaDistribucion( new RutaDistribucion(Integer.parseInt(homePage.getTxtIdRuta().getText()),
                                    ciudadService.listarCiudades().get(this.homePage.getCmbCiudadRuta().getSelectedIndex()).getId(),
                                    homePage.getTxtNombreRuta().getText(),
                            LocalDate.parse(homePage.getTxtFechaAperturaRuta().getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                            LocalDate.parse(homePage.getTxtFechaCambioCostoRuta().getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                            Double.parseDouble(homePage.getTxtCostoRuta().getText()) ));
                    this.homePage.info("Se registro la ruta de distribucion correctamente");
                    this.homePage.limpiarRegistrarRuta();

                    this.homePage.establecerRutasCondutor(rutasDistribucionService.listarRutasDistribucion());
                    this.homePage.establecerRutasCondutorUpdate(rutasDistribucionService.listarRutasDistribucion());
                    this.homePage.establecerIdRutaUpdate(rutasDistribucionService.listarRutasDistribucion());

                } catch (Exception ex) {
                    this.homePage.alert(ex.getMessage());
                }


            }else{
                this.homePage.alert("No se registro la ruta");
            }
        });


        homePage.getBtnGenerarVentaVentas().addActionListener(e -> {
            if(articuloVentas.size() != 0){
                try {
                    double subtotal=0;
                    for(int i = 0; i <this.articuloVentas.size();i++){
                        subtotal += (articuloVentas.get(i).getCantidad() * articuloVentas.get(i).getPrecio());
                    }
                    Pedido pedido = new Pedido(subtotal,this.rutasDistribucionService.listarRutasDistribucion().get(this.homePage.getCmbRutaDistribuiconVentas().getSelectedIndex()).getId(),
                            Integer.parseInt(this.homePage.getCmbClienteVentas().getSelectedItem().toString()));
                pedidoService.registrarPedido(pedido);

                Pedido pedidoEncontrado = pedidoService.obtenerUltimoPedido();
                    System.out.println(pedidoEncontrado.getId() + "sdfsfdsfd" + ids.toString());
                    for(int i = 0; i <this.articuloVentas.size();i++){

                        System.out.println(pedidoEncontrado.getId() + "pruebita" + ids.get(i));
                        SedePrincipal sede = new SedePrincipal(pedidoEncontrado.getId(),ids.get(i),
                                articuloVentas.get(i).getCantidad(),(articuloVentas.get(i).getCantidad() * articuloVentas.get(i).getPrecio()) );
                        System.out.println("envie" + sede.toString());
                    sedePrincipalService.registrarSedePrincipal(sede);
                        sede = null;
                    }
                    this.homePage.info("Se registro la venta");
                    this.homePage.borrarDatosTablaProductosVentas();
                    this.ids.clear();
                    this.articuloVentas.clear();
                } catch (Exception ex) {
                    this.homePage.alert(ex.getMessage());
                }


            }else{
                this.homePage.alert("No se registro la ruta");
            }
        });












        this.homePage.getCmbIdRutaUpdate().addActionListener(e-> {
            RutaDistribucion rutaDistribucion = null;
            if(!(this.homePage.getCmbIdRutaUpdate().getSelectedItem() == null)) {
                rutaDistribucion = rutasDistribucionService.consultarRutaDistribucion(new RutaDistribucion(Integer.parseInt((String) this.homePage.getCmbIdRutaUpdate().getSelectedItem())));
            }
            if(rutaDistribucion != null){
                this.homePage.getTxtNombreRutaUpdate().setText(rutaDistribucion.getNombre());
                this.homePage.getTxtFechaAperturaRutaUpdate().setText(rutaDistribucion.getFechaApertura().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                this.homePage.getTxtFechaCambioCostoRutaUpdate().setText(rutaDistribucion.getFechaCambioCosto().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                this.homePage.getTxtCostoRutaUpdate().setText(rutaDistribucion.getCostoRuta()+"");

                List<Ciudad> ciudades =  ciudadService.listarCiudades();
                int index =0;
                for(int i=0; i< ciudades.size(); i++){
                    if(ciudades.get(i).getId() == rutaDistribucion.getIdCiudadDestino()){
                        index = i;
                    }
                }
                this.homePage.getCmbCiudadRutaUpdate().setSelectedIndex(index);
            }
        });

        homePage.getBtnRutaUpdate().addActionListener(e->{
            if(!homePage.getTxtNombreRutaUpdate().getText().equals("")
                    && !homePage.getTxtFechaAperturaRutaUpdate().getText().equals("")
                    && !homePage.getTxtFechaCambioCostoRutaUpdate().getText().equals("")
                    && !homePage.getTxtCostoRutaUpdate().getText().equals("")) {

                int idRutaDistribucion = 0;
                if(!(this.homePage.getCmbIdRutaUpdate().getSelectedItem() == null)){
                    idRutaDistribucion = Integer.parseInt((String) this.homePage.getCmbIdRutaUpdate().getSelectedItem());
                }
                int idCiudad = ciudadService.listarCiudades().get(this.homePage.getCmbCiudadRutaUpdate().getSelectedIndex()).getId();

                rutasDistribucionService.actualizarRutaDistribucion(new RutaDistribucion(idRutaDistribucion, idCiudad,
                        homePage.getTxtNombreRutaUpdate().getText(),
                        LocalDate.parse(homePage.getTxtFechaAperturaRutaUpdate().getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        LocalDate.parse(homePage.getTxtFechaCambioCostoRutaUpdate().getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        Double.parseDouble(homePage.getTxtCostoRutaUpdate().getText())));

                homePage.info("Se actualizo correctamente");
                this.homePage.limpiarRegistrarRutaUpdate();
            }
        });


        homePage.getBtnRutaDelete().addActionListener(e->{
            RutaDistribucion rutaDistribucion=  null;
            if(!(this.homePage.getCmbIdRutaUpdate().getSelectedItem() == null)){
                rutaDistribucion=  rutasDistribucionService.consultarRutaDistribucion(new RutaDistribucion(Integer.parseInt((String) this.homePage.getCmbIdRutaUpdate().getSelectedItem())));
            }
            if(rutaDistribucion != null){
                rutasDistribucionService.eliminarRutaDistribucion(rutaDistribucion);
                homePage.info("Se elimino la ruta de distribucion");
                this.homePage.establecerIdRutaUpdate(rutasDistribucionService.listarRutasDistribucion());
                this.homePage.establecerRutasCondutor(rutasDistribucionService.listarRutasDistribucion());
                this.homePage.establecerRutasCondutorUpdate(rutasDistribucionService.listarRutasDistribucion());


            }else{
                homePage.alert("No se pudo eliminar al proveedor");
            }
        });



        homePage.getCmbConductoresAsignados().addActionListener(e->{
            boolean estado = homePage.getCmbConductoresAsignados().getSelectedIndex() == 0;
            this.homePage.borrarDatosRutaConductor();
            try {
                this.homePage.establecerRutasConductor(reportesDAOImplementacion.obtenerRutasyConductores(estado));
            } catch (Exception ex) {
                homePage.alert("Sin datos para mostrar");
            }
        });


        homePage.getCmbProductoVentas().addActionListener(e -> {
            this.homePage.getTxtValorVentas().setText(""+this.productoService.obtenerProductosArticulo().get(this.homePage.getCmbProductoVentas().getSelectedIndex()).getPrecio());
        });


        homePage.getBtnAgregarProductoVentas().addActionListener(e->{

            if (!homePage.getTxtCantidadProductoVentas().getText().equals("") &&
                !homePage.getTxtValorVentas().getText().equals("")) {
                this.articuloVentas.add(new Articulo(Integer.parseInt(homePage.getTxtCantidadProductoVentas().getText()),
                        homePage.getCmbProductoVentas().getSelectedItem().toString(),
                        Double.parseDouble(homePage.getTxtValorVentas().getText())));
                ids.add(this.productoService.obtenerProductosArticulo().get(this.homePage.getCmbProductoVentas().getSelectedIndex()).getId());
                homePage.borrarDatosTablaProductosVentas();
                this.homePage.establecerProductosVentas(this.articuloVentas);
                this.homePage.getTxtCantidadProductoVentas().setText("");
                this.homePage.getTxtValorVentas().setText("");

            }else{
                homePage.alert("Ingresa productos");
            }
        });


        homePage.getBtnRefreshCambios().addActionListener(e->{
            try {
                homePage.getLblGastos().setText(reportesDAOImplementacion.obtenerGastos());
                homePage.getLblVentas().setText(reportesDAOImplementacion.obtenerVentas());
            } catch (Exception ex) {
                homePage.alert("Sin datos para mostrar");
            }
        });

        homePage.getCmbVentasPorCiudad().addActionListener(l->{
            Ciudad ciudad = ciudadService.listarCiudades().get(homePage.getCmbVentasPorCiudad().getSelectedIndex());
            try {
                homePage.borrarDatosVentasPorCiudad();
                homePage.establecerVentasPorCiudad(reportesDAOImplementacion.obtenerVentasCiudad(ciudad));

            } catch (SQLException e) {
                homePage.alert("Sin datos para mostrar");
            }
        });

        homePage.getCmbVentasPorCliente().addActionListener(l->{
            Cliente cliente = null;
            if(!(homePage.getCmbVentasPorCliente().getSelectedItem() == null)){
                cliente = new Cliente(Integer.parseInt((String) homePage.getCmbVentasPorCliente().getSelectedItem()));
            }

            try {
                if(!(cliente == null)){
                    homePage.borrarDatosVentasPorCliente();
                    homePage.establecerVentasPorCliente(reportesDAOImplementacion.obtenerVentasCliente(cliente));
                }

            } catch (SQLException e) {
                homePage.alert("Sin datos para mostrar");
            }
        });

        homePage.setVisible(true);
    }


}
