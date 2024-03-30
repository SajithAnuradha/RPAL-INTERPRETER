package LexicalAnalyser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexicalAnalyser {
    private String InputFileName;
    private List<Token> tokensList;

    public LexicalAnalyser(String inputFileName) {
        this.InputFileName = inputFileName;
        tokensList = new ArrayList<>();
    }

    public String getInputFileName() {
        return InputFileName;
    }

    public void setInputFileName(String inputFileName) {
        this.InputFileName = inputFileName;
    }

    public List<Token> getTokens() {
        return tokensList;
    }

    public void setTokens(Token tokens) {
        this.tokensList.add(tokens);

    }

    public List<Token> scan() {
        try {
            BufferedReader scanner = new BufferedReader(new FileReader(InputFileName));
            String line = scanner.readLine();
            int lineCount = 0;
            while (line != null) {
                lineCount++;
                tokenizeLine(line);

            }
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return tokensList;

    }

    private void tokenizeLine(String line) {
        String digit = "[0-9]";
        String letter = "[a-zA-Z]";
        Pattern operatorSymbol = Pattern.compile("[+\\-*/<>&.@/:=~|$!#%^_\\[\\]{}\"`\\?]");
        Pattern escape = Pattern.compile("(\\\\'|\\\\t|\\\\n|\\\\\\\\)");
        Pattern identifierPattern = Pattern.compile(letter + "(" + letter + "|" + digit + "|" + "_)*");
        Pattern integerPattern = Pattern.compile(digit + "+");
        Pattern operatorPattern = Pattern.compile(operatorSymbol + "+");

        Pattern punctuationPattern = Pattern.compile("[(),;]");
        Pattern spacesPattern = Pattern.compile("(\s|\t)+");

        Pattern stringPattern = Pattern.compile("'(" + letter + "|" + digit + "|" + operatorSymbol + "|" + escape + "|"
                + punctuationPattern + "|" + spacesPattern + ")*'");

        Pattern commentPattern = Pattern.compile("//.*");

        Matcher matcher;
      
        int currentIndex=0;
        while (currentIndex<line.length()){
            Matcher spaceMatcher=spacesPattern.matcher(line.substring(currentIndex));
            if 





        }






    }

}
