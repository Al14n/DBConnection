import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String jdbcURL = "jdbc:postgresql://46.229.214.241:5432/postgres";
        System.out.println("login");
        String user = scanner.nextLine();
        System.out.println("password");
        String pass = scanner.nextLine();

        try {
            Connection connection = DriverManager.getConnection(jdbcURL,user,pass);
            System.out.println("Connect");
        } catch (SQLException e) {
            System.out.println("No connect");
            e.printStackTrace();
        }
    }
}