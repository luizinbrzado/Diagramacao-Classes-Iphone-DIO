package funcoes;

public interface AparelhoTelefonico {

    private Boolean redeMovelDisponivel() {
        return true;
    }

    public void ligar();

    public void atender();

    public void inciarCorreioVoz();
}
