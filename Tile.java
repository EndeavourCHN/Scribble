package Scrabble.Scribble;

import javax.swing.*;
import java.awt.*;

public class Tile extends JLabel {
    private char letter;
    private int value;

    public Tile() {
        this.letter = ' ';
        this.value = 0;
    }

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}