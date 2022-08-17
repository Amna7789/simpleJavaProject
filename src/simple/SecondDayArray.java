package simple;

public class SecondDayArray {
    public static void main(String[] args) {

        int[] no = {1, 2,3 , 4, 5};

        for(int i= 0; i< no.length; i++){
            System.out.println(no[i]);
        }
        int[][] num = {
                {1,2,3,11},
                {7,8,9,22},
                {4,5,6,33}
        };

        System.out.println("-----------------------------------------------------");

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.print(num[i][j]);
            }
        }


        int x[] = {2, 4, 6};
        System.out.println(x[1]);
    }
}
