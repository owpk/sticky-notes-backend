package owpk.backend.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import owpk.backend.entities.jpa.CardGroup;

@Repository
public interface CardGroupsRepository extends JpaRepository<CardGroup, Long>, JpaSpecificationExecutor<CardGroup> {

}