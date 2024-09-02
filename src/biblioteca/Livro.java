package biblioteca;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int quantidade;
    private double preco;

    // Construtor
    public Livro(int id, String titulo, String autor, int quantidade, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Métodos getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para mostrar informações do livro
    public void mostrarInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + preco);
    }
}
