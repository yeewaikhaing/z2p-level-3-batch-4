package com.bms.controller;

import java.io.IOException;

import com.bms.BMS;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CategoryController {

	@FXML
    private TableColumn<?, ?> col_created_at;

    @FXML
    private TableColumn<?, ?> col_id;

    @FXML
    private TableColumn<?, ?> col_name;

    @FXML
    private TableColumn<?, ?> col_updated_at;

    @FXML
    private TableView<?> tbl_category;

    @FXML
    private TextField txt_name;

    @FXML
    void btn_add_click(ActionEvent event) {

    }

    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	BMS.changeView("view/Main.fxml");
    }

    @FXML
    void btn_update_click(ActionEvent event) {

    }
}
