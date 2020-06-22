package sonproject.sonblog.service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sonproject.sonblog.model.Blog.PostBlog;
import sonproject.sonblog.model.User.User;

import java.util.List;
import java.util.Optional;

public interface PostBlogService {
    Page<PostBlog> findAllBlog(Pageable pageable);
    Optional<User> findById(Long id);
    void save(PostBlog postBlog);
    void remove(PostBlog postBlog);
}
