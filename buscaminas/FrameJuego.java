/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Azucena
 */

public class FrameJuego extends javax.swing.JFrame {
    
    public static Casilla casillas[][];
    private boolean casillasMinadas[][];
    public static int destapadas;

    public FrameJuego() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("images/mine.png")).getImage());
        
        if(FrameDificultad.comboBoxDificultad.getSelectedItem().toString().equals("Fácil")){
            this.setLocation(520, 200);
        }   
        if(FrameDificultad.comboBoxDificultad.getSelectedItem().toString().equals("Media")){
            this.setLocation(490, 160);
        }  
        if(FrameDificultad.comboBoxDificultad.getSelectedItem().toString().equals("Difícil")){
            this.setLocation(440, 60);
        }  
        if(FrameDificultad.comboBoxDificultad.getSelectedItem().toString().equals("Personalizada")){
            this.setLocationRelativeTo(null);
        }  
        this.setResizable(false);
        
        this.setSize(( FrameDificultad.filas * 25) + 20, ( FrameDificultad.columnas * 25) + 115);
        
        crearTablero();
        
    }   
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        textFieldMinasContador = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(64, 64, 64));

        textFieldMinasContador.setBackground(new java.awt.Color(64, 64, 64));
        textFieldMinasContador.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        textFieldMinasContador.setForeground(new java.awt.Color(255, 255, 255));
        textFieldMinasContador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Minas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        textFieldMinasContador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMinasContadorActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/icons8_Life_Cycle_30px.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldMinasContador, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(textFieldMinasContador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel4.setLayout(new java.awt.GridLayout(FrameDificultad.filas, FrameDificultad.filas));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getToolkit().beep();
        this.reiniciarDestapadas();

        for (int i = 0; i < FrameDificultad.filas; i++) {
            for (int j = 0; j < FrameDificultad.columnas; j++) {
                casillasMinadas[i][j] = false;
            }
        }
        
        jPanel4.removeAll();
        jPanel4.updateUI();  
        crearTablero();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textFieldMinasContadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMinasContadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMinasContadorActionPerformed

    private void crearTablero(){
        textFieldMinasContador.setText(Integer.toString(FrameDificultad.minas));
        this.casillas = new Casilla[FrameDificultad.filas][FrameDificultad.columnas];
        this.casillasMinadas = new boolean[FrameDificultad.filas][FrameDificultad.columnas];
        
        for (int i = 0; i < FrameDificultad.filas; i++) {
            for (int j = 0; j < FrameDificultad.columnas; j++) {
                casillasMinadas[i][j] = false;
            }
        }
        
        jPanel4.removeAll();
        jPanel4.updateUI();
        this.casillasMinadas = determinarCasillasMinadas(FrameDificultad.minas);
        
        for (int i = 0; i < FrameDificultad.filas; i++) {
            for (int j = 0; j < FrameDificultad.columnas; j++) {
                
                if(casillasMinadas[i][j] == true){
                    casillas[i][j] = new CasillaMinada(i, j, this);
                    jPanel4.add(casillas[i][j]);
                }else{
                    casillas[i][j] = new CasillaVacia(i, j, this);
                    jPanel4.add(casillas[i][j]);
                }
            }
        }
        
        for (int i = 0; i < FrameDificultad.filas; i++) {
            for (int j = 0; j < FrameDificultad.columnas; j++) {
                
                if(casillas[i][j] instanceof CasillaVacia){
                    ((CasillaVacia)casillas[i][j]).setMinasAlrededor( ((CasillaVacia)casillas[i][j]).calcularMinasAlrededor() );
                }
            }
        }
        
    }

    private boolean[][] determinarCasillasMinadas(int minas){       
        int cont = 0;                  
        boolean auxMatriz[][] = new boolean[FrameDificultad.filas][FrameDificultad.columnas];
        boolean bandera = false;
        int numeroRandom;
      
        for (int i = 0; i < FrameDificultad.filas; i++) {
            for (int j = 0; j < FrameDificultad.columnas; j++) {
                auxMatriz[i][j] = false;
            }
        }            
         
        while(cont < minas){
            
            for (int i = 0; i < FrameDificultad.filas; i++) {
 
                if(bandera == true){
                        break;}             
                for (int j = 0; j < FrameDificultad.filas; j++) {
                    Random random = new Random();
                    numeroRandom = random.nextInt(100)+1;
                    if(cont == minas){
                        bandera = true;
                        break;
                    }else if( auxMatriz[i][j] == false ){ 
                        if(numeroRandom == 33){
                            auxMatriz[i][j] = true;
                            cont++;
                        }                       
                    }
                }
            } 
        }
              
        return auxMatriz;
    }
    
    public void perder(){
        this.dispose();
    }

    public void destaparMinadas(int x, int y){
        for (int i = 0; i < FrameDificultad.filas; i++) {
            for (int j = 0; j < FrameDificultad.columnas; j++) {
                if(i == x && j == y){
                    casillas[i][j].setIcon(new ImageIcon(getClass().getResource("images/minadoActual.png")));
                    casillas[i][j].setBackground(new Color(240, 240, 240));
                }
                else if(casillas[i][j] instanceof CasillaMinada){
                    casillas[i][j].setIcon(new ImageIcon(getClass().getResource("images/minado.png")));
                    casillas[i][j].setBackground(new Color(240, 240, 240));
                }  
            }
        }  
    }

    public void flagearMinadas(){  
        textFieldMinasContador.setText("0");
        for (int i = 0; i < FrameDificultad.filas; i++) {
            for (int j = 0; j < FrameDificultad.columnas; j++) {

                if(casillas[i][j] instanceof CasillaMinada){
                    casillas[i][j].setIcon(new ImageIcon(getClass().getResource("images/flag.png")));
                }  
            }
        }  
    }

    public void reiniciarDestapadas(){
        destapadas = 0;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField textFieldMinasContador;
    // End of variables declaration//GEN-END:variables
}
