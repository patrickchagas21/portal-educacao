/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcao;

/**
 *
 * @author Aluno
 */
public class ContainerGigante extends javax.swing.JPanel {

    /**
     * Creates new form ContainerGigante
     */
    public ContainerGigante() {
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

        interfacePrincipal1 = new correcao.InterfacePrincipal();
        panelCorrecao2 = new correcao.PanelCorrecao();
        provaOff1 = new correcao.ProvaOff();

        setLayout(new java.awt.CardLayout());
        add(interfacePrincipal1, "InterfacePrincipal");
        add(panelCorrecao2, "PanelCorrecao");
        add(provaOff1, "ProvaOff");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private correcao.InterfacePrincipal interfacePrincipal1;
    private correcao.PanelCorrecao panelCorrecao2;
    private correcao.ProvaOff provaOff1;
    // End of variables declaration//GEN-END:variables
}
