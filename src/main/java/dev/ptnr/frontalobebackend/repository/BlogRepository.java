package dev.ptnr.frontalobebackend.repository;

import dev.ptnr.frontalobebackend.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
