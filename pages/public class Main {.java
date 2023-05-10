public class Main {
    public static int findNumber(int n){
        if(n==0||n==1)
            return n;
        else{
            int number = findNumber(n-1)*2;
            return number;
        }
    }
    public static void main(String[] args){
        System.out.println("The number I am looking for is: " + findNumber(10));
    }
}
