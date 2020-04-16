public class Main {

    public static void main(String[] args) {
        BarkingDog.shouldWakeUp(true,1);    // should be true
        BarkingDog.shouldWakeUp(false,2);   // should be false
        BarkingDog.shouldWakeUp(true,8);    // should be false
        BarkingDog.shouldWakeUp(true,-1);   // should be false
    }
}
