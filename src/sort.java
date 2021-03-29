import java.lang.reflect.Array;
import java.util.Arrays;
public class sort {

public  static double sort(int[] nums1 ,int[] nums2 ){
    double median=0;

        int i = 0, j = 0;


    int mergeArray[]=new int[nums1.length+ nums2.length];
    while (i<nums1.length&& j<nums2.length)

            if(nums1[i]<nums2[j]){
        mergeArray[i]=nums1[i];
        i++;

    }

       else{
        mergeArray[j]=nums2[j];
        j++;
    }

      if(mergeArray.length %2 != 0){
          median=mergeArray[mergeArray.length/2];


      }
      else
          median=mergeArray[(mergeArray.length - 1) / 2] + mergeArray[mergeArray.length / 2];

return median;

}

public static void main (String args[]){
    int[] array1= new int[]{1,29,43};
    int[] array2= new int[]{6,5,10};

    System.out.println(sort(array1,array2));



}



}
