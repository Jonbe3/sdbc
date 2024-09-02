package biblioteca;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de livros
        Livro livro1 = new Livro(1, "Java: Como Programar", "Deitel", 10, 120.0);
        Livro livro2 = new Livro(2, "Clean Code", "Robert C. Martin", 5, 80.0);
        Livro livro3 = new Livro(3, "Código Limpo", "Robert C. Martin", 3, 75.0);
        Livro livro4 = new Livro(4, "Java: Como Programar", "Deitel", 7, 120.0);  // Livro repetido

        // Criando instância da biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);

        // Listando todos os livros da biblioteca
        System.out.println("Lista de livros na biblioteca:");
        biblioteca.listarLivros();

        // Contando livros por autor
        String autor = "Robert C. Martin";
        int livrosDoAutor = biblioteca.contarLivrosPorAutor(autor);
        System.out.println("Número de livros de " + autor + ": " + livrosDoAutor);

        // Contando livros repetidos
        int livrosRepetidos = biblioteca.contarLivrosRepetidos();
        System.out.println("Número de livros repetidos: " + livrosRepetidos);

        // Criando instância de cliente
        Cliente cliente1 = new Cliente("João");

        // Cliente comprando um livro
        System.out.println("\nCliente " + cliente1.nome() + " comprando o livro 'Clean Code':");
        cliente1.comprarLivro(biblioteca, 2);

        // Cliente emprestando um livro
        System.out.println("\nCliente " + cliente1.nome() + " emprestando o livro 'Código Limpo':");
        cliente1.emprestarLivro(biblioteca, 3);

        // Cliente devolvendo um livro
        System.out.println("\nCliente " + cliente1.nome() + " devolvendo o livro 'Código Limpo':");
        cliente1.devolverLivro(biblioteca, 3);

        // Listando novamente todos os livros da biblioteca para verificar mudanças
        System.out.println("\nLista de livros na biblioteca após operações:");
        biblioteca.listarLivros();
    }
}
