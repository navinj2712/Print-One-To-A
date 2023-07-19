import java.util.Scanner;

public class PrintOneToA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int output = printOnetoA(number);
        //System.out.println("Output : " + output);
    }

    private static int printOnetoA(int number) {
        if (number == 1){
            System.out.print("1");
            return 1;
        }
        System.out.print(number + " ");
        return printOnetoA(number - 1) ;
    }
}
