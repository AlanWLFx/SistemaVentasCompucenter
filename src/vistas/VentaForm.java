
package vistas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.DetalleVentas;
import modelo.Producto;
import modelo.ProductoDAO;
import modelo.Ventas;
import modelo.VentasDAO;

/**
 *
 * @author ajf_4
 */
public class VentaForm extends javax.swing.JInternalFrame {
    
    ClienteDAO cdao = new ClienteDAO();
    VentasDAO vdao = new VentasDAO();
    ProductoDAO pdao = new ProductoDAO();
    Producto p = new Producto();
    Ventas v = new Ventas();
    DetalleVentas dv = new DetalleVentas();
    
    Cliente cliente = new Cliente();
    
    DefaultTableModel modelo = new DefaultTableModel();
    int idp;
    double tpagar;
    int cant;
    double pre;
    
    public VentaForm() {
        initComponents();
        generarSerie();
        
    Calendar calendar=new GregorianCalendar();
    int año, mes, dia;
    año=calendar.get(Calendar.YEAR);
    mes=calendar.get(Calendar.MONTH)+1;
    dia=calendar.get(Calendar.DATE);
    txtFecha.setText(año+"/"+mes+"/"+dia);
        
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        txtCodProd = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        txtCantidad = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Sistema de Ventas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel1.setText("PUNTO DE VENTA \"Compucenter\"");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Venta de productos de papeleria");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("NRO SERIE");

        txtSerie.setEditable(false);
        txtSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerieActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo png.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo png.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("COD CLIENTE:");
        jLabel6.setMaximumSize(new java.awt.Dimension(77, 14));
        jLabel6.setMinimumSize(new java.awt.Dimension(77, 14));
        jLabel6.setPreferredSize(new java.awt.Dimension(77, 14));

        jLabel7.setText("COD PRODUC:");

        jLabel8.setText("PRECIO:");

        jLabel9.setText("CANTIDAD:");

        txtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClienteActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        txtCantidad.setOpaque(false);

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("CLIENTE:");
        jLabel10.setMaximumSize(new java.awt.Dimension(48, 14));
        jLabel10.setMinimumSize(new java.awt.Dimension(48, 14));
        jLabel10.setPreferredSize(new java.awt.Dimension(48, 14));

        jLabel11.setText("PRODUC:");

        jLabel12.setText("STOCK:");

        jLabel14.setText("VENDE:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodCliente)
                    .addComponent(txtCodProd)
                    .addComponent(txtPrecio)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtProducto)
                    .addComponent(txtCliente)
                    .addComponent(txtStock)
                    .addComponent(txtVendedor, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel11)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel12)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO", "COD", "PRODUCTO", "CANTIDAD", "PRE UNI", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(TablaDetalle);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/money.png"))); // NOI18N
        jLabel15.setText("TOTAL A PAGAR:");

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calcular.png"))); // NOI18N
        btnGenerar.setText("GENERAR VENTA");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnCancelar)
                .addGap(37, 37, 37)
                .addComponent(btnGenerar)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar)
                    .addComponent(btnCancelar))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerieActionPerformed

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        BuscarCliente();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscarProducto();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        agregarProducto();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if (txtTotalPagar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar Datos");
        }else{
        guardarVenta();
        guardarDetalle();
        actualizarStock();
        JOptionPane.showMessageDialog(this, "Se Realizo con Exito");
        nuevo();
        generarSerie();
        }
        
       
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        nuevo();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    void generarSerie(){
        String serie= vdao.NroSerieVentas();
        if(serie == null){
            txtSerie.setText("0000001");
        }else{
            int increment = Integer.parseInt(serie);
            increment = increment + 1;
            txtSerie.setText("000000" + increment);
        }
    }
    
    void nuevo(){
        limpiarTabla();
        txtCodCliente.setText("");
        txtCliente.setText("");
        txtCantidad.setValue(1);
        txtCodProd.setText("");
        txtPrecio.setText("");
        txtProducto.setText("");
        txtStock.setText("");
        txtTotalPagar.setText("");
        txtCodCliente.requestFocus();
    }
    
    void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
    void actualizarStock(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Producto pr = new Producto();
            idp = Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            cant = Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            pr = pdao.listarID(idp);
            int sa = pr.getStock() - cant;
            pdao.actualizarStock(sa, idp);
        }
    }
    
    void guardarVenta(){
        int idv = 1;
        int idc = cliente.getId();
        String serie = txtSerie.getText();
        String fecha = txtFecha.getText();
        double monto = tpagar;
        String estado = "1";
        
        v.setIdCliente(idc);
        v.setIdVendedor(idv);
        v.setSerie(serie);
        v.setFecha(fecha);
        v.setMonto(monto);
        v.setEstado(estado);
        vdao.GuardarVentas(v);
        
    }
    
    void guardarDetalle(){
        String idv = vdao.IdVentas();
        int idve = Integer.parseInt(idv);   
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            int idp = Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            int cant = Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            double pre = Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            dv.setIdVentas(idve);
            dv.setIdProducto(idp);
            dv.setCantidad(cant);
            dv.setPreVenta(pre);
            vdao.GuardarDetalleVentas(dv); 
        }
    }
    
    void agregarProducto(){
        double total;
        int item = 0;
        modelo = (DefaultTableModel) TablaDetalle.getModel();
        item = item+1;
        idp = Integer.parseInt(txtCodProd.getText());//p.getId()
        String nomp = txtProducto.getText();
        pre = Double.parseDouble(txtPrecio.getText());
        cant = Integer.parseInt(txtCantidad.getValue().toString());
        int stock = Integer.parseInt(txtStock.getText());
        total = cant*pre;
        ArrayList lista = new ArrayList(); 
        if(stock>0){
            lista.add(item);
            lista.add(idp);
            lista.add(nomp);
            lista.add(cant);
            lista.add(pre);
            lista.add(total);
            Object[] ob = new Object[6];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
            ob[2] = lista.get(2);
            ob[3] = lista.get(3);
            ob[4] = lista.get(4);
            ob[5] = lista.get(5);
            modelo.addRow(ob);
            TablaDetalle.setModel(modelo);
            calcularTotal();
        }else{
            JOptionPane.showMessageDialog(this,"Stock de producto no disponible");
        }
    }
    
    void calcularTotal(){
        tpagar = 0;
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            cant = Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            pre = Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            tpagar = tpagar + (cant * pre);
        }
        txtTotalPagar.setText("" + tpagar + "0");
    }
    
    void buscarProducto(){
        int id = Integer.parseInt(txtCodProd.getText());
        if(txtCodProd.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Debe ingresar el codigo de producto");
        }else{
            p = pdao.listarID(id);
            if(p.getId()!=0){
                txtProducto.setText(p.getNom());
                txtPrecio.setText(""+p.getPre());
                txtStock.setText(""+p.getStock());
            }else{
                JOptionPane.showMessageDialog(this,"Producto no registrado");
                txtCodProd.requestFocus();
            }
        }
    }
    
    void BuscarCliente(){
        int r;
        String cod = txtCodCliente.getText();
        if(txtCodCliente.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar codigo cliente");
        }else{
            cliente = cdao.listarID(cod);
            if(cliente.getDni()!=null){
                txtCliente.setText(cliente.getNom());
                txtCodProd.requestFocus();
            }else{
               r = JOptionPane.showConfirmDialog(this, "Cliente no registrado, Desea registrar");
                if (r == 0) {
                    ClienteForm cf = new ClienteForm();
                    Principal.VentanaPrincipal.add(cf);
                    cf.setVisible(true);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
