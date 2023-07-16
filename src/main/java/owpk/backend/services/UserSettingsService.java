package owpk.backend.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import owpk.backend.repositories.jpa.UserSettingsRepository;

@Service
@RequiredArgsConstructor
public class UserSettingsService {

    private final UserSettingsRepository userSettingsRepository;
}
