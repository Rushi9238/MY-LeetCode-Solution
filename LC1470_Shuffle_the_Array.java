import java.util.Arrays;

public class LC1470_Shuffle_the_Array {
     public static void main(String args[]) {
        int arr[]={1,2,3,4,4,3,2,1};
        int n=arr.length/2;
        int temp[]=new int[arr.length];
        int j=0;
        int k=n;
        for(int i=0;i<arr.length;i++){
                if(i%2==0){
                    temp[i]=arr[j];
                    j++;
                }
                else{
                    temp[i]=arr[k];
                    k++;
                }
        }
        
        System.out.println(Arrays.toString(temp));
    }
}
