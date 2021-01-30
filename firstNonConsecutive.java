class FirstNonConsecutive {
    static Integer find(final int[] array) {
      int j=1;
      for(int i=0;i<array.length-1;i++){
          if(array[i]!=array[j]-1){
            return array[j];
          }
        j++;
      }
      return null;
    }
}