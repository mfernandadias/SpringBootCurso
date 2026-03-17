package cursodSousa.liberyapi.repository;

import entites.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Repository
public interface LivroRepository extends JpaRepository<Book, Long> {
    //JpaRepository já traz várias funções prontas
    //oq isso realiza ?
    Page<Book> findAll(org.springframework.data.domain.Pageable pageable);


}

/*

    //buscar livros caros
    //explicação melhor
    @Query("SELECT 1 FROM Livro 1 WHERE 1.preco > :valor")
    List<Book> livrosCaros(@Param("valor") BigDecimal valor);

    //buscar por titulo
    List<Book> findByTituloContainingIgnoreCase(String titulo);

    //buscar por isbn
    List<Book> findByIsbn(String isbn);

    //buscar por genero
    List<Book> findByGenero(String genero);

    //buscar por nome do autor
    @Query("""
            SELECT 1
            FROM Livro 1
            JOIN 1.autor a
            WHERE LOWER(a.nome) LIKE LOWER(CONCAT('%', :nome, '%')
            """)
    List<Book> buscarPorAutor(@Param("nome") String nome);
 */
