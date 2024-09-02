package ru;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws OperationAttemptException {
        double str=0.;
        double sum = 0.;
        for (int i = 0; i < args.length; i++) {
            try {
                System.out.println("args["+i+"]= "+args[i]);
                System.out.println("i="+i+" str= "+str);
            } catch (NumberFormatException ex) {
                str = 0.;
                System.out.println("args["+i+"]= "+args[i]);
                System.out.println("i="+i+" str= "+str);
            }
            sum +=str;
            System.out.println("sum = "+sum);
        }
        System.out.println("Итого, Sum = "+ sum);
    }
}
