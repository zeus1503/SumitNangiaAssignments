package Day7exercise.Question3;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

public class MyCalculator implements AdvancedArithmetic{

    public static void main(String[] args) {

        MyCalculator a =new MyCalculator();
        int div_Sum=a.divisor_sum(10);
        System.out.println("Sum is: "+div_Sum);
    }

    @Override
    public int divisor_sum(int n) {
        int sum=0;
        for(int i=1;i<=n/2;i++) {
            if(n%i==0) {
                sum=sum+i;
            }
        }
        return(sum+n);
    }

}