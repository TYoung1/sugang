package sugang.tichimi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sugang.tichimi.Entity.Lecture;

import java.util.List;

@Repository
public interface LectureRepository extends JpaRepository<Lecture,Integer> {
    @Query(value = "SELECT * FROM lecture AS A JOIN (SELECT lecture_id FROM lecture_category WHERE category_id IN :categories) AS B ON A.lecture_id = B.lecture_id", nativeQuery = true)
    public List<Lecture> findLecturesByCategoryId(List<Integer> categories);
}
