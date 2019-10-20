
package pen;

public class Toll {
    
    public Double hegy;
    public Double hossz;
    private String marka = "Zebra";
    public String szin;
    private Boolean toltheto = false;
    
    public Toll(Double hegy, Double hossz, String szin){                      //Új toll megadása
        this.hegy = hegy;
        this.hossz = hossz;
        this.szin = szin;
    }
    
    public String getmarka(){                                              //Márka  lekérdezése
        return marka;
    }
    
    public void setmarka(String marka){                                    //Márka beállítása
        this.marka = marka;
    }
    
    public String gettoltheto(){                                           //Tölthető lekérdezése
        String yes = "Igen";
        String no = "Nem";
        
        if (this.toltheto == true) {
            return yes;
        }
        else {
            return no;
        }
    }
    
    public void settoltheto(Boolean toltheto){                             //Tölthető beállítása
        this.toltheto = toltheto;
    }
    
    public void printToll(){                                               //Toll kiírása
        System.out.println("A toll tulajdonságai:");
        System.out.println("Hegye " + this.hegy + " mm");
        System.out.println("Hossza " + this.hossz + " cm");
        System.out.println("Márkája " + this.getmarka());
        System.out.println("Színe " + this.szin);
        System.out.println("Tölthető? " + this.gettoltheto());
    }
    
    public void kifogy(){
        Double kifogy;
        kifogy = (this.hossz/this.hegy)*(54.0/365.0);
        System.out.println("Ez a toll " + String.format("%.2f", kifogy) +  " hónap alatt fog kifogyni");
    }

}

