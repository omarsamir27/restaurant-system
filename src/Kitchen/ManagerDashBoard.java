/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kitchen;


import java.util.ArrayList;
import java.util.HashMap;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class ManagerDashBoard extends JFrame {
        Manager manager;
        restaurantAgent DATA;
        DefaultListModel<String> listModel;
        DefaultListModel<String> userModel;
        HashMap<String, Table> tableListMap;
        HashMap<String,User> userListMap;
        ArrayList<User> peopleList;
        User user;
                Dishes dishes = new Dishes();
        Dish dish = new Dish();
        ArrayList<Dish> dishlist = new ArrayList<>();
        HashMap<String,Dish> dishMap;
        DefaultListModel<String> dishModel = new DefaultListModel<>();
    
    public ManagerDashBoard(Manager manager , restaurantAgent DATA) {
        this.manager=manager;
        this.DATA=DATA; 
        
        user=new User();
        listModel=new DefaultListModel<>();
        userModel=new DefaultListModel<>();
        tableListMap=new HashMap<>();
        userListMap=new HashMap<>();
        peopleList=new ArrayList<>();
        peopleList=DATA.getUsers().getPeople();
        DATA.getTables().getTables().forEach((var table) -> {
            listModel.addElement("Table".concat(String.valueOf(table.getTableNum())));
            });
        for(int i =0;i<listModel.size();++i){
            tableListMap.put(listModel.get(i), DATA.getTables().getTables().get(i));
        }
        DATA.getUsers().getPeople().forEach((var person)->{
            userModel.addElement(person.getName());            
        });
        for(int i =0;i<userModel.size();++i){
            userListMap.put(userModel.get(i),peopleList.get(i));            
        }
         
        initComponents();
          this.dishlist=DATA.getDishes().getDishes();
        for(Dish dishHere : DATA.getDishes().getDishes())
            dishModel.addElement(dishHere.getDishName());
        this.dishMap = new HashMap<>();
        for(int i=0;i<dishModel.size();i++)
            dishMap.put(dishModel.get(i), DATA.getDishes().getDishes().get(i));
        MyDishesList.setModel(dishModel); 
        
        discountSlider.setVisible(false);
        sliderValue.setVisible(false);
        discount.setVisible(false);
        UserField.setVisible(false);
        NameLabel.setVisible(false);
     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editUserDetails = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        accountName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        roleBox = new javax.swing.JComboBox<>();
        userChangeDiscard = new javax.swing.JButton();
        userChangeConfirm = new javax.swing.JButton();
        discountSlider = new javax.swing.JSlider();
        sliderValue = new javax.swing.JLabel();
        discount = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        UserField = new javax.swing.JTextField();
        AddDish = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Confirmbtn = new javax.swing.JButton();
        Discardbtn = new javax.swing.JButton();
        DishNameField = new javax.swing.JTextField();
        DishTypeBox = new javax.swing.JComboBox<>();
        DishPriceField = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        userDetailsArea = new javax.swing.JTextArea();
        removeUser = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        editAccountBtn = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JList<>();
        StatBox = new javax.swing.JTextArea();
        showStats = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        MyDishesList = new javax.swing.JList<>();
        AddDishbtn = new javax.swing.JButton();
        Removebtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Confirmbtn2 = new javax.swing.JButton();
        Back2 = new javax.swing.JButton();

        editUserDetails.setMinimumSize(new java.awt.Dimension(470, 520));
        editUserDetails.setResizable(false);
        editUserDetails.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                editUserDetailsWindowClosed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 0, 51));
        jPanel4.setMaximumSize(new java.awt.Dimension(470, 520));
        jPanel4.setMinimumSize(new java.awt.Dimension(470, 520));
        jPanel4.setPreferredSize(new java.awt.Dimension(470, 520));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        accountName.setForeground(new java.awt.Color(255, 255, 255));
        accountName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountName.setText("Account Name");
        jPanel4.add(accountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 210, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Role:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 70, 40));

        userNameField.setMaximumSize(new java.awt.Dimension(80, 32));
        jPanel4.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 160, 40));

        passwordField.setMaximumSize(new java.awt.Dimension(80, 32));
        jPanel4.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 160, 40));

        roleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Cook", "Waiter", "Client" }));
        roleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleBoxActionPerformed(evt);
            }
        });
        jPanel4.add(roleBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 160, 40));

        userChangeDiscard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userChangeDiscard.setForeground(new java.awt.Color(102, 0, 51));
        userChangeDiscard.setText("Discard");
        userChangeDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userChangeDiscardActionPerformed(evt);
            }
        });
        jPanel4.add(userChangeDiscard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 120, 60));

        userChangeConfirm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userChangeConfirm.setForeground(new java.awt.Color(102, 0, 51));
        userChangeConfirm.setText("Confirm");
        userChangeConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userChangeConfirmActionPerformed(evt);
            }
        });
        jPanel4.add(userChangeConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 120, 60));

        discountSlider.setBackground(new java.awt.Color(102, 0, 51));
        discountSlider.setPaintLabels(true);
        discountSlider.setToolTipText("");
        discountSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                discountSliderStateChanged(evt);
            }
        });
        jPanel4.add(discountSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 215, -1));

        sliderValue.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(sliderValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 60, 40));

        discount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        discount.setForeground(new java.awt.Color(255, 255, 255));
        discount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        discount.setText("Discount");
        jPanel4.add(discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 100, 30));

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Name:");
        jPanel4.add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 71, 80, 40));

        UserField.setMaximumSize(new java.awt.Dimension(80, 32));
        jPanel4.add(UserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 160, 40));

        javax.swing.GroupLayout editUserDetailsLayout = new javax.swing.GroupLayout(editUserDetails.getContentPane());
        editUserDetails.getContentPane().setLayout(editUserDetailsLayout);
        editUserDetailsLayout.setHorizontalGroup(
            editUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editUserDetailsLayout.setVerticalGroup(
            editUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AddDish.setBackground(new java.awt.Color(102, 0, 51));
        AddDish.setMinimumSize(new java.awt.Dimension(554, 422));
        AddDish.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                AddDishWindowClosing(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Dish Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Enter Dish Type");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Enter Dish Price");

        Confirmbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Confirmbtn.setForeground(new java.awt.Color(102, 0, 51));
        Confirmbtn.setText("Confirm");
        Confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmbtnActionPerformed(evt);
            }
        });

        Discardbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Discardbtn.setForeground(new java.awt.Color(102, 0, 51));
        Discardbtn.setText("Discard");
        Discardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscardbtnActionPerformed(evt);
            }
        });

        DishNameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DishNameField.setForeground(new java.awt.Color(102, 0, 51));
        DishNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DishNameFieldActionPerformed(evt);
            }
        });

        DishTypeBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DishTypeBox.setForeground(new java.awt.Color(102, 0, 51));
        DishTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main Course", "Appetizer", "Desert" }));

        DishPriceField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DishPriceField.setForeground(new java.awt.Color(102, 0, 51));
        DishPriceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(Discardbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DishNameField)
                            .addComponent(DishTypeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DishPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DishNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DishTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DishPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Discardbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout AddDishLayout = new javax.swing.GroupLayout(AddDish.getContentPane());
        AddDish.getContentPane().setLayout(AddDishLayout);
        AddDishLayout.setHorizontalGroup(
            AddDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AddDishLayout.setVerticalGroup(
            AddDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setForeground(new java.awt.Color(102, 0, 51));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));
        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel2FocusGained(evt);
            }
        });
        jPanel2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel2PropertyChange(evt);
            }
        });

        userList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userList.setForeground(new java.awt.Color(102, 0, 51));
        userList.setModel(userModel);
        userList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                userListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(userList);

        userDetailsArea.setEditable(false);
        userDetailsArea.setColumns(20);
        userDetailsArea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userDetailsArea.setForeground(new java.awt.Color(102, 0, 51));
        userDetailsArea.setLineWrap(true);
        userDetailsArea.setRows(5);
        jScrollPane3.setViewportView(userDetailsArea);

        removeUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeUser.setForeground(new java.awt.Color(102, 0, 51));
        removeUser.setText("Remove Account");
        removeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserActionPerformed(evt);
            }
        });

        addUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addUser.setForeground(new java.awt.Color(102, 0, 51));
        addUser.setText("Add Account");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        editAccountBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editAccountBtn.setForeground(new java.awt.Color(102, 0, 51));
        editAccountBtn.setText("Edit Account Info");
        editAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAccountBtnActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(102, 0, 51));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(removeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(editAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Users", jPanel2);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        tableList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tableList.setForeground(new java.awt.Color(102, 0, 51));
        tableList.setModel(listModel);
        tableList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                tableListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tableList);

        StatBox.setEditable(false);
        StatBox.setColumns(20);
        StatBox.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        StatBox.setForeground(new java.awt.Color(102, 0, 51));
        StatBox.setRows(5);

        showStats.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showStats.setForeground(new java.awt.Color(102, 0, 51));
        showStats.setText("Show Stats");
        showStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStatsActionPerformed(evt);
            }
        });

        Back1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Back1.setForeground(new java.awt.Color(102, 0, 51));
        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showStats)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(StatBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showStats, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(StatBox, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Stats", jPanel1);

        jPanel3.setBackground(new java.awt.Color(102, 0, 51));

        MyDishesList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MyDishesList.setForeground(new java.awt.Color(102, 0, 51));
        jScrollPane4.setViewportView(MyDishesList);

        AddDishbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AddDishbtn.setForeground(new java.awt.Color(102, 0, 51));
        AddDishbtn.setText("Add A New Dish");
        AddDishbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDishbtnActionPerformed(evt);
            }
        });

        Removebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Removebtn.setForeground(new java.awt.Color(102, 0, 51));
        Removebtn.setText("Remove Dish");
        Removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovebtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("My Dishes");

        Confirmbtn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Confirmbtn2.setForeground(new java.awt.Color(102, 0, 51));
        Confirmbtn2.setText("Confirm");
        Confirmbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirmbtn2ActionPerformed(evt);
            }
        });

        Back2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Back2.setForeground(new java.awt.Color(102, 0, 51));
        Back2.setText("Back");
        Back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(Removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 116, Short.MAX_VALUE)
                .addComponent(Confirmbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(AddDishbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Confirmbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddDishbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Cuisine", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_tableListValueChanged
        StatBox.setText("");
        try{
        StatBox.setText("Customer Name : "+tableListMap.get(tableList.getSelectedValue()).getOrder().getCustomerName()+"\n"+"Order:");
        for(Dish dish:tableListMap.get(tableList.getSelectedValue()).getOrder().getDishes()){
            StatBox.setText(StatBox.getText()+"\n"+dish.getDishName());
        }   
            StatBox.setText(StatBox.getText()+"\n"+"Order Total: "+tableListMap.get(tableList.getSelectedValue()).getOrder().getPriceWithoutTax()+"\n"+"Order Gross Total:  "+
                    tableListMap.get(tableList.getSelectedValue()).getOrder().getOrderPrice());
        }
        catch (Exception ex) {
            StatBox.setText("Unreserved Table");
        }
               
    }//GEN-LAST:event_tableListValueChanged

    private void showStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStatsActionPerformed
        int reservedTables = 0;
        int numberofOrders=0;
        double revenue=DATA.getRevenue();
        try {
             numberofOrders=DATA.getOrders().getOrders().size();
             
        } catch (Exception e) {
            numberofOrders=0;
        }       
        
        for(Table table : DATA.getTables().getTables()){
            if(!table.isAvailable())
                reservedTables++;
        }
        StatBox.setText(reservedTables+" Tables are reserved today\n"+"Number of Orders: "+numberofOrders+"\n"+"Total Revenue:"+revenue);
    }//GEN-LAST:event_showStatsActionPerformed

    private void editAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAccountBtnActionPerformed
        this.setEnabled(false);
        accountName.setText(userListMap.get(userList.getSelectedValue()).getName());
        editUserDetails.setLocationRelativeTo(null);
        editUserDetails.setVisible(true);
    }//GEN-LAST:event_editAccountBtnActionPerformed

    private void userListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_userListValueChanged
  
                
            user.setName(userListMap.get(userList.getSelectedValue()).getName());
             user.setPassword(userListMap.get(userList.getSelectedValue()).getPassword());
             user.setUsername(userListMap.get(userList.getSelectedValue()).getUsername());
             user.setRole(userListMap.get(userList.getSelectedValue()).getRole());
             if(userListMap.get(userList.getSelectedValue()).getRole().equals("Client")){
                              }
        
            userDetailsArea.setText("Name:  "+ user.getName()+"\n"
                                   +"Username:  "+user.getUsername()+"\n"
                                   +"Password:  "+user.getPassword()+"\n"
                                   +"Role:    "+user.getRole());
            if(userListMap.get(userList.getSelectedValue()).getRole().equals("Client")){
                userDetailsArea.setText(userDetailsArea.getText()+"\n"+"Discount: "+ ((Customer)userListMap.get(userList.getSelectedValue())).getDiscount() );
                              }
            
    }//GEN-LAST:event_userListValueChanged

    private void userChangeConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userChangeConfirmActionPerformed
        if(!(accountName.getText().equals("Add User"))){
        peopleList.removeIf((person)->person.getName().equals(accountName.getText()));}        
        switch(roleBox.getSelectedItem().toString()){
            case "Manager":
                Manager manageradd= new Manager();
                if(!(accountName.getText().equals("Add User"))){
                    manageradd.setName(accountName.getText());
                }
                else{
                    manageradd.setName(UserField.getText());
                }
                manageradd.setPassword(passwordField.getText());
                manageradd.setUsername(userNameField.getText());
                manageradd.setRole("Manager");
                peopleList.add(manageradd);
                break;
            case "Cook":
                Cooker cookeradd = new Cooker();
                if(!(accountName.getText().equals("Add User"))){
                    cookeradd.setName(accountName.getText());
                }
                else{
                    cookeradd.setName(UserField.getText());
                }
                cookeradd.setPassword(passwordField.getText());
                cookeradd.setUsername(userNameField.getText());
                cookeradd.setRole("Cooker");
                peopleList.add(cookeradd);
                break;
            case "Waiter":
                Waiter waiteradd = new Waiter();
                if(!(accountName.getText().equals("Add User"))){
                    waiteradd.setName(accountName.getText());
                }
                else{
                    waiteradd.setName(UserField.getText());
                }
                waiteradd.setPassword(passwordField.getText());
                waiteradd.setUsername(userNameField.getText());
                waiteradd.setRole("Waiter");
                peopleList.add(waiteradd);
                break;
            case "Client":
                Customer customeradd = new Customer();
                if(!(accountName.getText().equals("Add User"))){
                    customeradd.setName(accountName.getText());
                }
                else{
                    customeradd.setName(UserField.getText());
                }
                customeradd.setPassword(passwordField.getText());
                customeradd.setUsername(userNameField.getText());
                customeradd.setRole("Client");
                if(discountSlider.getValue()>0){
                 customeradd.setPremium(true);
                customeradd.setDiscount(discountSlider.getValue());
                }               
                peopleList.add(customeradd);
                break;
            default:
            JOptionPane.showMessageDialog(null,"Please Choose Role");

        }
        Human humanXML=new Human();
        humanXML.setPeople(peopleList);
        DATA.setUsers(humanXML);
        try {
            DATA.writeData(Boot.jarParent);
        } catch (Exception ex) {
            Logger.getLogger(ManagerDashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.setEnabled(true);
        editUserDetails.dispose();
        this.setVisible(false);
        JFrame reboot= new ManagerDashBoard(this.manager, DATA);
        reboot.setVisible(true);
        
        this.dispose();

    }//GEN-LAST:event_userChangeConfirmActionPerformed

    private void userChangeDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userChangeDiscardActionPerformed
        this.setEnabled(true);
        editUserDetails.dispose();
    }//GEN-LAST:event_userChangeDiscardActionPerformed

    private void jPanel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusGained
            userList.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel2FocusGained

    private void jPanel2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel2PropertyChange
            userList.setSelectedIndex(0);

    }//GEN-LAST:event_jPanel2PropertyChange

    private void editUserDetailsWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_editUserDetailsWindowClosed


    }//GEN-LAST:event_editUserDetailsWindowClosed

    private void roleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleBoxActionPerformed
        if(roleBox.getSelectedIndex()==3){
           discountSlider.setVisible(true);
            sliderValue.setVisible(true);
            discount.setVisible(true);}
        else{
            
            discountSlider.setVisible(false);
            sliderValue.setVisible(false);
            discount.setVisible(false);
        }
    }//GEN-LAST:event_roleBoxActionPerformed

    private void discountSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_discountSliderStateChanged
                sliderValue.setText(String.valueOf(discountSlider.getValue()));
    }//GEN-LAST:event_discountSliderStateChanged

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        editUserDetails.setLocationRelativeTo(this);
        editUserDetails.setVisible(true);
        UserField.setVisible(true);
        NameLabel.setVisible(true);
        accountName.setText("Add User");
    }//GEN-LAST:event_addUserActionPerformed

    private void removeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserActionPerformed
        peopleList.removeIf((toremove)->toremove.getName().equals(userListMap.get(userList.getSelectedValue()).getName()));
        Human humanXML=new Human();
        humanXML.setPeople(peopleList);
        DATA.setUsers(humanXML);
        try {
            DATA.writeData(Boot.jarParent);
        } catch (Exception ex) {
            Logger.getLogger(ManagerDashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }      
        this.setVisible(false);
        JFrame reboot= new ManagerDashBoard(this.manager, DATA);
        reboot.setVisible(true);        
        this.dispose();
    }//GEN-LAST:event_removeUserActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        JFrame loginPage = new Start(DATA);
        this.dispose();
        loginPage.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        JFrame loginPage = new Start(DATA);
        this.dispose();
        loginPage.setVisible(true);
    }//GEN-LAST:event_Back1ActionPerformed

    private void AddDishbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDishbtnActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        AddDish.setLocationRelativeTo(this);
        AddDish.setVisible(true);
    }//GEN-LAST:event_AddDishbtnActionPerformed

    private void RemovebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovebtnActionPerformed
        // TODO add your handling code here:
        dish = dishMap.get(MyDishesList.getSelectedValue());
        dishlist.removeIf((var) -> var.getDishName() == dish.getDishName());
        dishModel.removeElementAt(MyDishesList.getSelectedIndex());
    }//GEN-LAST:event_RemovebtnActionPerformed

    private void Confirmbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirmbtn2ActionPerformed
        // TODO add your handling code here:
        dishes.setDishes(dishlist);
        DATA.setDishes(dishes);
        try {
            DATA.writeData(Boot.jarParent);
        } catch (Exception ex) {
            Logger.getLogger(ManagerDashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Confirmbtn2ActionPerformed

    private void Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2ActionPerformed
        JFrame loginPage = new Start(DATA);
        this.dispose();
        loginPage.setVisible(true);
    }//GEN-LAST:event_Back2ActionPerformed

    private void ConfirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmbtnActionPerformed
        // TODO add your handling code here:
        if(DishNameField.getText().equals(null) || DishPriceField.getText().equals(null))
        JOptionPane.showMessageDialog(null,"Please Fill All The Required Fields");
        else {
            dish.setDishName(DishNameField.getText());
            switch (DishTypeBox.getSelectedIndex()){
                case 0 : dish.setDishType("main_course");break;
                case 1 : dish.setDishType("appetizer");break;
                case 2 : dish.setDishType("desert");break;
            }
            try{
                dish.setDishPrice(Double.parseDouble(DishPriceField.getText()));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Please Enter A Numeric Value In The Price Field");
            }
        }
        dishlist.add(dish);
        dishes.setDishes(dishlist);
        DATA.setDishes(dishes);
        try {
            DATA.writeData(Boot.jarParent);
        } catch (Exception ex) {
            Logger.getLogger(ManagerDashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setEnabled(true);
        AddDish.dispose();
        this.setVisible(false);
        ManagerDashBoard reboot= new ManagerDashBoard(this.manager, DATA);
        reboot.getjTabbedPane1().setSelectedIndex(2);
        reboot.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_ConfirmbtnActionPerformed

    private void DiscardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscardbtnActionPerformed
        // TODO add your handling code here:
        AddDish.setVisible(false);
        this.setEnabled(true);
        this.setVisible(true);
    }//GEN-LAST:event_DiscardbtnActionPerformed

    private void DishNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DishNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DishNameFieldActionPerformed

    private void AddDishWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AddDishWindowClosing
        // TODO add your handling code here:
        AddDish.dispose();
        this.setEnabled(true);
        this.setVisible(true);
    }//GEN-LAST:event_AddDishWindowClosing

    public JTabbedPane getjTabbedPane1(){
        return this.jTabbedPane1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddDish;
    private javax.swing.JButton AddDishbtn;
    private javax.swing.JButton Back;
    private javax.swing.JButton Back1;
    private javax.swing.JButton Back2;
    private javax.swing.JButton Confirmbtn;
    private javax.swing.JButton Confirmbtn2;
    private javax.swing.JButton Discardbtn;
    private javax.swing.JTextField DishNameField;
    private javax.swing.JTextField DishPriceField;
    private javax.swing.JComboBox<String> DishTypeBox;
    private javax.swing.JList<String> MyDishesList;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton Removebtn;
    private javax.swing.JTextArea StatBox;
    private javax.swing.JTextField UserField;
    private javax.swing.JLabel accountName;
    private javax.swing.JButton addUser;
    private javax.swing.JLabel discount;
    private javax.swing.JSlider discountSlider;
    private javax.swing.JButton editAccountBtn;
    private javax.swing.JDialog editUserDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton removeUser;
    private javax.swing.JComboBox<String> roleBox;
    private javax.swing.JButton showStats;
    private javax.swing.JLabel sliderValue;
    private javax.swing.JList<String> tableList;
    private javax.swing.JButton userChangeConfirm;
    private javax.swing.JButton userChangeDiscard;
    private javax.swing.JTextArea userDetailsArea;
    private javax.swing.JList<String> userList;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
