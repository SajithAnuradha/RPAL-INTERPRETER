package LexicalAnalyser;

public class Token {
    private TokenType token;
    private String value;

    public Token(TokenType token, String value) {
        this.token = token;
        this.value = value;
    }

    public TokenType getTokenType() {
        return token;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return token + " " + value;
    }
}
