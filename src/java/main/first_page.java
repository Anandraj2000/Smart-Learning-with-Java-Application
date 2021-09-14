package main;


import file_data.Quiz_file;
import file_data.Reader_file;
import main.Home_page;
import file_data.sample;
import java.io.*;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

public class first_page extends javax.swing.JFrame {
    
    public static String name1 = "ANand";
    public static int noq = 0;
    public static Dictionary set = new Hashtable();
    public static Dictionary set1 = new Hashtable();
    public static String[] key;
    //public String[] key1 = new String[noq];
    
    
    /**
     * Creates new form first_page
     */
    public first_page() {
        initComponents();
    }
    public void run()
    {
        try{
        noq = Integer.parseInt(NOQ1.getText());
        }catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        //System.out.println(noq);
        /*String[] subs = ta.getText().split("Answer Key");
        ques_area.setText(subs[0]);
        ans_area.setText(subs[1]);*/
        String ans_area1 = ans_area.getText().replaceAll("[\r\n]+", " ");
        //String ans_area1 = ans_area.getText();
        //String ques_area1 = ques_area.getText().replaceAll("[\r\n]+", " ");
        String ques_area1 = ques_area.getText();
        //String ans_area1 = " Que. 1 Correct Option - 4 Que. 2 Correct Option - 1 Que. 3 Correct Option - 2 Que. 4 Correct Option - 1 Que. 5 Correct Option - 1 Que. 6 Correct Option - 3 Que. 7 Correct Option - 3 Que. 8 Correct Option - 1 Que. 9 Correct Option - 2 Que. 10 Correct Option - 1";
        //System.out.println("Answer key:"+ques_area1);
        //System.out.println("Answer key:"+ans_area1);
        key = new String[noq];
	String[] value = new String[noq];
        int index = 0;
        int index1 = 0;
        String[] keyword_sample = {"Question.","Que.","Q."," Question."," Que."," Q."};
        String keyword = "";
        int len = keyword_sample.length;
	for(int i=0;i<len;i++)
	{
            String search_key = keyword_sample[i]+"{"+noq+",}";//we can do {noq} instead of {noq,}
            boolean val_key = Pattern.matches(search_key, ans_area1);//use to find keyword
            System.out.println("keyword="+search_key+"val_key"+val_key);
            if(val_key)
            {
                keyword = keyword_sample[i];
                break;
            }
	}
        String pat = keyword+"\\s\\d*";
        //String pat ="Que.\\s\\d*";
	Pattern pattern = Pattern.compile(pat);
	Matcher matcher = pattern.matcher(ans_area1);
	boolean found = false;    
        while (matcher.find()) { 
            key[index] = matcher.group();

                //System.out.println("I found the text "+key[index]);    
            found = true;   
            index++;
        }  
        //System.out.println("I found the text "+key); 
        if(!found){    
            System.out.println("No match found.");    
        } 
        value = ans_area1.split(pat+"\\D*");
	boolean found1 = false;    
        for(String temp:value)
	{
            //System.out.println(temp);
            found1 = true; 
        }    
        if(!found1){    
            System.out.println("No match found.");    
        } 

            //form dictionary
        
        for(int i=0;i<noq;i++)
        {
            set.put(key[i],value[i+1]);
        }
        //dict_key.setText("dict:"+set);
        
        
        
        //Question ka 
        
	//String[] value1 = new String[noq];
        String[] key1 = new String[noq];
        Matcher matcher1 = pattern.matcher(ques_area1);
	boolean found2 = false;    
        while (matcher1.find()) 
        { 
            key1[index1] = matcher1.group();

            //System.out.println("I found the text "+key[index1]);    
            found2 = true;  
            //System.out.println("index: "+index1);
            index1++;
        }    
        if(!found2)
        {    
            System.out.println("No match found.");    
        } 
        //System.out.println("index: "+index1);
        //System.out.println("I found the text "+key[10]);
        String[] value1 = ques_area1.split(pat);
        boolean found4 = false;    
        for(String temp1:value1)
	{
            //System.out.println(temp1);
            found4 = true; 
	}    
        if(!found4)
        {    
            System.out.println("No match found.");    
        } 

            //form dictionary
        
        for(int i=0;i<noq;i++)
        {
            set1.put(key1[i],value1[i+1]);
        }
        //dict_key.setText(dict_key.getText()+"\ndict:"+set1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NOQ1 = new javax.swing.JTextField();
        ansType = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ques_area = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ans_area = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("INFORMATION OF WORD FILE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("NUMBER OF QUESTION");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("FORMATE OF ANSWER");

        ansType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ansType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ANSWER AT END OF ALL QUESTION", "ANSWER AT END OF EVERY QUESTION ", "ANSWER IN BOLD FORMATE", " " }));
        ansType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansTypeActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("READING MODE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(51, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("UPLOAD WORD FILE");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("UPLOAD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        ques_area.setColumns(20);
        ques_area.setRows(5);
        jScrollPane2.setViewportView(ques_area);

        ans_area.setColumns(20);
        ans_area.setRows(5);
        jScrollPane3.setViewportView(ans_area);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Question");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Answer");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Uplaoded file");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("SPLIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("TEST_MODE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(ansType, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(NOQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addGap(60, 60, 60)
                                .addComponent(jButton6)
                                .addGap(78, 78, 78))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel5)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel6)
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ansType, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ansTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ansTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //String temp = ta.getText();
        
        run();
        setVisible(false);
        new Reader_file().setVisible(true);
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

                /*JFileChooser fc=new JFileChooser(); 
                int i=fc.showOpenDialog(this); 
                String filepath = "";
                //System.out.println("i= "+i);
                if(i==JFileChooser.APPROVE_OPTION)
                { 
                    File f=fc.getSelectedFile(); 
                    filepath = f.getPath();    
                }
                else if(i==JFileChooser.CANCEL_OPTION)
                {
                    //System.out.println("i= "+i);
                    JOptionPane.showMessageDialog(this,"Cancel");
                }
                else
                {
                    System.out.println("nothing");
                }*/
                FileReader in = null; 
		FileWriter out = null;
		try {
		//in = new FileReader(filepath);
                in = new FileReader("D:\\ANAND\\TYCS\\project\\output.txt");
		//out = new FileWriter("D:\\ANAND\\TYCS\\project\\output.txt");
		int c;
                char ch;
                String t;
		while ((c = in.read()) != -1) 
		{ 
			ch = ((char)c);
                        ta.setText(ta.getText()+Character.toString(ch));
		}
                //ta.setText((String)ch));
		} catch (FileNotFoundException ex) {
            Logger.getLogger(first_page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(first_page.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
			if (in != null) 
			{
                            try {
                                in.close();
                            } catch (IOException ex) {
                                Logger.getLogger(first_page.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			if (out != null)
			{ 
                            try {
                                out.close();
                            } catch (IOException ex) {
                                Logger.getLogger(first_page.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
		}        
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int noq = 0;
        try{
        noq = Integer.parseInt(NOQ1.getText());
        }catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        //System.out.println(noq);
        String[] subs = ta.getText().split("Answer Key");
        ques_area.setText(subs[0]);
        ans_area.setText(subs[1]);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home_page().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        run();
        setVisible(false);
        new Quiz_file().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(first_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(first_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(first_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(first_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new first_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NOQ1;
    private javax.swing.JComboBox<String> ansType;
    private javax.swing.JTextArea ans_area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea ques_area;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
