public class Main {
    public static void main(String[] args) {
        
        Estofado puff = new Puff();
        Estofado sofa = new Sofa();
        Estofado cadeira = new Cadeira();

        Comando comandoPuff = new ComandoFabricarPuff(puff);
        Comando comandoSofa = new ComandoFabricarSofa(sofa);
        Comando comandoCadeira = new ComandoFabricarCadeira(cadeira);

        FabricaDeEstofados fabrica = new FabricaDeEstofados();

        fabrica.setComando(comandoPuff);
        fabrica.pedirFabricacao();

        fabrica.setComando(comandoSofa);
        fabrica.pedirFabricacao();

        fabrica.setComando(comandoCadeira);
        fabrica.pedirFabricacao();
    }
}
