package State;

public class GreenState implements LightState {
    @Override
    public void showLight() {
        System.out.println("Đèn giao thông đang hiển thị màu xanh");
    }
}
