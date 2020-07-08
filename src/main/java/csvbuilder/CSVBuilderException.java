package csvbuilder;

public class CSVBuilderException extends RuntimeException{
    public enum ExceptionType {
        UNABLE_TO_PARSE
    }

    public ExceptionType type;

    public CSVBuilderException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public CSVBuilderException(ExceptionType type) {
        this.type = type;
    }
}
