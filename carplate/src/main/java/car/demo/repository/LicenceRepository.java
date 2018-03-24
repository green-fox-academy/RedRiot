package car.demo.repository;

import car.demo.models.LicencePlate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenceRepository extends CrudRepository<LicencePlate, Integer> {
  List<LicencePlate> findAllByPlateStartingWith(String plate);
  List<LicencePlate> findAllByPlateContaining(String plate);
  List<LicencePlate> findAllByCarBrand(String brand);
}
