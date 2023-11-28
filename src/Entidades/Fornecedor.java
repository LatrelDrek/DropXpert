
package Entidades;

public class Fornecedor
{
    
    
    private int idfornecedor;
    private int idempresa;
    private String nomefornecedor;
    private String endereco;
    private String cnpj;
    private String telefone;
    private String celular;
    private String cep;
    private String inscricaoestadual;
    private String email;
    private String data;
    
    public Fornecedor()
    {
        this.idfornecedor=0;
        this.idempresa=0;
        this.nomefornecedor=null;
        this.endereco=null;
        this.cnpj=null;
        this.telefone=null;
        this.celular=null;
        this.cep=null;
        this.inscricaoestadual=null;
        this.email=null;
        this.data=null;
    }
    public void setIdfornecedor(int id)
    {
        this.idfornecedor=id;
    }
    public int getIdfornecedor()
    {
        return idfornecedor;
    }
    public void setIdempresa(int idempresa)
    {
        this.idempresa=idempresa;
    }
    public int getIdempresa()
    {
        return idempresa;
    }
    public void setNomefornecedor(String nomefornecedor)
    {
        this.nomefornecedor=nomefornecedor;
    }
    public String getNomefornecedor()
    {
        return nomefornecedor;
    }
    public void setEnderecofornecedor(String endereco)
    {
        this.endereco=endereco;
    }
    public String getEnderecofornecedor()
    {
        return endereco;
    }
     public void setCnpj(String cnpj)
    {
        this.cnpj=cnpj;
    }
    public String getCnpj()
    {
        return cnpj;
    }
    public void setTelefone(String telefone)
    {
        this.telefone=telefone;
    }
    public String getTelefone()
    {
        return telefone;
    }
    public void setCelular(String celular)
    {
        this.celular=celular;
    }
    public String getCelular()
    {
        return celular;
    }
    public void setCep(String cep)
    {
        this.cep=cep;
    }
    public String getCep()
    {
        return cep;
    }
    public void setInscricaoestadual(String inscricaoestadual)
    {
        this.inscricaoestadual=inscricaoestadual;
    }
    public String getInscricaoEstadual()
    {
        return inscricaoestadual;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
     public void setData(String data)
    {
        this.data=data;
    }
    public String getData()
    {
        return data;
    }
    
}
