package owpk.backend.dtos;


import lombok.Data;

import java.io.Serializable;

@Data
public class UserSettingsDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private Long userId;

    private String theme;

}
