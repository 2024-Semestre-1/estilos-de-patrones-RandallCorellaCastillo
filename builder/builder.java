/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author truez
 */

public interface builder {
  void setCarType(CarType type);
  void setSeats(int seats);
  void setEngine(Engine engine);
  void setWheels(int wheels);
  void setLeatherSeats(Boolean leatherSeats);
  void setBatteries(int batteries);
  void setConvertible(Boolean convertible);
  void setElectricCar(Boolean electricCar);
}
