package DynamicTreeStructures;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author Fiordor
 */
public class Main extends javax.swing.JFrame {

    private Controller controller;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        pnCanvas.setBackground(Color.WHITE);

        cbmAVLTree.setSelected(true);
        controller = new Controller(pnCanvas, tlValues, lbInfo, Controller.AVL_TREE);

        getContentPane().setBackground(new Color(150, 150, 150));

        setTitle("Dynamic Tree Structures");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCanvas = new javax.swing.JPanel();
        tfInput = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btSearch = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btGenerate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlValues = new javax.swing.JTable();
        lbInfo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miSave = new javax.swing.JMenuItem();
        miClear = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miAdd = new javax.swing.JMenuItem();
        miGenerate = new javax.swing.JMenuItem();
        miSearch = new javax.swing.JMenuItem();
        miDelete = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cbmAVLTree = new javax.swing.JCheckBoxMenuItem();
        cbmRootedBinary = new javax.swing.JCheckBoxMenuItem();
        cbmRedblack = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        pnCanvas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnCanvasMouseDragged(evt);
            }
        });
        pnCanvas.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                pnCanvasMouseWheelMoved(evt);
            }
        });
        pnCanvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnCanvasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnCanvasMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnCanvasLayout = new javax.swing.GroupLayout(pnCanvas);
        pnCanvas.setLayout(pnCanvasLayout);
        pnCanvasLayout.setHorizontalGroup(
            pnCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnCanvasLayout.setVerticalGroup(
            pnCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        tfInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfInput.setMinimumSize(new java.awt.Dimension(150, 30));
        tfInput.setPreferredSize(new java.awt.Dimension(150, 30));

        btAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btAdd.setText("ADD");
        btAdd.setToolTipText("Add value (Ctrl + A)");
        btAdd.setMaximumSize(new java.awt.Dimension(72, 30));
        btAdd.setMinimumSize(new java.awt.Dimension(72, 30));
        btAdd.setPreferredSize(new java.awt.Dimension(72, 30));
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSearch.setText("SEARCH");
        btSearch.setToolTipText("Search value (Ctrl + S)");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        btDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btDelete.setText("DELETE");
        btDelete.setToolTipText("Remove value (Ctrl + R)");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btGenerate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btGenerate.setText("GENERATE");
        btGenerate.setToolTipText("Generate random values (Ctrl + G)");
        btGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerateActionPerformed(evt);
            }
        });

        tlValues.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Value", "(ms)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tlValues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlValuesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tlValues);

        lbInfo.setText("Without tree");
        lbInfo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jMenu1.setText("File");

        miSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miSave.setText("Save");
        jMenu1.add(miSave);

        miClear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miClear.setText("Clear");
        miClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClearActionPerformed(evt);
            }
        });
        jMenu1.add(miClear);

        miExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Operation");

        miAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        miAdd.setText("Add");
        miAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddActionPerformed(evt);
            }
        });
        jMenu3.add(miAdd);

        miGenerate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        miGenerate.setText("Generate");
        miGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGenerateActionPerformed(evt);
            }
        });
        jMenu3.add(miGenerate);

        miSearch.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        miSearch.setText("Search");
        miSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchActionPerformed(evt);
            }
        });
        jMenu3.add(miSearch);

        miDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        miDelete.setText("Delete");
        miDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeleteActionPerformed(evt);
            }
        });
        jMenu3.add(miDelete);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Structure");

        cbmAVLTree.setText("AVL tree");
        cbmAVLTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmMenu(evt);
            }
        });
        jMenu2.add(cbmAVLTree);

        cbmRootedBinary.setText("Rooted binary tree");
        cbmRootedBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmMenu(evt);
            }
        });
        jMenu2.add(cbmRootedBinary);

        cbmRedblack.setText("Red black tree");
        cbmRedblack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmMenu(evt);
            }
        });
        jMenu2.add(cbmRedblack);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tfInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGenerate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                    .addComponent(pnCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerateActionPerformed
        controller.generate(tfInput.getText());
        tfInput.setText("");
        tfInput.requestFocus();
    }//GEN-LAST:event_btGenerateActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        controller.add(tfInput.getText());
        tfInput.setText("");
        tfInput.requestFocus();
    }//GEN-LAST:event_btAddActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        controller.delete(tfInput.getText());
        tfInput.setText("");
        tfInput.requestFocus();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void pnCanvasMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_pnCanvasMouseWheelMoved
        controller.zoom(evt.getWheelRotation());
    }//GEN-LAST:event_pnCanvasMouseWheelMoved

    private void pnCanvasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCanvasMouseDragged
        controller.moveDragged(evt.getX(), evt.getY());
    }//GEN-LAST:event_pnCanvasMouseDragged

    private void pnCanvasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCanvasMousePressed
        controller.movePressed(evt.getX(), evt.getY());
    }//GEN-LAST:event_pnCanvasMousePressed

    private void pnCanvasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCanvasMouseReleased
        controller.moveReleased();
    }//GEN-LAST:event_pnCanvasMouseReleased

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        controller.setSize(pnCanvas.getWidth(), pnCanvas.getHeight());
    }//GEN-LAST:event_formComponentResized

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miExitActionPerformed

    private void miClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClearActionPerformed
        controller.clearData();
    }//GEN-LAST:event_miClearActionPerformed

    private void miSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchActionPerformed
        btSearchActionPerformed(null);
    }//GEN-LAST:event_miSearchActionPerformed

    private void miAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddActionPerformed
        btAddActionPerformed(null);
    }//GEN-LAST:event_miAddActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        controller.search(tfInput.getText());
        tfInput.setText("");
        tfInput.requestFocus();
    }//GEN-LAST:event_btSearchActionPerformed

    private void miGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGenerateActionPerformed
        btGenerateActionPerformed(null);
    }//GEN-LAST:event_miGenerateActionPerformed

    private void miDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeleteActionPerformed
        btDeleteActionPerformed(null);
    }//GEN-LAST:event_miDeleteActionPerformed

    private void cbmMenu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmMenu
        
        cbmAVLTree.setSelected(false);
        cbmRootedBinary.setSelected(false);
        cbmRedblack.setSelected(false);
        
        if (evt.getSource() == cbmAVLTree) {
            cbmAVLTree.setSelected(true);
            controller.setTreeType(Controller.AVL_TREE);
        } else if (evt.getSource() == cbmRootedBinary) {
            cbmRootedBinary.setSelected(true);
            controller.setTreeType(Controller.ROOTED_BINARY_TREE);
        } else if (evt.getSource() == cbmRedblack) {
            cbmRedblack.setSelected(true);
            controller.setTreeType(Controller.RED_BLACK_TREE);
        }
    }//GEN-LAST:event_cbmMenu

    private void tlValuesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlValuesMouseClicked
        int row = tlValues.getSelectedRow();
        tfInput.setText(tlValues.getModel().getValueAt(row, 1).toString());
    }//GEN-LAST:event_tlValuesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btGenerate;
    private javax.swing.JButton btSearch;
    private javax.swing.JCheckBoxMenuItem cbmAVLTree;
    private javax.swing.JCheckBoxMenuItem cbmRedblack;
    private javax.swing.JCheckBoxMenuItem cbmRootedBinary;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JMenuItem miAdd;
    private javax.swing.JMenuItem miClear;
    private javax.swing.JMenuItem miDelete;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miGenerate;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JMenuItem miSearch;
    private javax.swing.JPanel pnCanvas;
    private javax.swing.JTextField tfInput;
    private javax.swing.JTable tlValues;
    // End of variables declaration//GEN-END:variables
}
