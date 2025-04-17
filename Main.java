import iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("radioactive - imagine dragons");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        meuIphone.ligar("40028922");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador de Internet
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
