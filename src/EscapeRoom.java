import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*okay idk where imma start but i have to start somewhere first escaperoom gotta escape in a typical room... escapingggg
okay where do I wanna put them.. no i need to make a layout first.... like maybe a box.... thats progress. imma name that box:
 "The Progression Box" and then sit and think on what i wanna do next because lord have mercy I dont remember anything.
 HA step .5 done!

 First player wakes up they pick between left and right  torch or clothes. They decide if they wanna go to the hall  or bed. after that they have
  to be by the bed to see the two doors  then they choose which door */
public class EscapeRoom {
    static JFrame tab;
    static JPanel panel;
    static JLabel title, explanation;
    static JButton cracklingButton, shadowsButton,bedBttn ;
    static Color bedTheme = new Color(34, 87, 126);


    public static void main(String[] args) {
        firstLevel();
    }

    public static void firstLevel() {
        tab = new JFrame("Room 1");
        panel = new JPanel();
        title = new JLabel("You Finally Woke Up!");
        explanation = new JLabel("Its dark, you're cold, you can't feel your clothes." + "\n" + "You sit up and feel your back peel off whatever you were laying on. ");
        cracklingButton = new JButton("Left towards the crackling");
        shadowsButton = new JButton("Right towards the shadows");
        bedBttn = new JButton("Right to where you awoke");


        tab.setLocationRelativeTo(null);
        tab.setSize(300, 400);
        tab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tab.add(panel);

        title.setForeground(Color.BLACK);
        panel.add(title);
        panel.add(explanation);
        panel.add(cracklingButton);
        panel.add(shadowsButton);

        panel.setBackground(bedTheme);

        explanation.setForeground(Color.BLACK);
        explanation.setBounds(20, 280, 40, 380);
        tab.setVisible(true);


        cracklingButton.addActionListener( new cracklingListener());
        shadowsButton.addActionListener(new shadowsListener());

    }

    public static void cracklingPanel() {

        panel.remove(cracklingButton);
        panel.add(bedBttn);
        Color panelColor = new Color(255, 84, 3);

        panel.setBackground(panelColor);

    }

    public static void shadowsPanel() {


    }

    private static class cracklingListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
          cracklingPanel();
        }
    }

    private static class shadowsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
        shadowsPanel();

        }
    }

















}
