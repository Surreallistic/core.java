package clicker.badoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AutoClicker {

    public static int rate = 100;

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public AutoClicker() {
        prepareGUI();
    }

    public static void main(String[] args) {

        AutoClicker swingControlDemo = new AutoClicker();
        swingControlDemo.showButtonDemo();

    }
    private void prepareGUI() {
        mainFrame = new JFrame("Java Swing Examples");
        mainFrame.setSize(200, 140);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);

        statusLabel.setSize(350, 100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showButtonDemo() {

        headerLabel.setText("app");

        JButton click1_button = new JButton("Send 1");

        JButton stop_button = new JButton("Send 1");

        click1_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                statusLabel.setText("Ok Button clicked.");
                try {
                    Robot robot = new Robot();

                    int a = 1;
                    int temp = 1;

                    while (a < 3000) {

                        a++;
                        System.out.println(a);

                        try {

                            Thread.sleep(rate);
                            robot.keyPress(KeyEvent.VK_1);
                            robot.keyRelease(KeyEvent.VK_1);

                            temp++;

                            if(temp == 120) {
                                robot.keyPress(KeyEvent.VK_ESCAPE);
                                robot.keyRelease(KeyEvent.VK_ESCAPE);

                                temp = 1;
                            }
//                        }

                        } catch (InterruptedException ex) {
                        }
                    }
                } catch (AWTException ex) {
                }

            }
        });

        controlPanel.add(click1_button);

        mainFrame.setVisible(true);
    }

}