import java.util.Arrays;

public class LC217_Contains_Duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        Boolean b=cheak(arr);
        System.out.println(b);
    }

    // TIME COMPLEXITY IS O(n)
    // private static Boolean cheak(int[] arr) {
    //     HashSet<Integer> hs=new HashSet<>();
    //     for(int i=0;i<arr.length;i++){
    //         if(hs.contains(arr[i])){
    //             return true;
    //         }
    //         else{
    //             hs.add(arr[i]);
    //         }
    //     }
    //     return false;
    // }

    // *******************BROUTE FORCE SOLUTION*****************************************
        // TIME COMPLEXITY IS O(nlogn)
    private static Boolean cheak(int[] arr) {
            Arrays.sort(arr);
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]==arr[i+1]){
                    return false;
                }
            }
        return true;
    }
    
    
    
}
