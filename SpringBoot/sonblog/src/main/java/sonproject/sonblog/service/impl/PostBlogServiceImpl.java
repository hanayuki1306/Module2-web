package sonproject.sonblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sonproject.sonblog.model.Blog.PostBlog;
import sonproject.sonblog.model.User.User;
import sonproject.sonblog.repository.PostBlogRepository;
import sonproject.sonblog.service.PostBlogService;

import java.util.List;
import java.util.Optional;

public class PostBlogServiceImpl implements PostBlogService {
    @Autowired
    PostBlogRepository postBlogRepository;


    @Override
    public Page<PostBlog> findAllBlog(Pageable pageable) {
        return postBlogRepository.findAll(pageable);
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(PostBlog postBlog) {

    }

    @Override
    public void remove(PostBlog postBlog) {

    }
}
