import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {

    @Bean
    TextEditor getTextEditor() {
        return new TextEditor();
    }

    @Bean
    public SpellChecker getSpellChecker() {
        return new SpellChecker();
    }
}
