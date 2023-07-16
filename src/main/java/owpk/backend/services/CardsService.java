package owpk.backend.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import owpk.backend.repositories.jpa.CardsRepository;

@Service
@RequiredArgsConstructor
public class CardsService {

    private final CardsRepository cardsRepository;
}
