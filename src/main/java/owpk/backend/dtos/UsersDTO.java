package owpk.backend.dtos;


import lombok.Data;

import java.io.Serializable;

@Data
public class UsersDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private String nickName;

    private String email;

    private String password;

}
