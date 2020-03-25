package lab9.entities;

import javax.persistence.*;

import java.util.List;

@Entity
public class Zakaz {
    @Id
    private Long id;
    @ManyToOne
    private Client client;
    @ManyToOne
    private DeliveryMan deliveryMan;
    @ManyToMany
    private List<Product> products;
    @Column
    private String dataOrder;
    @Column
    private String dataDelivery;
    @Column
    private String payMetod;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getDataOrder() {
        return dataOrder;
    }

    public void setDataOrder(String dataOrder) {
        this.dataOrder = dataOrder;
    }

    public String getDataDelivery() {
        return dataDelivery;
    }

    public void setDataDelivery(String dataDelivery) {
        this.dataDelivery = dataDelivery;
    }

    public String getPayMetod() {
        return payMetod;
    }

    public void setPayMetod(String payMetod) {
        this.payMetod = payMetod;
    }
}
