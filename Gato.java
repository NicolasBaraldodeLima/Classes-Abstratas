class  Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String fazerBarulho() {
        return nome + "faz 'Miau";
    }
}