package Day6assign.MathFunctionCallingPackage;
import Day6assign.BasicMathPackage.Basicmath;

public class AccessBasicMaths extends Basicmath {


    public static void main(String[] args) {

        substract(10,5);
        fact(6);
        division(10,2); //accessing protected method via different package
        multiply(10,11);

    }

}
