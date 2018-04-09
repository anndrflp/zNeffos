/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ClipBoard;

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
@Table(name = "ordem", catalog = "zneffos", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ordem.findAll", query = "SELECT o FROM Ordem o")
    , @NamedQuery(name = "Ordem.findById", query = "SELECT o FROM Ordem o WHERE o.id = :id")
    , @NamedQuery(name = "Ordem.findByPessoa", query = "SELECT o FROM Ordem o WHERE o.pessoa = :pessoa")
    , @NamedQuery(name = "Ordem.findByCpfcnpj", query = "SELECT o FROM Ordem o WHERE o.cpfcnpj = :cpfcnpj")
    , @NamedQuery(name = "Ordem.findByRg", query = "SELECT o FROM Ordem o WHERE o.rg = :rg")
    , @NamedQuery(name = "Ordem.findByEmail", query = "SELECT o FROM Ordem o WHERE o.email = :email")
    , @NamedQuery(name = "Ordem.findByFone", query = "SELECT o FROM Ordem o WHERE o.fone = :fone")
    , @NamedQuery(name = "Ordem.findByFone2", query = "SELECT o FROM Ordem o WHERE o.fone2 = :fone2")
    , @NamedQuery(name = "Ordem.findByDefeito", query = "SELECT o FROM Ordem o WHERE o.defeito = :defeito")
    , @NamedQuery(name = "Ordem.findByRetalho", query = "SELECT o FROM Ordem o WHERE o.retalho = :retalho")
    , @NamedQuery(name = "Ordem.findByMarca", query = "SELECT o FROM Ordem o WHERE o.marca = :marca")
    , @NamedQuery(name = "Ordem.findByModelo", query = "SELECT o FROM Ordem o WHERE o.modelo = :modelo")
    , @NamedQuery(name = "Ordem.findByComplemento", query = "SELECT o FROM Ordem o WHERE o.complemento = :complemento")})
public class Ordem implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "PESSOA")
    private String pessoa;
    @Basic(optional = false)
    @Column(name = "CPFCNPJ")
    private String cpfcnpj;
    @Column(name = "RG")
    private String rg;
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "FONE")
    private String fone;
    @Column(name = "FONE2")
    private String fone2;
    @Column(name = "DEFEITO")
    private String defeito;
    @Column(name = "RETALHO")
    private String retalho;
    @Basic(optional = false)
    @Column(name = "MARCA")
    private String marca;
    @Basic(optional = false)
    @Column(name = "MODELO")
    private String modelo;
    @Column(name = "COMPLEMENTO")
    private String complemento;

    public Ordem() {
    }

    public Ordem(Integer id) {
        this.id = id;
    }

    public Ordem(Integer id, String pessoa, String cpfcnpj, String fone, String marca, String modelo) {
        this.id = id;
        this.pessoa = pessoa;
        this.cpfcnpj = cpfcnpj;
        this.fone = fone;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        String oldPessoa = this.pessoa;
        this.pessoa = pessoa;
        changeSupport.firePropertyChange("pessoa", oldPessoa, pessoa);
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        String oldCpfcnpj = this.cpfcnpj;
        this.cpfcnpj = cpfcnpj;
        changeSupport.firePropertyChange("cpfcnpj", oldCpfcnpj, cpfcnpj);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        String oldFone = this.fone;
        this.fone = fone;
        changeSupport.firePropertyChange("fone", oldFone, fone);
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        String oldFone2 = this.fone2;
        this.fone2 = fone2;
        changeSupport.firePropertyChange("fone2", oldFone2, fone2);
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        String oldDefeito = this.defeito;
        this.defeito = defeito;
        changeSupport.firePropertyChange("defeito", oldDefeito, defeito);
    }

    public String getRetalho() {
        return retalho;
    }

    public void setRetalho(String retalho) {
        String oldRetalho = this.retalho;
        this.retalho = retalho;
        changeSupport.firePropertyChange("retalho", oldRetalho, retalho);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String oldModelo = this.modelo;
        this.modelo = modelo;
        changeSupport.firePropertyChange("modelo", oldModelo, modelo);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        changeSupport.firePropertyChange("complemento", oldComplemento, complemento);
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
        if (!(object instanceof Ordem)) {
            return false;
        }
        Ordem other = (Ordem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.ClipBoard.Ordem[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
