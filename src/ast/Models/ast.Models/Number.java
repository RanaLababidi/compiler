package ast.Models.ast.Models;

import ast.Models.JsxExpression;

public class Number extends JsxExpression {
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}