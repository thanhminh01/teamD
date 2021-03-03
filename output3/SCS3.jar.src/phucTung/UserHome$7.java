/*     */ package phucTung;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import javax.swing.JLabel;
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
/*     */     try {
/* 171 */       System.out.println("debug");
/* 172 */       String USER = "admin";
/* 173 */       String PASS = "administrator";
/* 174 */       String JDBC_DRIVER = "org.h2.Driver";
/* 175 */       String DB_URL = "jdbc:h2:~/test1;IFEXISTS=TRUE";
/* 176 */       Class.forName(JDBC_DRIVER);
/* 177 */       Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
/* 178 */       PreparedStatement st = conn.prepareStatement("SELECT * FROM registration WHERE username=?;");
/* 179 */       st.setString(1, userName);
/* 180 */       ResultSet rs = st.executeQuery();
/* 181 */       while (rs.next())
/*     */       {
/* 183 */         JLabel placeholder1Value = new JLabel(rs.getString("placeholder1"));
/* 184 */         placeholder1Value.setForeground(Color.BLACK);
/* 185 */         placeholder1Value.setFont(new Font("Times New Roman", 0, 38));
/* 186 */         placeholder1Value.setBounds(1000, 150, 273, 93);
/* 187 */         UserHome.this.contentPane.add(placeholder1Value);
/*     */         
/* 189 */         JLabel placeholder2Value = new JLabel(rs.getString("placeholder2"));
/* 190 */         placeholder2Value.setForeground(Color.BLACK);
/* 191 */         placeholder2Value.setFont(new Font("Times New Roman", 0, 38));
/* 192 */         placeholder2Value.setBounds(1000, 230, 273, 93);
/* 193 */         UserHome.this.contentPane.add(placeholder2Value);
/*     */       }
/*     */     
/*     */     }
/* 197 */     catch (SQLException|ClassNotFoundException sqlException) {
/*     */       
/* 199 */       sqlException.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\output3\dist\SCS3.jar!\phucTung\UserHome$7.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */