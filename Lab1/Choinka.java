

public class Choinka{
    public static void main(String[] args){
        int x =Integer.parseInt(args[0]);
        for(int i =1; i <=x; i++){
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}