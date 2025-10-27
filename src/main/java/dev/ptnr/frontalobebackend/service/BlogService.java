package dev.ptnr.frontalobebackend.service;

import dev.ptnr.frontalobebackend.domain.Article;
import dev.ptnr.frontalobebackend.dto.AddArticleRequest;
import dev.ptnr.frontalobebackend.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final or @NotNull이 붙은 생성자를 만들어 줌
@Service // BlogService as Spring Bean
public class BlogService {
    private final BlogRepository blogRepository;

    // Add Blog Article
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
