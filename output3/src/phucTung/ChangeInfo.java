/*     */ package phucTung;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.ResultSetMetaData;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ChangeInfo
/*     */   extends JFrame
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private JPanel contentPane;
/*     */   private JTextField textField;
/*     */   private JLabel updateInfoPromptLabel;
/*     */   static final String JDBC_DRIVER = "org.h2.Driver";
/*     */   static final String DB_URL = "jdbc:h2:~/test1;IFEXISTS=TRUE";
/*     */   static final String USER = "admin";
/*     */   static final String PASS = "administrator";
/*     */   
/*     */   public static void main(String[] args) {
/*  51 */     EventQueue.invokeLater(new Runnable()
/*     */         {
/*     */           public void run() {}
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ChangeInfo(final String userName, final int columnID) {
/*  66 */     setDefaultCloseOperation(2);
/*  67 */     setBounds(450, 360, 1024, 234);
/*  68 */     setResizable(false);
/*     */     
/*  70 */     this.contentPane = new JPanel();
/*  71 */     this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*  72 */     setContentPane(this.contentPane);
/*  73 */     this.contentPane.setLayout((LayoutManager)null);
/*     */     
/*  75 */     this.textField = new JTextField();
/*  76 */     this.textField.setFont(new Font("Tahoma", 0, 34));
/*  77 */     this.textField.setBounds(373, 35, 609, 67);
/*  78 */     this.contentPane.add(this.textField);
/*  79 */     this.textField.setColumns(10);
/*     */     
/*  81 */     final JButton btnSearch = new JButton("Enter");
/*  82 */     btnSearch.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/*  85 */             String newValue = ChangeInfo.this.textField.getText();
/*     */             try {
/*  87 */               Class.forName("org.h2.Driver");
/*  88 */               Connection connection = DriverManager.getConnection("jdbc:h2:~/test1;IFEXISTS=TRUE", "admin", "administrator");
/*     */               
/*  90 */               Statement stmt = connection.createStatement();
/*  91 */               ResultSet results = stmt.executeQuery("SELECT * FROM registration");
/*     */               
/*  93 */               ResultSetMetaData metadata = results.getMetaData();
/*  94 */               String columnName = metadata.getColumnName(columnID);
/*     */               
/*  96 */               PreparedStatement st = connection.prepareStatement("Update registration set " + columnName + " =? where username=?");
/*     */               
/*  98 */               st.setString(1, newValue);
/*  99 */               st.setString(2, userName);
/* 100 */               st.executeUpdate();
/* 101 */               JOptionPane.showMessageDialog(btnSearch, "Your info has been successfully updated");
                        dispose();
/*     */             }
/* 103 */             catch (SQLException|ClassNotFoundException sqlException) {
/* 104 */               sqlException.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 109 */     btnSearch.setFont(new Font("Tahoma", 0, 29));
/* 110 */     btnSearch.setBackground(new Color(240, 240, 240));
/* 111 */     btnSearch.setBounds(438, 127, 170, 59);
/* 112 */     this.contentPane.add(btnSearch);
/*     */     
/* 114 */     this.updateInfoPromptLabel = new JLabel("Update Info :");
/* 115 */     this.updateInfoPromptLabel.setFont(new Font("Tahoma", 0, 30));
/* 116 */     this.updateInfoPromptLabel.setBounds(45, 37, 326, 67);
/* 117 */     this.contentPane.add(this.updateInfoPromptLabel);
/*     */   }
/*     */ }


/* Location:              D:\output3\dist\SCS3.jar!\phucTung\ChangeInfo.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */