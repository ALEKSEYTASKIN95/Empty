package KataTest;

//public class Test1 {
//
//
//    interface TextAnalyzer {
//        Label processText(String text);
//    }
//
//    enum Label {
//        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
//    }
//
//    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
//        for (TextAnalyzer analyzer : analyzers) {
//            if (analyzer.processText(text) != Label.OK) {
//                return analyzer.processText(text);
//            }
//        }
//        return Label.OK;
//    }
//
//
//    public abstract class KeyWordAnalyzer implements TextAnalyzer {
//        abstract protected String[] getKeywords();
//
//        abstract protected Label getLabel();
//
//
//        public Label processText(String text) {
//            for (String keyword : getKeywords()) {
//                if (text.contains(keyword)) {
//                    return getLabel();
//                }
//
//            }
//            return Label.OK;
//        }
//    }
//
//    public class SpamAnalyzer extends KeyWordAnalyzer {
//        private String[] keywords;
//        private Label label;
//
//        public SpamAnalyzer(String[] keywords) {
//            this.keywords = keywords.clone();
//            label = Label.SPAM;
//        }
//
//        @Override
//        public String[] getKeywords() {
//            return keywords;
//        }
//
//        @Override
//        public Label getLabel() {
//            return label;
//        }
//    }
//
//    public class NegativeTextAnalyzer extends KeyWordAnalyzer {
//        Label lable = Label.NEGATIVE_TEXT;
//        private String[] keywords = {":(", "=(", ":|."};
//
//        public NegativeTextAnalyzer() {
//            this.keywords = new String[3];
//            this.keywords[0] = ":(";
//            this.keywords[1] = "=(";
//            this.keywords[2] = ":|";
//            lable = Label.NEGATIVE_TEXT;
//        }
//
//        @Override
//        public String[] getKeywords() {
//            return keywords;
//        }
//
//        @Override
//        public Label getLabel() {
//            return lable;
//        }
//    }
//
//
//    public class TooLongTextAnalyzer implements TextAnalyzer {
//        private int maxLength;
//
//        public TooLongTextAnalyzer(int maxLength) {
//            this.maxLength = maxLength;
//        }
//
//        @Override
//        public Label processText(String text) {
//            if (text.length() > maxLength) {
//                return Label.TOO_LONG;
//            }
//            return Label.OK;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        NegativeTextAnalyzer a = new NegativeTextAnalyzer();
//        SpamAnalyzer s = new SpamAnalyzer(new String[]{"купить", "продать"});
//        TooLongTextAnalyzer l = new TooLongTextAnalyzer(15);
//
//        TextAnalyzer[] T = {a, s, l};
//        System.out.println(checkLabels(T, "Эта строка не пройдёт проверку на длину в 3-м по счету анализаторе"));
//        System.out.println(checkLabels(T, "Реклама. Предлагаем купить квартиру! (2-й анализатор ругнётся)"));
//        System.out.println(checkLabels(T, "Не грусти :(, мышкой похрусти! (1-й)"));
//        System.out.println(checkLabels(T, "Здесь всё ОК"));
//
//    }
//
//
//}
//
//
////        public Label method(String str) {
////            String[] strings = getKeywords();
////            for (int i = 0; i < strings.length; i++) {
////
////            }
////            return null;
////        }
