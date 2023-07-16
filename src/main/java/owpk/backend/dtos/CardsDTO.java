package owpk.backend.dtos;


import lombok.Data;

import java.io.Serializable;

@Data
public class CardsDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private Long userId;

    private Long groupId;

    private String title;

    private Boolean toggleState;

    private Long createdAt;

    private Long updatedAt;

}
