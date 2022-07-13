package app.erp.web.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import com.mongodb.lang.NonNull;
import app.erp.web.Entity.Empresa.avisos;
import app.erp.web.Entity.Empresa.capabasica;
import app.erp.web.Entity.Empresa.instalacion;
import app.erp.web.Entity.Empresa.maestros;
import app.erp.web.Entity.Empresa.reportes;


@Document (collection = "empresa")
public class empresa {

    @Id
    @NonNull
    private String id;
    @Field
    private String ruc = "No Ruc";
    @Field
    private String razon_social = "No razon social";
    @Field
    private String fecha = update();
    @Field
    private String cargo = "No cargo";
    @Field
    private String celular = "No celular";
    @Field
    private String correo = "No email";
    @Field
    private String estado = "No estado";
    @Field
    private String giro_negocio = "No giro negocio";
    @Field
    private String fecha_inicio ="00/00/0000";
    @Field
    private int cant_empresas = 0;
    @Field
    private int cant_usuarios = 0;
    @Field
    private instalacion instalacion = new instalacion();
    @Field
    private maestros maestros = new maestros();
    @Field
    private boolean nuevo = true;
    @Field
    private reportes reportes = new reportes();
    @Field
    private avisos avisos = new avisos();
    @Field
    private capabasica capa_basica = new capabasica();

    public reportes getReportes() {
        return reportes;
    }

    public void setReportes(reportes reportes) {
        this.reportes = reportes;
    }

    public avisos getAvisos() {
        return avisos;
    }

    public void setAvisos(avisos avisos) {
        this.avisos = avisos;
    }

    public capabasica getCapa_basica() {
        return capa_basica;
    }

    public void setCapa_basica(capabasica capa_basica) {
        this.capa_basica = capa_basica;
    }

    public String update () {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(date);
    }

    public empresa() {
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getRuc() {
        return ruc;
    }


    public void setRuc(String ruc) {
        this.ruc = ruc;
    }


    public String getRazon_social() {
        return razon_social;
    }


    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public String getCelular() {
        return celular;
    }


    public void setCelular(String celular) {
        this.celular = celular;
    }


    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getGiro_negocio() {
        return giro_negocio;
    }


    public void setGiro_negocio(String giro_negocio) {
        this.giro_negocio = giro_negocio;
    }


    public String getFecha_inicio() {
        return fecha_inicio;
    }


    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }


    public int getCant_empresas() {
        return cant_empresas;
    }


    public void setCant_empresas(int cant_empresas) {
        this.cant_empresas = cant_empresas;
    }


    public int getCant_usuarios() {
        return cant_usuarios;
    }


    public void setCant_usuarios(int cant_usuarios) {
        this.cant_usuarios = cant_usuarios;
    }


    public instalacion getInstalacion() {
        return instalacion;
    }


    public void setInstalacion(instalacion instalacion) {
        this.instalacion = instalacion;
    }


    public maestros getMaestros() {
        return maestros;
    }


    public void setMaestros(maestros maestros) {
        this.maestros = maestros;
    }


    public boolean isNuevo() {
        return nuevo;
    }


    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }


    
    

}
