import java.util.HashMap;

public class LC219_Contains_Duplicate_ll {
    // EXPLAINE
/* you have been given an integers array nums and an integer K.
if you find any duplicate elements and the absolute difference between
 there indices gives you a value <= k then you can return true.
if you couldn't find such element you can return false.
eg: nums[] = {4, 3, 1, 4} k = 5 indices of 4 is : 0 , 3
the abs value of indices = |0 - 3| = 3
which is <= k so we can return true.*/  
    public static void main(String[] args) {
        int arr[]={1,0,1,1};
        int k=1;
      Boolean b=cheak(arr,k);
      System.out.println(b);
    }

    private static Boolean cheak(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(mp.containsKey(nums[i])){
               if(Math.abs(i-mp.get(nums[i]))<=k) return true;
           }
           mp.put(nums[i],i);
        }
        return false;
    }

    // private static Boolean cheak(int[] arr,int k) {
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //              if(arr[i]==arr[j] && Math.abs(i-j)>k){
    //                 return false;
                    
    //             }
    //             else if(arr[i]==arr[j] && Math.abs(i-j)<=k){
    //                 return true;
                     
    //              }
                
                
    //         }

    //     }
    //     return false;
    // }
    
}
