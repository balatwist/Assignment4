package Question1;

public class Reverse {
    static int count =0;
    public static void main(String[] args) {
     rev(12345);

    }

    public static void rev(int n){
        if (n<10){

            System.out.println(n);

            return;
        }
else {

            System.out.print(n%10);

            rev(n/10);

        }


    }
}
