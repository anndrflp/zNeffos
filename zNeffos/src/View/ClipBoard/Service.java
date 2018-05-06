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
@Table(name = "service", catalog = "zNeffos", schema = "")
@NamedQueries({
    @NamedQuery(name = "Service.findAll", query = "SELECT s FROM Service s")
    , @NamedQuery(name = "Service.findByNumero", query = "SELECT s FROM Service s WHERE s.numero = :numero")
    , @NamedQuery(name = "Service.findByCliente", query = "SELECT s FROM Service s WHERE s.cliente = :cliente")
    , @NamedQuery(name = "Service.findByCpfcnpj", query = "SELECT s FROM Service s WHERE s.cpfcnpj = :cpfcnpj")
    , @NamedQuery(name = "Service.findByFone", query = "SELECT s FROM Service s WHERE s.fone = :fone")
    , @NamedQuery(name = "Service.findByEmail", query = "SELECT s FROM Service s WHERE s.email = :email")
    , @NamedQuery(name = "Service.findByCelular", query = "SELECT s FROM Service s WHERE s.celular = :celular")
    , @NamedQuery(name = "Service.findByDefeito", query = "SELECT s FROM Service s WHERE s.defeito = :defeito")
    , @NamedQuery(name = "Service.findBySolucao", query = "SELECT s FROM Service s WHERE s.solucao = :solucao")
    , @NamedQuery(name = "Service.findByObservacao", query = "SELECT s FROM Service s WHERE s.observacao = :observacao")
    , @NamedQuery(name = "Service.findByValor", query = "SELECT s FROM Service s WHERE s.valor = :valor")
    , @NamedQuery(name = "Service.findByFormapagamento", query = "SELECT s FROM Service s WHERE s.formapagamento = :formapagamento")})
public class Service implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Basic(optional = false)
    @Column(name = "CLIENTE")
    private String cliente;
    @Column(name = "CPFCNPJ")
    private String cpfcnpj;
    @Column(name = "FONE")
    private String fone;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "DEFEITO")
    private String defeito;
    @Column(name = "SOLUCAO")
    private String solucao;
    @Column(name = "OBSERVACAO")
    private String observacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private Double valor;
    @Column(name = "FORMAPAGAMENTO")
    private String formapagamento;

    public Service() {
    }

    public Service(Integer numero) {
        this.numero = numero;
    }

    public Service(Integer numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        Integer oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        String oldCliente = this.cliente;
        this.cliente = cliente;
        changeSupport.firePropertyChange("cliente", oldCliente, cliente);
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        String oldCpfcnpj = this.cpfcnpj;
        this.cpfcnpj = cpfcnpj;
        changeSupport.firePropertyChange("cpfcnpj", oldCpfcnpj, cpfcnpj);
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        String oldFone = this.fone;
        this.fone = fone;
        changeSupport.firePropertyChange("fone", oldFone, fone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        String oldCelular = this.celular;
        this.celular = celular;
        changeSupport.firePropertyChange("celular", oldCelular, celular);
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        String oldDefeito = this.defeito;
        this.defeito = defeito;
        changeSupport.firePropertyChange("defeito", oldDefeito, defeito);
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        String oldSolucao = this.solucao;
        this.solucao = solucao;
        changeSupport.firePropertyChange("solucao", oldSolucao, solucao);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;
        changeSupport.firePropertyChange("observacao", oldObservacao, observacao);
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        Double oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String formapagamento) {
        String oldFormapagamento = this.formapagamento;
        this.formapagamento = formapagamento;
        changeSupport.firePropertyChange("formapagamento", oldFormapagamento, formapagamento);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Service)) {
            return false;
        }
        Service other = (Service) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.ClipBoard.Service[ numero=" + numero + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
