import java.util.*;

public class Driver1 {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of currency denominations");
        int size=sc.nextInt();
        System.out.println("Enter the currency denominations value");
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter the amount you want  to pay");
        int payable_amt=sc.nextInt();
        Arrays.sort(a);
      //  System.out.println(Arrays.toString(a));
        int remainder=payable_amt;
        HashMap<Integer, Integer> denominations = new HashMap<Integer, Integer>();
        if (remainder > 0) {
            for (int i = a.length - 1; i >= 0; i--) {
              //  System.out.println("Denomination value :" + a[i]);
                int denomination = remainder /a[i];
               // System.out.println("demomination :"+denomination);

            remainder =  remainder %a[i];
               //System.out.println("Remainder :"+remainder);
                if(denomination>0){
                    denominations.put(a[i], denomination);
                }
            }
        }

        System.out.println("Your payment approach in order to give min no of notes will be");
        Set<Integer> setOfKeys=denominations.keySet();
        Iterator iterator=setOfKeys.iterator();
        while (iterator.hasNext()){
            int demo=(int)iterator.next();
            int value=(int)denominations.get(demo);
            System.out.println(demo+":"+value);
        }

        }



    }

