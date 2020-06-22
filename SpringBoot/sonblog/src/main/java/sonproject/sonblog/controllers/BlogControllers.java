package sonproject.sonblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sonproject.sonblog.model.Blog.PostBlog;
import sonproject.sonblog.repository.PostBlogRepository;

@Controller
public class BlogControllers {
    @Autowired
    PostBlogRepository postBlogRepository;

    @GetMapping("/son_blog")
    public ModelAndView getHomeBlog(@PageableDefault(value = 3) Pageable pageable){
        Page<PostBlog> listPost = postBlogRepository.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("homeViews/blogViews/son_blog");
        modelAndView.addObject("ListPost",listPost);
        return  modelAndView;
    }

}
