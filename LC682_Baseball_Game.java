import java.util.Stack;
// import java.util.*;
// import java.util.Scanner;

class LC682_Baseball_Game{
        public static void main(String args[]){
            // Scanner sc= new Scanner(System.in);
            // String s[]= new String[5];
            Stack<Integer> st= new Stack<>();
            String s[]={"1","C"};
                for(int i=0;i<s.length;i++){
                    if(s[i].charAt(0)!=67 && s[i].charAt(0)!=68 && s[i].charAt(0)!=43){
                        int num=Integer.parseInt(s[i]);
                        // System.out.println(num);
                        st.push(num);

                    }
                    else if(s[i].charAt(0)==67){
                        st.pop();
                    }
                    else if(s[i].charAt(0)==68){
                        int num1=st.peek();
                        st.push(num1*2);
                    }
                    else if(s[i].charAt(0)==43){
                        int pop=st.pop();
                        int peek=st.peek();
                        st.push(pop);
                        st.push(pop+peek);

                    }
                    

                }
                System.out.println(st);
                int sum=0;
                for(Integer temp:st){
                   
                    sum=sum+temp;
                }
                System.out.println(sum);
        }
}