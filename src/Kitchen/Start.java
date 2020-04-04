package Kitchen;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmed
 */
public class Start extends JFrame {

    restaurantAgent DATA;
    
    
    public Start(restaurantAgent DATA) {
        
        this.DATA=DATA;
        initComponents();
        buttonGroup1.add(CustomerChoice);
        buttonGroup1.add(EmployeeChoice);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LoginPanel = new javax.swing.JPanel();
        RestaurantWelcome = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        PassWordLabel = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        CustomerChoice = new javax.swing.JRadioButton();
        EmployeeChoice = new javax.swing.JRadioButton();
        PasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LoginPanel.setBackground(new java.awt.Color(102, 0, 51));

        RestaurantWelcome.setFont(new java.awt.Font("Urdu Typesetting", 1, 36)); // NOI18N
        RestaurantWelcome.setForeground(new java.awt.Color(255, 255, 255));
        RestaurantWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RestaurantWelcome.setText("Welcome To My Restaurant");

        UserNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserNameLabel.setText("Username :");

        PassWordLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PassWordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PassWordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassWordLabel.setText("Password :");

        UsernameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UsernameField.setForeground(new java.awt.Color(102, 0, 51));

        LoginButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(102, 0, 51));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        CustomerChoice.setBackground(new java.awt.Color(102, 0, 51));
        CustomerChoice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CustomerChoice.setForeground(new java.awt.Color(255, 255, 255));
        CustomerChoice.setText("Customer");

        EmployeeChoice.setBackground(new java.awt.Color(102, 0, 51));
        EmployeeChoice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EmployeeChoice.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeChoice.setText("Employee");

        PasswordField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("*****");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("*****");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PassWordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UserNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LoginPanelLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(CustomerChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(EmployeeChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RestaurantWelcome)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RestaurantWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(63, 63, 63)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        Object queryResponse=DATA.userLogin(UsernameField.getText(), PasswordField.getText(),CustomerChoice.isSelected() , EmployeeChoice.isSelected());
        if(queryResponse instanceof String){
            JOptionPane.showMessageDialog(null, queryResponse);
        }
        else{
            if(queryResponse instanceof Manager){
                JFrame managerDashboard = new ManagerDashBoard((Manager) queryResponse , DATA);
                managerDashboard.setVisible(true);
                this.dispose();
            }
            else if(queryResponse instanceof Cooker){
                JFrame cookerDashboard = new CookerDashBoard((Cooker) queryResponse , DATA);
                cookerDashboard.setVisible(true);
                this.dispose();
            }
            else if(queryResponse instanceof Waiter){
                JFrame waiterDashboard = new WaiterDashBoard((Waiter) queryResponse , DATA);
                waiterDashboard.setVisible(true);
                this.dispose();
            }
            else if(queryResponse instanceof Customer){
                JFrame customerDashboard = new CustomerDashboard((Customer) queryResponse , DATA);
                customerDashboard.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR!");                
            }
        }   
    }//GEN-LAST:event_LoginButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CustomerChoice;
    private javax.swing.JRadioButton EmployeeChoice;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel PassWordLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel RestaurantWelcome;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UsernameField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
