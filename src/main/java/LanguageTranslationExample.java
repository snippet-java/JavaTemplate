import com.ibm.watson.developer_cloud.language_translation.v2.LanguageTranslation;
import com.ibm.watson.developer_cloud.language_translation.v2.model.Language;
import com.ibm.watson.developer_cloud.language_translation.v2.model.TranslationResult;

public class LanguageTranslationExample {
  public static void main(String[] args) {
    LanguageTranslation service = new LanguageTranslation();
    service.setUsernameAndPassword("","");// SET YOUR USERNAME AND PASSWORD
    TranslationResult translationResult = service.translate("Boy kicked a ball", Language.ENGLISH, Language.SPANISH).execute();
    System.out.println(translationResult);
  }

}