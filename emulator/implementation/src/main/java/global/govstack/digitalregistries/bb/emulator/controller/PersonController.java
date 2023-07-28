package global.govstack.digitalregistries.bb.emulator.controller;

import global.govstack.digitalregistries.bb.emulator.dto.*;
import global.govstack.digitalregistries.bb.emulator.dto.person.PersonCreateDto;
import global.govstack.digitalregistries.bb.emulator.dto.person.PersonDto;
import global.govstack.digitalregistries.bb.emulator.service.PersonService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Person Registry", description = "The person registry data API")
public class PersonController {

    private static final Logger log = LoggerFactory.getLogger(PersonController.class);

    private final HttpServletRequest request;

    private final PersonService service;

    public PersonController(HttpServletRequest request, PersonService service) {
        this.request = request;
        this.service = service;
    }

    @RequestMapping(value = "/data/prsn/1.0",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public ResponseEntity<ListResponseDto<PersonDto>> list() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/data/prsn/1.0/read",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    public ResponseEntity<ContentResponseDto<PersonDto>> read(@RequestBody ReadDto<PersonDto> body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<>(service.read(body), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @RequestMapping(value = "/data/prsn/1.0/create-entries",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ReceiveResponseDto<List<ContentResponseDto<PersonDto>>>> create(@RequestBody WriteDto<List<ContentRequestDto<PersonCreateDto>>> body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<>(service.create(body), HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping("/data/prsn/1.0/{id}/delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Map> handleNoRecordFound() {
        return new ResponseEntity<>(Collections.singletonMap("detail", "no record found"),HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IncorrectResultSizeDataAccessException.class)
    public ResponseEntity<Map> handleMultipleRecordsFound() {
        return new ResponseEntity<>(Collections.singletonMap("detail", "multiple records found"), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Map> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        return new ResponseEntity<>(Collections.singletonMap("detail", ex.getMessage()), HttpStatus.BAD_REQUEST);
    }

}
