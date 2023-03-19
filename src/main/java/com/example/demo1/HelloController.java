package com.example.demo1;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class HelloController {
    public TextField textField ;
    public ListView<String> listView ;
    ArrayList<String> names = new ArrayList<>();




    public void addToCollection(ActionEvent actionEvent) {
        names.add(textField.getText());
        listView.getItems().clear();
        for (String name : names) {
            listView.getItems().add(name);
        }
        textField.clear();
    }

    public void removeFromCollection(ActionEvent actionEvent) {
        int select = listView.getSelectionModel().getSelectedIndex();
        names.remove(select);
        listView.getItems().clear();
        for (String name : names) {
            listView.getItems().add(name);
        }

    }
}