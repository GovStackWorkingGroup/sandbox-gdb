package global.govstack.digitalregistries.bb.emulator.controller;

import global.govstack.digitalregistries.bb.emulator.dto.benefitpackage.BenefitPackageDto;
import global.govstack.digitalregistries.bb.emulator.dto.ListResponseDto;
import global.govstack.digitalregistries.bb.emulator.service.BenefitPackageService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Benefit Package Registry", description = "The Benefit Package data API")
public class BenefitPackageController {

    private static final Logger log = LoggerFactory.getLogger(BenefitPackageController.class);

    private final HttpServletRequest request;

    private final BenefitPackageService service;

    public BenefitPackageController(HttpServletRequest request, BenefitPackageService service) {
        this.request = request;
        this.service = service;
    }

    @RequestMapping(value = "/data/bpkg/1.0",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public ResponseEntity<ListResponseDto<BenefitPackageDto>> getAll() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
