package com.bms.controller;

import java.io.IOException;

import com.bms.BMS;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class BookSearchController {

	 @FXML
	    private TableView<?> book_table;

	    @FXML
	    private TableColumn<?, ?> col_author;

	    @FXML
	    private TableColumn<?, ?> col_category;

	    @FXML
	    private TableColumn<?, ?> col_code;

	    @FXML
	    private TableColumn<?, ?> col_price;

	    @FXML
	    private TableColumn<?, ?> col_title;

	    @FXML
	    private TextField txt_author;

	    @FXML
	    private TextField txt_category;

	    @FXML
	    private TextField txt_title;

	    @FXML
	    void search_click(MouseEvent event) {

	    }
	    
	    @FXML
	    void btn_back_click(ActionEvent event) throws IOException {
	    	BMS.changeView("view/Book.fxml");
	    }
}
