import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rate = 23000;

        System.out.println("Nhap so tien USD:");
        double usd = sc.nextDouble();
        double vnd = usd * rate;
        System.out.printf("%.2f VND",vnd);
    }
}
