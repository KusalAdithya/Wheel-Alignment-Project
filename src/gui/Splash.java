/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.formdev.flatlaf.IntelliJTheme;
import java.io.InputStream;

/**
 *
 * @author perer
 */
public class Splash {

    public static void main(String[] args) {
        try {

            Thread.sleep(4700);

            InputStream is = Splash.class.getResourceAsStream("/resources/arc-theme.theme.json");
            IntelliJTheme.setup(is);
          
           
            new SignIn().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
