package owpk.backend.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import owpk.backend.repositories.jpa.UsersRepository;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;
}
