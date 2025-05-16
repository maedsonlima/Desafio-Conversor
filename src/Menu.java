public class Menu {

    private String telaInicial = """
                Seja bem vindo ao conversor de moedas :)
                
                1 - Dólar ==>> peso argentino
                2 - Peso argentino ==>> dólar
                3 - Dólar ==>> Real Brasileiro
                4 - Real brasileiro ==>> dólar
                5 - Dólar ==>> peso colombiano
                6 - Peso colombiano ==>> dólar
                7 - Sair
                
                Escolha uma opção válida.
                """;

    public String getTelaInicial() {
        return telaInicial;
    }

  public void exibirTelaInicial () {
        System.out.println(getTelaInicial());
    }
}
