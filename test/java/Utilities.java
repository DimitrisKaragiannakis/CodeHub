public class Utilities {

    //create the method
    public static int getFirstRepeatedCharacter(String text) {

//return the position of the first repeated character in the text.
// If the text has no repeated characters,return -1

        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }

    //Create a method called goDownToOne(int startNumber)

    public static void goDownToOne(int startNumber) {
        int number = startNumber;
        while (number != 1) {
            System.out.print(number + " ");
            if (number % 2 == 0) {
                number /= 2; // divided by 2 for even
            } else {
                number = number * 2 + 1; // multiply with 2 and add 1 for odd
            }
        }
        System.out.println(1); // last number 1
    }
}