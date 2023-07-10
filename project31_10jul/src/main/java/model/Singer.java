package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "singer")
public class Singer {
    @Id
    @Column(name = "singer_id")
    private Long singerId;
    @Column(name = "singer_name")
    private String singerName;
    @Column(name = "singer_country")
    private String singerCountry;
}
