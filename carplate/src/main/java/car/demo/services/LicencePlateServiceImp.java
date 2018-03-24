package car.demo.services;

import car.demo.models.DTO.LicenceDTO;
import car.demo.models.LicencePlate;
import car.demo.repository.LicenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LicencePlateServiceImp implements LicencePlateService {

  @Autowired
  LicenceRepository licenceRepository;



  @Override
  public List<LicencePlate> listOfPlates() {
    return (List<LicencePlate>) licenceRepository.findAll();
  }

  @Override
  public List<LicencePlate> searchPlates(String plate, int police, int diplomat) {
    if (police == 1) {
      return licenceRepository.findAllByPlateStartingWith("RB");

    } else if (diplomat == 1) {
      return licenceRepository.findAllByPlateStartingWith("DT");

    }
    return licenceRepository.findAllByPlateContaining(plate);
  }

  @Override
  public List<LicencePlate> brandLister(String brand) {
    return licenceRepository.findAllByCarBrand(brand);
  }

  @Override
  public LicenceDTO response( String brand) {
    LicenceDTO licenceResponse = new LicenceDTO();
    licenceResponse.setResult("ok");
    licenceResponse.setData(licenceRepository.findAllByCarBrand(brand));

    return licenceResponse;
  }

  @Override
  public boolean plateValidator(String plate) {
    ArrayList<Character> validCharacters = new ArrayList<Character>(Arrays.asList('-','0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'G', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

    if (plate.length() <= 7 && licenceRepository.findAllByPlateContaining(plate) != null) {
      for (int i = 0; i < plate.length(); i++) {
        if (!validCharacters.contains(plate.charAt(i))) {
          return false;
        }
        return true;
      }
    }
    return false;
  }

}
