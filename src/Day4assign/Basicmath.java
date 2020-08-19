package Day4assign;

public class Basicmath {

    public static int main(String[] args) {

        var add = addition(5, 6);
        return add;
    }

        public static int substract (int a, int b)
        {
            return a-b;
        }


        public static int fact(int num)
        {
            int factorial=1;

            for(int i=1;i<num;i++)
            {
                factorial=factorial+factorial*i;

            }
            return  factorial;

        }

    private static int addition(int i, int j) {
        return i+j;

    }



    }



