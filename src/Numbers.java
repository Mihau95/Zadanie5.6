import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;


        do{
            System.out.println("Wskaz liczbe: ");
            a = scanner.nextInt();

            if (a<100){
                System.out.println("Podana liczba jest za mala!");
            }else if(a>200){
                System.out.println("Podana liczba jest za duza!");
            }else if(a%3!=0){
                System.out.println("Podana liczba nie jest podzielna przez 3!");
            }else {
                System.out.println("Prawidlowa liczba");
            }
        }while(a<=100 || a>=200 && a%3!=0);

    }
}
