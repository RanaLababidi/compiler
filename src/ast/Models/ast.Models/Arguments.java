package ast.Models.ast.Models;

import ast.Models.Node;
import ast.Models.Parameters;

import java.util.ArrayList;
import java.util.List;

public class Arguments extends Node {
    List<Parameters> parametersList = new ArrayList<>();

    public List<Parameters> getParametersList() {
        return parametersList;
    }

    public void setParametersList(List<Parameters> parametersList) {
        this.parametersList = parametersList;
    }

    public String generateCode() {
        return "";
    }


}
