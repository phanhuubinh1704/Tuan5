package State;

public class YellowState implements LightState {
    @Override
    public void showLight() {
        System.out.println("Đèn giao thông đang hiển thị màu vàng");
    }
}