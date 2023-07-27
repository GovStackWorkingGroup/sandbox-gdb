package global.govstack.digitalregistries.bb.emulator.service;

import global.govstack.digitalregistries.bb.emulator.dto.ExampleDTO;
import global.govstack.digitalregistries.bb.emulator.model.Example;
import global.govstack.digitalregistries.bb.emulator.repository.ExampleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    private final ModelMapper modelMapper;

    private final ExampleRepository repository;

    public ExampleService(ModelMapper modelMapper, ExampleRepository repository) {
        this.modelMapper = modelMapper;
        this.repository = repository;
    }

    public List<ExampleDTO> findAll() {
        return repository
                .findAll()
                .stream()
                .map(this::convertToDto)
                .toList();
    }

    public List<ExampleDTO> saveAll(List<ExampleDTO> exampleDTOS) {
        return exampleDTOS
                .stream()
                .map(this::convertToEntity)
                .map(repository::save)
                .map(this::convertToDto)
                .toList();
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    private Example convertToEntity(ExampleDTO exampleDTO)  {
        return modelMapper.map(exampleDTO, Example.class);
    }

    private ExampleDTO convertToDto(Example example) {
        return modelMapper.map(example, ExampleDTO.class);
    }
}
