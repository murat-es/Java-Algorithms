public class Kata {
  public static int findEvenIndex(int[] arr) {
    int index=0;
    boolean notEqual=false;
    for(int i=0; i<arr.length; i++){
    int left=0;
    int right=0;
 
      for(int j=0; j<i ;j++){
        left+=arr[j];
      }
      for(int k=i+1; k<arr.length; k++){
        right+=arr[k];
      }
      if(left==right){
        notEqual=true;
        index=i;
        break;
      }
    }
    if(notEqual==false){
      return -1;
    }
    
    return index;
  }
}