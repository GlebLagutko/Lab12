import javax.swing.*;
import java.awt.*;

public class Tab3 extends JPanel {
    public Tab3(){
        setLayout(new GridLayout(4,1));
        ButtonGroup radioGroup = new ButtonGroup();
        for(int i = 0; i < 4; i++){
            JRadioButton btn = new JRadioButton(new ImageIcon("images/first.png"));
            btn.setPressedIcon(new ImageIcon("images/second.png"));
            btn.setRolloverIcon(new ImageIcon("images/third.png"));
            btn.setSelectedIcon(new ImageIcon("images/fourth.png"));
            radioGroup.add(btn);
            add(btn);
        }
    }
}
