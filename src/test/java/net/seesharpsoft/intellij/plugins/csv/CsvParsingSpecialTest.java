package net.seesharpsoft.intellij.plugins.csv;

import com.intellij.testFramework.ParsingTestCase;

public class CsvParsingSpecialTest extends ParsingTestCase {

    public CsvParsingSpecialTest() {
        super("", "csv", new CsvParserDefinition());
    }

    public void testParsingTestData() {
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "./src/test/resources/parser/special";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}
