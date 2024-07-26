package com.example.nuevo;


import java.util.ArrayList;
import java.util.List;

import com.example.nuevo.ClasesAbstractas.Funcionalidad;
import com.example.nuevo.Persona.Application.actualizarPersona;
import com.example.nuevo.Persona.Application.crearPersona;
import com.example.nuevo.Persona.Application.eliminarPersona;


public class CasesListController {

    /* public static List<Funcionalidad> lstIntro;
    public static List<Funcionalidad> lstFuncionalidades;
    public static List<actualizarDatosCliente> lstActualizarDatosClientes;
    public static List<actualizarDatosTarifa> lstActualizarDatosTarifas;
    public static List<actualizarDatosRevision> lstActualizarDatosRevisionMantenimiento;

    public static List<Funcionalidad> lstFuncionalidadRevisionMantenimiento;
    public static List<Funcionalidad> lstGestionarAeropuerto;
    public static List<Funcionalidad> lstActualizarAvion;
    public static List<Funcionalidad> lstGestionarAvion;

    public static List<Funcionalidad> lstFuncionalidadesTarifa;  */


    public static List<Funcionalidad> lstFUncionesPersona; 


    private static CasesListController CONTROLLER = new CasesListController();

    private CasesListController() {

        lstFUncionesPersona = new ArrayList<>();


        Funcionalidad crearPersona = new crearPersona("Crear persona"); 
        Funcionalidad eliminarPersona = new eliminarPersona("Crear persona"); 
        Funcionalidad actualizarPersona = new actualizarPersona("Crear persona"); 

        lstFUncionesPersona.add(crearPersona); 
        lstFUncionesPersona.add(actualizarPersona); 
        lstFUncionesPersona.add(eliminarPersona);

/* 
        // INICIALIZACION DE LAS LISTAS
        lstIntro = new ArrayList<>();
        lstFuncionalidades = new ArrayList<>();
        lstActualizarDatosClientes = new ArrayList<>();
        lstActualizarDatosTarifas = new ArrayList<>();
        lstFuncionalidadRevisionMantenimiento = new ArrayList<>();
        lstActualizarDatosRevisionMantenimiento = new ArrayList<>();
        lstFuncionalidadesTarifa = new ArrayList<>();

        // Crear las funciones del menu principal de inicio de sesion        
        lstGestionarAvion = new ArrayList<>();
        lstActualizarAvion = new ArrayList<>();
        lstGestionarAeropuerto = new ArrayList<>();


        // CREAR LAS FUNCIONALIDADES PARA TARIFA 

        Funcionalidad crearTarifa = new IrCrearTarifa("Crear Tarifa" , ""); 

        Funcionalidad eliminarTarifa = new irEliminarTarifa("Eliminar Tarifa" , ""); 

        Funcionalidad actualizarTarifa = new irActualizarTarifa ("Actualizar Tarifa" , ""); 

        Funcionalidad consultarTarifa = new irConsultarTarifa("Consultar Tarifa", ""); 


        // AGREGAR LAS FUNCIONALIDADES AL MENU TARIFA 

        lstFuncionalidadesTarifa.add(crearTarifa);
        lstFuncionalidadesTarifa.add(eliminarTarifa);
        lstFuncionalidadesTarifa.add(actualizarTarifa);
        lstFuncionalidadesTarifa.add(consultarTarifa);


        // AGREGREGARfUNCIONALIDADE A ACTUALIZAR REVISION MANTENIMIENTO
        actualizarDatosRevision actualizarFechaRevision = new actualizarFecha("Actualizar fecha"); 
        actualizarDatosRevision actualizarDescripcionRevision = new actualizarDescripcionRevision("Actualizar descripción");
        actualizarDatosRevision actualizarAvionRevision = new actualizarAvion("Actualizar avion");

        //Agregar FUNCIONALIDADES A REVISION MANTENIMIENTO 
        Funcionalidad crearRevision = new crearRevision("Crear revisión"); 
        Funcionalidad eliminarRevision = new eliminarRevision("Eliminar revisión");
        Funcionalidad actualizarRevision = new actualizarRevision("Actualizar revisión");
        Funcionalidad consultarHistorial = new consultarHistorial("Consultar Historial");

        // AGREGAR FUNCIONALIDADES A ACTUALIZAR TARIFA 
        actualizarDatosTarifa actualizarDescripcionTarifa = new actualizarDescripcionTarifa ("Actualizar descripción");
        actualizarDatosTarifa actualizarDetalles = new actualizarDetallesTarifa("Actualizar detalle"); 
        actualizarDatosTarifa actualizarPrecio = new actualizarPrecioTarifa("Actualizar precio");
        actualizarDatosTarifa actualizarImpuesto = new actualizarImpuestoTarifa("Actualizar impuesto");



        // Instanciación funciones del Login Inicial
        Funcionalidad introLogin = new IntroLogIn("Iniciar Sesión", "");
        Funcionalidad logOut = new Exit("Salir", "");
        Funcionalidad checkIn = new CheckIn("Realizar Check-In", "");

        // Instanciación funciones del empleado
        Funcionalidad gestionarAvion = new GestionarAvion("Gestionar Avión", "gav");
        Funcionalidad gestionarAeropuerto = new GestionarAeropuerto("Gestionar Aeropuerto", "gae");
        Funcionalidad gestionTarifa = new GestionTarifa("Gestion Tarifa" , "gta");

        // INSTANCICIÓN FUNCIONALIDADES ACTUALIZAR CLIENTE
        actualizarDatosCliente actualizarNombre = new Nombre("Actualizar nombre");       
        actualizarDatosCliente actualizarEdad = new Edad("Actualizar edad");
        actualizarDatosCliente actualizarTipoDocumento = new TipoDocumento("Actualizar tipo de documento");
        actualizarDatosCliente actualizarNumeroDocumento = new NumeroDocumento("Actualizar numero de documento"); 
        actualizarDatosCliente actualizarUsuario = new Usuario("Actualizar usuario");
        actualizarDatosCliente actualizarContraseña = new Contrasena("Actualizar contraseña");

        // INSTANCIACIÓN FUNCIONALIDADES ´PARA GESTIONAR AVIÓN
        Funcionalidad registrarAvion = new GoToRegistrarAvion("Registrar Avión", "");
        Funcionalidad actualizarAvion = new GoToActualizarAvion("Actualizar Avión", "");
        Funcionalidad consultarAvion = new GoToConsultarAvion("Consultar Avión", "");
        Funcionalidad eliminarAvion = new GoToEliminarAvion("Eliminar Avión", "");

        // INSTANCIACIÓN FUNCIONALIDADES PARA ACTUALIZAR AVIÓN
        Funcionalidad actualizarCapacidadAvion = new GoToActualizarCapacidadAvion("Actualizar Capacidad", "");
        Funcionalidad actualizarEstadoAvion = new GoToActualizarEstadoAvion("Actualizar Estado", "");

        // INSTANCIACIÓN FUNCIONALIDADES PARA GESTIONAR AEROPUERTO
        Funcionalidad registrarAeropuerto = new GoToCrearAeropuerto("Registrar Aeropuerto", "");
        Funcionalidad actualizarAeropuerto = new GoToActualizarAeropuerto("Actualizar Aeropuerto", "");
        Funcionalidad consultarAeropuerto = new GoToConsultarAeropuerto("Consultar Aeropuerto", "");
        Funcionalidad eliminarAeropuerto = new GoToEliminarAeropuerto("Eliminar Aeropuerto", "");

        // AGREGAR LA FUNCIONALIDAD A LA LISTA DE CASOS DE USO DE ACTUALIZAR DATOS DEL CLIENTE 
        lstActualizarDatosClientes.add(actualizarNombre);
        lstActualizarDatosClientes.add(actualizarEdad);
        lstActualizarDatosClientes.add(actualizarTipoDocumento);
        lstActualizarDatosClientes.add(actualizarNumeroDocumento);
        lstActualizarDatosClientes.add(actualizarUsuario);
        lstActualizarDatosClientes.add(actualizarContraseña);

        // FUNCIONES DEL MENÚ INICIAL
        lstIntro.add(introLogin);
        lstIntro.add(checkIn);
        lstIntro.add(logOut);
        

        // FUNCIONALIDADES DE LOS EMPLEADOS
        lstFuncionalidades.add(gestionarAvion);
        lstFuncionalidades.add(gestionarAeropuerto);
        lstFuncionalidades.add(gestionTarifa);

        //FUNCIONALIDADES PARA GESTIONAR AVIÓN
        lstGestionarAvion.add(registrarAvion);
        lstGestionarAvion.add(actualizarAvion);
        lstGestionarAvion.add(consultarAvion);
        lstGestionarAvion.add(eliminarAvion);

        // FUNCIONALIDADES PARA ACTUALIZAR AVION
        lstActualizarAvion.add(actualizarCapacidadAvion);
        lstActualizarAvion.add(actualizarEstadoAvion);


        // FUNCIONALIDADES PARA GESTIONAR AEROPUERTO
        lstGestionarAeropuerto.add(registrarAeropuerto);
        lstGestionarAeropuerto.add(actualizarAeropuerto);
        lstGestionarAeropuerto.add(consultarAeropuerto);
        lstGestionarAeropuerto.add(eliminarAeropuerto);


        // AGREGAR LAS FUNCIONALIDADES AL MENU DE REVISION MANTENIMIENTO
        lstFuncionalidadRevisionMantenimiento.add(crearRevision);
        lstFuncionalidadRevisionMantenimiento.add(eliminarRevision);
        lstFuncionalidadRevisionMantenimiento.add(actualizarRevision);
        lstFuncionalidadRevisionMantenimiento.add(consultarHistorial);


        // AGREGAR LA FUNCIONALIDAD A LA LISTA DE CASOS DE USO DE ACTUALIZAR TATIFA
        lstActualizarDatosTarifas.add(actualizarDescripcionTarifa);
        lstActualizarDatosTarifas.add(actualizarDetalles);
        lstActualizarDatosTarifas.add(actualizarPrecio);
        lstActualizarDatosTarifas.add(actualizarImpuesto);



        // AGREGAR FUNCIONALIDAD AL LA LISTA DE CASOS DE USO DE ACTUALIZAR REVISION MANTENIMIENTO
        lstActualizarDatosRevisionMantenimiento.add(actualizarAvionRevision); 
        lstActualizarDatosRevisionMantenimiento.add(actualizarFechaRevision);
        lstActualizarDatosRevisionMantenimiento.add(actualizarDescripcionRevision);
         */
        
    }

    public static CasesListController getController() {
        return CONTROLLER;
    }

    


}

