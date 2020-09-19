import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int num = get.nextInt();
        if(!(num>12) && !(num <11))
            System.out.println("good");
    }

}
