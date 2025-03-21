public class Iphone implements ReprodutorMusical,AparelhoTelefonico,NavegadorInternet{
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("chamada atendida");

    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("correio de voz iniciado");

    }

    @Override
    public void exibirPagina() {
        System.out.println("exibindo pagina da internet");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("nova aba adicionada");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("pagina atualizada");

    }

    @Override
    public void tocar() {
        System.out.println("tocando musica");

    }

    @Override
    public void pausar() {
        System.out.println("musica pausada");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica "+ musica + " selecionada");

    }
}
