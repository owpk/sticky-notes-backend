package owpk.backend.dtos;


import lombok.Data;

import java.io.Serializable;

@Data
public class NotesDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private Long cardId;

    private String content;

    private Boolean draft;

    private Long timestamp;

}
