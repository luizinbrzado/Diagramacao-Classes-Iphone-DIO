package funcoes;

public interface NavegadorInternet {
    private Boolean conexaoInternet() {
        return true;
    }

    public void exibirPagina();

    public void adicionarNovaAba();

    public void atualizarPagina();
}
