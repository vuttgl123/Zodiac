/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ad
 */
public class Cung extends javax.swing.JFrame {

    /**
     * Creates new form Cung
     */
    public Cung() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        anh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbx_cung = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tieude.JPG"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/goc.JPG"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/goc1.JPG"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/goc3.JPG"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/goc2.JPG"))); // NOI18N
        jLabel7.setText("jLabel7");

        cbx_cung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbx_cung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bạch Dương", "Bảo Bình", "Bọ Cạp", "Cự Giải", "Kim Ngưu", "Ma Kết", "Nhân Mã", "Song Ngư", "Song Tử", "Sư Tử", "Thiên Bình", "Xử Nữ" }));
        cbx_cung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_cungActionPerformed(evt);
            }
        });

        tb.setColumns(20);
        tb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tb.setRows(5);
        jScrollPane1.setViewportView(tb);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel4)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(cbx_cung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(anh, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anh, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_cung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)))
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
    }// </editor-fold>//GEN-END:initComponents
public ImageIcon ResizeImage(String ImagePath, int width, int height) {
    ImageIcon MyImage = new ImageIcon(ImagePath);
    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}   
String duongdananh = "D:\\Netbean\\codebtl_ttltm\\src\\AnhCung\\BachDuong.jpg";
    private void cbx_cungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_cungActionPerformed
        // TODO add your handling code here:
           String selectedValue = (String) cbx_cung.getSelectedItem();
        try {
            if (duongdananh != null) {
                if("Bạch Dương".equals(selectedValue)){
                    duongdananh = "D:\\Netbean\\codebtl_ttltm\\src\\AnhCung\\BachDuong.jpg";               
                    anh.setIcon(ResizeImage(duongdananh, anh.getWidth(), anh.getHeight()));
                    System.out.println(duongdananh);
                    String longText = "Dưới đây là giới thiệu chi tiết về cung Bạch Dương (Aries), bao gồm cả kí hiệu của cung:\n" +
                                    "\n" +
                                    "Cung Bạch Dương (♈ Aries)\n" +
                                    "\n" +
                                    "Cung Bạch Dương là cung đầu tiên trong 12 cung Hoàng Đạo, biểu trưng bởi hình ảnh con cừu và thuộc nguyên tố Lửa.\n" +
                                    "\n" +
                                    "Kí hiệu của cung Bạch Dương là: ♈\n" +
                                    "\n" +
                                    "Ý nghĩa của kí hiệu ♈:\n" +
                                    "\n" +
                                    "Hình ảnh con cừu với hai sừng nhọn thể hiện tính cách mạnh mẽ, táo bạo và quyết đoán của người thuộc cung này.\n" +
                                    "Hình dạng kí hiệu gợi ý về sự mới mẻ, khởi đầu và bắt đầu một hành trình mới.\n" +
                                    "Đặc điểm của người thuộc cung Bạch Dương:\n" +
                                    "\n" +
                                    "Tính cách: Năng động, sôi nổi, thích thách thức, không kiên nhẫn, dễ nóng giận.\n" +
                                    "Điểm mạnh: Dũng cảm, sáng tạo, quyết đoán, độc lập, ham mê khám phá.\n" +
                                    "Điểm yếu: Thiếu suy nghĩ trước khi hành động, khó chịu khi bị từ chối.\n" +
                                    "Sự nghiệp: Thích công việc yêu cầu sáng tạo, liều lĩnh như quản lý, khởi nghiệp, thể thao.\n" +
                                    "Tình yêu: Lãng mạn, nhiệt tình, quyến rũ nhưng dễ nóng giận.\n" +
                                    "Sức khỏe: Khỏe mạnh nhưng dễ bị thương do tính cách liều lĩnh.\n" +
                                    "Tóm lại, Bạch Dương là những người năng động, mạnh mẽ và đầy tham vọng, nhưng cần học cách kiên nhẫn và cân nhắc kỹ trước khi hành động.";
                    tb.setText(longText);
                    String message = "Cung trước: Cự Giải\n"
                            + "Cung hiện tại: Bạch Dương\n"
                            + "Cung sau: Song Tử";
                            JOptionPane.showMessageDialog(null, message, "Bảng thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                else if("Bảo Bình".equals(selectedValue)){
                    duongdananh = "D:\\Netbean\\codebtl_ttltm\\src\\AnhCung\\BaoBinh.jpg";               
                    anh.setIcon(ResizeImage(duongdananh, anh.getWidth(), anh.getHeight()));
                    System.out.println(duongdananh);       
                    String longText = "Cung Bảo Bình (♒) là một trong 12 cung hoàng đạo trong chiêm tinh học. Dưới đây là một giới thiệu chi tiết về cung Bảo Bình:\n" +
                                    "\n" +
                                    "Kí hiệu: ♒\n" +
                                    "Ngày: 20 Tháng 1 - 18 Tháng 2\n" +
                                    "Biểu tượng: Người mang nước\n" +
                                    "Hành tinh cai quản: Thổ Tinh (Uranus)\n" +
                                    "Nguyên tố: Khí\n" +
                                    "Đặc điểm chính:\n" +
                                    "\n" +
                                    "Có tính cách độc lập, sáng tạo và cá tính mạnh.\n" +
                                    "Tư duy logic, khách quan và có tinh thần cải cách xã hội.\n" +
                                    "Thích sự tự do, ghét bị ràng buộc và không thích sự hào nhoáng.\n" +
                                    "Có khuynh hướng nhân đạo, quan tâm đến lợi ích của cộng đồng.\n" +
                                    "Có khả năng lãnh đạo nhưng lại không thích vai trò này.\n" +
                                    "Thích giao lưu, kết bạn và làm việc theo nhóm.\n" +
                                    "Có tinh thần phản kháng với những quy tắc lỗi thời.\n" +
                                    "Những người thuộc cung Bảo Bình thường là những người thông minh, độc đáo và có tư duy mới mẻ. Họ là những người bạn tuyệt vời, luôn sẵn sàng giúp đỡ người khác và có tâm hồn rộng mở";
                    tb.setText(longText);
                    String message = "Cung trước: Ma Kết\n"
                            + "Cung hiện tại: Bảo Bình\n"
                            + "Cung sau: Bạch Dương";
                             JOptionPane.showMessageDialog(null, message, "Bảng thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                else if("Bọ Cạp".equals(selectedValue)){
                    duongdananh = "D:\\Netbean\\codebtl_ttltm\\src\\AnhCung\\BoCap.jpg";               
                    anh.setIcon(ResizeImage(duongdananh, anh.getWidth(), anh.getHeight()));
                    System.out.println(duongdananh);            
                    String longText = "Cung Bọ Cạp (♏) là một trong 12 cung hoàng đạo trong chiêm tinh học. Dưới đây là một giới thiệu chi tiết về cung Bọ Cạp:\n" +
                                    "\n" +
                                    "Kí hiệu: ♏\n" +
                                    "Ngày: 23 Tháng 10 - 21 Tháng 11\n" +
                                    "Biểu tượng: Bọ cạp\n" +
                                    "Hành tinh cai quản: Hỏa Tinh (Pluto)\n" +
                                    "Nguyên tố: Nước\n" +
                                    "Đặc điểm chính:\n" +
                                    "\n" +
                                    "Có tính cách mạnh mẽ, sâu sắc và bí ẩn.\n" +
                                    "Rất nhạy cảm, sâu sắc trong cảm xúc và quan hệ.\n" +
                                    "Có khả năng quan sát và phân tích người khác sâu sắc.\n" +
                                    "Rất hiếu kỳ, thích khám phá những bí ẩn của cuộc sống.\n" +
                                    "Có khả năng thích nghi cao, dễ dàng thay đổi bản thân.\n" +
                                    "Kiên định trong quan điểm và sẵn sàng bảo vệ những gì mình tin tưởng.\n" +
                                    "Tham vọng và quyết tâm đạt được mục tiêu.\n" +
                                    "Những người thuộc cung Bọ Cạp thường là những người có sức hút lớn, quyến rũ và luôn thu hút sự chú ý của người khác. Họ là những người sâu sắc, bí ẩn nhưng cũng rất trung thành và tận tâm với những người họ yêu quý";
                    tb.setText(longText);
                    String message = "Cung trước: Thiên Bình\n"
                   + "Cung hiện tại: Bọ Cạp\n"
                   + "Cung sau: Nhân Mã";
                    JOptionPane.showMessageDialog(null, message, "Bảng thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                else if("Cự Giải".equals(selectedValue)){
                    duongdananh = "D:\\Netbean\\codebtl_ttltm\\src\\AnhCung\\CưGiai.jpg";               
                    anh.setIcon(ResizeImage(duongdananh, anh.getWidth(), anh.getHeight()));
                    System.out.println(duongdananh);       
                    String longText = "Cung Cự Giải (♋) là một trong 12 cung hoàng đạo trong chiêm tinh học. Dưới đây là một giới thiệu chi tiết về cung Cự Giải:\n" +
                                    "\n" +
                                    "Kí hiệu: ♋\n" +
                                    "Ngày: 22 Tháng 6 - 22 Tháng 7\n" +
                                    "Biểu tượng: Con cua\n" +
                                    "Hành tinh cai quản: Mặt Trăng\n" +
                                    "Nguyên tố: Nước\n" +
                                    "Đặc điểm chính:\n" +
                                    "\n" +
                                    "Có tính cảm xúc, trực giác và nhạy cảm rất mạnh.\n" +
                                    "Rất tình cảm, thân thiện và có trái tim ấm áp.\n" +
                                    "Thích sự an toàn, gia đình và những không gian quen thuộc.\n" +
                                    "Có khả năng quan sát và lắng nghe người khác rất tốt.\n" +
                                    "Rất sợ thay đổi và ghét bị áp lực.\n" +
                                    "Rất biết chăm sóc người khác nhưng đôi khi lại quá bảo thủ.\n" +
                                    "Có trí nhớ tốt và khả năng cảm thông cao"+
                                    "Những người thuộc cung Cự Giải thường là những người chu đáo, nhạy cảm và luôn muốn tạo ra một không gian ấm áp, an toàn cho gia đình và bạn bè. Họ là những người bạn tuyệt vời, luôn sẵn sàng lắng nghe và chia sẻ";
                    tb.setText(longText);
                    String message = "Cung trước: Song Tử\n"
                   + "Cung hiện tại: Cự Giải\n"
                   + "Cung sau: Sư Tử";
                    JOptionPane.showMessageDialog(null, message, "Bảng thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                else if("Kim Ngưu".equals(selectedValue)){
                    duongdananh = "D:\\Netbean\\codebtl_ttltm\\src\\AnhCung\\KimNguu.jpg";               
                    anh.setIcon(ResizeImage(duongdananh, anh.getWidth(), anh.getHeight()));
                    System.out.println(duongdananh);            
                    String longText = "Cung Kim Ngưu (♉) là một trong 12 cung hoàng đạo trong chiêm tinh học. Dưới đây là một giới thiệu chi tiết về cung Kim Ngưu:\n" +
                                    "\n" +
                                    "Kí hiệu: ♉\n" +
                                    "Ngày: 21 Tháng 4 - 21 Tháng 5\n" +
                                    "Biểu tượng: Con bò\n" +
                                    "Hành tinh cai quản: Tình Yêu Tinh (Venus)\n" +
                                    "Nguyên tố: Đất\n" +
                                    "Đặc điểm chính:\n" +
                                    "\n" +
                                    "Có tính cách ổn định, kiên định và bền bỉ.\n" +
                                    "Rất thực tế, giỏi quản lý tài chính và đề ra các kế hoạch dài hạn.\n" +
                                    "Trân trọng sự yên bình, thoải mái và những giá trị vật chất.\n" +
                                    "Rất tình cảm, trung thành và biết quan tâm đến những người thân yêu.\n" +
                                    "Có khả năng kiên nhẫn, kiên định và không dễ bị làm phiền.\n" +
                                    "Có tính cách ương ngạnh và khó thay đổi khi đã chọn lựa.\n" +
                                    "Trân trọng và thưởng thức những thứ tốt đẹp trong cuộc sống"+
                                    "Những người thuộc cung Kim Ngưu thường là những người ổn định, có trách nhiệm và luôn coi trọng sự an toàn, thoải mái. Họ là những người rất tốt để kết bạn và xây dựng mối quan hệ lâu dài";
                    tb.setText(longText);
                    String message = "Cung trước: Bạch Dương\n"
                   + "Cung hiện tại: Kim Ngưu\n"
                   + "Cung sau: Song Tử";
                    JOptionPane.showMessageDialog(null, message, "Bảng thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                else if("Ma Kết".equals(selectedValue)){
                    duongdananh = "D:\\Netbean\\codebtl_ttltm\\src\\AnhCung\\MaKet.jpg";               
                    anh.setIcon(ResizeImage(duongdananh, anh.getWidth(), anh.getHeight()));
                    System.out.println(duongdananh);            
                    String longText = "Cung Ma Kết (♑) là một trong 12 cung hoàng đạo trong chiêm tinh học. Dưới đây là một giới thiệu chi tiết về cung Ma Kết:\n" +
                                    "\n" +
                                    "Kí hiệu: ♑\n" +
                                    "Ngày: 22 Tháng 12 - 20 Tháng 1\n" +
                                    "Biểu tượng: Con dê\n" +
                                    "Hành tinh cai quản: Sao Thổ\n" +
                                    "Nguyên tố: Đất\n" +
                                    "Đặc điểm chính:\n" +
                                    "\n" +
                                    "Có tính kỷ luật, có trách nhiệm và thực tế rất cao.\n" +
                                    "Rất tham vọng, kiên nhẫn và kiên định trong việc theo đuổi mục tiêu.\n" +
                                    "Có tính toán kỹ lưỡng, cẩn thận và thích hoạch định kế hoạch.\n" +
                                    "Rất dốc lòng vì công việc và thường thành công trong sự nghiệp.\n" +
                                    "Có khiếu hài hước nhưng đôi khi lại quá nghiêm túc.\n" +
                                    "Thường khá bảo thủ và khó thay đổi khi đã vạch ra một lập trường.\n" +
                                    "Có xu hướng tự tin, độc lập và không thích sự can thiệp"+
                                    "Những người thuộc cung Ma Kết thường là những người đáng tin cậy, kiên nhẫn và mục tiêu định hướng. Họ làm việc chăm chỉ và luôn hướng tới thành công trong sự nghiệp";
                    tb.setText(longText);
                    String message = "Cung trước: Nhân Mã\n"
                   + "Cung hiện tại: Ma Kết\n"
                   + "Cung sau: Bảo Bình";
                    JOptionPane.showMessageDialog(null, message, "Bảng thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                else if("Nhân Mã".equals(selectedValue)){
                    duongdananh = "D:\\Netbean\\codebtl_ttltm\\src\\AnhCung\\NhanMa.jpg";               
                    anh.setIcon(ResizeImage(duongdananh, anh.getWidth(), anh.getHeight()));
                    System.out.println(duongdananh);            
                    String longText = "Cung Nhân Mã (♐) là một trong 12 cung hoàng đạo trong chiêm tinh học. Dưới đây là một giới thiệu chi tiết về cung Nhân Mã:\n" +
                                    "\n" +
                                    "Kí hiệu: ♐\n" +
                                    "Ngày: 23 Tháng 11 - 21 Tháng 12\n" +
                                    "Biểu tượng: Người Nhân Mã\n" +
                                    "Hành tinh cai quản: Sao Mộc\n" +
                                    "Nguyên tố: Lửa\n" +
                                    "Đặc điểm chính:\n" +
                                    "\n" +
                                    "Có tính thăng bằng, tự do và độc lập rất mạnh.\n" +
                                    "Rất tích cực, lạc quan và có tinh thần phiêu lưu mạo hiểm.\n" +
                                    "Thích sự thay đổi, học hỏi và khám phá điều mới lạ.\n" +
                                    "Rất thẳng thắn, thẳng tuột và không thích bị ràng buộc.\n" +
                                    "Có khả năng giao tiếp, ứng xử tốt và hài hước.\n" +
                                    "Thích được tôn trọng sự tự do và không chịu được sự ràng buộc.\n" +
                                    "Có tư duy rộng mở, bác học và luôn muốn mở rộng tầm nhìn"+
                                    "Những người thuộc cung Nhân Mã thường là những người lạc quan, tích cực và luôn tìm kiếm những điều mới mẻ. Họ là những người bạn tuyệt vời và đáng tin cậy nhưng đòi hỏi sự tự do và độc lập";
                    tb.setText(longText);
                     String message = "Cung trước: Bọ Cạp\n"
                   + "Cung hiện tại: Nhân Mã\n"
                   + "Cung sau: Ma Kết";
                    JOptionPane.showMessageDialog(null, message, "Bảng thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                else if("Song Ngư".equals(selectedValue)){
                    duongdananh = "D:\\Netbean\\codebtl_ttltm\\src\\AnhCung\\SongNgu.jpg";               
                    anh.setIcon(ResizeImage(duongdananh, anh.getWidth(), anh.getHeight()));
                    System.out.println(duongdananh);            
                    String longText = "Cung Song Ngư (♓) là một trong 12 cung hoàng đạo trong chiêm tinh học. Dưới đây là một giới thiệu chi tiết về cung Song Ngư:\n" +
                                    "\n" +
                                    "Kí hiệu: ♓\n" +
                                    "Ngày: 20 Tháng 2 - 20 Tháng 3\n" +
                                    "Biểu tượng: Hai con cá\n" +
                                    "Hành tinh cai quản: Sao Neptun\n" +
                                    "Nguyên tố: Nước\n" +
                                    "Đặc điểm chính:\n" +
                                    "\n" +
                                    "Có khả năng trực giác và tinh thần rất cao.\n" +
                                    "Rất nhạy cảm, dễ cảm thông và thường xuyên tự đồng cảm.\n" +
                                    "Thích sự yên tĩnh, tình cảm và thường lẩn tránh sự xung đột.\n" +
                                    "Có tính tưởng tượng phong phú và thích các hoạt động nghệ thuật.\n" +
                                    "Dễ bị tác động bởi những gì xung quanh, khó giữ vững quan điểm.\n" +
                                    "Thích sự lãng mạn, mơ mộng và có xu hướng trốn tránh thực tế.\n" +
                                    "Rất tốt bụng, điềm tĩnh và thường được mọi người tin tưởng.\n" +
                                    "Những người thuộc cung Song Ngư thường là những người đầy trực giác, tình cảm và tưởng tượng. Họ dễ cảm thông và thích sự yên bình, nhưng cũng dễ bị tác động bởi các yếu tố bên ngoài";
                    tb.setText(longText);
                    String message = "Cung trước: Bảo Bình\n"
                   + "Cung hiện tại: Song Ngư\n"
                   + "Cung sau: Bạch Dương";
                    JOptionPane.showMessageDialog(null, message, "Bảng thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                if("Song Tử".equals(selectedValue)){
                    duongdananh = "D:\\Netbean\\codebtl_ttltm\\src\\AnhCung\\SongTu.jpg";               
                    anh.setIcon(ResizeImage(duongdananh, anh.getWidth(), anh.getHeight()));
                    System.out.println(duongdananh);            
                    String longText = "Cung Song Tử (♊) là một trong 12 cung hoàng đạo trong chiêm tinh học. Dưới đây là một giới thiệu chi tiết về cung Song Tử:\n" +
                                    "\n" +
                                    "Kí hiệu: ♊\n" +
                                    "Ngày: 21 Tháng 5 - 21 Tháng 6\n" +
                                    "Biểu tượng: Hai người sinh đôi\n" +
                                    "Hành tinh cai quản: Sao Thủy\n" +
                                    "Nguyên tố: Khí\n" +
                                    "Đặc điểm chính:\n" +
                                    "\n" +
                                    "Rất thông minh, linh hoạt và hiếu kỳ.\n" +
                                    "Giao tiếp tốt, đa tài và luôn muốn học hỏi điều mới.\n" +
                                    "Thích sự thay đổi, luôn tìm tòi và khám phá.\n" +
                                    "Thường hoạt bát, nhiều ý tưởng và khó tập trung.\n" +
                                    "Có xu hướng trở nên nghiêm túc và lý trí khi cần.\n" +
                                    "Rất có khả năng ngôn ngữ và tư duy logic.\n" +
                                    "Có tính cách hai mặt, dễ thay đổi tâm trạng.\n" +
                                    "Những người thuộc cung Song Tử thường là những người thông minh, đa tài và ham học hỏi. Họ rất linh hoạt, nhưng cũng dễ bị phân tán và thay đổi tâm trạng";
                    tb.setText(longText);
                     String message = "Cung trước: Kim Ngưu\n"
                   + "Cung hiện tại: Song Tử\n"
                   + "Cung sau: Cự Giải";
                    JOptionPane.showMessageDialog(null, message, "Bảng thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                if("Sư Tử".equals(selectedValue)){
                    duongdananh = "D:\\Netbean\\codebtl_ttltm\\src\\AnhCung\\SuTu.jpg";               
                    anh.setIcon(ResizeImage(duongdananh, anh.getWidth(), anh.getHeight()));
                    System.out.println(duongdananh);            
                    String longText = "Cung Sư Tử (♌) là một trong 12 cung hoàng đạo trong chiêm tinh học. Dưới đây là một giới thiệu chi tiết về cung Sư Tử:\n" +
                                    "\n" +
                                    "Kí hiệu: ♌\n" +
                                    "Ngày: 23 Tháng 7 - 22 Tháng 8\n" +
                                    "Biểu tượng: Con sư tử\n" +
                                    "Hành tinh cai quản: Mặt Trời\n" +
                                    "Nguyên tố: Lửa\n" +
                                    "Đặc điểm chính:\n" +
                                    "\n" +
                                    "Rất tự tin, độc lập và thích được chú ý.\n" +
                                    "Có năng lượng và tính cách mạnh mẽ.\n" +
                                    "Sáng tạo, hào phóng và thường có lòng tự trọng cao.\n" +
                                    "Thích lãnh đạo, chỉ huy và không thích bị ai chỉ vẽ.\n" +
                                    "Rất nhiệt tình, ấm áp và đầy tính cách.\n" +
                                    "Có tham vọng to lớn và luôn muốn hoàn thành mục tiêu.\n" +
                                    "Khó chịu với sự hạn chế, không thích bị ràng buộc.\n" +
                                    "Những người thuộc cung Sư Tử thường là những người tự tin, có tài lãnh đạo và muốn được công nhận. Họ rất nhiệt tình và hào phóng nhưng cũng dễ tự kiêu và khó chịu với sự hạn chế.";
                    tb.setText(longText);
                    String message = "Cung trước: Cự Giải\n"
                   + "Cung hiện tại: Sư Tử\n"
                   + "Cung sau: Xử Nữ";
                    JOptionPane.showMessageDialog(null, message, "Bảng thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                 if("Thiên Bình".equals(selectedValue)){
                    duongdananh = "D:\\Netbean\\codebtl_ttltm\\src\\AnhCung\\ThienBinh.jpg";               
                    anh.setIcon(ResizeImage(duongdananh, anh.getWidth(), anh.getHeight()));
                    System.out.println(duongdananh);            
                    String longText = "Cung Thiên Bình (♎) là một trong 12 cung hoàng đạo trong chiêm tinh học. Dưới đây là một giới thiệu chi tiết về cung Thiên Bình:\n" +
                                    "\n" +
                                    "Kí hiệu: ♎\n" +
                                    "Ngày: 23 Tháng 9 - 22 Tháng 10\n" +
                                    "Biểu tượng: Cái cân\n" +
                                    "Hành tinh cai quản: Sao Kim\n" +
                                    "Nguyên tố: Khí\n" +
                                    "Đặc điểm chính:\n" +
                                    "\n" +
                                    "Rất công bằng, cân bằng và tìm kiếm sự hài hòa.\n" +
                                    "Có khả năng phân tích, đánh giá và tư duy logic tốt.\n" +
                                    "Thích tính toán, cân nhắc và tránh những quyết định vội vã.\n" +
                                    "Rất cởi mở, dễ thương và có khả năng giao tiếp tốt.\n" +
                                    "Ghét xung đột và luôn muốn đem lại sự hòa bình.\n" +
                                    "Có tính thẩm mĩ phát triển, ưa sự thanh lịch và tinh tế.\n" +
                                    "Khó đưa ra quyết định khi phải lựa chọn.\n" +
                                    "Những người thuộc cung Thiên Bình thường là những người công bằng, cân bằng và hướng tới sự hài hòa. Họ rất cởi mở và có khả năng giao tiếp tốt, nhưng đôi khi lại lưỡng lự khi phải đưa ra quyết định";
                    tb.setText(longText);
                    String message = "Cung trước: Xử Nữ\n"
                   + "Cung hiện tại: Thiên Bình\n"
                   + "Cung sau: Bọ Cạp";
                    JOptionPane.showMessageDialog(null, message, "Bảng thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                if("Xử Nữ".equals(selectedValue)){
                    duongdananh = "D:\\Netbean\\codebtl_ttltm\\src\\AnhCung\\XuNu.jpg";               
                    anh.setIcon(ResizeImage(duongdananh, anh.getWidth(), anh.getHeight()));
                    System.out.println(duongdananh);            
                    String longText = "Cung Xử Nữ (♍) là một trong 12 cung hoàng đạo trong chiêm tinh học. Dưới đây là một giới thiệu chi tiết về cung Xử Nữ:\n" +
                                        "\n" +
                                        "Kí hiệu: ♍\n" +
                                        "Ngày: 23 Tháng 8 - 22 Tháng 9\n" +
                                        "Biểu tượng: Người trinh nữ\n" +
                                        "Hành tinh cai quản: Sao Thủy\n" +
                                        "Nguyên tố: Đất\n" +
                                        "Đặc điểm chính:\n" +
                                        "\n" +
                                        "Rất chính xác, tỉ mỉ và luôn tìm kiếm sự hoàn hảo.\n" +
                                        "Thực tế, phân tích và có tinh thần trách nhiệm cao.\n" +
                                        "Thích tổ chức, lên kế hoạch và đặt tiêu chuẩn cao.\n" +
                                        "Cẩn thận, khắc khe với bản thân và với người khác.\n" +
                                        "Thông minh, tỉ mỉ và yêu thích sự ngăn nắp, gọn gàng.\n" +
                                        "Có khuynh hướng phê bình và thắc mắc về mọi thứ.\n" +
                                        "Khó khăn trong việc thể hiện tình cảm cá nhân.\n" +
                                        "Những người thuộc cung Xử Nữ thường là những người tỉ mỉ, chính xác và yêu thích sự hoàn hảo. Họ rất thông minh nhưng cũng có phần khắc khe và khó thể hiện cảm xúc";
                    tb.setText(longText);
                    String message = "Cung trước: Sư Tử\n"
                   + "Cung hiện tại: Xử Nữ\n"
                   + "Cung sau: Thiên Bình";
                    JOptionPane.showMessageDialog(null, message, "Bảng thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                System.out.println("Bạn chưa chọn ảnh");
            }
        } catch (Exception ex) {
            System.out.println("Chưa chọn ảnh");
            System.out.println(duongdananh);
        } 
        
    }//GEN-LAST:event_cbx_cungActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Bấm Yes nếu bạn muốn rời khỏi đây?", "Bạn muốn thoát?", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    // Đóng ứng dụng
                    this.setVisible(false);
                    Menu menu = new Menu();
                    menu.setVisible(true);
                } else {
                    // Người dùng chọn "Không", không làm gì cả
                    System.out.println("Thoát ứng dụng đã bị hủy.");
                }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anh;
    private javax.swing.JComboBox<String> cbx_cung;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tb;
    // End of variables declaration//GEN-END:variables
}
