package State;

public class RedState implements LightState {
    @Override
    public void showLight() {
        System.out.println("Đèn giao thông đang hiển thị màu đỏ");
    }
}