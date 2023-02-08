public class LC2535_Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int digit_sum=0;
        int num_sum=0;
        int diff=0;
        for(int i=0;i<arr.length;i++){
            num_sum=num_sum+arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            while(arr[i]>0){
                int last=arr[i]%10;
                arr[i]=arr[i]/10;
                digit_sum=digit_sum+last;
            }
        }
        diff=Math.abs(num_sum-digit_sum);
        System.out.println(num_sum);
        System.out.println(digit_sum);
        System.out.println(diff);
    }
}
