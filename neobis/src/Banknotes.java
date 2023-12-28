import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(n);

        int[] banknotes={100,50,20,10,5,2};
        for( int nota:banknotes){
            int num=n/nota;
            n%=nota;
            System.out.println(num+"nota(s) de R$ "+ nota + ",00");
        }
        sc.close();
    }
}
