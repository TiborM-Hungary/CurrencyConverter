package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerConverter implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //setting label value to zero as default
        labelResult.setText("0");
        comboBoxFromCurrency.getItems().addAll(
                "EUR",
                "USD",
                "GBP",
                "AUD",
                "CAD",
                "RUB"
        );
    }

    @FXML
    private Label labelResult;

    @FXML
    private TextField textFieldEnteredAmount;

    @FXML
    private ComboBox comboBoxFromCurrency;

    @FXML
    private Button buttonConvert;

    @FXML
    public void convert() {

        int convertAmount = Integer.parseInt(textFieldEnteredAmount.getText());
        String baseCurrency = String.valueOf(comboBoxFromCurrency.getValue());

        if (convertAmount <= 0){
            labelResult.setText("Negative amount");
            return;
        }

        switch (baseCurrency) {

            case "EUR":
                int resultEur = convertAmount * CurrencyValues.getSessionInstance().getEur();
                labelResult.setText(String.valueOf(resultEur));
                break;

            case "USD":
                int resultUSD = convertAmount * CurrencyValues.getSessionInstance().getUsd();
                labelResult.setText(String.valueOf(resultUSD));
                break;

            case "GBP":
                int resultGBP = convertAmount * CurrencyValues.getSessionInstance().getGbp();
                labelResult.setText(String.valueOf(resultGBP));
                break;

            case "AUD":
                int resultAUD = convertAmount * CurrencyValues.getSessionInstance().getAud();
                labelResult.setText(String.valueOf(resultAUD));
                break;

            case "CAD":
                int resultCAD = convertAmount * CurrencyValues.getSessionInstance().getCad();
                labelResult.setText(String.valueOf(resultCAD));
                break;

            case "RUB":
                double resultRUB = convertAmount * CurrencyValues.getSessionInstance().getRub();
                labelResult.setText(String.format("%1$,.2f", resultRUB));
                break;

            default:
                labelResult.setText("Select currency");
                break;
        }
    }
}
