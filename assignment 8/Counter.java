import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Counter extends JFrame implements ActionListener {
int count = 0;
JLabel l;
JTextField t;
JButton b1, b2, b3;
public Counter() {
setLayout(new FlowLayout());
l = new JLabel("Counter");
add(l);
t= new JTextField("0", 5);
t.setEditable(false);
t.setHorizontalAlignment(JTextField.CENTER);
add(t);
b1 = new JButton("Count Up");
b2 = new JButton("Count Down");
b3 = new JButton("Reset");
add(b1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
setTitle("Counter");
setSize(400, 120);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == b1) {
count++;
} else if (e.getSource() == b2) {
count--;
} else if (e.getSource() == b3) {
count = 0;
}
t.setText(String.valueOf(count));
}
public static void main(String[] args) {
new Counter();
}
}
