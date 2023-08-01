package sugang.tichimi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sugang.tichimi.Entity.User;

public interface UserRepository extends JpaRepository<User,String> {
}
