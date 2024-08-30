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
            try {
                str = Double.parseDouble(args[i]);
            } catch (NumberFormatException ex) {
                str = 0.;
            }
            sum +=str;
        }
        System.out.println(sum);
    }
}
