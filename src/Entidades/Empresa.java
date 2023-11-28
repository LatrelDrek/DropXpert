package Entidades;


public class Empresa 
{
    private String senhaempresa;
    private String nomeempresa;
    private String idempresa;
    private String cnpj;
    private String email;
    
    public Empresa()
    {
        this.idempresa=null;
        this.senhaempresa=null;
        this.nomeempresa=null;
        this.cnpj=null;
        this.email=null;
    }
    public void setIdempresa(String idempresa)
    {
        this.idempresa=idempresa;
    }
    public String getIdempresa()
    {
        return idempresa;
    }
     public void setSenhaempresa(String senhaempresa)
    {
        this.senhaempresa = senhaempresa;
    }
    public String getSenhaempresa()
    {
        return senhaempresa;
    }
    public void setNomeempresa(String nomeempresa)
    {
        this.nomeempresa = nomeempresa;
    }
    public String getNomeempresa()
    {
        return nomeempresa;
    }
    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }
    public String getCnpj()
    {
        return cnpj;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }
    
    
}
