package oop.basic;

public class Letter {
    String from;
    String to;
    StringBuilder lines = new StringBuilder();
    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void addLine(String line) {
        lines.append(line).append("\n");
    }
    public String getText() {
        String start = "Dear " + to + ":\n\n";
        String end = "\nSincerely,\n\n" + from;
        return start + lines.toString() + end;
    }
}
