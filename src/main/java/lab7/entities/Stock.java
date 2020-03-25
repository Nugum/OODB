package lab7.entities;

import lab7.annotation.Column;
import lab7.annotation.Entity;
import lab7.annotation.Id;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Entity
public class Stock {
    @Id
    private Long id;
    @Column
    private String Address;
    @Column
    private String phoneNumber;


    public Stock() {
    }

    @Override
    public String toString() {
        return "Stock{" +
                "Address='" + Address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Stock(String address, String phoneNumber ) {
        this.phoneNumber = phoneNumber;
        this.Address = address;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAdress() {
        return Address;
    }

    public void setAdress(String adress) {
        Address = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
