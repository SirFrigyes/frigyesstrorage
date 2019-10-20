package akasztofa;
import java.util.Scanner;

public class Akasztofa {
   
    
    
    public static void main(String[] args) {
        
        System.out.println("Akasztófa\n");
        System.out.println("Találd ki melyik szóra gondoltam.");
        System.out.println("10 életed van.");
        
        Integer life = 10;
        String word = "paralelogramma";
        StringBuilder c = new StringBuilder("______________");
        Boolean in = false;
        
        char cin;
        Scanner sc = new Scanner(System.in);
        
        
        while(life>0){
            in = false;
            System.out.println("Adj meg egy betűt: ");
            cin = sc.next().charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i)== cin) {
                    c.setCharAt(i,cin);
                    in = true;
                }
            }
            if (in==false) {
                life--; 
            }
            System.out.println(""+ c );
            System.out.println(life + " életed maradt");
            
            int j = 0;
            for (int i = 0; i < c.length(); i++) {
                if (c.charAt(i)=='_') {
                    j = 1;
                }
            }
            if (j==0) {
                System.out.println("\nGratulálnuk!\nVége a játéknak.");
                break;
            }
        }
        if(life==0){
            System.out.println("\nVesztettél!");
        }
    }
}
