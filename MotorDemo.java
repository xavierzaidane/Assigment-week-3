public class MotorDemo {

    public static void main(String[] args) {
        Motor motor = new Motor();

        motor.statusPrint();
        motor.increaseEngine();

        motor.startEngine();
        motor.increaseEngine();
        motor.statusPrint();

        motor.increaseEngine();
        motor.statusPrint();

        motor.increaseEngine();
        motor.statusPrint();

        motor.increaseEngine();
        motor.statusPrint();

        motor.turnOffEngine();
        motor.statusPrint();
    }
}