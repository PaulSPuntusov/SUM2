package ru;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
        double str=0.;
        double sum = 0.;

        for (int i = 0; i < args.length; i++) {
           char[] a_arr = args[i].toCharArray();
           for (int j = 0; j< a_arr.length; j++){
               if(args[i].charAt(j)!=(char)48
                       && args[i].charAt(j)!=(char)49
                       && args[i].charAt(j)!=(char)50
                       && args[i].charAt(j)!=(char)51
                       && args[i].charAt(j)!=(char)52
                       && args[i].charAt(j)!=(char)53
                       && args[i].charAt(j)!=(char)54
                       && args[i].charAt(j)!=(char)55
                       && args[i].charAt(j)!=(char)56
                       && args[i].charAt(j)!=(char)57){
                   args[i] = "0";
                   break;
               }
           }
           str = Double.parseDouble(args[i]);
           sum += str;
        }
        System.out.println(sum);

    }
}
