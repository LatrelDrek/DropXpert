
package Entidades;


public class Comprador
{
    private String nomecomprador;
     private String nome;
    private String descricaocomprador;
    private int idcomprador;
    private int id;
    
    public Comprador()
    {
        this.nome=null;
        this.id=0;
        this.nomecomprador=null;
        this.descricaocomprador=null;
        this.idcomprador=0;
    }
    
    public void setIdcomprador(int idcomprador)
    {
        this.idcomprador=idcomprador;
        
    }
    public int getIdcomprador()
    {
        return idcomprador;   
    }
     public void setNomecomprador(String nomecomprador)
    {
        this.nomecomprador=nomecomprador;
        
    }
    public String getNomecomprador()
    {
        return nomecomprador;   
    }
    public void setNome(String nome)
    {
        this.nome=nome;
        
    }
    public String getNome()
    {
        return nome;   
    }
    public void setDescricaocomprador(String descricaocomprador)
    {
        this.descricaocomprador=descricaocomprador;
        
    }
    public String getDescricaocomprador()
    {
        return descricaocomprador;   
    }
       public void setIdempresa(int id)
    {
        this.id=id;
        
    }
    public int getIdempresa()
    {
        return id;   
    }
}
