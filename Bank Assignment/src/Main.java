import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        Deposit deposit = new Deposit(5000, date, "CHECKING");

        System.out.println(deposit);
    }
}
