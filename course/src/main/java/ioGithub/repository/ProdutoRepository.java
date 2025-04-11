package ioGithub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  ioGithub.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
