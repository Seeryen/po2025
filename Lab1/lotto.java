import java.util.Random;
import java.util.ArrayList; 
public class lotto {
    public static void main(String[] args){
        Random r = new Random();
        ArrayList<Integer> ar = new ArrayList<Integer>(6); 
        ArrayList<Integer> ar_user = new ArrayList<Integer>(6); 
        Integer lotto_count = 0;
        long startTime = System.currentTimeMillis();
        for (int i =0; i<6; i++){
                ar_user.add(Integer.parseInt(args[i]));
            }
        while(true){
            for( int i = 0; i<6; i++){
                Integer x = r.nextInt(49)+1;
                while(ar.contains(x)){
                    x = r.nextInt(49)+1;
                }
                ar.add(x);
            }
            if (ar_user.containsAll(ar)) break;
            lotto_count +=1;
            ar.clear();
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println(duration + " ms");
        System.out.println(lotto_count);
    }

}

