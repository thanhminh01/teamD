/*    */ package phucTung;
/*    */ 
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import java.sql.PreparedStatement;
/*    */ import java.sql.SQLException;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   implements ActionListener
/*    */ {
/*    */   public void actionPerformed(ActionEvent e) {
/* 77 */     String newPass = ChangePassword.this.textField.getText();
/*    */     try {
/* 79 */       System.out.println("update password name " + name);
/* 80 */       System.out.println("update password");
/*    */       
/* 82 */       Class.forName("org.h2.Driver");
/* 83 */       Connection conn = DriverManager.getConnection("jdbc:h2:~/test1;IFEXISTS=TRUE", "admin", "administrator");
/*    */       
/* 85 */       PreparedStatement st = conn.prepareStatement("Update registration set password=? where username=?");
/*    */       
/* 87 */       st.setString(1, newPass);
/* 88 */       st.setString(2, name);
/* 89 */       st.executeUpdate();
/* 90 */       JOptionPane.showMessageDialog(btnSearch, "Password has been successfully changed");
/*    */     }
/* 92 */     catch (SQLException|ClassNotFoundException sqlException) {
/* 93 */       sqlException.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\output3\dist\SCS3.jar!\phucTung\ChangePassword$2.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */