package phucTung;
/**
 * @author: Tran Hoc Phuc
 * @function: Draft homepage (included change password and logout)
 * **/

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingUtilities;



public class UserHome extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserHome frame = new UserHome();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public UserHome() {

    }

    /**
     * Create the frame.
     */
    public UserHome(String userName) 
    {
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setBounds(450, 190, 1014, 900);
        setBounds(200, 100, 1264, 900);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
// logout button________________________________________________________________________

        JButton logOutButton = new JButton("Logout");
        logOutButton.setForeground(new Color(243, 126, 126));
        logOutButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        logOutButton.setFont(new Font("Tahoma", Font.PLAIN, 39));
        logOutButton.setBounds(100, 118, 491, 114);
        contentPane.add(logOutButton);
        
        logOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(logOutButton, "Are you sure?");
                // JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                    UserLogin obj = new UserLogin();
                    obj.setTitle("User-Login");
                    obj.setVisible(true);
                }
                dispose();
                UserLogin obj = new UserLogin();

                obj.setTitle("User-Login");
                obj.setVisible(true);

            }
        });
        
        
// change password button________________________________________________________________________
        JButton changePassButton = new JButton("Change-password\r\n");
        changePassButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        changePassButton.setFont(new Font("Tahoma", Font.PLAIN, 35));
        changePassButton.setBounds(100, 320, 491, 114);
        contentPane.add(changePassButton);
        
        changePassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChangePassword bo = new ChangePassword(userName);
                bo.setTitle("Update info");
                bo.setVisible(true);

            }
        });
        

// update buttons
        
        JButton changeInfoButton1 = new JButton("Update");
        changeInfoButton1.setBackground(UIManager.getColor("Button.disabledForeground"));
        changeInfoButton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        changeInfoButton1.setBounds(640, 160, 100, 60);
        contentPane.add(changeInfoButton1);
        
        changeInfoButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChangeInfo changeInfo = new ChangeInfo(userName,3);
                changeInfo.setTitle("Change Info");
                changeInfo.setVisible(true);
            }
        });
        
        JButton changeInfoButton2 = new JButton("Update");
        changeInfoButton2.setBackground(UIManager.getColor("Button.disabledForeground"));
        changeInfoButton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        changeInfoButton2.setBounds(640, 240, 100, 60);
        contentPane.add(changeInfoButton2);
        
        changeInfoButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChangeInfo changeInfo = new ChangeInfo(userName,4);
                changeInfo.setTitle("Change Info");
                changeInfo.setVisible(true);
            }
        });
        
// debug info label
        String USER = "admin";
        String PASS = "administrator";
        String JDBC_DRIVER = "org.h2.Driver";
        String DB_URL = "jdbc:h2:~/test1;IFEXISTS=TRUE";
// set debug info to db FOR DEBUG
        /*try 
        {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("Update registration set placeholder=? where username=?");
            st.setString(1, "debug placeholder");
            st.setString(2, userName);
            st.executeUpdate();
        } 
        catch (SQLException | ClassNotFoundException sqlException) 
        {    
            sqlException.printStackTrace();
        }*/
        
// read debug info from db
        JLabel placeholder1 = new JLabel("Placeholder1:");
                placeholder1.setForeground(Color.BLACK);
                placeholder1.setFont(new Font("Times New Roman", Font.PLAIN, 38));
                placeholder1.setBounds(780, 150, 273, 93);
                contentPane.add(placeholder1);
        JLabel placeholder2 = new JLabel("Placeholder2:");
                placeholder2.setForeground(Color.BLACK);
                placeholder2.setFont(new Font("Times New Roman", Font.PLAIN, 38));
                placeholder2.setBounds(780, 230, 273, 93);
                contentPane.add(placeholder2);
        try 
        {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            PreparedStatement st = (PreparedStatement) conn.prepareStatement("SELECT * FROM registration WHERE username=?;");
            st.setString(1, userName);
            ResultSet rs = st.executeQuery();
            while (rs.next())
            {
                JLabel placeholder1Value = new JLabel(rs.getString("placeholder1"));
                placeholder1Value.setForeground(Color.BLACK);
                placeholder1Value.setFont(new Font("Times New Roman", Font.PLAIN, 38));
                placeholder1Value.setBounds(1000, 150, 273, 93);
                contentPane.add(placeholder1Value);
                
                JLabel placeholder2Value = new JLabel(rs.getString("placeholder2"));
                placeholder2Value.setForeground(Color.BLACK);
                placeholder2Value.setFont(new Font("Times New Roman", Font.PLAIN, 38));
                placeholder2Value.setBounds(1000, 230, 273, 93);
                contentPane.add(placeholder2Value);
            }
            
        } 
        catch (SQLException | ClassNotFoundException sqlException) 
        {    
            sqlException.printStackTrace();
        }             
             
    }
}