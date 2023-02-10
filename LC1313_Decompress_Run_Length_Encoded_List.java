
import java.util.Arrays;

public class LC1313_Decompress_Run_Length_Encoded_List {
    public static void main(String[] args) {
        int arr[]={1,1,2,3};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                // System.out.println(i);
                count=count+arr[i];
            }
        }
        // System.out.println(count);
        int result[]=new int [count];
        int j=0;
        for(int i=0;i<arr.length;i=i+2){
            //if(i%2==0){
                for(int k=0;k<arr[i];k++){
                   result[j]=arr[i+1];
                   j++;
                
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
