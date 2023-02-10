

public class LC1528_Shuffle_String {
    public static void main(String[] args) {
        // given output
        String s="codeleet";
        int arr[]={4,5,6,7,0,2,1,3};
        String temp="";
        for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(i==arr[j]){
                        temp=temp+s.charAt(j);
                    }
                }
        }
        System.out.println(temp);
    }
}
