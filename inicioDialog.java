/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trackstreetfighter;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class InicioDialog extends JDialog {

    public InicioDialog(JFrame parent) {
        super(parent, "Inicio", true);
        Inicio inicioPanel = new Inicio(this);
        getContentPane().add(inicioPanel);
        pack();
        setLocationRelativeTo(parent);
    }
}
