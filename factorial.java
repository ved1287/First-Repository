import java.util.Scanner;

class factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;

        }
        System.out.println(fact);
        
    }
}