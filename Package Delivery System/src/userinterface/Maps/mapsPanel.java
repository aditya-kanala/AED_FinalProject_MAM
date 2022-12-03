/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Maps;

import com.kingaspx.util.BrowserUtil;
import com.kingaspx.version.Version;
import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;


/**
 *
 * @author mahith
 */


public class mapsPanel extends javax.swing.JPanel {
        
    /**
     * Creates new form mapsPanel
     */
    
    //JPanel userProcessContainer;
    //LocationPoint locationPoint;
    Browser browser;
    BrowserView view;
    public mapsPanel() {

        initComponents();
        //locationPoint = new LocationPoint();
        
        EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDHFSC1G4NNJSWIB7FX6CBOWWCX8MKR14WNT2DH9XV6YW9EOWTXHCOQSIKV88D6J65JS").build();
        Engine engine = Engine.newInstance(options);
        browser = engine.newBrowser();
        BrowserView view = BrowserView.newInstance(browser);
        browser.navigation().loadUrl("https://www.google.com/maps");
        
        mapArea.add(view);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mapArea = new javax.swing.JPanel();

        mapArea.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mapArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mapArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mapArea;
    // End of variables declaration//GEN-END:variables

    
    
//    private void open_site(){
//        
//        Browser browser;
//        BrowserView view;
//        
//        BrowserUtil.setVersion(Version.V6_22);
//        
//        browser = new Browser();
//        view = new BrowserView(browser);
//        
//        mapArea.add(view,BorderLayout.CENTER);
//        
//        browser.addTitleListener((TitleEvent evt)->{
//            setTitle(evt.getTitle());
//            
//        });
//                
//        browser.addConsoleListener((ConsoleEvent evt)->{
//            System.out.println("LOG:"+ evt.getMessage());
//        });
//                
//        
//        
//    }


}