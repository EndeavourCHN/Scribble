import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.security.Key;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    public GameJFrame(){
        initJFrame();

        headText();

        infoDisplay();

        initBoard();

        this.setVisible(true);    
    }

    private void initJFrame(){
        this.setSize(1024, 576);
        this.setTitle("Scribble Game");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.addKeyListener(this);
    }

    private void headText(){
        JLabel gameName = new JLabel("Scribble Game");
        gameName.setBounds(50, 10, 200, 20);
        this.getContentPane().add(gameName);
    }

    private void infoDisplay() {
        Player player1 = new Player();
        Player player2 = new Player();
        JLabel info = new JLabel("Player 1: " + player1.getName() + "  Player 2: " + player2.getName());
        info.setBounds(50, 40, 200, 20);
        this.getContentPane().add(info);
        JLabel score = new JLabel("Score: " + player1.getScore() + "  " + player2.getScore());
        score.setBounds(50, 60, 200, 20);
        this.getContentPane().add(score);
    }

    private void initBoard() {
        JPanel panel=new JPanel(new GridLayout(15,15));
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public boolean isGameOver(){
        return false;
    }

}