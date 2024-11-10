public class FabricarPuff implements Comando {
    private Estofado estofado;

    public FabricarPuff(Estofado estofado) {
        this.estofado = estofado;
    }

    @Override
    public void executar() {
        estofado.confecionar();
    }
}
