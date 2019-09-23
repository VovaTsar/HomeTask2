package com.task.homework5.mysentence;

public class Text {

    private Sentence[] sentencess;

    public Text(String text) {
        this.sentencess = new Sentence[0];
        splitForSentence(text);
    }

    public Sentence[] getSents() {
        return sentencess;
    }

    public int lenght() {
        return sentencess.length;
    }

    private void splitForSentence(String text) {
        char[] chars = text.toCharArray();
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.' || chars[i] == '?' || chars[i] == '!') {
                addSentence(sentence.toString(), new Punctuation(chars[i]));
                sentence = new StringBuilder();
            } else sentence.append(chars[i]);
        }
    }

    private void addSentence(String sentence, Punctuation punctuation) {
        Sentence[] newSents = new Sentence[sentencess.length + 1];
        int i = 0;
        for (; i < sentencess.length; i++) {
            newSents[i] = sentencess[i];
        }
        newSents[i] = new Sentence(sentence, punctuation);
        sentencess = newSents;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Sentence sent : sentencess) {
            text.append(sent.toString());
        }
        return text.toString();
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Text text = (Text) o;
        if (text.lenght() != this.lenght())
            return false;

        for (int i = 0; i < this.lenght(); i++) {
            if (text.getSents()[i] != sentencess[i])
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (Object element : sentencess)
            result = 31 * result + (element == null ? 0 : element.hashCode());
        return result;
    }

    public void suppText(String text) {
        char[] chars = text.toCharArray();
        for (char aChar : chars) {
            if (aChar == '.' || aChar == '?' || aChar == '!') {
                addSentence(text, new Punctuation(aChar));
            }
        }
    }

    public String getTitle (){
        return sentencess[0].toString();
    }
}
