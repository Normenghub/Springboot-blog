package com.example.springbootblog.service;

import com.example.springbootblog.domain.Article;
import com.example.springbootblog.dto.AddArticleRequest;
import com.example.springbootblog.dto.UpdateArticleRequest;
import com.example.springbootblog.repository.BlogRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;


    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
    public List<Article> findAll() {
        return blogRepository.findAll();
    }
    public Article findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));
    }

    public void delete(long id) {
        blogRepository.deleteById(id);
    }
    @Transactional
    public Article update(Long id, UpdateArticleRequest request){
        Article article = blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not found " + id));


        article.update(request.getTitle(), request.getContent());
        return article;
    }
}
