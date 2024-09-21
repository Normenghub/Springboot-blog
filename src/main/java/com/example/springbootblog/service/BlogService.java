package com.example.springbootblog.service;

import com.example.springbootblog.domain.Article;
import com.example.springbootblog.dto.AddArticleRequest;
import com.example.springbootblog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;


    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
