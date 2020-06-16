package controllers;

public class Car {
    private Wheels wheel = new W;
    private Battery battery;

  /*Ở đâu đó trong project, ta khởi tạo những objects mà đc yêu cầu bởi class này
    Có 2 cách để implement dependency injection
    1. Dựa vào constructor
    2. Dựa vào Setter method
  */

    // Dựa vào constructor
    Car(Wheel wh, Battery bt) {
        this.wheel = wh;
        this.bt = bt;
    }

    // Dựa vào Setter method
    void setWheel(Batter bt){
        this.bt = bt;
    }

}
