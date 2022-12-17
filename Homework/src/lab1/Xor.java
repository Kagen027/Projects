package lab1;

public class Xor {
    public static boolean xor(int n, int k) {
        if((n==1)^(k==3) || (n==3)^(k==1)){
            return true;
        }
        else{
            return false;
        }
    }   
}
