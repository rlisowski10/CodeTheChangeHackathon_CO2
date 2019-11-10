package view;

import controller.ChallengeController;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Sat Nov 09 13:01:14 MST 2019
 */



/**
 * @author unknown
 */
public class userJoinChallenge extends JFrame {
    public userJoinChallenge() {
        initComponents();
    }

    private void okButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        System.out.println("User clicked OK");

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        setTitle("Welcome to the CO2 Challenge!");
        setMinimumSize(new Dimension(350, 22));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
                    new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , ""
                    , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
                    , new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 )
                    , java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (
                new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
                ) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( )
                        ; }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new BorderLayout(1, 1));

                //---- label1 ----
                label1.setText("Enter your name and invitation code:");
                contentPanel.add(label1, BorderLayout.NORTH);

                //---- textField1 ----
                textField1.setText("TeamBenevity1109");
                contentPanel.add(textField1, BorderLayout.CENTER);

                //---- textField2 ----
                textField2.setText("Will");
                contentPanel.add(textField2, BorderLayout.WEST);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
//                okButton.setActionCommand("System.out.println(\"clicked ok\");;");
//                okButton.addActionListener(e -> {
//                    okButtonActionPerformed(e);
//                    okButtonActionPerformed(e);
//                });
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel buttonBar;
    private JButton okButton;

    public void okButtonAddListener(ActionListener newUserListener) {
        okButton.addActionListener(newUserListener);
    }

    public String getUserName(){

        String name = textField2.getText();
        textField2.setText("");
        return name;
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}