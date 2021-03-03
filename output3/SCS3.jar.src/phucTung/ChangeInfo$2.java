/*     */ package phucTung;
/*     */ 
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
/*     */ class null
/*     */   implements ActionListener
/*     */ {
/*     */   public void actionPerformed(ActionEvent e) {
/*  85 */     String newValue = ChangeInfo.this.textField.getText();
/*     */     try {
/*  87 */       Class.forName("org.h2.Driver");
/*  88 */       Connection connection = DriverManager.getConnection("jdbc:h2:~/test1;IFEXISTS=TRUE", "admin", "administrator");
/*     */       
/*  90 */       Statement stmt = connection.createStatement();
/*  91 */       ResultSet results = stmt.executeQuery("SELECT * FROM registration");
/*     */       
/*  93 */       ResultSetMetaData metadata = results.getMetaData();
/*  94 */       String columnName = metadata.getColumnName(columnID);
/*     */       
/*  96 */       PreparedStatement st = connection.prepareStatement("Update registration set " + columnName + " =? where username=?");
/*     */       
/*  98 */       st.setString(1, newValue);
/*  99 */       st.setString(2, userName);
/* 100 */       st.executeUpdate();
/* 101 */       JOptionPane.showMessageDialog(btnSearch, "Your info has been successfully updated");
/*     */     }
/* 103 */     catch (SQLException|ClassNotFoundException sqlException) {
/* 104 */       sqlException.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\output3\dist\SCS3.jar!\phucTung\ChangeInfo$2.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */