package LexicalAnalyZer;

public class Token {
    public TokenType type;
    public String value;

    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }

    public TokenType getTokenType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return type + " " + value;
    }
}
