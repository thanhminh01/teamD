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
/*     */ import java.sql.SQLException;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UserRegistration
/*     */   extends JFrame
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private JTextField textField;
/*     */   private JPasswordField passwordField;
/*     */   private JButton btnNewButton;
/*     */   private JButton backButton;
/*     */   
/*     */   public static void main(String[] args) {
/*  35 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/*     */             try {
/*  38 */               UserRegistration frame = new UserRegistration();
/*  39 */               frame.setVisible(true);
/*  40 */             } catch (Exception e) {
/*  41 */               e.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */   } private JLabel label; private JPanel contentPane; static final String JDBC_DRIVER = "org.h2.Driver"; static final String DB_URL = "jdbc:h2:~/test1;IFEXISTS=TRUE"; static final String USER = "admin"; static final String PASS = "administrator";
/*     */   public UserRegistration() {
/*  47 */     setDefaultCloseOperation(3);
/*  48 */     setBounds(450, 190, 1014, 597);
/*  49 */     setResizable(false);
/*  50 */     this.contentPane = new JPanel();
/*  51 */     this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*  52 */     setContentPane(this.contentPane);
/*  53 */     this.contentPane.setLayout((LayoutManager)null);
/*     */     
/*  55 */     JLabel lblNewLabel = new JLabel("User Registration");
/*  56 */     lblNewLabel.setForeground(Color.BLACK);
/*  57 */     lblNewLabel.setFont(new Font("Times New Roman", 0, 46));
/*  58 */     lblNewLabel.setBounds(423, 13, 273, 93);
/*  59 */     this.contentPane.add(lblNewLabel);
/*     */     
/*  61 */     this.textField = new JTextField();
/*  62 */     this.textField.setFont(new Font("Tahoma", 0, 32));
/*  63 */     this.textField.setBounds(481, 170, 281, 68);
/*  64 */     this.contentPane.add(this.textField);
/*  65 */     this.textField.setColumns(10);
/*     */     
/*  67 */     this.passwordField = new JPasswordField();
/*  68 */     this.passwordField.setFont(new Font("Tahoma", 0, 32));
/*  69 */     this.passwordField.setBounds(481, 286, 281, 68);
/*  70 */     this.contentPane.add(this.passwordField);
/*     */     
/*  72 */     JLabel lblUsername = new JLabel("Username");
/*  73 */     lblUsername.setBackground(Color.BLACK);
/*  74 */     lblUsername.setForeground(Color.BLACK);
/*  75 */     lblUsername.setFont(new Font("Tahoma", 0, 31));
/*  76 */     lblUsername.setBounds(250, 166, 193, 52);
/*  77 */     this.contentPane.add(lblUsername);
/*     */     
/*  79 */     JLabel lblPassword = new JLabel("Password");
/*  80 */     lblPassword.setForeground(Color.BLACK);
/*  81 */     lblPassword.setBackground(Color.CYAN);
/*  82 */     lblPassword.setFont(new Font("Tahoma", 0, 31));
/*  83 */     lblPassword.setBounds(250, 286, 193, 52);
/*  84 */     this.contentPane.add(lblPassword);
/*     */     
/*  86 */     this.backButton = new JButton("Back");
/*  87 */     this.backButton.setFont(new Font("Tahoma", 0, 26));
/*  88 */     this.backButton.setBounds(345, 392, 162, 73);
/*  89 */     this.backButton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  91 */             UserRegistration.this.dispose();
/*     */           }
/*     */         });
/*     */     
/*  95 */     this.btnNewButton = new JButton("Register");
/*  96 */     this.btnNewButton.setFont(new Font("Tahoma", 0, 26));
/*  97 */     this.btnNewButton.setBounds(545, 392, 162, 73);
/*  98 */     this.btnNewButton.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/* 101 */             String userName = UserRegistration.this.textField.getText();
/* 102 */             String password = UserRegistration.this.passwordField.getText();
/*     */             try {
/* 104 */               Class.forName("org.h2.Driver");
/* 105 */               Connection conn = DriverManager.getConnection("jdbc:h2:~/test1;IFEXISTS=TRUE", "admin", "administrator");
/*     */ 
/*     */               
/* 108 */               PreparedStatement st = conn.prepareStatement("Select username from registration where username=?");
/* 109 */               st.setString(1, userName);
/* 110 */               ResultSet rs = st.executeQuery();
/* 111 */               if (rs.next()) {
/* 112 */                 JOptionPane.showMessageDialog(UserRegistration.this.btnNewButton, "Username existed, please choose another one.");
/*     */               } else {
/* 114 */                 PreparedStatement stmt = conn.prepareStatement("INSERT INTO Registration VALUES (?, ?, 'placeholding 1', 'placeholding 2')");
/* 115 */                 stmt.setString(1, userName);
/* 116 */                 stmt.setString(2, password);
/* 117 */                 stmt.executeUpdate();
/*     */                 
/* 119 */                 stmt.close();
/* 120 */                 conn.close();
/* 121 */                 JOptionPane.showMessageDialog(UserRegistration.this.btnNewButton, "New account succesfully registered");
/*     */               }
/*     */             
/* 124 */             } catch (SQLException|ClassNotFoundException sqlException) {
/* 125 */               sqlException.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 130 */     this.contentPane.add(this.btnNewButton);
/* 131 */     this.contentPane.add(this.backButton);
/*     */     
/* 133 */     this.label = new JLabel("");
/* 134 */     this.label.setBounds(0, 0, 1008, 562);
/* 135 */     this.contentPane.add(this.label);
/*     */   }
/*     */ }


/* Location:              D:\output3\dist\SCS3.jar!\phucTung\UserRegistration.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */