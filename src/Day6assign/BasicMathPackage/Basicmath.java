package Day6assign.BasicMathPackage;

public class Basicmath {


        public static void substract (int a, int b)
        {
            int c = a-b;
            System.out.println(c);
        }


        public static void fact(int num)
        {
            int factorial=1;

            for(int i=1;i<num;i++)
            {
                factorial=factorial+factorial*i;

            }
            System.out.println(factorial);

        }


        public static void multiply(int i, int j) {
            System.out.println(i*j); }



                 //making addition as private instead of public
        private static void addition(int i, int j) {
            System.out.println(i+j); }

                //making division protected instead of public
        protected static void division(int i, int j) {
            System.out.println(i/j);  }


}



