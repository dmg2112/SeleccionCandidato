package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class Controller {
	@FXML
	private Button btnAdd;
	@FXML
	private Button btnDeslct;
	@FXML
	private ListView<String> Candidates;
	@FXML
	private ListView<String> Selected;

	private ObservableList<String> bands;
	private ObservableList<String> SelectedBands;

	public void initialize() {
		bands = FXCollections.observableArrayList("SOAD", "Sabaton", "Slipknot", "Kontrust");

		Candidates.setItems(bands);
	}

	public void select() {
		Boolean candidatos = Candidates.getItems().isEmpty();
		ObservableList<String> selected = Selected.getItems();
		if (!candidatos) {
			ObservableList<String> candidates = Candidates.getItems();
			String item = Candidates.getSelectionModel().getSelectedItem();
			if (!(item == null)) {

				selected.add(item);
				candidates.remove(item);
				Candidates.setItems(candidates);
				Selected.setItems(selected);

			} else {

			}

		}

	}

	public void deselect() {
		Boolean seleccionados = Selected.getItems().isEmpty();
		ObservableList<String> candidates = Candidates.getItems();

		if (!seleccionados) {
			ObservableList<String> selected = Selected.getItems();
			String item = Selected.getSelectionModel().getSelectedItem();
			if (!(item == null)) {

				candidates.add(item);
				selected.remove(item);
				Candidates.setItems(candidates);
				Selected.setItems(selected);

			} else {

			}

		}

	}

}
