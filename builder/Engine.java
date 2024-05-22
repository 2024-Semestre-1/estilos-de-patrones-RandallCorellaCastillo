/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author truez
 */
public class Engine {
  private Integer engineCapacity;
  public Integer getEngineCapacity() {
    return engineCapacity;
  }
  public void setEngineCapacity(Integer engineCapacity) {
    this.engineCapacity = engineCapacity;
  }
  public Engine(Integer engineCapacity) {
    this.engineCapacity = engineCapacity;
  }
}