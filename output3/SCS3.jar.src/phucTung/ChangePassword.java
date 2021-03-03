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
/*     */ import java.sql.SQLException;
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
/*     */ public class ChangePassword
/*     */   extends JFrame
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private JPanel contentPane;
/*     */   private JTextField textField;
/*     */   private JLabel lblEnterNewPassword;
/*     */   static final String JDBC_DRIVER = "org.h2.Driver";
/*     */   static final String DB_URL = "jdbc:h2:~/test1;IFEXISTS=TRUE";
/*     */   static final String USER = "admin";
/*     */   static final String PASS = "administrator";
/*     */   
/*     */   public static void main(String[] args) {
/*  43 */     EventQueue.invokeLater(new Runnable()
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
/*     */   public ChangePassword(final String name) {
/*  58 */     setDefaultCloseOperation(2);
/*  59 */     setBounds(450, 360, 1024, 234);
/*  60 */     setResizable(false);
/*     */     
/*  62 */     this.contentPane = new JPanel();
/*  63 */     this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*  64 */     setContentPane(this.contentPane);
/*  65 */     this.contentPane.setLayout((LayoutManager)null);
/*     */     
/*  67 */     this.textField = new JTextField();
/*  68 */     this.textField.setFont(new Font("Tahoma", 0, 34));
/*  69 */     this.textField.setBounds(373, 35, 609, 67);
/*  70 */     this.contentPane.add(this.textField);
/*  71 */     this.textField.setColumns(10);
/*     */     
/*  73 */     final JButton btnSearch = new JButton("Enter");
/*  74 */     btnSearch.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/*  77 */             String newPass = ChangePassword.this.textField.getText();
/*     */             try {
/*  79 */               System.out.println("update password name " + name);
/*  80 */               System.out.println("update password");
/*     */               
/*  82 */               Class.forName("org.h2.Driver");
/*  83 */               Connection conn = DriverManager.getConnection("jdbc:h2:~/test1;IFEXISTS=TRUE", "admin", "administrator");
/*     */               
/*  85 */               PreparedStatement st = conn.prepareStatement("Update registration set password=? where username=?");
/*     */               
/*  87 */               st.setString(1, newPass);
/*  88 */               st.setString(2, name);
/*  89 */               st.executeUpdate();
/*  90 */               JOptionPane.showMessageDialog(btnSearch, "Password has been successfully changed");
/*     */             }
/*  92 */             catch (SQLException|ClassNotFoundException sqlException) {
/*  93 */               sqlException.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/*  98 */     btnSearch.setFont(new Font("Tahoma", 0, 29));
/*  99 */     btnSearch.setBackground(new Color(240, 240, 240));
/* 100 */     btnSearch.setBounds(438, 127, 170, 59);
/* 101 */     this.contentPane.add(btnSearch);
/*     */     
/* 103 */     this.lblEnterNewPassword = new JLabel("Enter New Password :");
/* 104 */     this.lblEnterNewPassword.setFont(new Font("Tahoma", 0, 30));
/* 105 */     this.lblEnterNewPassword.setBounds(45, 37, 326, 67);
/* 106 */     this.contentPane.add(this.lblEnterNewPassword);
/*     */   }
/*     */ }


/* Location:              D:\output3\dist\SCS3.jar!\phucTung\ChangePassword.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */