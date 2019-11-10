/*
 * Created by JFormDesigner on Sat Nov 09 17:51:55 MST 2019
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class userDashboard extends JFrame {
    public userDashboard() {
        initComponents();
    }

    private void logSubmitButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        tabbedPane1 = new JTabbedPane();
        myChallenge = new JPanel();
        scrollPane1 = new JScrollPane();
        panel4 = new JPanel();
        scrollPane3 = new JScrollPane();
        tab1TextArea = new JTextArea();
        leaderBoard = new JPanel();
        scrollPane2 = new JScrollPane();
        tab2TextArea = new JTextArea();
        logDay = new JPanel();
        panel5 = new JPanel();
        label1 = new JLabel();
        logSubmitButton = new JButton();
        modeDropDown = new JComboBox();
        textField1 = new JTextField();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
                    javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "", javax
                    . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
                    .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
                    . Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans.
                PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .
                equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            panel1.setLayout(new BorderLayout());

            //======== tabbedPane1 ========
            {
                tabbedPane1.setPreferredSize(new Dimension(550, 120));

                //======== myChallenge ========
                {
                    myChallenge.setLayout(new BorderLayout());

                    //======== scrollPane1 ========
                    {

                        //======== panel4 ========
                        {
                            panel4.setLayout(new BorderLayout());

                            //======== scrollPane3 ========
                            {
                                scrollPane3.setViewportView(tab1TextArea);
                            }
                            panel4.add(scrollPane3, BorderLayout.CENTER);
                        }
                        scrollPane1.setViewportView(panel4);
                    }
                    myChallenge.add(scrollPane1, BorderLayout.CENTER);
                }
                tabbedPane1.addTab("My Challenge", myChallenge);

                //======== leaderBoard ========
                {
                    leaderBoard.setLayout(new BorderLayout());

                    //======== scrollPane2 ========
                    {
                        scrollPane2.setViewportView(tab2TextArea);
                    }
                    leaderBoard.add(scrollPane2, BorderLayout.CENTER);
                }
                tabbedPane1.addTab("Leaderboard", leaderBoard);

                //======== logDay ========
                {
                    logDay.setMaximumSize(new Dimension(2, 2));
                    logDay.setLayout(new BorderLayout());

                    //======== panel5 ========
                    {
                        panel5.setLayout(new BorderLayout());

                        //---- label1 ----
                        label1.setText("Select transportation mode and enter distance:");
                        panel5.add(label1, BorderLayout.CENTER);
                    }
                    logDay.add(panel5, BorderLayout.NORTH);

                    //---- logSubmitButton ----
                    logSubmitButton.setText("Submit");
                    logSubmitButton.addActionListener(e -> logSubmitButtonActionPerformed(e));
                    logDay.add(logSubmitButton, BorderLayout.SOUTH);
                    logDay.add(modeDropDown, BorderLayout.WEST);
                    logDay.add(textField1, BorderLayout.CENTER);
                }
                tabbedPane1.addTab("Log Your Day", logDay);
            }
            panel1.add(tabbedPane1, BorderLayout.CENTER);
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        modeDropDown.addItem("car");
        modeDropDown.addItem("bus");;

        modeDropDown.addItem("train");
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JPanel myChallenge;
    private JScrollPane scrollPane1;
    private JPanel panel4;
    private JScrollPane scrollPane3;
    private JTextArea tab1TextArea;
    private JPanel leaderBoard;
    private JScrollPane scrollPane2;
    private JTextArea tab2TextArea;
    private JPanel logDay;
    private JPanel panel5;
    private JLabel label1;
    private JButton logSubmitButton;
    private JComboBox modeDropDown;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void setMyChallenge(String s) {
        tab1TextArea.setText(s);
    }

    public void setLeaderboard(String leaderboard) {
        tab2TextArea.setText(leaderboard);
    }
}