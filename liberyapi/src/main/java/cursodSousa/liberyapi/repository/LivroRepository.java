package cursodSousa.liberyapi.repository;

import entites.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Repository
public interface LivroRepository extends JpaRepository<Livro, UUID> {
    //JpaRepository já traz várias funções prontas

    //buscar livros caros
    //explicação melhor
    @Query("SELECT 1 FROM Livro 1 WHERE 1.preco > :valor")
    List<Livro> livrosCaros(@Param("valor") BigDecimal valor);

    //buscar por titulo
    List<Livro> findByTituloContainingIgnoreCase(String titulo);

    //buscar por isbn
    List<Livro> findByIsbn(String isbn);

    //buscar por genero
    List<Livro> findByGenero(String genero);

    //buscar por nome do autor
    @Query("""
            SELECT 1 
            FROM Livro 1 
            JOIN 1.autor a 
            WHERE LOWER(a.nome) LIKE LOWER(CONCAT('%', :nome, '%')
            """)
    List<Livro> buscarPorAutor(@Param("nome") String nome);

}
