import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        Map characterMap = new HashMap();

        for(char x: string.toCharArray()) {
            if(characterMap.containsKey(x)) {
                int count = (int) characterMap.get(x);
                characterMap.put(x, count + 1);
            }
            else {
                characterMap.put(x, 1);
            }
        }
        characterMap.remove(' ');
        System.out.println("Here are the counts of each character: " + characterMap);


    }

}
