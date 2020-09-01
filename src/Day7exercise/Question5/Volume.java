package Day7exercise.Question5;

public class Volume {

        public static void main(String[] args) {
            int array[][] = {{2, 3, 2}, {6, 6, 7}, {1, 2, 1}};
            int sum=0;
            int volume=1;

            for(int i=0;i<array.length;i++) {
                for(int j=0;j<array[i].length;j++) {
                    volume=volume*array[i][j];
                }
                sum=sum+volume;
                volume=1;
            }
            System.out.println(sum);
        }


    }
