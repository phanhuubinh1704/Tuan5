package singletona;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Xây dựng bất hợp pháp - Lỗi biên dịch: Hàm tạo SingleObject() không có quyền truy cập
        // SingleObject object = new SingleObject();

        // Lấy duy nhất đối tượng có sẵn
        SingleObject object = SingleObject.getInstance();

        // Hiển thị thông báo
        object.showMessage();
    }
}
