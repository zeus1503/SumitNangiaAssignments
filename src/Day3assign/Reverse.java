package Day3assign;

public class Reverse {

    public static void main(String[] args){

        int var=213465; 
	int rem=0;

        while (var!= 0)
	{
           int i = var%10;
            rem = rem*10 + i;
            var=var/10;
        }
        System.out.println("Reversal is" + rem);

    }
}