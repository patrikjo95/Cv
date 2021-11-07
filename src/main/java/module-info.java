module com.example.cv2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cv2 to javafx.fxml;
    exports com.example.cv2;
}