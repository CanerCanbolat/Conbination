import java.util.Scanner;
public class Conbination {
    public static void main (String[] args) {
        int n,r,fak=1,fak2=1,fak3=1;double con ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz :");
        n= inp.nextInt();
        System.out.print("Kaç elemanlı gruplar olsun ? ");
        r=inp.nextInt();
        for (int i = 1 ; i <= n; i++) {
            fak = fak*i ;
        }
        for (int i = 1; i <=r ; i++) {
            fak2 = fak2*i;
        }
        for (int i = 1; i <=(n-r) ; i++) {
            fak3=fak3*i;
        }
        con=fak/(fak2*fak3);
        System.out.print("Konbinasyon = "+con);
    }
}
