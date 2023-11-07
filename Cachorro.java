
class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String fazerBarulho() {
        return nome + "faz Au Au";
    }

}

