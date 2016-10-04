/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jarmo
 */
@Embeddable
public class AddressPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Street")
    private String street;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "AdditionalInfo")
    private String additionalInfo;

    public AddressPK() {
    }

    public AddressPK(String street, String additionalInfo) {
        this.street = street;
        this.additionalInfo = additionalInfo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (street != null ? street.hashCode() : 0);
        hash += (additionalInfo != null ? additionalInfo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AddressPK)) {
            return false;
        }
        AddressPK other = (AddressPK) object;
        if ((this.street == null && other.street != null) || (this.street != null && !this.street.equals(other.street))) {
            return false;
        }
        if ((this.additionalInfo == null && other.additionalInfo != null) || (this.additionalInfo != null && !this.additionalInfo.equals(other.additionalInfo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AddressPK[ street=" + street + ", additionalInfo=" + additionalInfo + " ]";
    }
    
}
