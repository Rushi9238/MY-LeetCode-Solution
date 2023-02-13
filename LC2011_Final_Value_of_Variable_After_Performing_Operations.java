
class LC2011_Final_Value_of_Variable_After_Performing_Operations{
    public static void main(String[] args) {
        String s[]={"--X","X++","X++"};
        int x=0;
        for(int i=0;i<s.length;i++){
            //System.out.println(s[i]);
            if(s[i].charAt(0)=='-' || s[i].charAt(1)=='-'){
                // System.out.println(s[i]);
                x=x-1;
            }
            else if(s[i].charAt(0)=='+' || s[i].charAt(1)=='+'){
                x=x+1;
            }
        }
        System.out.println(x);
    }
}