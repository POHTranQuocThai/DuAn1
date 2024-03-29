/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import com.sun.corba.se.impl.io.IIOPInputStream;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;
import model.SinhVienDAO;

/**
 *
 * @author Tran Quoc Thai - CE181618
 */
public class SinhVienDiolog extends javax.swing.JDialog {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    SinhVienDAO dao = new SinhVienDAO();
    String strHinhAnh = null;
    /**
     * Creates new form SinhVienDiolog
     */
    public SinhVienDiolog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
    public void fillDateTABLE(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (SinhVien sv : dao.getAllSinhVien()) {
            Object[] newData = new Object[6];
            newData[0] = sv.getMaSV();
            newData[1] = sv.getTenSV();
            newData[2] = dateFormat.format(sv.getNgaySinh());
            newData[3] = sv.isGioiTinh()?"Nam":"Nữ";
            newData[4] = sv.getDiaChi();
            newData[5] = sv.getHinhAnh();
            model.addRow(newData);
             
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel_MSV = new javax.swing.JLabel();
        jLabel_HoVaTen = new javax.swing.JLabel();
        jLabel_NgaySinh = new javax.swing.JLabel();
        jTextField_MSV = new javax.swing.JTextField();
        jTextField_NSinh = new javax.swing.JTextField();
        jTextField_HVTen = new javax.swing.JTextField();
        jLabel_DiaChi = new javax.swing.JLabel();
        jRadioButton_Nam = new javax.swing.JRadioButton();
        jRadioButton_Nu = new javax.swing.JRadioButton();
        jLabel_GTinh = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_DiaChi = new javax.swing.JTextArea();
        jLabel_HAnh = new javax.swing.JLabel();
        jButton_Them = new javax.swing.JButton();
        jButton_Sua = new javax.swing.JButton();
        jButton_Xoa = new javax.swing.JButton();
        jButton_Luu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Doc = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_Open = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÍ SINH VIÊN");

        jLabel_MSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_MSV.setText("Mã Sinh Viên");

        jLabel_HoVaTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_HoVaTen.setText("Họ Và Tên");

        jLabel_NgaySinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_NgaySinh.setText("Ngày Sinh");

        jTextField_MSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_NSinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_HVTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel_DiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_DiaChi.setText("Địa Chỉ :");

        buttonGroup1.add(jRadioButton_Nam);
        jRadioButton_Nam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton_Nam.setText("Nam");

        buttonGroup1.add(jRadioButton_Nu);
        jRadioButton_Nu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton_Nu.setText("Nữ");

        jLabel_GTinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_GTinh.setText("Giới Tính");

        jTextArea_DiaChi.setColumns(20);
        jTextArea_DiaChi.setRows(5);
        jScrollPane1.setViewportView(jTextArea_DiaChi);

        jLabel_HAnh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_HAnh.setText("Hình Ảnh");
        jLabel_HAnh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_HAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_HAnhMouseClicked(evt);
            }
        });

        jButton_Them.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        jButton_Them.setText("Thêm");
        jButton_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemActionPerformed(evt);
            }
        });

        jButton_Sua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Edit.png"))); // NOI18N
        jButton_Sua.setText("Sửa");
        jButton_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SuaActionPerformed(evt);
            }
        });

        jButton_Xoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        jButton_Xoa.setText("Xóa");
        jButton_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XoaActionPerformed(evt);
            }
        });

        jButton_Luu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Luu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Save.png"))); // NOI18N
        jButton_Luu.setText("Lưu");
        jButton_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LuuActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ Và Tên", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "Hình ẢNh"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton_Doc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Doc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Save.png"))); // NOI18N
        jButton_Doc.setText("Doc File");
        jButton_Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DocActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem_Open.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem_Open.setText("Open");
        jMenuItem_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_OpenActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Open);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_HoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_MSV, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_GTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_MSV, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jTextField_HVTen)
                            .addComponent(jTextField_NSinh)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton_Nu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel_HAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_MSV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_MSV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_HoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_HVTen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_NSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton_Nam)
                            .addComponent(jRadioButton_Nu)
                            .addComponent(jLabel_GTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_HAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SuaActionPerformed
        // TODO add your handling code here:
        if(validateForm()){
            try {
                SinhVien sv = getModel();
                if(dao.updateSinhVienDao(sv)>0){
                    JOptionPane.showMessageDialog(this, "Cap Nhat Thanh Cong");
                    fillDateTABLE();
                }
            } catch (ParseException ex) {
                Logger.getLogger(SinhVienDiolog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(this,"Ban chua nhap thong tin");
        }
    }//GEN-LAST:event_jButton_SuaActionPerformed

    private void jButton_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaActionPerformed
        // TODO add your handling code here:
        if(jTextField_MSV.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ban chua nhap thong tin sinh vien");
        }else {
            if (dao.delSinhVienDao(jTextField_MSV.getText())>0) {
                JOptionPane.showMessageDialog(this, "Xoa thanh cong");
                fillDateTABLE();
            } else {
                JOptionPane.showMessageDialog(this, "Khong co Sinh Vien de xoa");
            }
        }
    }//GEN-LAST:event_jButton_XoaActionPerformed
    public SinhVien getModel() throws ParseException{
       SinhVien sv = new SinhVien();
       sv.setMaSV(jTextField_MSV.getText());
       sv.setTenSV(jTextField_HVTen.getText());
       boolean gt = true;
       if(this.jRadioButton_Nam.isSelected()){
           gt = true;
       }else {
           gt = false;
       }
       sv.setGioiTinh(gt);
       sv.setDiaChi(jTextArea_DiaChi.getText());
       sv.setNgaySinh(dateFormat.parse(jTextField_NSinh.getText()));
       if(strHinhAnh == (null)){
           sv.setHinhAnh("NO AVATAR");
       }else {
           sv.setHinhAnh(strHinhAnh);
       }
       
       return sv;
    }

    public boolean ghiFile(List<SinhVien> ds,String duongdan) {
        try {
            
            FileOutputStream fos = new FileOutputStream(duongdan);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ds);
            oos.close();
            fos.close();
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error");
            return false; 
        }
                  
    }
    public void thuchienSaveFile() throws ParseException {
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            if (ghiFile(dao.getLs(), f.getAbsolutePath())) {
                JOptionPane.showMessageDialog(this, "Save thanh cong");
            }
        }
    }

    public void thuchientailendulieu() {
        while (true) {
            DefaultTableModel model_table = (DefaultTableModel) jTable1.getModel();
            int sl = model_table.getRowCount();
            if (sl == 0) {
                break;
            }else{
                try {
                    model_table.removeRow(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        for (SinhVien sv : dao.getLs()) {
            dao.ls.add(sv);
            fillDateTABLE();
        }
    }
    public void docFile(File file){
        ArrayList<SinhVien> ds = new ArrayList<>();
        try {
            
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object doc = ois.readObject();
            ds =  (ArrayList<SinhVien>) doc;
            ois.close();
            fis.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
            
        }
        dao.setLs(ds);
    }

    public void thuchienOpenFile() {
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            docFile(file);
                 thuchientailendulieu();
                JOptionPane.showMessageDialog(this, "Read sucessfull");
              
        }
    }
    private void jButton_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LuuActionPerformed
        
        try {
            thuchienSaveFile();
        } catch (ParseException ex) {
            Logger.getLogger(SinhVienDiolog.class.getName()).log(Level.SEVERE, null, ex);
        }
       
           
       
    }//GEN-LAST:event_jButton_LuuActionPerformed

    private void jLabel_HAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HAnhMouseClicked
        try {
            JFileChooser jfc = new JFileChooser("D:\\ProJect\\src\\Images");
            jfc.showOpenDialog(null);
            File f = jfc.getSelectedFile();
            Image image = ImageIO.read(f);
            strHinhAnh = f.getName();
            jLabel_HAnh.setText("");
            int width = jLabel_HAnh.getWidth();
            int height = jLabel_HAnh.getHeight();
            jLabel_HAnh.setIcon(new ImageIcon(image.getScaledInstance(width, height, 0)));
        } catch (IOException ex) {
            System.out.println("Error:"+ex.toString());
        }
    }//GEN-LAST:event_jLabel_HAnhMouseClicked
    public void reser(){
        jTextArea_DiaChi.setText("");
        jTextField_MSV.setText("");
        jTextField_HVTen.setText("");
        jTextField_NSinh.setText("");
        buttonGroup1.clearSelection();
        jTextArea_DiaChi.setText("");
        jLabel_HAnh.setText("Hình Ẩnh");
        jLabel_HAnh.setIcon(null);
        strHinhAnh = null;
    }
    private void jButton_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemActionPerformed
       
        if (validateForm()) {
            try {
                SinhVien sv = getModel();
                if(dao.plus(sv)>0){
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    fillDateTABLE();
                    reser();
                }
            } catch (ParseException ex) {
                Logger.getLogger(SinhVienDiolog.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đầy đủ thông tin!");
        }
    }//GEN-LAST:event_jButton_ThemActionPerformed
    public void setModel(SinhVien sv){
        jTextField_MSV.setText(sv.getMaSV());
        jTextField_HVTen.setText(sv.getTenSV());
        jTextField_NSinh.setText(dateFormat.format(sv.getNgaySinh()));
        jTextArea_DiaChi.setText(sv.getDiaChi());
        if(sv.isGioiTinh()){
            jRadioButton_Nam.setSelected(true);
        }else{
            jRadioButton_Nu.setSelected(true);
        }
        if(sv.getHinhAnh().equalsIgnoreCase("NO AVATAR")){
            jLabel_HAnh.setText("No AVATAR");
            jLabel_HAnh.setIcon(null);
        }else {
            jLabel_HAnh.setText("");
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/"+sv.getHinhAnh()));
        Image img = icon.getImage();
        img.getScaledInstance(jLabel_HAnh.getWidth(), jLabel_HAnh.getHeight(), 0);
        jLabel_HAnh.setIcon(icon);
        }
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int id = jTable1.rowAtPoint(evt.getPoint());
        String maSV = jTable1.getValueAt(id,0).toString();
        SinhVien sv = dao.getSinhVienByID(maSV);
        setModel(sv);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_OpenActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenuItem_OpenActionPerformed

    private void jButton_DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DocActionPerformed
        // TODO add your handling code here:
        try {
            thuchienOpenFile();
          
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton_DocActionPerformed
    public boolean validateForm(){
        if(jTextField_MSV.getText().isEmpty() || jTextField_HVTen.getText().isEmpty()){
            return false;
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SinhVienDiolog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVienDiolog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVienDiolog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVienDiolog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SinhVienDiolog dialog = new SinhVienDiolog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_Doc;
    private javax.swing.JButton jButton_Luu;
    private javax.swing.JButton jButton_Sua;
    private javax.swing.JButton jButton_Them;
    private javax.swing.JButton jButton_Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_DiaChi;
    private javax.swing.JLabel jLabel_GTinh;
    private javax.swing.JLabel jLabel_HAnh;
    private javax.swing.JLabel jLabel_HoVaTen;
    private javax.swing.JLabel jLabel_MSV;
    private javax.swing.JLabel jLabel_NgaySinh;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Open;
    private javax.swing.JRadioButton jRadioButton_Nam;
    private javax.swing.JRadioButton jRadioButton_Nu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_DiaChi;
    private javax.swing.JTextField jTextField_HVTen;
    private javax.swing.JTextField jTextField_MSV;
    private javax.swing.JTextField jTextField_NSinh;
    // End of variables declaration//GEN-END:variables
}
