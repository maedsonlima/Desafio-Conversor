import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Menu meuMenu = new Menu ();


        ApiRequisicao requisitar = new ApiRequisicao ();

        do {
            meuMenu.exibirTelaInicial();     // mostra o menu
            requisitar.requistar();         // lê a escolha do usuário
        } while (requisitar.getOpcaoEscolhida() != 7); // repete enquanto a escolha for diferente de 7

    }
}