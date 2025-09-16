public abstract class Arma {

    // Atributos que toda arma terá.
    protected int dano;
    protected int minNivel;

    public Arma(int dano, int minNivel) {
        this.dano = dano;
        this.minNivel = minNivel;
    }

    // --- Getters ---
    public int getDano() {
        return dano;
    }

    public int getMinNivel() {
        return minNivel;
    }
}