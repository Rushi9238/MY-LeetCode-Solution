import java.util.ArrayList;
import java.util.List;

public class LC1431_Kids_With_the_Greatest_Number_of_Candies {
public static void main(String[] args) {
    int arr[]={12,1,12};
    int extraCandies = 10;
    List<Boolean> lb= new ArrayList<>(arr.length);
    int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]+extraCandies>=max){
                lb.add(true);
            }
            else{
                lb.add(false);
            }
        }
        System.out.println(lb);
}
}
