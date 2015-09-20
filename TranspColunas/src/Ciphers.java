import java.util.Scanner;

public class Ciphers {

     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
         doEncryptions(keyboard);
         doDecryptions(keyboard);
         keyboard.close();
     }

     public static void doEncryptions(Scanner keyboard) {
         System.out.print("\nDigite uma mensagem para ser CIFRAFA: ");
         String message = keyboard.nextLine();
         System.out.println();
         
         encryptMessage(message, 6, false);
     }

     public static void doDecryptions(Scanner keyboard) {
         System.out.print("\nDigite uma mensagem para ser DECIFRAFA: ");
         String message = keyboard.nextLine();
         
         decryptMessage(message, 6, true);
     }

     public static String encryptMessage(String message, int rows, boolean b) {
         System.out.print("Mensagem cifrafa: ");
         int columns = message.length() / rows + 1;
         int position = 0;
         char[][] temp;
         temp = new char [rows][columns];
         
         for (int i = 0; i < columns; i++) {
             for (int j = 0; j < rows; j++) {
                 if (position < message.length()) {
                     temp[j][i] = message.charAt(position);
                 }
                 else if (b == true) {
                     temp[j][i] = 'X';
                 }
                 position++;
             }
         }
         position = 0;
         char[] charArrays = new char[rows*columns];
         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < columns; j++) {
                 charArrays[position] = temp[i][j];
                 position++;
             }
         }
         String encryptedMessage = new String(charArrays);
         System.out.print(encryptedMessage); 
         System.out.println();
         System.out.println();
         
         return encryptedMessage;
     }
     
     public static String decryptMessage(String message, int rows, boolean b) {
         System.out.println();
         int columns = message.length() / rows + 1;
         int position = 0;
         char[][] temp = new char [rows][columns];
         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < columns; j++) {
                 if (position < message.length()) {
                     temp[i][j] = message.charAt(position);
                }
                else if (b == true) {
                    temp[i][j] = ' ';
                }
                 position++;
             }
         }
         position = 0;
         char[] charArrays = new char[rows*columns];
         for (int i = 0; i < columns; i++) {
             for (int j = 0; j < rows; j++) {
                 charArrays[position] = temp[j][i];
                 position++;
             }
         }
         System.out.print("Mensagem decifrada: ");
         String decryptedMessage = new String(charArrays);
         System.out.print(decryptedMessage); 
         System.out.println(); 
         System.out.println();
         
         return decryptedMessage;
     }
}