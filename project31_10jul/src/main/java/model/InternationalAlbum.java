package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "international_album")

public class InternationalAlbum extends Album {
	@Column(name = "attribute")
    private String attribute;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "album_singer", joinColumns = @JoinColumn(name = "album_id"), inverseJoinColumns = @JoinColumn(name = "singer_id"))
    private List<Singer> singers;

    public InternationalAlbum(int albumId, String albumName, double price, String attribute, List<Singer> singers) {
        super(albumId, albumName, price);
        this.attribute = attribute;
        this.singers = singers;
    }
}

