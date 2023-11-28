
package Entidades;


public class Usuario 
{
    private String nome;
    private String senha;
    private int nivel;
    private int idusuario;
    private int idempresa;
    private String logar;
    
    public Usuario()
    {
        this.idempresa = 0;
        this.nome = null;
        this.senha = null;
        this.nivel = 0;
        this.idusuario = 0;
        this.logar = null;
    }
    public void setSenha(String senha)
    {
        this.senha =  senha;
    }
    public String getSenha()
    {
        return senha;
    }
    public void setNomeusuario(String nome)
    {
        this.nome = nome;
    }
    public String getNomeusuario()
    {
        return nome;
    } 
    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }
    public int getNivel()
    {
        
        return nivel;
        
    }
    public void setIdempresa(int idempresa)
    {
       this.idempresa= idempresa; 
    }
   public int getIdempresa()
   {
        return idempresa;
   }
    public void setIdusuario(int idusuario)
    {
       this.idusuario= idusuario; 
    }
   public int getIdusuario()
   {
        return idusuario;
   }
    public void setLogar(String logar)
    {
       this.logar= logar; 
    }
   public String getLogar()
   {
        return logar;
   }

    public void setIdusuaario(int t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

    
}
