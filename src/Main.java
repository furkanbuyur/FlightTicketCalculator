import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int distance, schedule, age, type;
        boolean isError = true;
        double perKm = 0.10,amount,discountAmount = 0,discountRate = 1;

        System.out.print("Enter the distance in km : ");
        distance = inp.nextInt();
        System.out.print("Enter your age : ");
        age = inp.nextInt();
        System.out.print("\n1. One way\n2. Round Trip\nChoose your travel preference : ");
        type = inp.nextInt();

        amount = distance * perKm;

            if (age > 0 && distance > 0 && ((type == 1) || (type == 2)) ){
                if (age < 12){
                    discountRate = 0.5;
                }else if (age < 24){
                    discountRate = 0.9;
                }else if (age > 65){
                    discountRate = 0.7;
                }
            }else {
                isError = false;
            }
            amount *= discountRate ;

            if (type == 2) {
                discountAmount = (amount * 0.8) * 2;
            } else if (type == 1) {
                discountAmount = amount;
            }
        if (!isError){
                System.out.println("\nYou entered incorrect data.");
            }else {
                System.out.println("\nTotal Amount : " + discountAmount);
            }
    }
}