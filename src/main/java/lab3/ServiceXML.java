package lab3;


import lab1.Product;
import lab1.Stock;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ServiceXML {


    public static void saveProductData(Stock stock) {

        try {
            JAXBContext context = JAXBContext.newInstance(Stock.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(stock, new File("stocks.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    public static Stock loadProductFromXML() {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Stock.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (Stock) un.unmarshal(new File("stocks.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}
