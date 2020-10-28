 package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class WordsTransformerTest {

        @Test
        public void transEquals3_strLength3() {
            assertEquals("ABC DEF", WordsTransformer.transformEquals3("abc def"));
        }

        @Test
        public void transEquals3_strLengthMoreOrLessThan3() {
            assertEquals("ab deFG", WordsTransformer.transformEquals3("ab deFG"));
        }
        @Test
        public void transEquals3_strLengthMoreOrLessThanOrEquals3() {
            assertEquals("ab ABC deFG", WordsTransformer.transformEquals3("ab abc deFG"));
        }

        @Test
        public void transEquals5_strLength5() {
            assertEquals("abcde fghij", WordsTransformer.transformEquals5("ABcDE FgHiJ"));
        }

        @Test
        public void transEquals5_strLengthMoreOrLessThan5() {
            assertEquals("aBc dE fGhiJkLMN", WordsTransformer.transformEquals5("aBc dE fGhiJkLMN"));
        }
        @Test
        public void transEquals5_strLengthMoreOrLessThanOrEquals5() {
            assertEquals("aBc defgh iJk LM", WordsTransformer.transformEquals5("aBc dEfGh iJk LM"));
        }
        @Test
        public void transEven_strLengthEven() {
            assertEquals("ABCD EFGH IJ", WordsTransformer.transformEven("abCd efGh iJ"));
        }

        @Test
        public void transEven_strLengthOdd() {
            assertEquals("aBc d  efGhi", WordsTransformer.transformEven("aBc d  efGhi"));
        }
        @Test
        public void transEven_strLengthOddOrEven() {
            assertEquals("aBc DEFG hij KLMN", WordsTransformer.transformEven("aBc defg hij kLmN"));
        }

    }
