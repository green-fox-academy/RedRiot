package car.demo.models.DTO;

import car.demo.models.LicencePlate;

import java.util.List;

public class LicenceDTO {
  private String result;
  private List<LicencePlate> data;

  public LicenceDTO() {
  }


  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<LicencePlate> getData() {
    return data;
  }

  public void setData(List<LicencePlate> data) {
    this.data = data;
  }
}
