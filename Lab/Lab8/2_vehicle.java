class vehicleInfo{
  public void show(Vehicle v) {
    // write your code here
    Ststem.out.println("This is class "+);
    Ststem.out.println("The WheelCount is "+WheelCount);
    Ststem.out.println("The MaxSpeed is "+MaxSpeed);
  }
}

class Car extends Vehicle {
  @Override
  public int getWheelCount() {
    // write your code here
    return wheelCount;
  }

  @Override
  public int getMaxSpeed() {
    // write your code here
    return maxSpeed;
  }
}

class Motorcycle extends Vehicle {
  @Override
  public int getWheelCount() {
    // write your code here
    return wheelCount;
  }

  @Override
  public int getMaxSpeed() {
    // write your code here
  }

}

class Bicycle extends Vehicle {
  @Override
  public int getWheelCount() {
    // write your code here
  }

  @Override
  public int getMaxSpeed() {
    // write your code here
  }

}
