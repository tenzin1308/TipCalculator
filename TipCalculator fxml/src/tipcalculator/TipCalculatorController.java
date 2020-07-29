/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tenzintashi
 */
public class TipCalculatorController implements Initializable {

    @FXML
    private TextField txtTotalAmt;
    @FXML
    private TextField txtTipPerc;
    @FXML
    private Button btnComputeTip;
    @FXML
    private Button btnClear;
    @FXML
    private Label lblTipPerPerson;
    @FXML
    private Button btnExit;
    @FXML
    private TextField txtSplit;
    @FXML
    private Label lblTotalPerPerson;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void btnClear(){
        txtTotalAmt.setText("");
        txtTipPerc.setText("");
        txtSplit.setText("");
        lblTipPerPerson.setText("");
        lblTotalPerPerson.setText("");
    }
    public void btnExit(){
        System.exit(0);
    }
    public void btnComputeTip(){
        double totalAmt = Double.parseDouble(txtTotalAmt.getText());
        int percent = Integer.parseInt(txtTipPerc.getText());
        int totalPeople = Integer.parseInt(txtSplit.getText());
        double perPersonTip = totalAmt * (double)percent/100;
        totalAmt += perPersonTip;
        perPersonTip = perPersonTip / totalPeople;
        totalAmt /= totalPeople;
        lblTipPerPerson.setText(String.format("The Tip should be $%.1f per person\n", perPersonTip));
        lblTotalPerPerson.setText(String.format("The amount is $%.1f per person\n", totalAmt));
    }
}
