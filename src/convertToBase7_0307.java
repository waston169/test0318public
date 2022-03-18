public class convertToBase7_0307 {

    public static void main(String[] args) {

        System.out.printf(convertToBase7(100));

    }



    public static String convertToBase7(int num) {

     String res="";
     String sign="";
     if(num<0){
         sign="-";
         num=-num;
     }
        while (num/7>0){
            res=num%7+res;
            num=num/7;

        }
        return  sign+num+res;

    }

}
