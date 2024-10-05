package repository;
import neves.seven.api_rest_railway.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    
}
