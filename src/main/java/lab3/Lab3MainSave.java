package lab3;


import lab1.Product;
import lab1.Stock;

import java.util.ArrayList;
import java.util.List;

public class Lab3MainSave {
    public static void main(String[] args) {


        Stock stock1 = new Stock("Анина 345","+784564576");
        Product product1 = new Product("An") ;
        stock1.getProducts().put(product1,4);

        ServiceXML.saveProductData(stock1);
    }
}
