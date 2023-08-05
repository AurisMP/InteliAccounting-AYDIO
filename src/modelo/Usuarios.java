package modelo;

public class Usuarios {
    
    
    
    
  private String loginUsr ; 
  private String passUsr; 
  private String nivelAccs;
  private String nombreUs;
  private String ApellidosUsr;
  private String emailUsr;

    public Usuarios(String loginUsr, String passUsr, String nivelAccs, String nombreUs, String ApellidosUsr, String emailUsr) {
        this.loginUsr = loginUsr;
        this.passUsr = passUsr;
        this.nivelAccs = nivelAccs;
        this.nombreUs = nombreUs;
        this.ApellidosUsr = ApellidosUsr;
        this.emailUsr = emailUsr;
    }

    public Usuarios() {
    }

    public String getLoginUsr() {
        return loginUsr;
    }

    public void setLoginUsr(String loginUsr) {
        this.loginUsr = loginUsr;
    }

    public String getPassUsr() {
        return passUsr;
    }

    public void setPassUsr(String passUsr) {
        this.passUsr = passUsr;
    }

    public String getNivelAccs() {
        return nivelAccs;
    }

    public void setNivelAccs(String nivelAccs) {
        this.nivelAccs = nivelAccs;
    }

    public String getNombreUs() {
        return nombreUs;
    }

    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    public String getApellidosUsr() {
        return ApellidosUsr;
    }

    public void setApellidosUsr(String ApellidosUsr) {
        this.ApellidosUsr = ApellidosUsr;
    }

    public String getEmailUsr() {
        return emailUsr;
    }

    public void setEmailUsr(String emailUsr) {
        this.emailUsr = emailUsr;
    }
  
  
  
}
