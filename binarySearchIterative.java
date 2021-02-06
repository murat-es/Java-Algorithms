public class binarySearchIterative {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10,23,45,48,49};
        System.out.println(binarySearch(array,8));
    }
    public static int binarySearch(int[] array,int number){
        int low=0;
        int high=array.length-1;

        while (low<=high){
            int mid=(high+low)/2;

            if (array[mid]==number){
                return mid;
            }

            if (array[mid]>number){
                high=mid-1;

            }
            else {  // if (array[mid]<number)
                low=mid+1;
            }
        }
        return -1;
    }
}