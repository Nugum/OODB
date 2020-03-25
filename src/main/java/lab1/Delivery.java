package lab1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement
public class Delivery {

    @XmlElementWrapper (name = "orders")
    @XmlElement (name = "order")
    private List<Order> orders;
    @XmlElementWrapper (name = "deliveryMans")
    @XmlElement (name = "deliveryMan")
    private List<DeliveryMan> deliveryManList;
    @XmlElementWrapper (name = "stocks")
    @XmlElement (name = "stock")
    private List<Stock> stocks;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(List<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}
