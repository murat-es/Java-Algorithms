public class Matrix {
    public static void main(String[] args) {
        int [][] matrix= new int[5][5];


        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                int random = (int)(Math.random()*10);
                matrix [i][j]=random;
                System.out.print(" | "+matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("sum of the cross:");
        int cross1=0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (i==j){
                    cross1+=matrix[i][j];

                }
            }
        }
        int cross2=0;
        for (int i =0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                if (i+j==matrix.length-1){
                    cross2+=matrix[i][j];
                }
            }
        }
        System.out.println("sum of the 1st cross : "+cross1);
        System.out.println("sum of the 2nd cross: "+cross2);
    }
}
