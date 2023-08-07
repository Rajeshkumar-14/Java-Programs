import java.util.Scanner;
class Test {
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a word: ");
      String word = scan.nextLine();
      int size = word.length();

      for (int i=0; i<size; i++) {
        for (int j=0; j<=size/2; j++) {
          if(i == size/2 ){
            System.out.print(word);
            break;
          } else {
            if(j == size/2)
              System.out.print(word.charAt(i));
            else
              System.out.print(" "); // one space
          }
        }
        System.out.println(); // new line
      }
   }
}