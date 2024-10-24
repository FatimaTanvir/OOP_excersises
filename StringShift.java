import java.util.Scanner;

public class StringShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("REAL SHIFT | V0.1");
        
        String input = "";
        int stage = 0;
        while (true) {
            if (stage == 0) {
                System.out.print("Give me a string (or type 'exit' to quit): ");
                input = scanner.nextLine();
                
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                
                if (input.length() == 0) {
                    System.out.println("Please give me a string with at least 1 character.");
                    continue;
                }
                
                stage = 1;
            } else if (stage == 1) {
                System.out.print("How much would you like to shift \"" + input + "\"? ");
                String shiftAmount = scanner.nextLine();
                
                try {
                    int shiftAmountInt = Integer.parseInt(shiftAmount);
                    System.out.println("Original: " + input);
                    System.out.println("New: " + ShiftString(input, shiftAmountInt));
                    System.out.println("Shift amount: " + shiftAmountInt);
                    stage = 0;
                } catch (NumberFormatException e) {
                    System.out.println(shiftAmount + " is not a valid integer. Try again.");
                }
            }
        }
        System.out.println("Goodbye");
        scanner.close();
    }

    public static String ShiftString(String s, int amount) {
        int sLen = s.length();
        char[] out = new char[sLen];
        
        int index = 0;
        for (char c : s.toCharArray()) {
            out[(index + amount) % sLen] = c;
            index++;
        }
        
        return new String(out);
    }
}
