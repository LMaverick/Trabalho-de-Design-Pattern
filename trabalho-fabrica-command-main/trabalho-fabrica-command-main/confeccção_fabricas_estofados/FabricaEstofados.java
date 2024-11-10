public class FabricaEstofados {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void pedirFabricacao() {
        comando.executar();
    }
}
