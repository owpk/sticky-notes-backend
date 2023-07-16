package owpk.backend.dtos;


import lombok.Data;

import java.io.Serializable;

@Data
public class CardGroupsDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private String name;

    private String color;

}
