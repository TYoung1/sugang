package sugang.tichimi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sugang.tichimi.Entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
