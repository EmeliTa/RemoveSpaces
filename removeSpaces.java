public class RemoveSpaces {
    public static String removeWhiteSpaces(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (!Character.isWhitespace(character)) {
                result.append(character);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "This is a sample string with spaces";
        String result = removeWhiteSpaces(input);

        System.out.println("Original String: " + input);
        System.out.println("String without spaces: " + result);
    }
}