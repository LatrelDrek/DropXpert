
package Entidades;

public class Categoria
{
    private int idcategoria;
    private int idempresa;
    private String nomecategoria;
    private String descricao;
    private String tipo;
    private String nome;
    private int quantidade, unidade;
   
    public Categoria()
    {
        this.idcategoria=0;
        this.idempresa=0;
        this.nomecategoria=null;
        this.descricao=null;
        this.tipo=null;
        this.nome=null;
        this.unidade = this.quantidade =0;
        
    }
    
    public void setNomecategoria(String nomecategoria)
    {
        this.nomecategoria=nomecategoria;
    }
    public String getNomecatedoria()
    {
        return nomecategoria;
    }
      public void setNome(String nome)
    {
        this.nome=nome;
    }
    public String getNome()
    {
        return nome;
    }
    public void setDescricao(String descricao)
    {
        this.descricao=descricao;
    }
    public String getDescricao()
    {
        return descricao;
    }
    public void setIdcategoria(int idcategoria)
    {
        this.idcategoria=idcategoria;
    }
    public int getIdcategoria()
    {
        return idcategoria;
    }
     public void setIdempresa(int idempresa)
    {
        this.idempresa=idempresa;
    }
    public int getIdempresa()
    {
        return idempresa;
    }
    public void setTipo(String tipo)
    {
        this.tipo=tipo;
    }
    public String getTipo()
    {
        return tipo;
    }
      public void setQuantidade(int quantidade)
    {
        this.quantidade=quantidade;
    }
    public int getQuantidade()
    {
        return quantidade;
    }
       public void setUnidade(int unidade)
    {
        this.unidade=unidade;
    }
    public int getUnidade()
    {
        return unidade;
    }
}
