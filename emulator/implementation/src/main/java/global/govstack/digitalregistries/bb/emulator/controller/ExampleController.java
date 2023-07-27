package global.govstack.digitalregistries.bb.emulator.controller;

import global.govstack.digitalregistries.bb.emulator.dto.ExampleDTO;
import global.govstack.digitalregistries.bb.emulator.service.ExampleService;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExampleController {

    private static final Logger log = LoggerFactory.getLogger(ExampleController.class);

    private final HttpServletRequest request;

    private final ExampleService service;

    public ExampleController(HttpServletRequest request, ExampleService service) {
        this.request = request;
        this.service = service;
    }

    @RequestMapping(value = "/example",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public ResponseEntity<List<ExampleDTO>> getAll() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/example",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<List<ExampleDTO>> saveAll(@RequestBody List<ExampleDTO> body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<>(service.saveAll(body), HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping("/example/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void saveAll(@PathVariable("id") String id) {
        service.delete(id);
    }
}
