/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Location;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Usuário
 */
@Entity
@Table(name = "estoque", catalog = "zNeffos", schema = "")
@NamedQueries({
    @NamedQuery(name = "Estoque.findAll", query = "SELECT e FROM Estoque e")
    , @NamedQuery(name = "Estoque.findById", query = "SELECT e FROM Estoque e WHERE e.id = :id")
    , @NamedQuery(name = "Estoque.findByCodigo", query = "SELECT e FROM Estoque e WHERE e.codigo = :codigo")
    , @NamedQuery(name = "Estoque.findByProduto", query = "SELECT e FROM Estoque e WHERE e.produto = :produto")
    , @NamedQuery(name = "Estoque.findByDescricao", query = "SELECT e FROM Estoque e WHERE e.descricao = :descricao")
    , @NamedQuery(name = "Estoque.findByValorun", query = "SELECT e FROM Estoque e WHERE e.valorun = :valorun")
    , @NamedQuery(name = "Estoque.findByQuantidade", query = "SELECT e FROM Estoque e WHERE e.quantidade = :quantidade")
    , @NamedQuery(name = "Estoque.findByValortotal", query = "SELECT e FROM Estoque e WHERE e.valortotal = :valortotal")})
public class Estoque implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "PRODUTO")
    private String produto;
    @Column(name = "DESCRICAO")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALORUN")
    private Double valorun;
    @Column(name = "QUANTIDADE")
    private Double quantidade;
    @Column(name = "VALORTOTAL")
    private Double valortotal;

    public Estoque() {
    }

    public Estoque(Integer id) {
        this.id = id;
    }

    public Estoque(Integer id, String produto) {
        this.id = id;
        this.produto = produto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        String oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        String oldProduto = this.produto;
        this.produto = produto;
        changeSupport.firePropertyChange("produto", oldProduto, produto);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public Double getValorun() {
        return valorun;
    }

    public void setValorun(Double valorun) {
        Double oldValorun = this.valorun;
        this.valorun = valorun;
        changeSupport.firePropertyChange("valorun", oldValorun, valorun);
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        Double oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    public Double getValortotal() {
        return valortotal;
    }

    public void setValortotal(Double valortotal) {
        Double oldValortotal = this.valortotal;
        this.valortotal = valortotal;
        changeSupport.firePropertyChange("valortotal", oldValortotal, valortotal);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estoque)) {
            return false;
        }
        Estoque other = (Estoque) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Location.Estoque[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
