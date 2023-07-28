package global.govstack.digitalregistries.bb.emulator.service;

import global.govstack.digitalregistries.bb.emulator.dto.*;
import global.govstack.digitalregistries.bb.emulator.dto.person.PersonCreateDto;
import global.govstack.digitalregistries.bb.emulator.dto.person.PersonDto;
import global.govstack.digitalregistries.bb.emulator.model.Person;
import global.govstack.digitalregistries.bb.emulator.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {

    private final ModelMapper modelMapper;

    private final PersonRepository repository;

    public PersonService(ModelMapper modelMapper, PersonRepository repository) {
        this.modelMapper = modelMapper;
        this.repository = repository;
    }

    public ListResponseDto<PersonDto> findAll() {
        var benefitPackages = repository
                .findAll()
                .stream()
                .map(this::convertToDto)
                .toList();
        return new ListResponseDto<>(benefitPackages.size(), 0, 0, benefitPackages);
    }

    public ContentResponseDto<PersonDto> read(ReadDto<PersonDto> body) {
        var example = Example.of(convertToEntity(body.getQuery().getContent()));
        var data = repository
                .findOne(example)
                .map((element) -> modelMapper.map(element, PersonDto.class))
                .get();

        return new ContentResponseDto<>(data);
    }

    @Transactional
    public ReceiveResponseDto<List<ContentResponseDto<PersonDto>>> create(WriteDto<List<ContentRequestDto<PersonCreateDto>>> body) {
        var result = body.getWrite()
                .stream()
                .map(ContentRequestDto::getContent)
                .map(this::convertToEntity)
                .map(repository::save)
                .map(this::convertToDto)
                .map(ContentResponseDto::new)
                .toList();

        return new ReceiveResponseDto<>(result);
    }

    private Person convertToEntity(PersonDto personDto) {
        return modelMapper.map(personDto, Person.class);
    }

    private Person convertToEntity(PersonCreateDto personDto) {
        return new Person(
                personDto.getFoundationalId(),
                personDto.getFirstName(),
                personDto.getLastName(),
                personDto.getEmail(),
                personDto.getDateOfBirth());
    }

    private PersonDto convertToDto(Person person) {
        return modelMapper.map(person, PersonDto.class);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
