package Question2;

public class Counter {
    public static void main(String[] args) {
        countDigits(123456789);
        System.out.println("\nTotal number of digits is  = "+count);
    }
    static  int count;
     static void countDigits(int num){
        if (num<10){
           count++;
            return;
        }
        else {
            System.out.print(num % 10);
         count++;
         countDigits(num/10);
        }
    }
}
