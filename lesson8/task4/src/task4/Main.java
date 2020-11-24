package task4;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        Player[] p1 = new Player[3];
        p1[0]= new Player(1, "Aidana", "Bissenova", "1");
        p1[1]= new Player(2, "Aruzhan", "Satybaldiyeva", "2");
        p1[2]= new Player(3, "Kamila", "Malikova", "3");
        Player[] p2 = new Player[3];
        p2[0]= new Player(1, "Muba", "Tur", "1");
        p2[1]= new Player(2, "Kema", "Iman", "2");
        p2[2]= new Player(3, "Altynbek", "Kais", "3");
        Club c1 = new Club("Zvezzda", "Ata", 5, p1 );
        Club c2 = new Club("Pantera", "Astana", 4, p2 );
        Club[] c = {c1,c2};
        for(int i=0; i<c.length; i++){
           c[i].printClubData();
        }

    }
}
