import java.awt.*;

/**
 * Created by andrey on 10.10.2015.
 */

public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for(TextAnalyzer analyz : analyzers)
        if (analyz.processText(text) != Label.OK) return analyz.processText(text);

        return Label.OK;
        }

abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
    Label processText(String text) {
        for (String keyword : getKeywords())
        if (text.contains(keyword))
            return getLabel();
        return Label.OK;
    }
    }

class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    public String[] getKeywords() {
        return this.keywords;
    }
    public Label getLabel() {
        return Label.SPAM;
    }
    public SpamAnalyzer(String[] keywords){
        this.keywords = keywords;
    }

}

class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keywords={":(","=(",":|"};
    public String[] getKeywords() {
        return this.keywords;
    }
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

}

class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;
    public TooLongTextAnalyzer(int maxLength){
        this.maxLength = maxLength;
    }
    public Label processText(String text) {
        return (text.length() > maxLength) ? Label.TOO_LONG : Label.OK;
    }
}
