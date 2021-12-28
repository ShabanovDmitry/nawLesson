import org.sqlite.JDBC;

import java.sql.*;

public class DbHandler {

    private final String PATH_TO_DB = "jdbc:sqlite:src/main/resources/lesson7sql.db";
    private Connection connection;

    public DbHandler() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        this.connection = DriverManager.getConnection(PATH_TO_DB);
    }

    public void addInfo(Info info) {

        try (PreparedStatement preparedStatement = this.connection.prepareStatement(
                "INSERT INTO lesson7sql('city', 'localDate', 'weatherText', 'temperature') VALUES(?, ?, ?, ?)"
        )) {
            preparedStatement.setObject(1, info.getCity());
            preparedStatement.setObject(2, info.getLocalDate());
            preparedStatement.setObject(3, info.getWeatherText());
            preparedStatement.setObject(4, info.getTemperature());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}
