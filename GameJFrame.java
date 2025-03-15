import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.security.Key;

public class GameJFrame extends JFrame implements KeyListener {

    public GameJFrame(){
        FrontPage();

        initJFrame();

        initBoard();

        this.setVisible(true);    
    }

    private void FrontPage(){
        JLabel gameName = new JLabel("Scribble Game");
        gameName.setBounds(400, 200, 200, 100);
        this.getContentPane().add(gameName);
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

    private void initBoard(){
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

    public boolean isGameOver(){
        return false;
    }

}
