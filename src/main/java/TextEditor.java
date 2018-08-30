import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

    @Autowired
    private SpellChecker spellChecker;

    void spellCheck() {
        spellChecker.checkSpelling(this.getClass().getName());
    }
}