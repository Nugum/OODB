package lab3;


import lab1.Product;

public class Lab3MainLoad {
    public static void main(String[] args) {

        Product product = ServiceXML.loadProductFromXML();

        System.out.println(product);
    }


}
