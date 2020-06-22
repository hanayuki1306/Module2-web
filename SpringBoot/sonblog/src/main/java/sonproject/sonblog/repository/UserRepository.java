package sonproject.sonblog.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import sonproject.sonblog.model.User.User;

public interface UserRepository extends JpaRepository<User,Long> {

}