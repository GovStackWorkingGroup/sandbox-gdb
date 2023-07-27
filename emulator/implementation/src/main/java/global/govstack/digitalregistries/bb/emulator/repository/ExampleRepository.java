package global.govstack.digitalregistries.bb.emulator.repository;

import global.govstack.digitalregistries.bb.emulator.model.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<Example, String> {}
