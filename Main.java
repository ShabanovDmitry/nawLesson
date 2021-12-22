import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(RequestSender.sendCityIdRequest("Moscow"));
        System.out.println(RequestSender.sendTempIdRequest("294021"));
    }
}
