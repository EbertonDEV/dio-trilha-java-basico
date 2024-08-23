public class loja {
    public static void main(String[] args) {
        iPhone ph = new iPhone();
        AparelhoTelefonico aparelhoTelefonico = ph;
        ReprodutorMusical reprodutorMusical = ph;
        NavegadorInternet navegadorInternet = ph;

        ph.tocar();
        ph.tocar();
        ph.adicionarNovaAba();       
    }

}
