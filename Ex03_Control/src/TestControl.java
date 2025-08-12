public class TestControl {
    public static void main(String[] args) {
        int n = 0;
        while(n<10){
            System.out.println("The value of n is " + n);
            System.out.println("The value of n + 10 is " + (n+10));

            n++;
        }

        int j = 1;
        double result = 0.0;

        while(j<10){
            System.out.println("The value of j is " + j);
            result = Math.pow(2,j);
            System.out.println("2 to the power of "+j+ " is " + result);
            j++;

        }

        //rewriting the above loops as for loops
        for (int i=0; i<10; i++){
            System.out.println(i);
            System.out.println(i+10);
        }

        for (int k=1; k<10;k++) {
            double result2 = 0.0d;
            System.out.println("The value for k using the for loop is " + k);
            result2 = Math.pow(2,k);
            System.out.println("2 to the power of "+ k+ " is "+ result2);
        }
    }
}
