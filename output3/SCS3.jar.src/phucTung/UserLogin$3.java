/*     */ package phucTung;
/*     */ 
/*     */ import folder.NewJFrame;
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
/* 113 */     String userName = UserLogin.this.textField.getText();
/* 114 */     String password = UserLogin.this.passwordField.getText();
/*     */     try {
/* 116 */       Class.forName("org.h2.Driver");
/* 117 */       Connection conn = DriverManager.getConnection("jdbc:h2:~/test1;IFEXISTS=TRUE", "admin", "administrator");
/*     */       
/* 119 */       PreparedStatement st = conn.prepareStatement("Select username, password from registration where username=? and password=?");
/*     */       
/* 121 */       st.setString(1, userName);
/* 122 */       st.setString(2, password);
/* 123 */       ResultSet rs = st.executeQuery();
/* 124 */       if (rs.next()) {
/* 125 */         UserLogin.this.dispose();
/* 126 */         NewJFrame frame = new NewJFrame();
/* 127 */         frame.setUserName(userName);
/* 128 */         frame.setVisible(true);
/* 129 */         JOptionPane.showMessageDialog(UserLogin.this.btnNewButton, "You have successfully logged in");
/*     */       } else {
/* 131 */         JOptionPane.showMessageDialog(UserLogin.this.btnNewButton, "Wrong Username & Password");
/*     */       } 
/* 133 */     } catch (SQLException|ClassNotFoundException sqlException) {
/* 134 */       sqlException.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\output3\dist\SCS3.jar!\phucTung\UserLogin$3.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */