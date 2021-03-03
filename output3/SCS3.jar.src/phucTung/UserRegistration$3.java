/*     */ package phucTung;
/*     */ 
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import javax.swing.JOptionPane;
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
/*     */ class null
/*     */   implements ActionListener
/*     */ {
/*     */   public void actionPerformed(ActionEvent e) {
/* 101 */     String userName = UserRegistration.this.textField.getText();
/* 102 */     String password = UserRegistration.this.passwordField.getText();
/*     */     try {
/* 104 */       Class.forName("org.h2.Driver");
/* 105 */       Connection conn = DriverManager.getConnection("jdbc:h2:~/test1;IFEXISTS=TRUE", "admin", "administrator");
/*     */ 
/*     */       
/* 108 */       PreparedStatement st = conn.prepareStatement("Select username from registration where username=?");
/* 109 */       st.setString(1, userName);
/* 110 */       ResultSet rs = st.executeQuery();
/* 111 */       if (rs.next()) {
/* 112 */         JOptionPane.showMessageDialog(UserRegistration.this.btnNewButton, "Username existed, please choose another one.");
/*     */       } else {
/* 114 */         PreparedStatement stmt = conn.prepareStatement("INSERT INTO Registration VALUES (?, ?, 'placeholding 1', 'placeholding 2')");
/* 115 */         stmt.setString(1, userName);
/* 116 */         stmt.setString(2, password);
/* 117 */         stmt.executeUpdate();
/*     */         
/* 119 */         stmt.close();
/* 120 */         conn.close();
/* 121 */         JOptionPane.showMessageDialog(UserRegistration.this.btnNewButton, "New account succesfully registered");
/*     */       }
/*     */     
/* 124 */     } catch (SQLException|ClassNotFoundException sqlException) {
/* 125 */       sqlException.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\output3\dist\SCS3.jar!\phucTung\UserRegistration$3.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */