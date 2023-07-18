package sugang.tichimi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import sugang.tichimi.Entity.Review;
@Service
public interface ReviewRepository extends JpaRepository<Review,Integer> {

}
