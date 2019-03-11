import javax.swing.*;
public class Formulario extends JFrame{
    public Formulario() {
        setLayout(null);
    }

    public static void main(String[] ar) {
        Formulario formulario1=new Formulario();
        formulario1.setBounds(0,0,1024,800);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
    }
}