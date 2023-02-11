public class LC1071_Greatest_Common_Divisor_of_Strings {
    public static void main(String[] args) {
        String str1="ABCABC";
        String str2="ABC";
        int l1=str1.length();
        int l2=str2.length();
        int max=Math.max(l1, l2);
        String result="";
        for(int i=0;i<max;i++){
                if(str1.charAt(i)==str2.charAt(i)){
                    result=result+str1.charAt(i);
                }
        }
    }
}
