import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int countNumber = 5;
        int sum = 0;

        for(int i =1; i <= countNumber; i++){
            System.out.println("Vui long nhap so nguyen thu: " + i );
            int numb = sc.nextInt();
            sum += numb;
        }

        double numAveg = (double) sum / countNumber;

        System.out.println("Gia tri trung binh la: " + numAveg);

        sc.close();

    }
}