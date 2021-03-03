/*     */ package folder;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.io.FileReader;
/*     */ import java.io.FileWriter;
/*     */ import java.util.Arrays;
/*     */ import javax.swing.DefaultComboBoxModel;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.LayoutStyle;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*     */ import phucTung.UserHome;
/*     */ 
/*     */ public class NewJFrame extends JFrame {
/*  24 */   Data newData = new Data();
/*     */   
/*     */   String usr;
/*     */   
/*     */   private JButton btnAreaStatisticResult;
/*     */   
/*     */   private JButton btnbacktoOption1;
/*     */   
/*     */   private JButton btnbacktoOption2;
/*     */   
/*     */   private JButton btnlogin;
/*     */   
/*     */   private JButton btntoframe3;
/*     */   
/*     */   private JComboBox<String> cbbseveresymptoms;
/*     */   private JCheckBox cbfeverorchills;
/*     */   private JCheckBox cblosstaste;
/*     */   private JCheckBox cbmild;
/*     */   private JCheckBox cbnewcough;
/*     */   private JCheckBox cbnonesymp;
/*     */   private JCheckBox cbsorethroat;
/*     */   private JCheckBox cbunexplained;
/*     */   private JCheckBox cbvomiting;
/*     */   private JButton jButton1;
/*     */   private JButton jButton10;
/*     */   
/*     */   private void initComponents() {
/*  51 */     this.jFrameSelfDiag1 = new JFrame();
/*  52 */     this.cbbseveresymptoms = new JComboBox<>();
/*  53 */     this.jLabel3 = new JLabel();
/*  54 */     this.jLabel4 = new JLabel();
/*  55 */     this.btntoframe3 = new JButton();
/*  56 */     this.cbfeverorchills = new JCheckBox();
/*  57 */     this.cbmild = new JCheckBox();
/*  58 */     this.cbnewcough = new JCheckBox();
/*  59 */     this.cblosstaste = new JCheckBox();
/*  60 */     this.cbsorethroat = new JCheckBox();
/*  61 */     this.cbvomiting = new JCheckBox();
/*  62 */     this.cbunexplained = new JCheckBox();
/*  63 */     this.cbnonesymp = new JCheckBox();
/*  64 */     this.btnbacktoOption1 = new JButton();
/*  65 */     this.jFrameAreaStatistic = new JFrame();
/*  66 */     this.jLabel8 = new JLabel();
/*  67 */     this.jLabel9 = new JLabel();
/*  68 */     this.btnAreaStatisticResult = new JButton();
/*  69 */     this.btnbacktoOption2 = new JButton();
/*  70 */     this.jComboBox2 = new JComboBox<>();
/*  71 */     this.jComboBox4 = new JComboBox<>();
/*  72 */     this.login = new JFrame();
/*  73 */     this.jPasswordField1 = new JPasswordField();
/*  74 */     this.jFormattedTextField1 = new JFormattedTextField();
/*  75 */     this.username = new JLabel();
/*  76 */     this.password = new JLabel();
/*  77 */     this.btnlogin = new JButton();
/*  78 */     this.jButton7 = new JButton();
/*  79 */     this.jButton8 = new JButton();
/*  80 */     this.jButton9 = new JButton();
/*  81 */     this.jButton10 = new JButton();
/*  82 */     this.jButton1 = new JButton();
/*     */     
/*  84 */     this.jFrameSelfDiag1.setResizable(false);
/*  85 */     this.jFrameSelfDiag1.setSize(new Dimension(750, 600));
/*  86 */     this.jFrameSelfDiag1.addWindowListener(new WindowAdapter() {
/*     */           public void windowClosed(WindowEvent evt) {
/*  88 */             NewJFrame.this.jFrameSelfDiag1WindowClosed(evt);
/*     */           }
/*     */         });
/*     */     
/*  92 */     this.cbbseveresymptoms.setModel(new DefaultComboBoxModel<>(new String[] { "Your answer.", "I am able to do normal activities like exercising.", "I can only do some daily activities like cleaning and making food.", "I can only do what's necessary such as using the bathroom or eating.", " " }));
/*  93 */     this.cbbseveresymptoms.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  95 */             NewJFrame.this.cbbseveresymptomsActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  99 */     this.jLabel3.setFont(new Font("Tahoma", 1, 11));
/* 100 */     this.jLabel3.setText("Have you recently started experiencing any of these symptoms ?");
/*     */     
/* 102 */     this.jLabel4.setFont(new Font("Tahoma", 1, 11));
/* 103 */     this.jLabel4.setText("How severe are your symptoms ?");
/*     */     
/* 105 */     this.btntoframe3.setText("Next");
/* 106 */     this.btntoframe3.setMaximumSize(new Dimension(91, 23));
/* 107 */     this.btntoframe3.setMinimumSize(new Dimension(91, 23));
/* 108 */     this.btntoframe3.setPreferredSize(new Dimension(91, 23));
/* 109 */     this.btntoframe3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 111 */             NewJFrame.this.btntoframe3ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 115 */     this.cbfeverorchills.setText("Fever or Chills");
/* 116 */     this.cbfeverorchills.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 118 */             NewJFrame.this.cbfeverorchillsActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 122 */     this.cbmild.setText("Mild or moderate difficulty breathing");
/*     */     
/* 124 */     this.cbnewcough.setText("New or worsening cough");
/*     */     
/* 126 */     this.cblosstaste.setText("Suddently loss of taste or smell");
/* 127 */     this.cblosstaste.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 129 */             NewJFrame.this.cblosstasteActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 133 */     this.cbsorethroat.setText("Sore throat");
/* 134 */     this.cbsorethroat.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 136 */             NewJFrame.this.cbsorethroatActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 140 */     this.cbvomiting.setText("Vomiting or diarrhea");
/*     */     
/* 142 */     this.cbunexplained.setText("Unexplained, significant fatigue or aching throughout the body");
/*     */     
/* 144 */     this.cbnonesymp.setText("None of the above");
/*     */     
/* 146 */     this.btnbacktoOption1.setText("Previous");
/* 147 */     this.btnbacktoOption1.setMaximumSize(new Dimension(91, 23));
/* 148 */     this.btnbacktoOption1.setMinimumSize(new Dimension(91, 23));
/* 149 */     this.btnbacktoOption1.setPreferredSize(new Dimension(91, 23));
/* 150 */     this.btnbacktoOption1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 152 */             NewJFrame.this.btnbacktoOption1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 156 */     GroupLayout jFrameSelfDiag1Layout = new GroupLayout(this.jFrameSelfDiag1.getContentPane());
/* 157 */     this.jFrameSelfDiag1.getContentPane().setLayout(jFrameSelfDiag1Layout);
/* 158 */     jFrameSelfDiag1Layout.setHorizontalGroup(jFrameSelfDiag1Layout
/* 159 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 160 */         .addGroup(GroupLayout.Alignment.TRAILING, jFrameSelfDiag1Layout.createSequentialGroup()
/* 161 */           .addGap(52, 52, 52)
/* 162 */           .addGroup(jFrameSelfDiag1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 163 */             .addComponent(this.jLabel3)
/* 164 */             .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
/* 165 */               .addGroup(jFrameSelfDiag1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 166 */                 .addComponent(this.cbunexplained)
/* 167 */                 .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
/* 168 */                   .addGroup(jFrameSelfDiag1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 169 */                     .addComponent(this.cbsorethroat)
/* 170 */                     .addComponent(this.cbfeverorchills))
/* 171 */                   .addGap(107, 107, 107)
/* 172 */                   .addGroup(jFrameSelfDiag1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 173 */                     .addComponent(this.cbmild)
/* 174 */                     .addComponent(this.cblosstaste))))
/* 175 */               .addGap(70, 70, 70)))
/* 176 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 177 */           .addGroup(jFrameSelfDiag1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 178 */             .addComponent(this.cbvomiting)
/* 179 */             .addComponent(this.cbnewcough)
/* 180 */             .addComponent(this.cbnonesymp))
/* 181 */           .addGap(40, 40, 40))
/* 182 */         .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
/* 183 */           .addGroup(jFrameSelfDiag1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 184 */             .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
/* 185 */               .addGap(171, 171, 171)
/* 186 */               .addComponent(this.cbbseveresymptoms, -2, -1, -2))
/* 187 */             .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
/* 188 */               .addGap(259, 259, 259)
/* 189 */               .addComponent(this.jLabel4)))
/* 190 */           .addContainerGap(-1, 32767))
/* 191 */         .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
/* 192 */           .addGap(75, 75, 75)
/* 193 */           .addComponent(this.btnbacktoOption1, -2, -1, -2)
/* 194 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 195 */           .addComponent(this.btntoframe3, -2, -1, -2)
/* 196 */           .addGap(49, 49, 49)));
/*     */     
/* 198 */     jFrameSelfDiag1Layout.setVerticalGroup(jFrameSelfDiag1Layout
/* 199 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 200 */         .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
/* 201 */           .addGap(161, 161, 161)
/* 202 */           .addComponent(this.jLabel3)
/* 203 */           .addGap(29, 29, 29)
/* 204 */           .addGroup(jFrameSelfDiag1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 205 */             .addComponent(this.cbfeverorchills)
/* 206 */             .addGroup(jFrameSelfDiag1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 207 */               .addComponent(this.cbmild)
/* 208 */               .addComponent(this.cbnewcough)))
/* 209 */           .addGap(32, 32, 32)
/* 210 */           .addGroup(jFrameSelfDiag1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 211 */             .addComponent(this.cbsorethroat)
/* 212 */             .addGroup(jFrameSelfDiag1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 213 */               .addComponent(this.cblosstaste)
/* 214 */               .addComponent(this.cbvomiting)))
/* 215 */           .addGap(41, 41, 41)
/* 216 */           .addGroup(jFrameSelfDiag1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 217 */             .addComponent(this.cbunexplained)
/* 218 */             .addComponent(this.cbnonesymp))
/* 219 */           .addGap(61, 61, 61)
/* 220 */           .addComponent(this.jLabel4)
/* 221 */           .addGap(18, 18, 18)
/* 222 */           .addComponent(this.cbbseveresymptoms, -2, -1, -2)
/* 223 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 84, 32767)
/* 224 */           .addGroup(jFrameSelfDiag1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 225 */             .addComponent(this.btnbacktoOption1, -2, -1, -2)
/* 226 */             .addComponent(this.btntoframe3, -2, -1, -2))
/* 227 */           .addGap(28, 28, 28)));
/*     */ 
/*     */     
/* 230 */     this.jFrameAreaStatistic.setBounds(new Rectangle(0, 0, 0, 0));
/* 231 */     this.jFrameAreaStatistic.setSize(new Dimension(400, 400));
/* 232 */     this.jFrameAreaStatistic.getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 234 */     this.jLabel8.setFont(new Font("Tahoma", 1, 11));
/* 235 */     this.jLabel8.setHorizontalAlignment(0);
/* 236 */     this.jLabel8.setText("What is your region ?");
/* 237 */     this.jLabel8.setMaximumSize(new Dimension(112, 14));
/* 238 */     this.jLabel8.setMinimumSize(new Dimension(112, 14));
/* 239 */     this.jLabel8.setPreferredSize(new Dimension(112, 14));
/* 240 */     this.jFrameAreaStatistic.getContentPane().add(this.jLabel8, new AbsoluteConstraints(90, 40, 190, 20));
/*     */     
/* 242 */     this.jLabel9.setFont(new Font("Tahoma", 1, 11));
/* 243 */     this.jLabel9.setText("What is your Location ?");
/* 244 */     this.jLabel9.setMaximumSize(new Dimension(112, 14));
/* 245 */     this.jFrameAreaStatistic.getContentPane().add(this.jLabel9, new AbsoluteConstraints(120, 180, -1, -1));
/*     */     
/* 247 */     this.btnAreaStatisticResult.setText("Check Result");
/* 248 */     this.btnAreaStatisticResult.setMaximumSize(new Dimension(92, 23));
/* 249 */     this.btnAreaStatisticResult.setMinimumSize(new Dimension(92, 23));
/* 250 */     this.btnAreaStatisticResult.setPreferredSize(new Dimension(92, 23));
/* 251 */     this.btnAreaStatisticResult.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 253 */             NewJFrame.this.btnAreaStatisticResultActionPerformed(evt);
/*     */           }
/*     */         });
/* 256 */     this.jFrameAreaStatistic.getContentPane().add(this.btnAreaStatisticResult, new AbsoluteConstraints(250, 320, 100, -1));
/*     */     
/* 258 */     this.btnbacktoOption2.setText("Previous");
/* 259 */     this.btnbacktoOption2.setMaximumSize(new Dimension(91, 23));
/* 260 */     this.btnbacktoOption2.setMinimumSize(new Dimension(91, 23));
/* 261 */     this.btnbacktoOption2.setPreferredSize(new Dimension(91, 23));
/* 262 */     this.btnbacktoOption2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 264 */             NewJFrame.this.btnbacktoOption2ActionPerformed(evt);
/*     */           }
/*     */         });
/* 267 */     this.jFrameAreaStatistic.getContentPane().add(this.btnbacktoOption2, new AbsoluteConstraints(30, 320, -1, -1));
/*     */     
/* 269 */     this.jComboBox2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 271 */             NewJFrame.this.jComboBox2ActionPerformed(evt);
/*     */           }
/*     */         });
/* 274 */     this.jFrameAreaStatistic.getContentPane().add(this.jComboBox2, new AbsoluteConstraints(170, 220, -1, -1));
/*     */     
/* 276 */     this.jComboBox4.setModel(new DefaultComboBoxModel<>(new String[] { "General", "States", "Districts" }));
/* 277 */     this.jComboBox4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 279 */             NewJFrame.this.jComboBox4ActionPerformed(evt);
/*     */           }
/*     */         });
/* 282 */     this.jFrameAreaStatistic.getContentPane().add(this.jComboBox4, new AbsoluteConstraints(170, 100, -1, -1));
/*     */     
/* 284 */     this.login.setResizable(false);
/* 285 */     this.login.setSize(new Dimension(500, 300));
/*     */     
/* 287 */     this.jPasswordField1.setText("jPasswordField1");
/*     */     
/* 289 */     this.jFormattedTextField1.setText("jFormattedTextField1");
/*     */     
/* 291 */     this.username.setText("username");
/*     */     
/* 293 */     this.password.setText("password");
/*     */     
/* 295 */     this.btnlogin.setText("Login");
/* 296 */     this.btnlogin.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 298 */             NewJFrame.this.btnloginActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 302 */     GroupLayout loginLayout = new GroupLayout(this.login.getContentPane());
/* 303 */     this.login.getContentPane().setLayout(loginLayout);
/* 304 */     loginLayout.setHorizontalGroup(loginLayout
/* 305 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 306 */         .addGroup(loginLayout.createSequentialGroup()
/* 307 */           .addGap(71, 71, 71)
/* 308 */           .addGroup(loginLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 309 */             .addComponent(this.password)
/* 310 */             .addComponent(this.username))
/* 311 */           .addGap(34, 34, 34)
/* 312 */           .addGroup(loginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 313 */             .addComponent(this.btnlogin)
/* 314 */             .addGroup(loginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 315 */               .addComponent(this.jFormattedTextField1, GroupLayout.Alignment.TRAILING, -2, -1, -2)
/* 316 */               .addComponent(this.jPasswordField1, GroupLayout.Alignment.TRAILING, -2, -1, -2)))
/* 317 */           .addContainerGap(136, 32767)));
/*     */     
/* 319 */     loginLayout.setVerticalGroup(loginLayout
/* 320 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 321 */         .addGroup(loginLayout.createSequentialGroup()
/* 322 */           .addGap(70, 70, 70)
/* 323 */           .addGroup(loginLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 324 */             .addComponent(this.jFormattedTextField1, -2, -1, -2)
/* 325 */             .addComponent(this.username))
/* 326 */           .addGap(18, 18, 18)
/* 327 */           .addGroup(loginLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 328 */             .addComponent(this.jPasswordField1, -2, -1, -2)
/* 329 */             .addComponent(this.password))
/* 330 */           .addGap(44, 44, 44)
/* 331 */           .addComponent(this.btnlogin)
/* 332 */           .addContainerGap(105, 32767)));
/*     */ 
/*     */     
/* 335 */     setDefaultCloseOperation(3);
/* 336 */     setSize(new Dimension(300, 300));
/* 337 */     addWindowListener(new WindowAdapter() {
/*     */           public void windowClosed(WindowEvent evt) {
/* 339 */             NewJFrame.this.formWindowClosed(evt);
/*     */           }
/*     */         });
/*     */     
/* 343 */     this.jButton7.setText("Self-Diagnosis");
/* 344 */     this.jButton7.setMaximumSize(new Dimension(230, 23));
/* 345 */     this.jButton7.setMinimumSize(new Dimension(230, 23));
/* 346 */     this.jButton7.setPreferredSize(new Dimension(230, 23));
/* 347 */     this.jButton7.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 349 */             NewJFrame.this.jButton7ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 353 */     this.jButton8.setText("Area Statistics");
/* 354 */     this.jButton8.setMaximumSize(new Dimension(230, 23));
/* 355 */     this.jButton8.setMinimumSize(new Dimension(230, 23));
/* 356 */     this.jButton8.setPreferredSize(new Dimension(230, 23));
/* 357 */     this.jButton8.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 359 */             NewJFrame.this.jButton8ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 363 */     this.jButton9.setText("Area Regulations");
/* 364 */     this.jButton9.setMaximumSize(new Dimension(230, 23));
/* 365 */     this.jButton9.setMinimumSize(new Dimension(230, 23));
/* 366 */     this.jButton9.setPreferredSize(new Dimension(230, 23));
/* 367 */     this.jButton9.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 369 */             NewJFrame.this.jButton9ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 373 */     this.jButton10.setText("Your account info");
/* 374 */     this.jButton10.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 376 */             NewJFrame.this.jButton10ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 380 */     this.jButton1.setText("Healthcare tips");
/* 381 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 383 */             NewJFrame.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 387 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 388 */     getContentPane().setLayout(layout);
/* 389 */     layout.setHorizontalGroup(layout
/* 390 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 391 */         .addGroup(layout.createSequentialGroup()
/* 392 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/* 393 */             .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
/* 394 */               .addGap(84, 84, 84)
/* 395 */               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 396 */                 .addComponent(this.jButton10, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
/* 397 */                 .addComponent(this.jButton1, -1, -1, 32767)))
/* 398 */             .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
/* 399 */               .addGap(84, 84, 84)
/* 400 */               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 401 */                 .addComponent(this.jButton7, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
/* 402 */                 .addComponent(this.jButton8, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
/* 403 */                 .addComponent(this.jButton9, -1, -1, 32767))))
/* 404 */           .addContainerGap(82, 32767)));
/*     */     
/* 406 */     layout.setVerticalGroup(layout
/* 407 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 408 */         .addGroup(layout.createSequentialGroup()
/* 409 */           .addGap(40, 40, 40)
/* 410 */           .addComponent(this.jButton7, -2, -1, -2)
/* 411 */           .addGap(40, 40, 40)
/* 412 */           .addComponent(this.jButton8, -2, -1, -2)
/* 413 */           .addGap(40, 40, 40)
/* 414 */           .addComponent(this.jButton9, -2, -1, -2)
/* 415 */           .addGap(44, 44, 44)
/* 416 */           .addComponent(this.jButton1)
/* 417 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, 32767)
/* 418 */           .addComponent(this.jButton10)
/* 419 */           .addGap(91, 91, 91)));
/*     */ 
/*     */     
/* 422 */     pack();
/*     */   }
/*     */   private JButton jButton7; private JButton jButton8; private JButton jButton9; private JComboBox<String> jComboBox2; private JComboBox<String> jComboBox4; private JFormattedTextField jFormattedTextField1; private JFrame jFrameAreaStatistic; private JFrame jFrameSelfDiag1; private JLabel jLabel3; private JLabel jLabel4; private JLabel jLabel8; private JLabel jLabel9; private JPasswordField jPasswordField1; private JFrame login; private JLabel password; private JLabel username; int limit1;
/*     */   
/*     */   private void btntoframe3ActionPerformed(ActionEvent evt) {
/* 427 */     if (this.cbnonesymp.isSelected()) {
/* 428 */       System.out.println("nothin");
/*     */     } else {
/*     */       
/* 431 */       if (this.cbfeverorchills.isSelected())
/* 432 */         AddPoint.addPoint(1); 
/* 433 */       if (this.cbmild.isSelected())
/* 434 */         AddPoint.addPoint(1); 
/* 435 */       if (this.cbnewcough.isSelected())
/* 436 */         AddPoint.addPoint(1); 
/* 437 */       if (this.cbsorethroat.isSelected())
/* 438 */         AddPoint.addPoint(1); 
/* 439 */       if (this.cblosstaste.isSelected())
/* 440 */         AddPoint.addPoint(1); 
/* 441 */       if (this.cbvomiting.isSelected())
/* 442 */         AddPoint.addPoint(1); 
/* 443 */       if (this.cbunexplained.isSelected())
/* 444 */         AddPoint.addPoint(1); 
/*     */     } 
/* 446 */     String msg = (String)this.cbbseveresymptoms.getSelectedItem();
/* 447 */     switch (msg) {
/*     */       
/*     */       case "I can only do some daily activities like cleaning and making food.":
/* 450 */         AddPoint.addPoint(2);
/*     */         break;
/*     */       case "I can only do what's necessary such as using the bathroom or eating.":
/* 453 */         AddPoint.addPoint(3); break;
/*     */     } 
/*     */     try {
/* 456 */       FileReader fileReader = new FileReader("filename.txt");
/*     */       
/* 458 */       try { int ch = fileReader.read();
/* 459 */         String chString = "";
/* 460 */         while (ch != -1) {
/*     */           
/* 462 */           chString = chString + chString;
/* 463 */           ch = fileReader.read();
/*     */         } 
/* 465 */         ch = Integer.parseInt(chString);
/* 466 */         if (ch <= 4)
/*     */         {
/* 468 */           JOptionPane.showMessageDialog(null, "Your result is : " + chString + " point(s)\n You have mild symptoms that may be caused by Covid-19.\nTake care of your health and remember to use self diagnosis again in case of getting new symptoms! ");
/*     */         }
/*     */ 
/*     */         
/* 472 */         if (ch == 0)
/*     */         {
/* 474 */           JOptionPane.showMessageDialog(null, "Your result is : " + chString + " point(s)\n You have no covid-19 related symptoms!");
/*     */         }
/*     */         
/* 477 */         if (ch > 4)
/*     */         {
/* 479 */           JOptionPane.showMessageDialog(null, "Your result is : " + chString + " point(s)\n Your symptoms are likely caused by Covid-19.\nYou should avoid contact with others and try to get a covid-19 test as soon as possible!");
/*     */         }
/*     */ 
/*     */         
/* 483 */         AddPoint.addPoint(Integer.parseInt(chString) * -1);
/* 484 */         fileReader.close(); } catch (Throwable throwable) { try { fileReader.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; } 
/* 485 */     } catch (FileNotFoundException fileNotFoundException) {
/*     */ 
/*     */     
/*     */     }
/* 489 */     catch (IOException iOException) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void cbbseveresymptomsActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void cbsorethroatActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void cbfeverorchillsActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void cblosstasteActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnloginActionPerformed(ActionEvent evt) {
/* 515 */     JOptionPane.showMessageDialog(null, "login successful");
/*     */   }
/*     */ 
/*     */   
/*     */   private void btnbacktoOption1ActionPerformed(ActionEvent evt) {
/* 520 */     this.jFrameSelfDiag1.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jFrameSelfDiag1WindowClosed(WindowEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void formWindowClosed(WindowEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnbacktoOption2ActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnAreaStatisticResultActionPerformed(ActionEvent evt) {
/* 538 */     String msg2, msg3, msg = (String)this.jComboBox4.getSelectedItem();
/* 539 */     switch (msg) {
/*     */       
/*     */       case "General":
/* 542 */         JOptionPane.showMessageDialog(null, this.newData.displayGeneralStats());
/*     */         break;
/*     */       case "States":
/* 545 */         msg2 = (String)this.jComboBox2.getSelectedItem();
/* 546 */         JOptionPane.showMessageDialog(null, this.newData.displayStatesStats(msg2));
/*     */         break;
/*     */       case "Districts":
/* 549 */         msg3 = (String)this.jComboBox2.getSelectedItem();
/* 550 */         JOptionPane.showMessageDialog(null, this.newData.displayDistrictsStats(msg3));
/*     */         break;
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jComboBox4ActionPerformed(ActionEvent evt) {
/*     */     Object[] a, b;
/* 592 */     String msg = (String)this.jComboBox4.getSelectedItem();
/* 593 */     switch (msg) {
/*     */       
/*     */       case "States":
/* 596 */         a = this.newData.getNames("states");
/* 597 */         Arrays.sort(a);
/* 598 */         this.jComboBox2.setModel(new DefaultComboBoxModel(a));
/*     */         return;
/*     */       case "Districts":
/* 601 */         b = this.newData.getNames("districts");
/* 602 */         Arrays.sort(b);
/* 603 */         this.jComboBox2.setModel(new DefaultComboBoxModel(b)); return;
/*     */     } 
/* 605 */     this.jComboBox2.removeAllItems();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jComboBox2ActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton7ActionPerformed(ActionEvent evt) {
/* 615 */     this.jFrameSelfDiag1.setVisible(true);
/*     */   }
/*     */   
/*     */   private void jButton8ActionPerformed(ActionEvent evt) {
/* 619 */     this.jFrameAreaStatistic.setVisible(true);
/*     */   }
/*     */   
/*     */   private void jButton10ActionPerformed(ActionEvent evt) {
/* 623 */     dispose();
/* 624 */     UserHome ah = new UserHome(getUserName());
/* 625 */     ah.setTitle("Welcome");
/* 626 */     ah.setVisible(true);
/*     */   }
/*     */   
/*     */   private void jButton9ActionPerformed(ActionEvent evt) {
/* 630 */     JOptionPane.showMessageDialog(null, "Contact limit: \nStays in public are limited to one household and one additional person, children are being counted as well.\n\nMask duty: \t\nIt is obligatory to wear a mouth and nose cover outside in the entire inner city area within the “Anlagenring”,\nnorth of the railroad line in Sachsenhausen, the area of Berger Straße north of the Alleenring, Leipziger Straße and Königsteiner Straße limited to the sector between Bolongarostraße and Kasinostraße.\nMasks are compulsory at all public events and in public facilities.\nWearing a mouth-nose-cover is mandatory in public transportation as well as during the stay on platforms and at stops, when driving in a vehicle with persons from more than one household and in taxis.\n\nProhibition of alcohol consumption: \t\nThe consumption of alcohol is prohibited all day in defined public places, locations and facilities. From 11:00 pm – 6:00 am the consumption of alcohol is forbidden in all public places.\n\nLeisure events + activities: \t\nAll events that serve as entertainment are prohibited.\nGuided city tours are cancelled, the zoo and botanical gardens as well as museums, theatres and cinemas are closed. The flea markets have been cancelled.\n\nRestaurants: \t\nRestaurants are closed. Delivery and collection of food for consumption at home is allowed. Canteens are also allowed to open.\n\nHotels: \t\nAccommodation offers for tourist purposes are not allowed. \nAccommodation offers will only be provided for necessary purposes such as mandatory business trips that cannot be postponed. \nA necessary professional obligation is given, if the personal participation on site is absolutely necessary for professional reasons and the change to alternative (tele-) communication means as well as the participation on site by a representative is not possible.\n\nMessen + Business Meetings: \t\nTrade fairs are prohibited. As a result of the course taken by the pandemic, Messe Frankfurt will not be holding any of its own physical trade fairs at the Frankfurt exhibition grounds between January and March 2021.\nThis does not apply to guest events that are not organized by Messe Frankfurt. The rental business continues to operate without restrictions, in compliance with the necessary hygiene and safety regulations.\nHeimtextil postponed to 04.05. - 07.05.2021\nAutomechanika postponed to 14.09. - 18.09.2021\nLight + Building cancelled, next Light + Building 13.03. - 18.03.2022\nOptatech postponed to 17.05. - 19.05.2022\nTexcare postponed to 27.11. - 01.12.2021\nAchema postponed to 04.04. - 08.04.2022\nMeetings and events with personal participation are only permitted in the case of special public interest and with the approval of the competent authority. \nThe number of participants in attendance must be kept as low as possible and, in order to comply with the hygiene rules and the minimum distance, must be based, among other things, on the type and size of the venue. Wherever possible, telephone or video conferencing shall be used.");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 668 */     JOptionPane.showMessageDialog(null, "When you are well\n1. Wash your hands often with soap and water. This includes before and after eating and after going to the toilet\n2. Use alcohol-based hand sanitisers when you can’t use soap and water\n3. Avoid touching your eyes, nose and mouth clean and disinfect surfaces and objects you use often\n4. Increase the amount of fresh air by opening windows or changing air conditioning\n5. There is no evidence that alcohol-free hand rubs are effective against viruses like COVID-19.\n\nWhen you are sick\n1. As we move towards living COVIDSafe, it is important that you stay at home if you feel unwell. You should also continue to practise good hygiene.\n2. If you have cold or flu like symptoms you should seek medical advice and get tested for COVID-19. You should get tested even if your symptoms are mild.\n3. If you have COVID-19 you must isolate and follow the directions of your local Public Health Unit.");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUserName(String id) {
/* 685 */     this.usr = id;
/*     */   }
/*     */   
/*     */   public String getUserName() {
/* 689 */     return this.usr;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NewJFrame() {
/* 725 */     this.limit1 = 0;
/*     */     initComponents();
/*     */     CreateFile.newFile();
/*     */     try {
/*     */       FileWriter fileWriter = new FileWriter("filename.txt");
/*     */       try {
/*     */         String filecontent = "0";
/*     */         fileWriter.write(filecontent);
/*     */         fileWriter.close();
/*     */         fileWriter.close();
/*     */       } catch (Throwable throwable) {
/*     */         try {
/*     */           fileWriter.close();
/*     */         } catch (Throwable throwable1) {
/*     */           throwable.addSuppressed(throwable1);
/*     */         } 
/*     */         throw throwable;
/*     */       } 
/*     */     } catch (IOException iOException) {}
/*     */   }
/*     */ }


/* Location:              D:\output3\dist\SCS3.jar!\folder\NewJFrame.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */