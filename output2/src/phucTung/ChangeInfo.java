package phucTung;

/**
 * @author: Tran Hoc Phuc
 * @function: Change password function
 * **/
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingUtilities;


public class ChangeInfo extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JLabel updateInfoPromptLabel;

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test1;IFEXISTS=TRUE";

    //  Database credentials
    static final String USER = "admin";
    static final String PASS = "administrator";
    
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ChangeInfo(String userName, int columnID) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(450, 360, 1024, 234);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 34));
        textField.setBounds(373, 35, 609, 67);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnSearch = new JButton("Enter");
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String newValue = textField.getText();
                try {
                    Class.forName(JDBC_DRIVER);
                    Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
                    
                    Statement stmt = connection.createStatement();
                    ResultSet results = stmt.executeQuery("SELECT * FROM registration");
                    
                    ResultSetMetaData metadata = results.getMetaData();
                    String columnName = metadata.getColumnName(columnID);
                    
                    PreparedStatement st = (PreparedStatement) connection.prepareStatement("Update registration set " + columnName + " =? where username=?");

                    st.setString(1, newValue);
                    st.setString(2, userName);
                    st.executeUpdate();
                    JOptionPane.showMessageDialog(btnSearch, "Your info has been successfully updated");

                } catch (SQLException | ClassNotFoundException sqlException) {
                    sqlException.printStackTrace();
                }

            }
        });
        btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnSearch.setBackground(new Color(240, 240, 240));
        btnSearch.setBounds(438, 127, 170, 59);
        contentPane.add(btnSearch);

        updateInfoPromptLabel = new JLabel("Update Info :");
        updateInfoPromptLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        updateInfoPromptLabel.setBounds(45, 37, 326, 67);
        contentPane.add(updateInfoPromptLabel);
        
    }
}