public class Respostas {
    public static String getResposta(String palavraChave) {
        switch (palavraChave) {
            case "olá":
                return "Olá! Como posso ajudar?";
            case "tempo":
                return "Desculpe, eu não conheço o tempo atual.";
            case "nome":
                return "Meu nome é Chatbot.";
            default:
                return "Desculpe, não entendi a pergunta.";
        }
    }
}
