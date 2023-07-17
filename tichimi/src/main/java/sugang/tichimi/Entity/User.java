package sugang.tichimi.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "user")
public class User {
    @Id
    private String userId;
    private String userPw;
    private String userName;
    private String userEmail;
    private ZonedDateTime signupDay;
}
