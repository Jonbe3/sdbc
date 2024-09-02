package biblioteca;

public record Cliente(String nome) {

    public void comprarLivro(Biblioteca biblioteca, int idLivro) {
        biblioteca.venderLivro(idLivro);
    }

    public void emprestarLivro(Biblioteca biblioteca, int idLivro) {
        biblioteca.emprestarLivro(idLivro);
    }

    public void devolverLivro(Biblioteca biblioteca, int idLivro) {
        biblioteca.devolverLivro(idLivro);
    }

}
