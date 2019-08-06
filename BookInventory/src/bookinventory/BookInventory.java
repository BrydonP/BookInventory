/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookinventory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author Brydon
 */
public class BookInventory{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        try (RandomAccessFile test = new RandomAccessFile("test.dat", "rw");)
        {
            test.writeUTF("12345");
            test.writeUTF("Harry Potter");
            test.writeUTF("54321");
            test.writeUTF("Lotr");
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your book: ");
        
    }

}
