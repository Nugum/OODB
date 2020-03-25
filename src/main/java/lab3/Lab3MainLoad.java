package lab3;


import lab1.Product;
import lab1.Stock;

public class Lab3MainLoad {
    public static void main(String[] args) {

        Stock stock = ServiceXML.loadProductFromXML();

        System.out.println(stock);
    }


}
