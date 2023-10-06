package Question1;

public class Reverse {
    static int count =0;
    public static void main(String[] args) {
     rev(153568);
        System.out.println(count);
    }

    public static void rev(int n){
        if (n<10){

            System.out.println(n);
count++;
            return;
        }
else {

            System.out.println(n%10);
           ++ count;
            rev(n/10);

        }


    }
}
