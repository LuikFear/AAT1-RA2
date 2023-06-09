/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprojectah3;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class App extends javax.swing.JFrame {

    static LinkedList<vendedores> Lista = new LinkedList<> ();
   
    public App() {
        initComponents();
        MostrarTabla();
        MostrarTablaP();
        MostrarTablaC();
        MostrarTablaS();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        B1crear = new javax.swing.JButton();
        B2Cargar = new javax.swing.JButton();
        B3Update = new javax.swing.JButton();
        B4Delete = new javax.swing.JButton();
        B5Export = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Productos = new javax.swing.JPanel();
        B5Export4 = new javax.swing.JButton();
        B3UpdateP = new javax.swing.JButton();
        B4Delete4 = new javax.swing.JButton();
        B2Cargar4 = new javax.swing.JButton();
        B1crearP = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaP = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Clientes = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaC = new javax.swing.JTable();
        B1crear3 = new javax.swing.JButton();
        B2Cargar3 = new javax.swing.JButton();
        B4Delete3 = new javax.swing.JButton();
        B3Update3 = new javax.swing.JButton();
        B5Export3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Sucursales = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaS = new javax.swing.JTable();
        B1crear1 = new javax.swing.JButton();
        B2Cargar1 = new javax.swing.JButton();
        B4Delete1 = new javax.swing.JButton();
        B3Update1 = new javax.swing.JButton();
        B5Export1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 161, 172));

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newpackage/cerrar-sesion (3) (1).png"))); // NOI18N
        jButton1.setText("Cerrar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Caja", "Ventas", "Genero"
            }
        ));
        jScrollPane1.setViewportView(table);

        B1crear.setText("Crear");
        B1crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1crearActionPerformed(evt);
            }
        });

        B2Cargar.setText("Carga Masiva");
        B2Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2CargarActionPerformed(evt);
            }
        });

        B3Update.setText("Actualizar");
        B3Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3UpdateActionPerformed(evt);
            }
        });

        B4Delete.setText("Eliminar");
        B4Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4DeleteActionPerformed(evt);
            }
        });

        B5Export.setText("Exportar listado a PDF");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newpackage/Bocho perfil.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(B5Export, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(B1crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B3Update, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B2Cargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B4Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B1crear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B3Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B4Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(B5Export, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        Tabs.addTab("Vendedores", jPanel2);

        Productos.setBackground(new java.awt.Color(255, 255, 204));

        B5Export4.setText("Exportar listado a PDF");

        B3UpdateP.setText("Actualizar");
        B3UpdateP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3UpdatePActionPerformed(evt);
            }
        });

        B4Delete4.setText("Eliminar");
        B4Delete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4Delete4ActionPerformed(evt);
            }
        });

        B2Cargar4.setText("Carga Masiva");
        B2Cargar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2Cargar4ActionPerformed(evt);
            }
        });

        B1crearP.setText("Crear");
        B1crearP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1crearPActionPerformed(evt);
            }
        });

        TablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Cantidad", "Precio"
            }
        ));
        jScrollPane5.setViewportView(TablaP);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newpackage/Nijika perfil.png"))); // NOI18N

        javax.swing.GroupLayout ProductosLayout = new javax.swing.GroupLayout(Productos);
        Productos.setLayout(ProductosLayout);
        ProductosLayout.setHorizontalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(B5Export4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ProductosLayout.createSequentialGroup()
                                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(B1crearP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B3UpdateP, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(B2Cargar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B4Delete4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        ProductosLayout.setVerticalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ProductosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B1crearP, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2Cargar4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B3UpdateP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B4Delete4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(B5Export4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        Tabs.addTab("Productos", Productos);

        Clientes.setBackground(new java.awt.Color(153, 204, 255));

        TablaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "NIT", "Correo", "Genero"
            }
        ));
        jScrollPane4.setViewportView(TablaC);

        B1crear3.setText("Crear");
        B1crear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1crear3ActionPerformed(evt);
            }
        });

        B2Cargar3.setText("Carga Masiva");
        B2Cargar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2Cargar3ActionPerformed(evt);
            }
        });

        B4Delete3.setText("Eliminar");
        B4Delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4Delete3ActionPerformed(evt);
            }
        });

        B3Update3.setText("Actualizar");
        B3Update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3Update3ActionPerformed(evt);
            }
        });

        B5Export3.setText("Exportar listado a PDF");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newpackage/Ryo perfil.png"))); // NOI18N

        javax.swing.GroupLayout ClientesLayout = new javax.swing.GroupLayout(Clientes);
        Clientes.setLayout(ClientesLayout);
        ClientesLayout.setHorizontalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(B5Export3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ClientesLayout.createSequentialGroup()
                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(B1crear3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B3Update3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(B2Cargar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B4Delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClientesLayout.setVerticalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesLayout.createSequentialGroup()
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B1crear3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2Cargar3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B3Update3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B4Delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(B5Export3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        Tabs.addTab("Clientes", Clientes);

        Sucursales.setBackground(new java.awt.Color(255, 153, 153));

        TablaS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Direccion", "Correo", "Telefono"
            }
        ));
        jScrollPane2.setViewportView(TablaS);

        B1crear1.setText("Crear");
        B1crear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1crear1ActionPerformed(evt);
            }
        });

        B2Cargar1.setText("Carga Masiva");
        B2Cargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2Cargar1ActionPerformed(evt);
            }
        });

        B4Delete1.setText("Eliminar");
        B4Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4Delete1ActionPerformed(evt);
            }
        });

        B3Update1.setText("Actualizar");
        B3Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3Update1ActionPerformed(evt);
            }
        });

        B5Export1.setText("Exportar listado a PDF");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newpackage/Ikuyo perfil.png"))); // NOI18N

        javax.swing.GroupLayout SucursalesLayout = new javax.swing.GroupLayout(Sucursales);
        Sucursales.setLayout(SucursalesLayout);
        SucursalesLayout.setHorizontalGroup(
            SucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SucursalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(SucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SucursalesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(B5Export1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(SucursalesLayout.createSequentialGroup()
                                .addGroup(SucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(B1crear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B3Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(SucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(B2Cargar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B4Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SucursalesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38))))
        );
        SucursalesLayout.setVerticalGroup(
            SucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SucursalesLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(SucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SucursalesLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(SucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B1crear1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2Cargar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(SucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B3Update1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B4Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(B5Export1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );

        Tabs.addTab("Sucursales", Sucursales);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabs)
                .addContainerGap())
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

    
    

     
   

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Login Newframe = new Login() ;
            Newframe.setVisible(true);
            dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void B1crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1crearActionPerformed
        // TODO add your handling code here:
        
        Crear Newframe = new Crear() ;
            Newframe.setVisible(true);
            dispose();
        
        
    }//GEN-LAST:event_B1crearActionPerformed

    private void B2CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2CargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B2CargarActionPerformed

    private void B3UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3UpdateActionPerformed
        // TODO add your handling code here:
        if (table.getSelectedRow() <0) {
            JOptionPane.showMessageDialog(null, "Selecciona Una Fila primero");
        } else {
            ModVen mv= new ModVen();
            mv.content = table.getSelectedRow();
            mv.mostrar(table.getSelectedRow());
            mv.setVisible(true);
            dispose();
        }
        
        
        
    }//GEN-LAST:event_B3UpdateActionPerformed

    private void B1crear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1crear1ActionPerformed
        // TODO add your handling code here:
        CrearS Newframe = new CrearS() ;
            Newframe.setVisible(true);
            dispose();

        
        
        
    }//GEN-LAST:event_B1crear1ActionPerformed

    private void B2Cargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2Cargar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B2Cargar1ActionPerformed

    private void B3Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3Update1ActionPerformed
        // TODO add your handling code here:
         
        if (TablaS.getSelectedRow() <0) {
            JOptionPane.showMessageDialog(null, "Selecciona Una Fila primero");
        } else {
            UpSuc mvs= new UpSuc();
            mvs.contentS = TablaS.getSelectedRow();
            mvs.mostrar(TablaS.getSelectedRow());
            mvs.setVisible(true);
            dispose();
        }
       
        
        
        
    }//GEN-LAST:event_B3Update1ActionPerformed

    private void B1crear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1crear3ActionPerformed


        CrearC Newframe = new CrearC() ;
            Newframe.setVisible(true);
            dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_B1crear3ActionPerformed

    private void B2Cargar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2Cargar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B2Cargar3ActionPerformed

    private void B3Update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3Update3ActionPerformed
        // TODO add your handling code here:
        
        
        
        if (TablaC.getSelectedRow() <0) {
            JOptionPane.showMessageDialog(null, "Selecciona Una Fila primero");
        } else {
            UpCli mvc= new UpCli();
            mvc.contentC = TablaC.getSelectedRow();
            mvc.mostrar(TablaC.getSelectedRow());
            mvc.setVisible(true);
            dispose();
        }
          
        
        
        
        
        
    }//GEN-LAST:event_B3Update3ActionPerformed

    private void B3UpdatePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3UpdatePActionPerformed
  
        
        
        if (TablaP.getSelectedRow() <0) {
            JOptionPane.showMessageDialog(null, "Selecciona Una Fila primero");
        } else {
            UpPro mvp= new UpPro();
            mvp.contentP = TablaP.getSelectedRow();
            mvp.mostrar(TablaP.getSelectedRow());
            mvp.setVisible(true);
            dispose();
        }
          

        
    }//GEN-LAST:event_B3UpdatePActionPerformed

    private void B2Cargar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2Cargar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B2Cargar4ActionPerformed
