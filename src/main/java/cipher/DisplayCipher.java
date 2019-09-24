package cipher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** This class reads a file, enciphers, and outputs its contents.
 *
 * @author {YOUR NAME HERE}
 */
public class DisplayCipher {
  
  /**The main entry point.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    // Declare file and scanner objects.
    File encipherFile = null;
    Scanner scanner = null;
    // Connect file contents to Scanner object.
    try {
      encipherFile = new File("inputs/encipher.txt");
      scanner = new Scanner(encipherFile);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    // Get cipher data (message, cipher distance)
    String originalWord = scanner.nextLine();
    int cipherDistance = Integer.parseInt(scanner.nextLine());
    /*
     * TODO Implement the newCharValue method with the charAt method
     * of String to get a letter and pass it to newCharValue,
     * casting the result as a char. How can you concatenate the
     * encipherWord string? How many separate statements do you
     * need to provide?
     */
    String encipheredWord = new String();
    /* 
     * TODO Print originalWord and encipheredWord on two lines using
     * only one print statement.
     */
  }
  
  /** Shifts the value of the character sent.
   *
   * @param origChar The original char
   * @param shift Amount to transpose a char
   */
  public static int newCharValue(char origChar, int shift) {
    /*
     * TODO Implement a definition for cipherChar that casts
     * origChar as an int, adding the shift value.
     */
    int cipherChar;
    return cipherChar;
  }
}
