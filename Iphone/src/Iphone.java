public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    //Parte do reprodutor musical
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
    //Parte do aparelho telefonico
    @Override
    public void ligar() {
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    //Parte do navegador internet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página web");
    }
}