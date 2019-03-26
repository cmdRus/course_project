package dataBase;

import java.sql.*;

public class jdbc {

    private final String driverName = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/mediasoft?useSSL=false";
    private final String login = "root";
    private final String password = "BVCdsa45";

    /* подключение к базе данных */

    public void connectToSQL() {

        try{
            String INPUT = "insert into vacancy(name,description,email) values ('adm', 'adm', 'adm')";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection(url, login, password);
            Statement statement = connect.createStatement();
            statement.executeUpdate(INPUT);
            ResultSet resultSet = statement.executeQuery("select * from vacancy");

            while (resultSet.next()){
                System.out.print(resultSet.getInt(1)+"   ");
                System.out.print(resultSet.getString(2)+"   ");
                System.out.print(resultSet.getString(3)+"   ");
                System.out.println(resultSet.getString(4));
                System.out.println("------------------------");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
