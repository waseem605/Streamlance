package com.example.streamlance.Models;

public class Cars {
    String CarName,Carpic,CarModel;

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getCarpic() {
        return Carpic;
    }

    public void setCarpic(String carpic) {
        Carpic = carpic;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public Cars(String CarName, String Carpic, String CarModel)
    {
          this.CarName=CarName;
          this.CarModel=CarModel;
          this.Carpic=Carpic;
    }
}
