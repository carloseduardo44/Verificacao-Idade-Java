import java.awt.event.*;
import javax.swing.*;

public class idade {
    public static void main(String[] args) {
        JFrame verific_idade = new JFrame("Verific. Idade");
        verific_idade.setSize(500, 250);
        verific_idade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        verific_idade.setLayout(null);

        JButton entrar = new JButton("Entrar");
        entrar.setBounds(130, 100, 120, 40);

        entrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 1. Pede o nome
                String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
                
                // 2. Corrigido: Pede a idade E converte para inteiro
                String inputIdade = JOptionPane.showInputDialog(null, "Olá " + nome + ", digite sua idade: ");
                int idadex = Integer.parseInt(inputIdade);

                // 3. Lógica de verificação
                if (idadex >= 18) {
                    JOptionPane.showMessageDialog(null, "Olá, " + nome + "! Seja bem-vindo.");
                } else {
                    JOptionPane.showMessageDialog(null, "Olá, " + nome + ". Você é menor de idade.");
                    
                }
            }
        }); // Fecha o ActionListener corretamente

        verific_idade.add(entrar);
        verific_idade.setVisible(true);
                
    }
}