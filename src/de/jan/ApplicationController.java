package de.jan;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class ApplicationController {


    @FXML
    private TextArea inputField;
    private int firstNumber = 0;
    private int secondNumber = 0;
    private int operator = -1;
    private boolean isSecondNumber = false;

    public ApplicationController() {}

    @FXML
    private void initialize () {}

    @FXML
    private void reset () {

        inputField.setText("");
        firstNumber = 0;
        secondNumber = 0;
        operator = -1;
        isSecondNumber = false;
    }



    @FXML
    private void calculate () {

        switch (operator) {

            case 1:

                inputField.setText(firstNumber + "+" + secondNumber + " = "
                        + String.valueOf((firstNumber) + (secondNumber)));
                return;

            case 2:

                inputField.setText(firstNumber + "-" + secondNumber + " = "
                        + String.valueOf((firstNumber) - (secondNumber)));
                return;

            case 3:

                inputField.setText(firstNumber + "*" + secondNumber + " = "
                        + String.valueOf((firstNumber) * (secondNumber)));
                return;

            case 4:

                inputField.setText(firstNumber + "/" + secondNumber + " = "
                        + String.valueOf(Float.valueOf(firstNumber) / Float.valueOf(secondNumber)));
                return;



        }


    }

    @FXML
    private void numberOne() {

        inputField.appendText("1");

        if(!isSecondNumber) {
            firstNumber = Integer.valueOf(firstNumber + "1");
        } else {
            secondNumber = Integer.valueOf(secondNumber + "1");
        }

    }

    @FXML
    private void numberTwo() {

        inputField.appendText("2");

        if(!isSecondNumber) {
            firstNumber = Integer.valueOf(firstNumber + "2");
        } else {
            secondNumber = Integer.valueOf(secondNumber + "2");
        }
    }

    @FXML
    private void numberThree() {

        inputField.appendText("3");

        if(!isSecondNumber) {
            firstNumber = Integer.valueOf(firstNumber + "3");
        } else {
            secondNumber = Integer.valueOf(secondNumber + "3");
        }

    }

    @FXML
    private void numberFour() {

        inputField.appendText("4");

        if(!isSecondNumber) {
            firstNumber = Integer.valueOf(firstNumber + "4");
        } else {
            secondNumber = Integer.valueOf(secondNumber + "4");
        }

    }

    @FXML
    private void numberFive() {

        inputField.appendText("5");

        if(!isSecondNumber) {
            firstNumber = Integer.valueOf(firstNumber + "5");
        } else {
            secondNumber = Integer.valueOf(secondNumber + "5");
        }


    }

    @FXML
    private void numberSix() {

        inputField.appendText("6");

        if(!isSecondNumber) {
            firstNumber = Integer.valueOf(firstNumber + "6");
        } else {
            secondNumber = Integer.valueOf(secondNumber + "6");
        }

    }

    @FXML
    private void numberSeven() {

        inputField.appendText("7");

        if(!isSecondNumber) {
            firstNumber = Integer.valueOf(firstNumber + "7");
        } else {
            secondNumber = Integer.valueOf(secondNumber + "7");
        }

    }

    @FXML
    private void numberEight() {

        numberInput("8");
    }


    private void numberInput(String s) {

        inputField.appendText(s);

        if(!isSecondNumber) {
            firstNumber = Integer.valueOf(firstNumber + s);
        } else {
            secondNumber = Integer.valueOf(secondNumber + s);
        }
    }


    @FXML
    private void numberNine() {
        inputField.appendText("9");
        if(!isSecondNumber) {
            firstNumber = Integer.valueOf(firstNumber + "9");
        } else {
            secondNumber = Integer.valueOf(secondNumber + "9");
        }
    }

    @FXML
    private void numberZero() {

        inputField.appendText("0");

        if(!isSecondNumber) {
            firstNumber = Integer.valueOf(firstNumber + "0");
        } else {
            secondNumber = Integer.valueOf(secondNumber + "0");
        }

    }

    @FXML
    private void plus() {

        inputField.appendText("+");
        isSecondNumber = true;

        if (operator == -1) {
            operator = 1;

        }
    }

    @FXML
    private void minus() {

        inputField.appendText("-");
        isSecondNumber = true;
        if (operator == -1) {
            operator = 2;

        }
    }

    @FXML
    private void multiplicate() {

        inputField.appendText("*");
        isSecondNumber = true;
        if (operator == -1) {
            operator = 3;

        }
    }

    @FXML
    private void divide() {

        inputField.appendText("/");
        isSecondNumber = true;
        if (operator == -1) {
            operator = 4;

        }
    }
}