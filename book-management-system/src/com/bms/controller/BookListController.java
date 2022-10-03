package com.bms.controller;

import java.io.IOException;

import com.bms.BMS;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class BookListController {

	@FXML
    private TableView<?> book_table;

    @FXML
    private TableColumn<?, ?> col_author;

    @FXML
    private TableColumn<?, ?> col_category;

    @FXML
    private TableColumn<?, ?> col_code;

    @FXML
    private TableColumn<?, ?> col_created_by;

    @FXML
    private TableColumn<?, ?> col_price;

    @FXML
    private TableColumn<?, ?> col_title;

    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	BMS.changeView("view/Book.fxml");
    }
}
