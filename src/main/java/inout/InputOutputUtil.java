package inout;

import com.sun.org.apache.xalan.internal.xsltc.runtime.ErrorMessages_es;
import model.Car;
import model.Message;

import java.util.List;
import java.util.Scanner;

public class InputOutputUtil {
    private static Scanner scanner = new Scanner(System.in);
    private static StringBuilder sb = new StringBuilder();
    private static final String COLON = ":";
    private static final String DASH = "-";

    public static void writeWinner(List<Car> winnerList) {
        for (Car car : winnerList) {
            sb.append(car.getName());
        }
        sb.append(Message.WINNER_ANNOUNCE.getMessage());
        writeFlush();
    }

    private static void writeFlush() {
        System.out.println(sb);
        sb.setLength(0);
    }

    public static String getCarsInput() {
        return scanner.nextLine();
    }

    public static int getLapInput() {
        return scanner.nextInt();
    }

    public static void writeRaceProceed(List<Car> carList) {
        for (Car car : carList){
            writeCarProceed(car);
        }
        writeFlush();
    }

    private static void writeCarProceed(Car car) {
        sb.append(car.getName());
        sb.append(COLON);
        for (int i = 0; i<car.getRaceDist(); i++){
            sb.append(DASH);
        }
        writeFlush();
    }

    public static void writeMessage(Message message){
        sb.append(message.getMessage());
        writeFlush();
    }
}
