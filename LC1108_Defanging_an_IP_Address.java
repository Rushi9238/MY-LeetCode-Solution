public class LC1108_Defanging_an_IP_Address {
    public static void main(String args[]){
        String s="1.1.1.1";
        String temp="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='.'){
                    // System.out.print("["+s.charAt(i)+"]");
                    temp=temp+"["+s.charAt(i)+"]";
                }
                else{
                    temp=temp+s.charAt(i)+"";
                }
            }
            System.out.println(temp);
    }

}
