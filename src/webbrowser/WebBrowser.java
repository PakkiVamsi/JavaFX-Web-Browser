
package webbrowser;

import java.awt.Toolkit;
import javax.swing.*;
import javafx.embed.swing.JFXPanel;
import javafx.scene.web.WebView;
import javafx.scene.Scene;
import javafx.application.Platform;
public class WebBrowser extends JFrame implements Runnable{
    private JFXPanel panel;
    ImageIcon icon;
    public void run(){
        setTitle("Web Browser");
        setBounds(-5,-5,1950,1050);
        setVisible(true);
        icon=new ImageIcon("icon.png");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        panel=new JFXPanel();
        add(panel);
        
        Platform.runLater(()->{
            WebView view =new WebView();
            view.getEngine().load("https://www.google.com");
            Scene scene =new Scene(view);
            panel.setScene((scene));     
        });
        
        
        
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new WebBrowser());
    }  
}
