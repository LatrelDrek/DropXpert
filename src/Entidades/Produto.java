package Entidades;


public class Produto 
{
    
    private int idproduto;
    private int idprodutosaida;
    private int idempresa;
    private String nomeproduto;
    private String nomeprodutosaida;
    private String dataentrada;
    private String horaentrada;
    private String datasaida;
    private String horasaida;
    private int unidade;
    private int quantidade;
    private int quantidadesaida;
    private String tipo;
    private Double preco;
    private Double precosaida;
    private int idmercadoria;
    private String comprador;
    private String fornecedor;
    
    public Produto()
    {
        this.idempresa=0;
        this.idprodutosaida=0;
        this.precosaida=null;
        this.quantidadesaida=0;
        this.nomeprodutosaida = null;
        this.dataentrada=null;
        this.datasaida=null;
        this.idmercadoria=0;
        this.idproduto=0;
        this.nomeproduto=null;
        this.preco=null;
        this.quantidade=0;
        this.unidade=0;
        this.tipo=null;
        this.horaentrada=null;
        this.horasaida=null;
        this.fornecedor=null;
        this.comprador=null;
        
    }
     
    public int getQuantidade()
    {
        return quantidade;
    }
       public void setUnidade(int unidade)
    {
        this.unidade=unidade;
    }
    public void setDataentrada(String dataentrada)
    {
        this.dataentrada=dataentrada;
    }
    public String getDataentrada()
    {
        return dataentrada;
    }
    public void setNomeprodutosaida(String nomeprodutosaida)
    {
        this.nomeprodutosaida=nomeprodutosaida;
    }
    public String getNomeprodutosaida()
    {
        return nomeprodutosaida;
    }
    public void setDatasaida(String datasaida)
    {
        this.datasaida=datasaida;
    }
    public String getDatasaida()
    {
        return datasaida;
    }
     public void setIdproduto(int idproduto)
    {
        this.idproduto=idproduto;
    }
    public int getIdproduto()
    {
        return idproduto;
    }
     
     public void setQuantidadesaida(int quantidadesaida)
    {
        this.quantidadesaida=quantidadesaida;
    }
    public int getQuantidadesaida()
    {
        return quantidadesaida;
    }
      public void setIdprodutosaida(int idprodutosaida)
    {
        this.idprodutosaida=idprodutosaida;
    }
    public int getIdprodutosaida()
    {
        return idprodutosaida;
    }
     public void setidmercadoria(int idmercadoria)
    {
        this.idmercadoria=idmercadoria;
    }
    public int getIdmercadoria()
    {
        return idmercadoria;
    }
     public void setQuantidade(int quantidade)
    {
        this.quantidade=quantidade;
    }
    public int getUnidade()
    {
        return unidade;
    }
     public void setHorasaida(String horasaida)
    {
        this.horasaida=horasaida;
    }
    public String getHorasaida()
    {
        return horasaida;
    }
    public void setNomeproduto(String nomeproduto)
    {
        this.nomeproduto=nomeproduto;
    }
    public String getNomeproduto()
    {
        return nomeproduto;
    }
    public void setTipo(String tipo)
    {
        this.tipo=tipo;
    }
    public String getTipo()
    {
        return tipo;
    }
    public void setPreco(Double preco)
    {
        this.preco=preco;
    }
    public Double getPreco()
    {
        return preco;
    }
      public void setHoraentrada(String horaentrada)
    {
        this.horaentrada=horaentrada;
    }
    public String getHoraentrada()
    {
        return horaentrada;
    }
     public void setPrecosaida(Double precosaida)
    {
        this.precosaida=precosaida;
    }
    public Double getPrecosaida()
    {
        return precosaida;
    }
    public int getIdempresaentrada()
    {
        return idempresa;
    }
     public void setIdempresaentrada(int idempresa)
    {
       this.idempresa = idempresa;
    }
      public int getIdempresasaida()
    {
        return idprodutosaida;
    }
     public void setIdempresasaida(int idprodutosaida)
    {
       this.idprodutosaida = idprodutosaida;
    }
     public void setFornecedor(String fornecedor)
    {
        this.fornecedor=fornecedor;
    }
    public String getFornecedor()
    {
        return fornecedor;
    }
     public void setComprador(String comprador)
    {
        this.comprador=comprador;
    }
    public String getComprador()
    {
        return comprador;
    }

    
}
