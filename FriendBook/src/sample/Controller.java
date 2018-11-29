package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {


    public TextField textAddName;
    public TextField textAddAge;
    public TextField textAddNumber;
    public TextField textAddAddress;
    public TextField textAddEmail;
    public ListView <Friend> friendList = new ListView<>();
    public Label lblName;
    public Label lblAge;
    public Label lblNumber;
    public Label lblAddress;
    public Label lblEmail;

    public void addFriend(ActionEvent actionEvent) {
        String name = textAddName.getText();
        int age = Integer.parseInt(textAddAge.getText());
        String phoneNumber = textAddNumber.getText();
        String address = textAddAddress.getText();
        String emailAddress = textAddEmail.getText();

        Friend friend = new Friend(name, age, phoneNumber, address, emailAddress);
        friendList.getItems().add(friend);
        textAddName.clear();
        textAddAge.clear();
        textAddNumber.clear();
        textAddAddress.clear();
        textAddEmail.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend friend;
        friend = friendList.getSelectionModel().getSelectedItem();
        lblName.setText(friend.name);
        lblAge.setText(Integer.toString(friend.getAge()));
        lblNumber.setText(friend.phoneNumber);
        lblAddress.setText(friend.address);
        lblEmail.setText(friend.emailAddress);
    }

    public void deleteFriend(ActionEvent actionEvent) {
        Friend friend;
        friend = friendList.getSelectionModel().getSelectedItem();
        friendList.getItems().remove(friend);
    }
}
