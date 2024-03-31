package LexicalAnalyZer;

import java.util.List;

public class test {
    public static void main(String[] args) {

        String inputFileName = "input.txt";
        LexicalAnalyser scanner1 = new LexicalAnalyser(inputFileName);
        List<Token> tokens;
        try {
            tokens = scanner1.scan();

            // Print the generated tokens
            for (Token token : tokens) {
                System.out.println("<" + token.getTokenType() + ", " + token.getValue() + ">");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}