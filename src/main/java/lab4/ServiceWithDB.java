package lab4;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import lab1.Delivery;
import lab1.DeliveryMan;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceWithDB {

    public static void saveDeliveryList(List<DeliveryMan> deliveries) throws SQLException {

        Connection connection = getDBconnection();
        if (deliveries != null && deliveries.size() > 0) {
            Gson gson = new Gson();

            String deliveriesAsJson = gson.toJson(deliveries);

            PreparedStatement statement = connection.
                    prepareStatement("insert into jtest (content, contentb) values ( cast( ? as json) , cast( ? as json) )");
            statement.setString(1, deliveriesAsJson);
            statement.setString(2, deliveriesAsJson);

            int count = statement.executeUpdate();

            System.out.println(count + " records added!");

            statement.close();

        }
    }

    public static List<DeliveryMan> loadDeliveryManList(String sql) throws JsonSyntaxException, SQLException {
        Connection con = getDBconnection();
        PreparedStatement statement = con.prepareStatement(sql);

        long start = System.nanoTime();
        ResultSet rs = statement.executeQuery();
        long finish = System.nanoTime();

        System.out.printf(sql.contains("contentb") ? "Jsonb: %d\n" : "Json: %d\n", (finish - start));

        List<DeliveryMan> deliveries = new ArrayList<>();
        while (rs.next()) {
            DeliveryMan dlv = new Gson().fromJson(rs.getString(1), DeliveryMan.class);
            deliveries.add(dlv);
        }

        return deliveries;
    }

    public static List<DeliveryMan> loadJson() throws SQLException {
        return loadDeliveryManList("select content from jtest");
    }

    public static List<DeliveryMan> loadJsonb() throws SQLException {
        return loadDeliveryManList("select contentb from jtest");
    }

    public static Connection getDBconnection(){
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            String dbURL = "jdbc:postgresql://localhost:5432/oodb";
            connection =
                    DriverManager.getConnection( dbURL, "postgres", "131997");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
