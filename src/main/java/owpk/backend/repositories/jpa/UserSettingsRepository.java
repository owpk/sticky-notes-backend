package owpk.backend.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import owpk.backend.entities.jpa.UserSettings;

@Repository
public interface UserSettingsRepository extends JpaRepository<UserSettings, Long>, JpaSpecificationExecutor<UserSettings> {

}