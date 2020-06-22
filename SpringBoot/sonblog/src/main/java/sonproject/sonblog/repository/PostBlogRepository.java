package sonproject.sonblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sonproject.sonblog.model.Blog.PostBlog;

public interface PostBlogRepository extends JpaRepository<PostBlog, Long> {
}
