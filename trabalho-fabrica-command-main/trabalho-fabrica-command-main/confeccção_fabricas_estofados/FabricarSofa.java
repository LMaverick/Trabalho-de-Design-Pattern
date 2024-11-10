public class FabricarSofa implements Comando {
    private Estofado estofado;

    public FabricarSofa(Estofado estofado) {
        this.estofado = estofado;
    }

    @Override
    public void executar() {
        estofado.confecionar();
    }
}
