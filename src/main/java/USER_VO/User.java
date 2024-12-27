package USER_VO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User")
@Entity
public class User {

    @Id
    @Column
    private String USER_ID;

    @Column
    private String  PWD;



}
