public class Invert{
  public static int[] invert(int[] array) {
    if(array.length==0){
    return array;
  }
    for(int i=0; i<array.length; i++)
    {
     if(array[i]>0){
        array[i]=array[i]*-1;
     } 
      else if(array[i]<0){
        array[i]=Math.abs(array[i]);
      }
    }
    return array;
  }
}