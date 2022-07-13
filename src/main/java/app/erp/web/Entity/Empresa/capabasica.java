package app.erp.web.Entity.Empresa;

public class capabasica {   
    private String configuracion = "-";
    private String seguridad = "-";
    private String mantenimiento = "-";
    private String usuarios = "-";
    private String actas = "-";
    private String actas_firmadas = "-";


    
    public capabasica() {
    }

    public String getConfiguracion() {
        return configuracion;
    }
    public void setConfiguracion(String configuracion) {
        this.configuracion = configuracion;
    }
    public String getSeguridad() {
        return seguridad;
    }
    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }
    public String getMantenimiento() {
        return mantenimiento;
    }
    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    public String getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }
    public String getActas() {
        return actas;
    }
    public void setActas(String actas) {
        this.actas = actas;
    }
    public String getActas_firmadas() {
        return actas_firmadas;
    }
    public void setActas_firmadas(String actas_firmadas) {
        this.actas_firmadas = actas_firmadas;
    }


    
}
