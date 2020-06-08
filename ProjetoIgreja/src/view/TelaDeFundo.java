package view;

import java.awt.Graphics;
import java.awt.Image;

public class TelaDeFundo extends javax.swing.JInternalFrame {

    public static Image fundo;

    public TelaDeFundo() {
        super(null, false, false, false);
        initComponents();

        try {
            fundo = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("fundo.png"), "fundo.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics Fundo) {
        Fundo.drawImage(fundo, 0, 0, getWidth(), getHeight(), this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
