/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;


public class Dealership {
  public void createLuxuryCar(builder builder) {
    builder.setCarType(CarType.LUXURY);
    Engine engine = new Engine(2700);
    builder.setSeats(4);
    builder.setElectricCar(Boolean.TRUE);
    builder.setBatteries(2);
    builder.setConvertible(Boolean.TRUE);
    builder.setLeatherSeats(Boolean.TRUE);
    builder.setEngine(engine);
  }
  public void createSmallCar(builder builder) {
    builder.setCarType(CarType.SMALL);
    Engine engine = new Engine(1200);
    builder.setBatteries(1);
    builder.setEngine(engine);
    builder.setSeats(4);
  }
  public void createBerlinaCar(builder builder) {
    builder.setCarType(CarType.BERLINA);
    Engine engine = new Engine(1900);
    builder.setSeats(5);
    builder.setElectricCar(Boolean.TRUE);
    builder.setBatteries(2);
    builder.setEngine(engine);
  }
  public void createSportCar(builder builder) {
    builder.setCarType(CarType.SPORT);
    Engine engine = new Engine(5400);
    builder.setSeats(2);
    builder.setElectricCar(Boolean.TRUE);
    builder.setBatteries(2);
    builder.setConvertible(Boolean.TRUE);
    builder.setEngine(engine);
  }
}