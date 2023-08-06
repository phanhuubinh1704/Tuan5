package State;

public class Main {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext();

        // Đèn đỏ
        trafficLight.showLight();

        // Chuyển sang đèn vàng
        trafficLight.setCurrentState(new YellowState());
        trafficLight.showLight();

        // Chuyển sang đèn xanh
        trafficLight.setCurrentState(new GreenState());
        trafficLight.showLight();
    }
}




