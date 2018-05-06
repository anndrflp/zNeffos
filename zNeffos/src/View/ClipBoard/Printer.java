/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ClipBoard;

import Connection.ConexaoMySQL;
import View.Page.Page;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Usuário
 */
public class Printer {
    
    ConexaoMySQL cn = new ConexaoMySQL();
    
     public void imprimir(java.awt.event.ActionEvent evt, int variavel) {                                         
        // TODO add your handling code here:       
        String query = "SELECT * FROM SERVICE WHERE NUMERO = " + variavel;
        try {
            ConexaoMySQL.Consult(query);
            JRResultSetDataSource relatService = new JRResultSetDataSource(cn.rs);
            JasperPrint jpPrint = JasperFillManager.fillReport("src/Relatorio/Os.jasper" ,new HashMap(), relatService);
            JasperViewer jv = new JasperViewer(jpPrint, false);
            jv.setVisible(true);
         } catch (SQLException ex) {
            Logger.getLogger(Page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
     
}
