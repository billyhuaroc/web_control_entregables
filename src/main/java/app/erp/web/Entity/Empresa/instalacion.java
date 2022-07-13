package app.erp.web.Entity.Empresa;



public class instalacion {
    
    private String erp = "-";
    private String fibox = "-";
    private String acta = "-";
    private String acta_firmada = "-";

    
    public String getErp() {
        return erp;
    }
    public void setErp(String erp) {
        this.erp = erp;
    }
    public String getFibox() {
        return fibox;
    }
    public void setFibox(String fibox) {
        this.fibox = fibox;
    }
    public String getActa() {
        return acta;
    }
    public void setActa(String acta) {
        this.acta = acta;
    }
    public String getActa_firmada() {
        return acta_firmada;
    }
    public void setActa_firmada(String acta_firmada) {
        this.acta_firmada = acta_firmada;
    }

    public instalacion(String erp, String fibox, String acta, String acta_firmada) {
        this.erp = erp;
        this.fibox = fibox;
        this.acta = acta;
        this.acta_firmada = acta_firmada;
    }
    
    public instalacion() {
    }
  
}
