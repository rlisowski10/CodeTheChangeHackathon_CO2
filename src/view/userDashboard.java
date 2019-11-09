package view;

import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Nov 09 13:41:45 MST 2019
 */



/**
 * @author unknown
 */
public class userDashboard extends JPanel {
    public userDashboard() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder (
        0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder
        . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .
        red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java .
        beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
        setLayout(new BorderLayout());

        //======== tabbedPane1 ========
        {
            tabbedPane1.setPreferredSize(new Dimension(550, 400));

            //======== panel1 ========
            {
                panel1.setLayout(new BorderLayout());
            }
            tabbedPane1.addTab("My Challenge", panel1);

            //======== panel2 ========
            {
                panel2.setLayout(new BorderLayout());
            }
            tabbedPane1.addTab("Leaderboard", panel2);

            //======== panel3 ========
            {
                panel3.setLayout(new BorderLayout());
            }
            tabbedPane1.addTab("Log Your Day", panel3);
        }
        add(tabbedPane1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
