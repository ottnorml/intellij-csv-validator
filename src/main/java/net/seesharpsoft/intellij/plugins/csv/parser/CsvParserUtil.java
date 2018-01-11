package net.seesharpsoft.intellij.plugins.csv.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.psi.PsiFile;
import com.intellij.psi.impl.source.resolve.FileContextUtil;
import net.seesharpsoft.intellij.plugins.csv.formatter.CsvCodeStyleSettings;
import net.seesharpsoft.intellij.plugins.csv.psi.CsvTypes;

public class CsvParserUtil {

    public static boolean separator(PsiBuilder builder, int tokenType) {
        if (builder.getTokenType() == CsvTypes.COMMA) {
            PsiFile currentFile = builder.getUserDataUnprotected(FileContextUtil.CONTAINING_FILE_KEY);
            return builder.getTokenText().equals(
                    CsvCodeStyleSettings.getCurrentSeparator(builder.getProject(), currentFile != null ? currentFile.getLanguage() : null)
            );
        }
        return false;
    }

}
