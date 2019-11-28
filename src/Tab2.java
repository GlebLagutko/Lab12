import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Tab2 extends JPanel implements MouseListener {
    private Color oldColor;
    private String oldName;
    private final int T = 5;
    private final int SIZE = 80;
    public Tab2() {
        setLayout(new GridLayout(T, T));
        for (int i = 0; i < T; i++)
            for (int j = 0; j < T; j++) {
                JButton bn = new JButton(i*T+j+1+"");
                bn.setSize(new Dimension(SIZE,SIZE));
                bn.addMouseListener(this);
                bn.setBackground(Color.GREEN);
                add(bn);
            }
        setPreferredSize(new Dimension(SIZE*T,SIZE*T));
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        JButton tmp = ((JButton) e.getSource());
        oldName = tmp.getText();
        tmp.setText("clicked!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        JButton tmp = ((JButton) e.getSource());
        tmp.setText(oldName);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JButton tmp = ((JButton) e.getSource());
        oldColor = tmp.getBackground();
        tmp.setBackground(Color.RED);
        tmp.setForeground(Color.RED);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JButton tmp = ((JButton) e.getSource());
        tmp.setBackground(oldColor);
        tmp.setForeground(Color.BLACK);
    }
}
