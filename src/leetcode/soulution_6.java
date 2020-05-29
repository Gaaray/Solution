package leetcode;

public class soulution_6 {
    public static void main(String[] args) {
        System.out.println(convert(

                "PAYPALISHIRING",
                5));
    }
    public  static String convert(String s, int numRows) {
        if(s.length()<=1||numRows==1) return  s;
        String[] ss = new String[numRows];
        int len  =  s.length();
        int a = len/(2*numRows-2);
        int b =len %(2*numRows-2);
        //每个块有2n-2个数据，数据会分到a个块，最后多b个不够一个块
//每行输出有a个块，和最后的多出的b个数决定




        for(int i =0 ;i < a; i++){

            //对每行进行复制
            for(int j = 0;j <numRows;j++) {
                if (i == 0) {
                    if (j == 0 || j == numRows - 1) {
                        ss[j] =s.charAt(j + i * (2 * numRows - 2))+"";
                    } else {
                        ss[j] = "" + s.charAt(j + i * (2 * numRows - 2)) + s.charAt(i * (2 * numRows - 2) + 2 * numRows - j - 2);
                    }
                } else{
                if (j == 0 || j == numRows - 1) {
                    ss[j] += "" + s.charAt(j + i * (2 * numRows - 2));

                } else {
                    ss[j] += "" + s.charAt(j + i * (2 * numRows - 2)) + s.charAt(i * (2 * numRows - 2) + 2 * numRows - j - 2);

                }
            }
            }
        }
//b个多余数据处处理，在在s的a*(2*numrow -2)  到  a*(2*numrow -2) +b       len/（2*numrows-2） = a 余b



        //a= 0的情况
   if(a==0&&b<=numRows){
       return s;
   }else if(a==0&&b>numRows){
       String sh= s.substring(0,1);
       for(int i = 1;i<numRows;i++){
           if(i<numRows-1&&i>=2*numRows-1-b){
              sh+= s.charAt(i)+s.substring((2*numRows -2-i),(2*numRows -1-i));
           }else {
               sh += s.substring(i, i + 1) + "";
           }
       }
return sh;
   }


        String sss="";
            if(b<=numRows){
                for(int i =0 ;i<numRows;i++){
                if(i<b){
                    sss +=ss[i]+s.charAt(a*(2*numRows-2)+i);
                }else{
                    sss +=ss[i];
                }
            }} else if(b>numRows){

                for(int j = 0;j<numRows;j++){
                    if(j<numRows-1&&j>=2*numRows-1-b){
                        sss+= ss[j]+s.charAt(a*(2*numRows-2)+j)+s.substring(a*(2*numRows-2)+(2*numRows -2-j),a*(2*numRows-2)+(2*numRows -1-j));
                    }else {
                       sss += ss[j]+s.substring(a*(2*numRows-2)+j, a*(2*numRows-2)+j + 1) + "";
                    }


            }
        }


return sss;

    }

}
