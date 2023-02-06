import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main (String args[]){
        HashMap<Integer,Integer>hs=new HashMap<>();
        int arr[]={2,7,11,15};
        int result[]=new int [2];
        int target=9;
        for(int i=0;i<arr.length;i++){
            int temp=target-arr[i];
            if(hs.containsKey(temp)){
                result[0]=hs.get(temp);
                result[1]=i;
            }
            else{
                hs.put(arr[i], i);
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
