package Utilities;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;


// with the kind help of http://stackoverflow.com/questions/18132078/handling-errors-in-antlr4

public class DescriptiveErrorListener extends BaseErrorListener {

    public static DescriptiveErrorListener INSTANCE = new DescriptiveErrorListener();

    private List<String> errors = new ArrayList<>();

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e)
    {
        String error = "Line " + line + ":" + charPositionInLine + " " + msg;
        this.errors.add(error);
    }
}