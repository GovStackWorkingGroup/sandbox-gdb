package global.govstack.digitalregistries.bb.emulator.service;

import global.govstack.digitalregistries.bb.emulator.dto.benefitpackage.BenefitPackageDto;
import global.govstack.digitalregistries.bb.emulator.dto.ListResponseDto;
import global.govstack.digitalregistries.bb.emulator.model.BenefitPackage;
import global.govstack.digitalregistries.bb.emulator.repository.BenefitPackageRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class BenefitPackageService {

    private final ModelMapper modelMapper;

    private final BenefitPackageRepository repository;

    public BenefitPackageService(ModelMapper modelMapper, BenefitPackageRepository repository) {
        this.modelMapper = modelMapper;
        this.repository = repository;
    }

    public ListResponseDto<BenefitPackageDto> findAll() {
        var benefitPackages = repository
                .findAll()
                .stream()
                .map(this::convertToDto)
                .toList();
        return new ListResponseDto<>(benefitPackages.size(), 0, 0, benefitPackages);
    }

    private BenefitPackageDto convertToDto(BenefitPackage benefitPackage) {
        return modelMapper.map(benefitPackage, BenefitPackageDto.class);
    }

}
