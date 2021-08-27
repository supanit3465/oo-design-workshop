public class Range {
    private String txt;
    public Range(String text) {
        txt = text;
    }

    public boolean isStartWithInclusive() {
        return txt.charAt(0) == '[';
    }

    public int getStartInput() {
        return Integer.parseInt(String.valueOf(txt.charAt(1)));
    }

    public boolean isEndWithInclusive() {
        return txt.endsWith("]");
    }
}
