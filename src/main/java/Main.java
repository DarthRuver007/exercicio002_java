

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade: "));

        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Pode votar");
        } else {
            JOptionPane.showMessageDialog(null, "Não pode votar");
        }
    }
}