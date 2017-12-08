
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] tab = new int[3][3];
        System.out.println(tab.length);


        int i = 0;
        int j = 0;
        while (i < tab.length){
            if (j >tab.length-1){
                j = 0;
                i++;
            }

            if (i >= tab.length || j >= tab.length){
                break;
            }
            tab[i][j] = sc.nextInt();
            j++;


        }
        i=0;
        j=0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        while(j!=3) {
            sum1 += tab[0][j];
            j++;
        }
        j=0;
        while(j!=3) {
            sum2 += tab[1][j];
            j++;
        }
        j=0;
        while(j!=3) {
            sum3 += tab[2][j];
            j++;
        }

        if (sum1 > sum2 && sum1 > sum3){
            System.out.println("Najwieksza suma liczb jest w wierszu 1 i wynosi "+sum1);
        }
        else if (sum2 > sum1 && sum2 > sum3){
            System.out.println("Najwieksza suma liczb jest w wierszu 2 i wynosi "+sum2);
        }
        else if (sum3 > sum2 && sum3 > sum1){
            System.out.println("Najwieksza suma liczb jest w wierszu 3 i wynosi "+sum3);
        }
        else{
            System.out.println("Brak największego wyniku sumy w wierszu");
        }









    }
}
