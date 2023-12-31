import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FriendBot {
    private static JTextArea chatArea;
    private static JTextField inputField;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chatbot GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        inputField = new JTextField();
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processUserInput();
            }
        });
        panel.add(inputField, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void processUserInput() {
        String userMessage = inputField.getText().toLowerCase();
        chatArea.append("You: " + userMessage + "\n");

        String botResponse = Respostas.getResposta(userMessage);

        chatArea.append("Chatbot: " + botResponse + "\n");
        inputField.setText("");
    }
}
