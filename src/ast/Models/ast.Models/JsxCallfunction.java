package ast.Models.ast.Models;

import ast.Models.Id;
import ast.Models.JsxParameters;
import ast.Models.JsxSimpleCallfunction;

import java.util.ArrayList;
import java.util.List;

public class JsxCallfunction extends JsxParameters {

    List<ast.Models.Id> idList =new ArrayList<> ();
    List<JsxSimpleCallfunction> jsxSimpleCallfunctionList =new ArrayList<> ();

    public List<ast.Models.Id> getIdList() {
        return idList;
    }

    public void setIdList(List<Id> idList) {
        this.idList = idList;
    }

    public List<JsxSimpleCallfunction> getJsxSimpleCallfunctionList() {
        return jsxSimpleCallfunctionList;
    }

    public void setJsxSimpleCallfunctionList(List<JsxSimpleCallfunction> jsxSimpleCallfunctionList) {
        this.jsxSimpleCallfunctionList = jsxSimpleCallfunctionList;
    }
}
