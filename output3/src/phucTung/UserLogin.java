/*     */ package phucTung;
/*     */ 
/*     */ import folder.NewJFrame;
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
/*     */ public class UserLogin
/*     */   extends JFrame
/*     */ {
/*     */   static final String JDBC_DRIVER = "org.h2.Driver";
/*     */   static final String DB_URL = "jdbc:h2:~/test1;IFEXISTS=TRUE";
/*     */   static final String USER = "admin";
/*     */   static final String PASS = "administrator";
/*     */   private static final long serialVersionUID = 1L;
/*     */   private JTextField textField;
/*     */   private JPasswordField passwordField;
/*     */   private JButton btnNewButton;
/*     */   private JButton regButton;
/*     */   private JLabel label;
/*     */   private JPanel contentPane;
/*     */   
/*     */   public static void main(String[] args) {
/*  40 */     h2Database.createTable();
/*  41 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/*     */             try {
/*  44 */               UserLogin frame = new UserLogin();
/*  45 */               frame.setVisible(true);
/*  46 */             } catch (Exception e) {
/*  47 */               e.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UserLogin() {
/*  57 */     setDefaultCloseOperation(3);
/*  58 */     setBounds(450, 190, 1014, 597);
/*     */     
/*  60 */     setResizable(false);
/*  61 */     this.contentPane = new JPanel();
/*  62 */     this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*  63 */     setContentPane(this.contentPane);
/*  64 */     this.contentPane.setLayout((LayoutManager)null);
/*     */     
/*  66 */     JLabel logInLabel = new JLabel("Login");
/*  67 */     logInLabel.setForeground(Color.BLACK);
/*  68 */     logInLabel.setFont(new Font("Times New Roman", 0, 46));
/*  69 */     logInLabel.setBounds(423, 13, 273, 93);
/*  70 */     this.contentPane.add(logInLabel);
/*     */     
/*  72 */     this.textField = new JTextField();
/*  73 */     this.textField.setFont(new Font("Tahoma", 0, 32));
/*  74 */     this.textField.setBounds(481, 170, 281, 68);
/*  75 */     this.contentPane.add(this.textField);
/*  76 */     this.textField.setColumns(10);
/*     */     
/*  78 */     this.passwordField = new JPasswordField();
/*  79 */     this.passwordField.setFont(new Font("Tahoma", 0, 32));
/*  80 */     this.passwordField.setBounds(481, 286, 281, 68);
/*  81 */     this.contentPane.add(this.passwordField);
/*     */     
/*  83 */     JLabel lblUsername = new JLabel("Username");
/*  84 */     lblUsername.setBackground(Color.BLACK);
/*  85 */     lblUsername.setForeground(Color.BLACK);
/*  86 */     lblUsername.setFont(new Font("Tahoma", 0, 31));
/*  87 */     lblUsername.setBounds(250, 166, 193, 52);
/*  88 */     this.contentPane.add(lblUsername);
/*     */     
/*  90 */     JLabel lblPassword = new JLabel("Password");
/*  91 */     lblPassword.setForeground(Color.BLACK);
/*  92 */     lblPassword.setBackground(Color.CYAN);
/*  93 */     lblPassword.setFont(new Font("Tahoma", 0, 31));
/*  94 */     lblPassword.setBounds(250, 286, 193, 52);
/*  95 */     this.contentPane.add(lblPassword);
/*     */     
/*  97 */     this.regButton = new JButton("Register");
/*  98 */     this.regButton.setFont(new Font("Tahoma", 0, 26));
/*  99 */     this.regButton.setBounds(322, 392, 162, 73);
/* 100 */     this.regButton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 102 */             UserRegistration newUser = new UserRegistration();
/* 103 */             newUser.setTitle("Registration");
/* 104 */             newUser.setVisible(true);
/*     */           }
/*     */         });
/*     */     
/* 108 */     this.btnNewButton = new JButton("Login");
/* 109 */     this.btnNewButton.setFont(new Font("Tahoma", 0, 26));
/* 110 */     this.btnNewButton.setBounds(545, 392, 162, 73);
/* 111 */     this.btnNewButton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 113 */             String userName = UserLogin.this.textField.getText();
/* 114 */             String password = UserLogin.this.passwordField.getText();
/*     */             try {
/* 116 */               Class.forName("org.h2.Driver");
/* 117 */               Connection conn = DriverManager.getConnection("jdbc:h2:~/test1;IFEXISTS=TRUE", "admin", "administrator");
/*     */               
/* 119 */               PreparedStatement st = conn.prepareStatement("Select username, password from registration where username=? and password=?");
/*     */               
/* 121 */               st.setString(1, userName);
/* 122 */               st.setString(2, password);
/* 123 */               ResultSet rs = st.executeQuery();
/* 124 */               if (rs.next()) {
/* 125 */                 UserLogin.this.dispose();
/* 126 */                 NewJFrame frame = new NewJFrame();
/* 127 */                 frame.setUserName(userName);
/* 128 */                 frame.setVisible(true);
/* 129 */                 JOptionPane.showMessageDialog(UserLogin.this.btnNewButton, "You have successfully logged in");
/*     */               } else {
/* 131 */                 JOptionPane.showMessageDialog(UserLogin.this.btnNewButton, "Wrong Username & Password");
/*     */               } 
/* 133 */             } catch (SQLException|ClassNotFoundException sqlException) {
/* 134 */               sqlException.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 139 */     this.contentPane.add(this.btnNewButton);
/* 140 */     this.contentPane.add(this.regButton);
/*     */     
/* 142 */     this.label = new JLabel("");
/* 143 */     this.label.setBounds(0, 0, 1008, 562);
/* 144 */     this.contentPane.add(this.label);
/*     */   }
/*     */ }


/* Location:              D:\output3\dist\SCS3.jar!\phucTung\UserLogin.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */