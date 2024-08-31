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


    }

    public static int divide(String filename) {
        File f = new File(filename);
        int tr = 0;
        Scanner sc = null;
        try {
            sc = new Scanner(f);

            try {
                tr = sc.nextInt() / sc.nextInt();
            } catch (InputMismatchException ime) {
                tr = 0;
                throw new OperationAttemptException("OperationAttemptException");

            } catch (NoSuchElementException nsee) {
                tr = 0;

            } catch (ArithmeticException ae) {
                tr = 0;
            }
        } catch (FileNotFoundException fnfe) {
            sc.close();
        }
        return tr;
    }
}
