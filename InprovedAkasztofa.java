package inprovedakasztofa;
import java.util.Scanner;

public class InprovedAkasztofa {

    public static void main(String[] args) {
        System.out.println("Akasztófa\n");
        
        Integer life = 10;
        
        System.out.println("Adj meg egy szót vagy többet (az ékezeteket nem ismeri fel!):");
        Scanner be = new Scanner(System.in);
        String s = be.nextLine();
        
        StringBuilder s_new = new StringBuilder(s);
        char also = '_';
        for (int i = 0; i < s.length(); i++) {
            if (s_new.charAt(i)!=' ') {
                s_new.setCharAt(i,also);
            }  
        }
        System.out.println("\n\n\n\n" + s_new);
        System.out.println(life + " életed van.");
        
        Boolean in = false;
        
        char c_in;
        char c_IN;
        char c_in2;
        Scanner sc = new Scanner(System.in);
        
        
        while(life>0){
            in = false;
            System.out.println("Adj meg egy betűt: ");
            c_in = sc.next().charAt(0);
           
            
            c_IN = Character.toUpperCase(c_in);
            c_in2 = Character.toLowerCase(c_in);
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ') {
                    if (s.charAt(i)== c_in) {
                    s_new.setCharAt(i,c_in);
                    in = true;
                    }
                    if (s.charAt(i)== c_IN) {
                    s_new.setCharAt(i,c_IN);
                    in = true;
                    }
                    if (s.charAt(i)== c_in2) {
                    s_new.setCharAt(i,c_in2);
                    in = true;
                    }
                    
                }
                
            }
            if (in==false) {
                life--; 
            }
            System.out.println(""+ s_new );
            System.out.println(life + " életed maradt");
            
            int j = 0;
            for (int i = 0; i < s_new.length(); i++) {
                if (s_new.charAt(i)=='_') {
                    j = 1;
                }
            }
            if (j==0) {
                System.out.println("\nGratulálunk!\nVége a játéknak.");
                System.out.println("A kifejezés: " + s);
                if (life>0) {
                    System.out.println("És még maradt " + life + " életed is!");
                }
                break;
            }
        }
        if(life==0){
            System.out.println("\nVesztettél!");
        }
    }
    
}
