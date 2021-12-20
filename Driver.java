import java.util.Scanner;

public class Driver {
    static Scanner sc=new Scanner(System.in);
    public static void main(String...args){
        System.out.println("Enter the size of transaction array");
        int size =sc.nextInt();
        int a[]=new int[size];
        int target_value=0;
        System.out.println("Enter the values of array");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the total number of targets that needs to be achieved");
        int targets=sc.nextInt();
       while(targets>0){
           System.out.println("Enter the value of target");
            target_value=sc.nextInt();
           int sum=0;
           for(int j=0;j<size;j++){
               sum=sum+a[j];
               if(sum>=target_value){
                   System.out.println("Target achieved in "+(j+1)+"transactions");
                   break;
               }
           }
           if(sum<target_value){
               System.out.println("Given target is not achieved");
           }
        targets--;
       }


    }

}
