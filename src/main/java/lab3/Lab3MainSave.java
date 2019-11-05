package lab3;


import lab1.Product;
import lab1.Stock;

import java.util.ArrayList;
import java.util.List;

public class Lab3MainSave {
    public static void main(String[] args) {

        // Создаем объект продукт
        Product product = new Product();

        // Создаем объекты - склады где хранится продукт
        Stock stock1 = new Stock("Анина 345","+784564576");
        Stock stock2 = new Stock("Нугумува 144","+7342343455");

        List<Stock> stocks = new ArrayList<>();
        stocks.add(stock1);
        stocks.add(stock2);

        product.setName("Монитор");
        // Прикрепляем склады к продукту
        product.setStocks(stocks);

        // сохраняем объект в в XML документ
        ServiceXML.saveProductData(product);
    }
}
