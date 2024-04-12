/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
*/

/**
 *
 * @author rhed
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;


public class MainMenu extends javax.swing.JFrame {
    
    
    public MainMenu() {
        initComponents();
        loadDataFromFile();
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Time = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        GenerateReservation = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Enter = new javax.swing.JButton();
        NumAdults = new com.toedter.components.JSpinField();
        NumChildren = new com.toedter.components.JSpinField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Date", "Time", "Name", "Adults", "Children"
            }
        ));
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Date");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Time");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("No of Children");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("No of Adults");

        Delete.setText("Delete Reservation");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        GenerateReservation.setText("Generate Reservation");
        GenerateReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReservationActionPerformed(evt);
            }
        });

        Clear.setText("Clear Data");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Enter.setText("Add Reservation");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ADMIN VIEW");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GenerateReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NumAdults, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(33, 33, 33)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(NumChildren, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(Name)
                                .addComponent(Time)
                                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Enter)
                                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Delete)
                                    .addComponent(GenerateReservation)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumAdults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(Enter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Clear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Exit Button for Admin Main menu page
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        saveDataToFile();
        JOptionPane.showMessageDialog(null, "Neil Ardrey P. Laza, ITE - 232");
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked
    
    //Add Reservation Button. Validation for each info
    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        Calendar minDate = Calendar.getInstance();
        minDate.set(2024, Calendar.MARCH, 7);
        
        Calendar maxDate = Calendar.getInstance();
        maxDate.set(2025, Calendar.DECEMBER, 31);
        
        
        try {
            Date selectedDate = Date.getDate();
            
            if (selectedDate == null || Time.getText().isEmpty() || Name.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill out all of the required information.");
            } else if (!Name.getText().matches("^[a-zA-Z\\s]+$")) {
                JOptionPane.showMessageDialog(null, "Cannot Input Numbers in Name");
            } else if ((int) NumChildren.getValue() < 0) {
                JOptionPane.showMessageDialog(null, "Cannot Input Negative Value on Children");
            }else if((int) NumAdults.getValue() < 1){
                JOptionPane.showMessageDialog(null, " Must have at least 1 Adult in reservation");
            } else if (!Time.getText().matches("^(7:[0-5][0-9] AM|8:[0-5][0-9] AM|9:[0-5][0-9] AM|10:[0-5][0-9] AM|11:[0-5][0-9] AM|12:[0-5][0-9] PM|1:[0-5][0-9] PM|2:[0-5][0-9] PM|3:[0-5][0-9] PM|4:[0-5][0-9] PM|5:[0-5][0-9] PM|6:[0-5][0-9] PM|7:[0-5][0-9] PM)$")) {
                JOptionPane.showMessageDialog(null, "Only accepting 7:00 AM until to 7:00 PM. Please follow the format");
            } else {
                
                int Capacity = 50;
                int TotalPax = (int) NumAdults.getValue() + (int) NumChildren.getValue();
                
                if (TotalPax > Capacity) {
                    JOptionPane.showMessageDialog(null, "Max Capacity reached. Restaurant can only accommodate 50 pax");
                } else {
                    int remainingCapacity = Capacity - TotalPax;
                    if (remainingCapacity < 0) {
                        JOptionPane.showMessageDialog(null, "Not enough capacity for this reservation. Restaurant can only accommodate 50 pax");
                    } else {
                        Capacity = remainingCapacity;
                    }
                    
                    Calendar selectedCalendar = Calendar.getInstance();
                    selectedCalendar.setTime(selectedDate);
                    
                    if (selectedCalendar.before(minDate) || selectedCalendar.after(maxDate)) {
                        JOptionPane.showMessageDialog(null, "Please choose a date within the allowed range");
                    } else {
                        Vector<Object> rowData = new Vector<>();
                        rowData.add(Table.getRowCount() + 1);
                        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
                        String formattedDate = sdf.format(selectedDate);
                        rowData.add(formattedDate);
                        rowData.add(Time.getText());
                        rowData.add(Name.getText());
                        rowData.add(NumAdults.getValue());
                        rowData.add(NumChildren.getValue());
                        
                        DefaultTableModel newTable = (DefaultTableModel) Table.getModel();
                        ;
                        newTable.addRow(rowData);
                        
                        Date.setDate(null);
                        Time.setText("");
                        Name.setText("");
                        NumAdults.setValue(0);
                        NumChildren.setValue(0);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
        
        
    }//GEN-LAST:event_EnterActionPerformed
    public double calculateSubtotal(int adults, int children) {
        
        double adultPrice = 500.0;
        double childPrice = 300.0;
        
        double subtotal = (adults * adultPrice) + (children * childPrice);
        return subtotal;
    }
    
    //Generate Reservation Button
    private void GenerateReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReservationActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            int totalAdults = 0;
            int totalChildren = 0;
            double grandTotal = 0.0;
            
            
            JDialog dialog = new JDialog(this, "Reservation Report", true);
            dialog.setLayout(new BorderLayout());
            
            JTable reportTable = new JTable();
            DefaultTableModel reportModel = new DefaultTableModel();
            reportModel.setColumnIdentifiers(new String[]{"#", "Date", "Time", "Name", "Adults", "Children", "Subtotal"});
            reportTable.setModel(reportModel);
            
            
            for (int i = 0; i < model.getRowCount(); i++) {
                Vector<Object> rowData = new Vector<>();
                rowData.add(model.getValueAt(i, 0));
                Object dateObject = model.getValueAt(i, 1);
                if (dateObject instanceof Date) {
                    // Format date using SimpleDateFormat
                    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
                    String formattedDate = sdf.format((Date) dateObject);
                    rowData.add(formattedDate); // Add formatted date to rowData
                } else {
                    rowData.add(dateObject != null ? dateObject.toString() : ""); // Handle non-Date objects
                }
                rowData.add(model.getValueAt(i, 2));
                rowData.add(model.getValueAt(i, 3));
                int adults = Integer.parseInt(model.getValueAt(i, 4).toString());
                int children = Integer.parseInt(model.getValueAt(i, 5).toString());
                double subtotal = calculateSubtotal(adults, children);
                rowData.add(adults);
                rowData.add(children);
                rowData.add(subtotal);
                
                totalAdults += adults;
                totalChildren += children;
                grandTotal += subtotal;
                
                reportModel.addRow(rowData);
            }
            
            JScrollPane scrollPane = new JScrollPane(reportTable);
            dialog.add(scrollPane, BorderLayout.CENTER);
            
            JLabel totalLabel = new JLabel("<html><b>Total Number of Adults:</b> " + totalAdults + "<br><b>Total Number of Kids:</b> " + totalChildren + "<br><b>Grand Total:</b> " + grandTotal + "</html>");
            dialog.add(totalLabel, BorderLayout.SOUTH);
            
            dialog.getContentPane().setPreferredSize(new Dimension(900, 510));
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_GenerateReservationActionPerformed
    //Clear Button. Used to clear txt fields etc
    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        
        Date.setDate(null);
        Time.setText("");
        Name.setText("");
        NumAdults.setValue(0);
        NumChildren.setValue(0);
    }//GEN-LAST:event_ClearActionPerformed
    //Delete Reservation Button
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        
        
        DefaultTableModel DeleteTable = (DefaultTableModel) Table.getModel();
        
        if (Table.getSelectedRowCount() == 1) {
            int selectedRow = Table.getSelectedRow();
            
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to Delete", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                
                JOptionPane.showMessageDialog(null, "Succesfully Delete.");
                DeleteTable.removeRow(selectedRow);
            } else if (choice == JOptionPane.NO_OPTION) {
                
                JOptionPane.showMessageDialog(null, "Changes not saved.");
            }
            
            
            
            
            for (int i = selectedRow; i < DeleteTable.getRowCount(); i++) {
                DeleteTable.setValueAt(i + 1, i, 0);
            }
            
        }else{
            if (Table.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty");
            }else{
                JOptionPane.showMessageDialog(null, "Select a row to delete");
            }
        }
        
    }//GEN-LAST:event_DeleteActionPerformed
    
    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed
    //Saving the contents of jtable
    private void saveDataToFile() {
        try {
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            FileWriter writer = new FileWriter("table_data.txt");
            
            
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    writer.write(model.getValueAt(i, j).toString());
                    if (j < model.getColumnCount() - 1) {
                        writer.write("\t");
                    }
                }
                writer.write(System.lineSeparator());
            }
            
            writer.close();
            JOptionPane.showMessageDialog(this, "Data saved successfully.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving data: " + e.getMessage());
        }
    }
    //Loading the contents of jtable from the saved file so it may be visible in another run of the program
    private void loadDataFromFile() {
        try {
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            BufferedReader reader = new BufferedReader(new FileReader("table_data.txt"));
            String line;
            
            model.setRowCount(0);
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                model.addRow(parts);
            }
            
            reader.close();
            JOptionPane.showMessageDialog(this, "Data loaded successfully.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
        }
    }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    public static com.toedter.calendar.JDateChooser Date;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Enter;
    private javax.swing.JButton GenerateReservation;
    public static javax.swing.JTextField Name;
    public static com.toedter.components.JSpinField NumAdults;
    public static com.toedter.components.JSpinField NumChildren;
    private javax.swing.JTable Table;
    public static javax.swing.JTextField Time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
