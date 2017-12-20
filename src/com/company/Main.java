package com.company;

import java.io.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /*** FileOutputStream fout = null;

         try

         {

         fout = new FileOutputStream("C:\\Asztal\\test.txt");

         String s = "Hello world";
         fout.write(s.getBytes());

         }catch (FileNotFoundException e){
         System.err.println(e.getMessage());
         }catch (Exception e){
         System.err.println(e.getMessage());
         } finally {
         if (fout != null) {

         try {
         fout.close();
         } catch (IOException e1) {
         e1.printStackTrace();


         }
         }
         }*/


        /**FileReader fr = null;
         FileWriter fw = null;
         try {
         fr = new FileReader("/home/java1/Asztal/kosztolanyi_dezso_hajnali_reszegseg.txt");
         fw = new FileWriter("/home/java1/Asztal/Kosztolanyi.txt");
         int i;
         while ((i = fr.read()) != -1) {
         fw.write((char) i);
         }
         } catch (FileNotFoundException e) {
         e.printStackTrace();
         } catch (IOException e) {
         e.printStackTrace();
         } catch (Exception e){

         } finally {
         if (fr != null) {
         try {
         fr.close();
         } catch (IOException e) {
         e.printStackTrace();
         }
         }
         if (fw != null) {
         try {
         fw.close();
         } catch (IOException e) {
         e.printStackTrace();
         }
         }
         }*/

        String[][] matrix = new String[3][3];

        try (BufferedReader br = new BufferedReader(new FileReader("/home/java1/Asztal/Matrix.txt"))) {
            String line = " ";
            while ((line = br.readLine()) != null) {
                System.out.println(line);

                for (int i = 0; i < 3; i++) {
                    matrix[i] = line.split(" ");

                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
