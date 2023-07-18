package sugang.tichimi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sugang.tichimi.Dto.ReviewDto;
import sugang.tichimi.Entity.Review;
import sugang.tichimi.Repository.LectureRepository;
import sugang.tichimi.Repository.ReviewRepository;

@Service
public class ReviewService {
    @Autowired
    LectureRepository lectureRepository;
    @Autowired
    ReviewRepository reviewRepository;
    public void createReview(int lectureId, ReviewDto dto){
        lectureRepository.findById(lectureId);

        Review review = dto.toEntity();
        review.setLectureId(lectureId);
        reviewRepository.save(review);
    }
}
