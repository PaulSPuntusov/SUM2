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

    public static int divide(String filename) throws FileNotFoundException {
        File f = new File(filename);
        Scanner sc = new Scanner(f);
        int tr;
        try {
            tr = sc.nextInt() / sc.nextInt();
        } catch (InputMismatchException ime) {
            tr = 0;
            sc.close();
        } catch (NoSuchElementException nsee) {
            tr = 0;
            sc.close();
        } catch (ArithmeticException ae) {
            tr = 0;
            sc.close();
        }
        return tr;
    }
}
