package aula06;

import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;


public class Export {

public class CreateTextFile {

    private static Formatter output;

    public static void openFile() {
        try {
            output = new Formatter("C:\\Users\\User\\Desktop\\teste\\exer.txt"); // abre o arquivo
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void addRecords(String nome, String telefone, String email, String salario) {
            
            try {                               
                output.format("%d %s %s %.2f%n", nome, 
                telefone, email, salario);                
                                
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to file. Terminating.");
                
            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                
            }
            
            System.out.print("caiu ");
        } 
        
          
    

    public static void closeFile() {
        if (output != null) {
            output.close();
        }
    }
}
}
