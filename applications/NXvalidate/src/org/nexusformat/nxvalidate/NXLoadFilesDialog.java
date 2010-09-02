/* NeXus - Neutron & X-ray Common Data Format
 *
 * NeXus file validation GUI tool.
 *
 * Copyright (C) 2010 Stephen Rankin
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * For further information, see <http://www.neutron.anl.gov/NeXus/>
 *
 * NXLoadFilesDialog.java
 *
 * Created on 16-Jun-2010, 11:56:31
 */
package org.nexusformat.nxvalidate;

import java.io.File;
import java.util.ResourceBundle;

/**
 *
 * @author Stephen Rankin
 */
public class NXLoadFilesDialog extends javax.swing.JDialog {

    private File nxs = null;
    private File nxdl = null;
    private boolean OKButtonUsed = false;
    private CheckNexusFileType check = null;
    private ResourceBundle bundle = null;
    /** Creates new form NXLoadFilesDialog */
    public NXLoadFilesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        check = new CheckNexusFileType();
        bundle = ResourceBundle.getBundle(
                "org/nexusformat/nxvalidate/resources/nxvalidate");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        messageOptionPane = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        nxsLabel = new javax.swing.JLabel();
        nxsTextField = new javax.swing.JTextField();
        openButton1 = new javax.swing.JButton();
        nxdlLabel = new javax.swing.JLabel();
        nxdcTextField = new javax.swing.JTextField();
        openButton2 = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        OKButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Open Files");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        nxsLabel.setText("Load NXS:");

        nxsTextField.setEditable(false);

        openButton1.setText("Open");
        openButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButton1ActionPerformed(evt);
            }
        });

        nxdlLabel.setText("Load NXDL:");

        nxdcTextField.setEditable(false);

        openButton2.setText("Open");
        openButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButton2ActionPerformed(evt);
            }
        });

        cancelButton.setText("CANCEL");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nxsLabel)
                            .addComponent(nxdlLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nxdcTextField)
                            .addComponent(nxsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)))
                    .addComponent(cancelButton))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(openButton1)
                    .addComponent(openButton2)
                    .addComponent(OKButton))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nxsLabel)
                    .addComponent(nxsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openButton1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nxdlLabel)
                    .addComponent(nxdcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openButton2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(OKButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButton1ActionPerformed

        if (evt.getSource() == openButton1) {

            int returnVal = jFileChooser1.showOpenDialog(this);

            if (returnVal == jFileChooser1.APPROVE_OPTION) {
                nxs = jFileChooser1.getSelectedFile();

                if(check.checkNexusFile(nxs)){
                    nxsTextField.setText(nxs.getAbsolutePath());
                    nxsTextField.setToolTipText(nxs.getAbsolutePath());
                } else{
                    nxs = null;
                    messageOptionPane.showMessageDialog(this,
                        bundle.getString("notNXDLFileMessage"));
                }

                
            } else {
                nxs = null;
            }

        }
}//GEN-LAST:event_openButton1ActionPerformed

    private void openButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButton2ActionPerformed

        if (evt.getSource() == openButton2) {

            int returnVal = jFileChooser1.showOpenDialog(this);

            if (returnVal == jFileChooser1.APPROVE_OPTION) {
                nxdl = jFileChooser1.getSelectedFile();

                if(check.checkNXDLFile(nxdl)){
                    nxdcTextField.setText(nxdl.getAbsolutePath());
                    nxdcTextField.setToolTipText(nxdl.getAbsolutePath());
                } else{
                    nxdl = null;
                    messageOptionPane.showMessageDialog(this,
                        bundle.getString("notNXDLFileMessage"));
                }
                
                
            } else {
                nxdl = null;
            }

        }
}//GEN-LAST:event_openButton2ActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        if (evt.getSource() == cancelButton) {
            OKButtonUsed = false;
            this.setVisible(false);
        }
}//GEN-LAST:event_cancelButtonActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        if (evt.getSource() == OKButton) {
            OKButtonUsed = true;
            this.setVisible(false);
        }
    }//GEN-LAST:event_OKButtonActionPerformed

    public File getNXSFile() {
        return nxs;
    }

    public File getNXDLFile() {
        return nxdl;
    }

    public boolean OKButtonUsed() {
        return OKButtonUsed;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                NXLoadFilesDialog dialog = new NXLoadFilesDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JOptionPane messageOptionPane;
    private javax.swing.JTextField nxdcTextField;
    private javax.swing.JLabel nxdlLabel;
    private javax.swing.JLabel nxsLabel;
    private javax.swing.JTextField nxsTextField;
    private javax.swing.JButton openButton1;
    private javax.swing.JButton openButton2;
    // End of variables declaration//GEN-END:variables
}
