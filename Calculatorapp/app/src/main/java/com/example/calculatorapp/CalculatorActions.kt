package com.example.calculatorapp

// for each thing User does we will send it to ViewModel
// but we don't to minimize the # of event to send:

// Events classified by: numbers, ac, del, operators, result (=)
sealed class CalculatorAction {
    data class Number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()

}
