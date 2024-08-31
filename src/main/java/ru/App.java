package ru;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try{
            System.out.println(divide("C:\\Users\\pps_r\\OneDrive\\Документы\\java\\f.txt"));
        } catch(OperationAttemptException oae) {
            System.out.println("OperationAttemptException");
        }


    }

    public static int divide(String filename) throws OperationAttemptException {
        File f = new File(filename);
        int tr = 0;
        Scanner sc = null;
        try {
            sc = new Scanner(f);

            try {
                tr = sc.nextInt() / sc.nextInt();
            } catch (InputMismatchException ime) {
                tr = 0;
                System.out.println("IME");

            } catch (NoSuchElementException nsee) {
                tr = 0;
                System.out.println("NSEE");

            } catch (ArithmeticException ae) {
                tr = 0;
                System.out.println("AE");
            }
        } catch (FileNotFoundException fnfe) {
            sc.close();
            System.out.println("FNFE");
        } catch (NullPointerException npe) {
            System.out.println("NPE");
        }

        return tr;
    }
}
