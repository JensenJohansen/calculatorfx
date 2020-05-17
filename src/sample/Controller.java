package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;

public class Controller implements Initializable {


    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn0;
    @FXML
    private Button btnc;
    @FXML
    private Button btneql;
    @FXML
    private Button btnmult;
    @FXML
    private Button btnfb;
    @FXML
    private Button btnbb;
    @FXML
    private Button btnrem;
    @FXML
    private Button btndot;
    @FXML
    private Button btnpls;
    @FXML
    private Button btnmns;
    @FXML
    private Button btndiv;
    @FXML
    private TextField textf;
    @FXML
    URL url;
    @FXML
    ResourceBundle resourceBundle;



    @FXML
    public void buttonAction(ActionEvent event) throws Exception {
       if (event.getSource()==btn1){
           textf.setText(textf.getText()+"1");
       }
       else if(event.getSource()==btn2){
           textf.setText(textf.getText()+"2");
       }
        else if (event.getSource()==btn3){
            textf.setText(textf.getText()+"3");
        }
        else if(event.getSource()==btn4){
            textf.setText(textf.getText()+"4");
        }
        else if (event.getSource()==btn5){
            textf.setText(textf.getText()+"5");
        }
        else if(event.getSource()==btn6){
            textf.setText(textf.getText()+"6");
        }
        else if (event.getSource()==btn7){
            textf.setText(textf.getText()+"7");
        }
        else if(event.getSource()==btn8){
            textf.setText(textf.getText()+"8");
        }
        else if (event.getSource()==btn9){
            textf.setText(textf.getText()+"9");
        }
        else if(event.getSource()==btnc){
            textf.setText("");
        }
        else if (event.getSource()==btnfb){
            textf.setText(textf.getText()+"(");
        }
        else if(event.getSource()==btnbb){
            textf.setText(textf.getText()+")");
        }
        else if (event.getSource()==btnpls){
            textf.setText(textf.getText()+"+");
        }
        else if(event.getSource()==btnmult){
            textf.setText(textf.getText()+"*");
        }
        else if (event.getSource()==btnmns){
            textf.setText(textf.getText()+"-");
        }
        else if(event.getSource()==btndiv){
            textf.setText(textf.getText()+"/");
        }
       else if(event.getSource()==btn0){
           textf.setText(textf.getText()+"0");
       }
       else if(event.getSource()==btndot){
           textf.setText(textf.getText()+".");
       }
       else if(event.getSource()==btnrem){
           textf.setText(String.valueOf(Double.parseDouble(textf.getText()) / 100));
       }
       else if(event.getSource()==btneql){
           String banswer=textf.getText();
           textf.setText("");
           textf.setText(textf.getText()+Test.findValueInBraces(banswer));

       }


       else{
           textf.setText(textf.getText()+"");
       }

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}