package global.govstack.digitalregistries.bb.emulator.repository;

import global.govstack.digitalregistries.bb.emulator.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
