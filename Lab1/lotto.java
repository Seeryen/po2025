import java.util.Random;
import java.util.ArrayList; // Import the ArrayList class
public class lotto {
    public static void main(String[] args){
        Random r = new Random();
        ArrayList<Integer> ar = new ArrayList<Integer>(10); // Create an ArrayList object
        for( int i = 0; i<6; i++){
            Integer x = r.nextInt(50);
            while(ar.contains(x)){
                x = r.nextInt(50);
            }
            ar.add(x);
            //ar[i] = r.nextInt(50);
            //System.out.println(ar[i]);

        }
        System.out.println(ar);
    }
}
