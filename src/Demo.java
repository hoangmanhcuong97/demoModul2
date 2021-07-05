import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thang ma ban muon hien thi ngay:");
        int month = sc.nextInt();
        String daysInMonth;
       switch (month){
           case 2:
//               System.out.println("Thang 2 co 28 hoac 29 ngay");
               daysInMonth = "28 or 29";
               break;
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
//               System.out.println("Thang " + month + " co 31 ngay");
               daysInMonth = "31";
               break;
           case 4:
           case 6:
           case 9:
           case 11:
//               System.out.println("Thang " + month + " co 30 ngay");
               daysInMonth = "30";
               break;
           default:
//               System.out.print("Invalid input!");
               daysInMonth ="";
               break;
       }
        if (!daysInMonth.equals("")) {
            System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        }
        else System.out.print("Invalid input!");
    }
}