//Crear Producto
    private void B1crearPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1crearPActionPerformed
 
        CrearP Newframe = new CrearP() ;
            Newframe.setVisible(true);
            dispose();


    }//GEN-LAST:event_B1crearPActionPerformed

    private void B4DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4DeleteActionPerformed
        // TODO add your handling code here:
        
          if (table.getSelectedRow() <0) {
            JOptionPane.showMessageDialog(null, "Selecciona Una Fila primero");
        } else {

              vendedores.Lista.remove(table.getSelectedRow());
             
               App Newframe = new App() ;
            Newframe.setVisible(true);
            dispose();
        }
        
        
        
        
        
    }//GEN-LAST:event_B4DeleteActionPerformed

    private void B4Delete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4Delete4ActionPerformed
        // TODO add your handling code here:
        
          if (TablaP.getSelectedRow() <0) {
            JOptionPane.showMessageDialog(null, "Selecciona Una Fila primero");
        } else {

              ProductList.Stock.remove(TablaP.getSelectedRow());
             
               App Newframe = new App() ;
            Newframe.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_B4Delete4ActionPerformed

    private void B4Delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4Delete3ActionPerformed
        // TODO add your handling code here:
        
          if (TablaC.getSelectedRow() <0) {
            JOptionPane.showMessageDialog(null, "Selecciona Una Fila primero");
        } else {

              ClientsList.List.remove(TablaC.getSelectedRow());
             
               App Newframe = new App() ;
            Newframe.setVisible(true);
            dispose();
        }
                                          
    }//GEN-LAST:event_B4Delete3ActionPerformed

    private void B4Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4Delete1ActionPerformed
        // TODO add your handling code here:
        
          if (TablaS.getSelectedRow() <0) {
            JOptionPane.showMessageDialog(null, "Selecciona Una Fila primero");
        } else {

              SucList.Ad.remove(TablaS.getSelectedRow());
             
               App Newframe = new App() ;
            Newframe.setVisible(true);
            dispose();
        }
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_B4Delete1ActionPerformed
    //  U S E R S
    public void MostrarTabla(){
        
        String columnas [] = {"Codigo","Nombre","Caja","Ventas","Genero"};
        DefaultTableModel tablota = new DefaultTableModel(null,columnas);
        
        
        for(vendedores Sp : vendedores.Lista) {
        Object filas[] = new Object[5];
        filas[0] = Sp.getCodigo();
        filas[1] = Sp.getNombre();
        filas[2] = Sp.getCaja();
        filas[4] = Sp.getGenero();
        filas[3] = Sp.getVentas();
        tablota.addRow(filas);
        }
        
        table.setModel(tablota);
    }
    //P R O D U C T S
     public void MostrarTablaP(){
        
        String columnas [] = {"Codigo","Nombre","Descripcion","Cantidad","Precio"};
        DefaultTableModel tablotaP = new DefaultTableModel(null,columnas);
        
        
        for(ProductList Sp : ProductList.Stock) {
        Object filas[] = new Object[5];
        filas[0] = Sp.getCodigo();
        filas[1] = Sp.getNombre();
        filas[2] = Sp.getDescription();
        filas[4] = Sp.getPrecio();
        filas[3] = Sp.getCantidad();
        tablotaP.addRow(filas);
        }
        
        TablaP.setModel(tablotaP);
    }
    
     //  C L I E N T S 
    public void MostrarTablaC(){
        
        String columnas [] = {"Codigo","Nombre","NIT","Correo","Genero"};
        DefaultTableModel tabloton = new DefaultTableModel(null,columnas);
        
        
        for(ClientsList Sp : ClientsList.List) {
        Object filas[] = new Object[5];
        filas[0] = Sp.getCodigo();
        filas[1] = Sp.getNombre();
        filas[2] = Sp.getNIT();
        filas[4] = Sp.getGenero();
        filas[3] = Sp.getCorreo();
        tabloton.addRow(filas);
        }
        
        TablaC.setModel(tabloton);
     
     
     
    }
     
     
     public void MostrarTablaS(){
        
        String columnas [] = {"Codigo","Nombre","Direccion","Correo","Telefono"};
        DefaultTableModel Teibol = new DefaultTableModel(null,columnas);
        
        
        for(SucList Sp : SucList.Ad) {
        Object filas[] = new Object[5];
        filas[0] = Sp.getCodigo();
        filas[1] = Sp.getNombre();
        filas[2] = Sp.getDireccion();
        filas[4] = Sp.getTelefono();
        filas[3] = Sp.getCorreo();
        Teibol.addRow(filas);
        }
        
        TablaS.setModel(Teibol);
     
     
     
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        
        
        
        
        
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1crear;
    private javax.swing.JButton B1crear1;
    private javax.swing.JButton B1crear3;
    private javax.swing.JButton B1crearP;
    private javax.swing.JButton B2Cargar;
    private javax.swing.JButton B2Cargar1;
    private javax.swing.JButton B2Cargar3;
    private javax.swing.JButton B2Cargar4;
    private javax.swing.JButton B3Update;
    private javax.swing.JButton B3Update1;
    private javax.swing.JButton B3Update3;
    private javax.swing.JButton B3UpdateP;
    private javax.swing.JButton B4Delete;
    private javax.swing.JButton B4Delete1;
    private javax.swing.JButton B4Delete3;
    private javax.swing.JButton B4Delete4;
    private javax.swing.JButton B5Export;
    private javax.swing.JButton B5Export1;
    private javax.swing.JButton B5Export3;
    private javax.swing.JButton B5Export4;
    private javax.swing.JPanel Clientes;
    private javax.swing.JPanel Productos;
    private javax.swing.JPanel Sucursales;
    private javax.swing.JTable TablaC;
    private javax.swing.JTable TablaP;
    private javax.swing.JTable TablaS;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
