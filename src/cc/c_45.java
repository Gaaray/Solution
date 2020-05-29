package cc;

import java.util.LinkedList;
import java.util.List;

public class c_45 {
    public static void main(String[] args) {
        System.out.println(fun(new int[]{2,3,4,1,1111}));
    }
    public static  String fun(int  [] nums){
        List<String> list =  new LinkedList<>();
for(int a : nums){
    list.add(String.valueOf(a));
}
        list.sort((s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        StringBuilder ss = new StringBuilder();
        for (String str : list) {
            ss.append(str);
        }
        return ss.toString();

    }

}
