import multifuncional.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.inciarCorreioVoz();

        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
    }
}
