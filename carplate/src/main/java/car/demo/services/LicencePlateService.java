package car.demo.services;

import car.demo.models.DTO.LicenceDTO;
import car.demo.models.LicencePlate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LicencePlateService {
  List<LicencePlate> listOfPlates();
  List<LicencePlate> searchPlates(String plate, int police, int diplomat);
  List<LicencePlate> brandLister(String brand);
  LicenceDTO response(String brand);
  boolean plateValidator(String plate);
}
