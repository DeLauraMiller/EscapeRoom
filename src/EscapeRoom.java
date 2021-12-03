import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*okay idk where imma start but i have to start somewhere first escaperoom gotta escape in a typical room... escapingggg
okay where do I wanna put them.. no i need to make a layout first.... like maybe a box.... thats progress. imma name that box:
 "The Progression Box" and then sit and think on what i wanna do next because lord have mercy I dont remember anything.
 HA step .5 done!*/
public class EscapeRoom {

    public static void main(String[] args) {
        JFrame box = new JFrame("The Progression Box");
        JPanel meat = new JPanel();
        JLabel title = new JLabel(" You Finally Woke Up!");


        box.setLocationRelativeTo(null);
        box.setSize(300,400);
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        box.add(meat);

        meat.add(title);
        box.setVisible(true);
    }
}
