import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaSwing {
    private static Agenda agenda = new Agenda();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Agenda de Contatos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Painel para mostrar os contatos
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Painel para entradas
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField();
        JLabel telefoneLabel = new JLabel("Telefone:");
        JTextField telefoneField = new JTextField();
        JButton adicionarButton = new JButton("Adicionar Contato");
        JButton removerButton = new JButton("Remover Contato");

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(telefoneLabel);
        panel.add(telefoneField);
        panel.add(adicionarButton);
        panel.add(removerButton);

        frame.add(panel, BorderLayout.NORTH);

        // Evento para adicionar contato
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String telefone = telefoneField.getText();
                if (!nome.isEmpty() && !telefone.isEmpty()) {
                    Contato novoContato = new Contato(nome, telefone);
                    agenda.adicionarContato(novoContato);
                    nomeField.setText("");
                    telefoneField.setText("");
                    atualizarListaContatos(textArea);
                } else {
                    JOptionPane.showMessageDialog(frame, "Por favor, preencha todos os campos.");
                }
            }
        });

        // Evento para remover contato
        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                if (!nome.isEmpty()) {
                    agenda.removerContato(nome);
                    nomeField.setText("");
                    telefoneField.setText("");
                    atualizarListaContatos(textArea);
                } else {
                    JOptionPane.showMessageDialog(frame, "Por favor, digite o nome do contato a remover.");
                }
            }
        });

        frame.setVisible(true);
    }

    private static void atualizarListaContatos(JTextArea textArea) {
        StringBuilder sb = new StringBuilder();
        for (Contato c : agenda.listarContatos()) {
            sb.append(c).append("\n");
        }
        textArea.setText(sb.toString());
    }
}
