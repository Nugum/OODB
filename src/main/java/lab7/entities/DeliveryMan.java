package lab7.entities;

import lab7.annotation.Column;
import lab7.annotation.Entity;
import lab7.annotation.Id;

@Entity
public class DeliveryMan {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DeliveryMan(String name, String data) {

        this.name = name;
        this.data = data;
    }
}
