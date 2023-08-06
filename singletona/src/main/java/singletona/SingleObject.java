package singletona;

public class SingleObject {
    // Tạo một đối tượng SingleObject
    private static SingleObject instance = new SingleObject();
// thể hiện tính duy nhât instance
    
    

    
    
    
    // Đặt hàm tạo là private để không thể tạo đối tượng từ bên ngoài lớp
    private SingleObject() {}
    // khởi tạo dùng private để k cho phép bên ngoài sài nó

    // Lấy duy nhất đối tượng có sẵn
    // vì duy nhất nên lấy nó ra 
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Xin chào Thế giới!");
    }
}
