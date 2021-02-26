public class bubbleSort {
    public static void main(String[] args) {

        int[] array={3,8,4,51,6,161,484,516,16,4,54,12,3468,1};
        boolean isSorted=true;

        while (isSorted){
            isSorted=false;
            for (int i = 0; i <array.length-1 ; i++) {
                if (array[i]>array[i+1]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    isSorted=true;
                }
            }
        }

        for (int value : array) {
            System.out.println("i= " + value);
        }
    }
}