/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jarmo
 */
@Entity
@Table(name = "address")
@NamedQueries({
    @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a"),
    @NamedQuery(name = "Address.findByStreet", query = "SELECT a FROM Address a WHERE a.addressPK.street = :street"),
    @NamedQuery(name = "Address.findByAdditionalInfo", query = "SELECT a FROM Address a WHERE a.addressPK.additionalInfo = :additionalInfo")})
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AddressPK addressPK;
    @JoinColumn(name = "InfoEntity_Id", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Infoentity infoEntityId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
    private Collection<Cityinfo> cityinfoCollection;

    public Address() {
    }

    public Address(AddressPK addressPK) {
        this.addressPK = addressPK;
    }

    public Address(String street, String additionalInfo) {
        this.addressPK = new AddressPK(street, additionalInfo);
    }

    public AddressPK getAddressPK() {
        return addressPK;
    }

    public void setAddressPK(AddressPK addressPK) {
        this.addressPK = addressPK;
    }

    public Infoentity getInfoEntityId() {
        return infoEntityId;
    }

    public void setInfoEntityId(Infoentity infoEntityId) {
        this.infoEntityId = infoEntityId;
    }

    public Collection<Cityinfo> getCityinfoCollection() {
        return cityinfoCollection;
    }

    public void setCityinfoCollection(Collection<Cityinfo> cityinfoCollection) {
        this.cityinfoCollection = cityinfoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addressPK != null ? addressPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.addressPK == null && other.addressPK != null) || (this.addressPK != null && !this.addressPK.equals(other.addressPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Address[ addressPK=" + addressPK + " ]";
    }
    
}
