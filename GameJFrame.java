import javax.swing.*;

public class GameJFrame extends JFrame{
    public GameJFrame(){
        this.setSize(1024, 576);
        this.setTitle("Scribble Game");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("Function");
        JMenu aboutJMenu = new JMenu("About");

        JMenuItem replayItem = new JMenuItem("Replay");
        JMenuItem closeItem = new JMenuItem("Close");

        JMenuItem accountItem = new JMenuItem("About");

        functionJMenu.add(replayItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);

        this.setVisible(true);
        
    }
}
