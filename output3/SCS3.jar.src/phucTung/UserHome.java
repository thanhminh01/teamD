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
/*     */ import javax.swing.UIManager;
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
/*     */ public class UserHome
/*     */   extends JFrame
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private JPanel contentPane;
/*     */   
/*     */   public static void main(String[] args) {
/*  40 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/*     */             try {
/*  43 */               UserHome frame = new UserHome();
/*  44 */               frame.setVisible(true);
/*  45 */             } catch (Exception e) {
/*  46 */               e.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UserHome() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UserHome(final String userName) {
/*  62 */     setDefaultCloseOperation(3);
/*     */     
/*  64 */     setBounds(200, 100, 1264, 900);
/*  65 */     setResizable(false);
/*  66 */     this.contentPane = new JPanel();
/*  67 */     this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*  68 */     setContentPane(this.contentPane);
/*  69 */     this.contentPane.setLayout((LayoutManager)null);
/*     */ 
/*     */ 
/*     */     
/*  73 */     final JButton logOutButton = new JButton("Logout");
/*  74 */     logOutButton.setForeground(new Color(243, 126, 126));
/*  75 */     logOutButton.setBackground(UIManager.getColor("Button.disabledForeground"));
/*  76 */     logOutButton.setFont(new Font("Tahoma", 0, 39));
/*  77 */     logOutButton.setBounds(100, 118, 491, 114);
/*  78 */     this.contentPane.add(logOutButton);
/*     */     
/*  80 */     logOutButton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  82 */             int a = JOptionPane.showConfirmDialog(logOutButton, "Are you sure?");
/*     */             
/*  84 */             if (a == 0) {
/*  85 */               UserHome.this.dispose();
/*  86 */               UserLogin obj = new UserLogin();
/*  87 */               obj.setTitle("User-Login");
/*  88 */               obj.setVisible(true);
/*     */             } 
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     JButton changePassButton = new JButton("Change-password\r\n");
/*  97 */     changePassButton.setBackground(UIManager.getColor("Button.disabledForeground"));
/*  98 */     changePassButton.setFont(new Font("Tahoma", 0, 35));
/*  99 */     changePassButton.setBounds(100, 320, 491, 114);
/* 100 */     this.contentPane.add(changePassButton);
/*     */     
/* 102 */     changePassButton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 104 */             ChangePassword bo = new ChangePassword(userName);
/* 105 */             bo.setTitle("Update info");
/* 106 */             bo.setVisible(true);
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     JButton changeInfoButton1 = new JButton("Update");
/* 115 */     changeInfoButton1.setBackground(UIManager.getColor("Button.disabledForeground"));
/* 116 */     changeInfoButton1.setFont(new Font("Tahoma", 0, 20));
/* 117 */     changeInfoButton1.setBounds(640, 160, 100, 60);
/* 118 */     this.contentPane.add(changeInfoButton1);
/*     */     
/* 120 */     changeInfoButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 122 */             ChangeInfo changeInfo = new ChangeInfo(userName, 3);
/* 123 */             changeInfo.setTitle("Change Info");
/* 124 */             changeInfo.setVisible(true);
/*     */           }
/*     */         });
/*     */     
/* 128 */     JButton changeInfoButton2 = new JButton("Update");
/* 129 */     changeInfoButton2.setBackground(UIManager.getColor("Button.disabledForeground"));
/* 130 */     changeInfoButton2.setFont(new Font("Tahoma", 0, 20));
/* 131 */     changeInfoButton2.setBounds(640, 240, 100, 60);
/* 132 */     this.contentPane.add(changeInfoButton2);
/*     */     
/* 134 */     changeInfoButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 136 */             ChangeInfo changeInfo = new ChangeInfo(userName, 4);
/* 137 */             changeInfo.setTitle("Change Info");
/* 138 */             changeInfo.setVisible(true);
/*     */           }
/*     */         });
/*     */     
/* 142 */     JButton backToMenuButton = new JButton("Back to menu\r\n");
/* 143 */     backToMenuButton.setBackground(UIManager.getColor("Button.disabledForeground"));
/* 144 */     backToMenuButton.setFont(new Font("Tahoma", 0, 20));
/* 145 */     backToMenuButton.setBounds(0, 0, 200, 50);
/* 146 */     this.contentPane.add(backToMenuButton);
/*     */     
/* 148 */     backToMenuButton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 150 */             UserHome.this.dispose();
/* 151 */             NewJFrame frame = new NewJFrame();
/* 152 */             frame.setUserName(userName);
/* 153 */             frame.setVisible(true);
/*     */           }
/*     */         });
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
/*     */ 
/*     */ 
/*     */     
/* 174 */     String USER = "admin";
/* 175 */     String PASS = "administrator";
/* 176 */     String JDBC_DRIVER = "org.h2.Driver";
/* 177 */     String DB_URL = "jdbc:h2:~/test1;IFEXISTS=TRUE";
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
/*     */     
/* 194 */     JLabel placeholder1 = new JLabel("Placeholder1:");
/* 195 */     placeholder1.setForeground(Color.BLACK);
/* 196 */     placeholder1.setFont(new Font("Times New Roman", 0, 38));
/* 197 */     placeholder1.setBounds(780, 150, 273, 93);
/* 198 */     this.contentPane.add(placeholder1);
/* 199 */     JLabel placeholder2 = new JLabel("Placeholder2:");
/* 200 */     placeholder2.setForeground(Color.BLACK);
/* 201 */     placeholder2.setFont(new Font("Times New Roman", 0, 38));
/* 202 */     placeholder2.setBounds(780, 230, 273, 93);
/* 203 */     this.contentPane.add(placeholder2);
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 208 */       Class.forName(JDBC_DRIVER);
/* 209 */       Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
/* 210 */       PreparedStatement st = conn.prepareStatement("SELECT * FROM registration WHERE username=?;");
/* 211 */       st.setString(1, userName);
/* 212 */       ResultSet rs = st.executeQuery();
/* 213 */       while (rs.next())
/*     */       {
/* 215 */         JLabel placeholder1Value = new JLabel(rs.getString("placeholder1"));
/* 216 */         placeholder1Value.setForeground(Color.BLACK);
/* 217 */         placeholder1Value.setFont(new Font("Times New Roman", 0, 38));
/* 218 */         placeholder1Value.setBounds(1000, 150, 273, 93);
/* 219 */         this.contentPane.add(placeholder1Value);
/*     */         
/* 221 */         JLabel placeholder2Value = new JLabel(rs.getString("placeholder2"));
/* 222 */         placeholder2Value.setForeground(Color.BLACK);
/* 223 */         placeholder2Value.setFont(new Font("Times New Roman", 0, 38));
/* 224 */         placeholder2Value.setBounds(1000, 230, 273, 93);
/* 225 */         this.contentPane.add(placeholder2Value);
/*     */       }
/*     */     
/*     */     }
/* 229 */     catch (SQLException|ClassNotFoundException sqlException) {
/*     */       
/* 231 */       sqlException.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\output3\dist\SCS3.jar!\phucTung\UserHome.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */