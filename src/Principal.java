import java.io.IOException;

public class Principal extends Moeda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Menu meuMenu = new Menu ();


        Calculadora calculadora = new Calculadora();

        do {
            meuMenu.exibirTelaInicial();     // mostra o menu
            calculadora.requistar();         // lê a escolha do usuário
            calculadora.converter();
        } while (calculadora.getOpcaoEscolhida() != 7); // repete enquanto a escolha for diferente de 7



    }
}