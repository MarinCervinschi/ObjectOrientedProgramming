package oop.basic;

/**
 * A class for authoring a simple letter.
 */
public class Letter {
    final String from;
    final String to;
    final StringBuilder lines = new StringBuilder();

    /**
     * Set the names of the sender and the recipient.
     * @param from the sender.
     * @param to the recipient.
     */
    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
    }

    /**
     * A method to add a line of text to the body of the letter.
     * @param line the line to be added.
     */
    public void addLine(String line) {
        lines.append(line).append("\n");
    }

    /**
     *
     * @return the entire text of the letter;
     */
    public String getText() {
        String start = "Dear " + to + ":\n\n";
        String end = "\nSincerely,\n\n" + from;
        return start + lines.toString() + end;
    }
}
