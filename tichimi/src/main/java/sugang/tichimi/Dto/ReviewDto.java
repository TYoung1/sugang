package sugang.tichimi.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sugang.tichimi.Entity.Review;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {
    private String content;
    private Double score;

    public Review toEntity(){
        Review entity = new Review();
        entity.setReviewContent(this.content);
        entity.setScore(this.score);
        entity.setCreatedAt(ZonedDateTime.now());
        entity.setUpdatedAt(ZonedDateTime.now());
        return entity;
    }
}
