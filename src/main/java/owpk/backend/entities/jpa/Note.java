package owpk.backend.entities.jpa;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "notes")
public class Note implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "card_id")
    private Long cardId;

    @Column(name = "content")
    private String content;

    @Column(name = "draft")
    private Boolean draft;

    @Column(name = "timestamp")
    private Long timestamp;

}
