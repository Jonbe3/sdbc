package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Método para adicionar um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Método para remover um livro da biblioteca
    public void removerLivro(int id) {
        livros.removeIf(livro -> livro.getId() == id);
    }

    // Método para vender um livro (diminui a quantidade)
    public void venderLivro(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                if (livro.getQuantidade() > 0) {
                    livro.setQuantidade(livro.getQuantidade() - 1);
                    System.out.println("biblioteca.Livro vendido com sucesso!");
                } else {
                    System.out.println("biblioteca.Livro fora de estoque!");
                }
                return;
            }
        }
        System.out.println("biblioteca.Livro não encontrado!");
    }

    // Método para emprestar um livro (diminui a quantidade)
    public void emprestarLivro(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                if (livro.getQuantidade() > 0) {
                    livro.setQuantidade(livro.getQuantidade() - 1);
                    System.out.println("biblioteca.Livro emprestado com sucesso!");
                } else {
                    System.out.println("biblioteca.Livro indisponível para empréstimo!");
                }
                return;
            }
        }
        System.out.println("biblioteca.Livro não encontrado!");
    }

    // Método para devolver um livro (aumenta a quantidade)
    public void devolverLivro(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                livro.setQuantidade(livro.getQuantidade() + 1);
                System.out.println("biblioteca.Livro devolvido com sucesso!");
                return;
            }
        }
        System.out.println("biblioteca.Livro não encontrado!");
    }

    // Método para listar todos os livros
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca.");
        } else {
            for (Livro livro : livros) {
                livro.mostrarInformacoes();
                System.out.println("---------------------------");
            }
        }
    }

    // Método para contar livros por autor
    public int contarLivrosPorAutor(String autor) {
        int count = 0;
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                count++;
            }
        }
        return count;
    }

    // Método para contar livros repetidos (mesmo título e autor)
    public int contarLivrosRepetidos() {
        HashMap<String, Integer> contadorLivros = new HashMap<>();
        int repetidos = 0;

        for (Livro livro : livros) {
            String chave = livro.getTitulo() + livro.getAutor();
            contadorLivros.put(chave, contadorLivros.getOrDefault(chave, 0) + 1);
        }

        for (int count : contadorLivros.values()) {
            if (count > 1) {
                repetidos += count - 1;
            }
        }
        return repetidos;
    }
}
