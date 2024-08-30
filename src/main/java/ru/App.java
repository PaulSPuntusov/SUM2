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
            if(args[i]!=71){
                str = 0.;
            } else {
                str = Double.parseDouble(args[i]);
            }
            sum +=str;
        }
        System.out.println(sum);
    }
}
