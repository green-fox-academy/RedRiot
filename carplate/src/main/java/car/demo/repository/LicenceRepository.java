package car.demo.repository;

import car.demo.models.LicencePlate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenceRepository extends CrudRepository<LicencePlate, Integer> {

  @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE 'DT%'", nativeQuery = true)
  List<LicencePlate> getDiplomat();

  @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE 'RB%'", nativeQuery = true)
  List<LicencePlate> getPolice();

  List<LicencePlate> findAllByPlateContaining(String plate);
  List<LicencePlate> findAllByCarBrand(String brand);
}
