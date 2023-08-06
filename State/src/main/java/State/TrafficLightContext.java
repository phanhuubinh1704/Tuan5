package State;
//Lớp Context quản lý trạng thái của đèn giao thông

public class TrafficLightContext {
    private LightState currentState;

    public TrafficLightContext() {
        // Mặc định khi tạo đối tượng, đèn giao thông hiển thị màu đỏ
        currentState = new RedState();
    }

    public void setCurrentState(LightState state) {
        currentState = state;
    }

    public void showLight() {
        currentState.showLight();
    }
}
