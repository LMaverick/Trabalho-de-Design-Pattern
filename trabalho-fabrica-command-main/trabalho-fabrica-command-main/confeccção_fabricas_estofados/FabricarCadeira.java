public class FabricarCadeira implements Comando {
    private Estofado estofado;

    public FabricarCadeira(Estofado estofado) {
        this.estofado = estofado;
    }

    @Override
    public void executar() {
        estofado.confecionar();
    }
}
