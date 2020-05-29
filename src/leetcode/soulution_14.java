package leetcode;

public class soulution_14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }



    public static String longestCommonPrefix(String[] strs) {

     if(strs.length<1)  return "";
        if(strs.length==1) return  strs[0];

        //一个一个比较太慢
        int len =strs[0].length();
        for(String s:strs){
            if(s.length()<len){
                len = s.length();
            }
        }
//最短字符串长len
        int a =0;
        for(int i =0 ,j = len;i<j;){
            a =  (i + j)/2;
            boolean f =  true;
            for(String s :strs){
                if(! s.substring(0,a).equals(strs[0].substring(0,a))){
                   j=a;
                    a =  (i+a)/2;
                    f= false;
                    break;
                }
            }
            if(f){
                i= a;
                a =  (a +j)/2 ;

            }
        }
        if(a>0) {
            return strs[0].substring(0, a);
        }else{
            return "";
        }
    }
}
