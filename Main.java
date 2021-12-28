import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {

//Не получается достать данные из RequestSender. Ввел произвольные данные.
        Info info = new Info("Moscow", "25.12.2021", "cold", -8.0);


        DbHandler dbHandler = new DbHandler();

        dbHandler.addInfo(info);


        System.out.println(RequestSender.sendCityIdRequest("Moscow"));
        System.out.println(RequestSender.sendTempIdRequest("294021"));
    }
}
