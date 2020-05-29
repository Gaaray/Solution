package leetcode;

public class solution_394 {
    public static void main(String[] args) {
        System.out.println(decodeString(
                "100[leetcode]"));
    }

    public static String decodeString(String s) {
     //不存在括号
     if(!s.contains("[")){
            return  s;
     }

        //没有额外要求最直接的方式
        int c =0;
        String a = "";
        for (int i = 0; i < s.length(); i++) {
                 //确定了数
            int m =i;
                    if(Isnumber(s.charAt(i))){

                       while(Isnumber(s.charAt(m))){
                           m++;
                       }
                        c= Integer.parseInt(s.substring(i,m));
                       i =  m;

            int cc = 0;
            do{
                if(s.charAt(m)=='['){
                    cc++;
                }else if(s.charAt(m)==']'){
                    cc--;
                }
                m++;
            }while(cc!=0);
            m--;
            for (int k = 0; k < c; k++) {
                a += s.substring(i+1, m);
            }
            i=m;
                    }else{
                        a+=s.substring(i,i+1);
                    }
        }
        return decodeString(a);
    }

    public   static boolean Isnumber(char c){
        if(c<='9'&&c>='0'){
return true;
        }
        return false;
    }
}