package lab1;

import java.util.List;

public class Order {
    private List<Client> clients;
    private List<DeliveryMan> deliveryMans;
    private List<Product> products;
    String dataOrder;
    String dataDelivery;
    String payMetod;

    public List<Client> getClients() {
        return clients;
    }


    public List<DeliveryMan> getDeliveryMan() {
        return deliveryMans;
    }


    public List<Product> getProducts() {
        return products;
    }

    void addClient (Client client){
        if (!clients.contains(client)) {
            clients.add(client);
        }
    }

    void addDeliveryMan (DeliveryMan deliveryMan){
        if (!deliveryMans.contains(deliveryMan)) {
            deliveryMans.add(deliveryMan);
        }
    }

    void addProduct (Product product){
        if (!products.contains(product)) {
            products.add(product);
        }
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
