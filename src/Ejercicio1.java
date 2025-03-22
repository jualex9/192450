import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          final String  claveSecreta ="1234";
          final String fraseSecreta = "la matrix vive";
          while (true) {
              System.out.println("bievenido al club casi secreto. responde la pregunta");

              System.out.println("¿que edad tienes?");
              int edad = scanner.nextInt();
              scanner.nextLine(); 

              if (edad <= 18) {
                System.out.println("Lo siento, debes tener más de 18 años para entrar.");
                continue;
              }

              System.out.print("Introduce la clave secreta: ");
              String clave = scanner.nextLine();

              if (!clave.equals(claveSecreta)) {
                System.out.println("clave incorrecta");
              }

              System.out.print("Di la frase secreta: ");
              String frase = scanner.nextLine();

              if (!frase.equalsIgnoreCase(fraseSecreta)) {
                System.out.println("Frase incorrecta. No puedes entrar.");
                continue;
              }

               System.out.println("¡Bienvenido al Club Casi Secreto™!");    
               break;
          }
          scanner.close();;
    }
}
















