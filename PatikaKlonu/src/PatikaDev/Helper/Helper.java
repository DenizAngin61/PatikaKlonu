package PatikaDev.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {

    public static Object Config;

    public static int screenCenterPoint(String eksen, Dimension size) {
        int point = 0;
        switch (eksen) {
            case "x":
                point = (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
                break;
            case "y":
                point = (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
                break;
            default:
                point = 0;
        }
        return point;
    }

    public static boolean isFieldEmpty(JTextField field){
        return field.getText().trim().isEmpty();
    }

    public static void showMessage(String str){
        optionPaneTR();
        String msg;
        String title;
        switch (str){
            case "fill":
                msg = "Lütfen tüm alanları doldurun!";
                title = "Hata!";
                break;
            case "done":
                msg = "işlem başarılı";
                title = "sonuç";
                break;
            case "error":
                msg = "bir hata oluştu";
                title = "hata";
                break;
            default:
                msg = str;
                title = "Mesaj";
        }

        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void optionPaneTR(){
        UIManager.put("OptionPane.okButtonText" , "Tamam");
    }
}
