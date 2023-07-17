package sugang.tichimi.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lecture")
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lectureId;
    private String lectureImg;
    private String lectureTitle;
    private String lectureInfo;
    private int price;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
}
