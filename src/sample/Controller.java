package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class Controller extends LogicGame {

    @FXML
    public HBox oneHBox;
    @FXML
    public HBox twoHBox;
    @FXML
    public HBox threeHBox;
    @FXML
    public AnchorPane oneAnchorPane;
    @FXML
    public AnchorPane twoAnchorPane;
    @FXML
    public AnchorPane threeAnchorPane;


    // копка выбора поля 3x3
    @FXML
    void btn3x3(ActionEvent event) {
        threeHBox.setVisible(false);
        oneAnchorPane.setVisible(true);
        SIZE = 3;
        DOTS_TO_WIN = 3;
        field3x3 = 1;
        initMap();
    }

    // копка выбора поля 5x5
    @FXML
    void btn5x5(ActionEvent event) {
        threeHBox.setVisible(false);
        twoAnchorPane.setVisible(true);
        SIZE = 5;
        DOTS_TO_WIN = 4;
        field5x5 = 1;
        initMap();
    }

    // копка выбора поля 10x10
    @FXML
    void btn10x10(ActionEvent event) {
        threeHBox.setVisible(false);
        threeAnchorPane.setVisible(true);
        SIZE = 10;
        DOTS_TO_WIN = 5;
        field10x10 = 1;
        initMap();
    }

    // копка выбора многопользовательской игры
    @FXML
    void btnMultiplayer(ActionEvent event) {
        // СЮДА нужно добавить логику игры, чтобы могли играть два человека
        rivalPeople = 1;
        twoHBox.setVisible(false);
        threeHBox.setVisible(true);
    }

    // копка выбора игры против компьютера
    @FXML
    void btnPlayer(ActionEvent event) {
        rivalAi = 1;
        twoHBox.setVisible(false);
        threeHBox.setVisible(true);
    }

    // копка выходы из игры
    @FXML
    void btnExitGame(ActionEvent event) {
        System.exit(0);
    }

    // копка для начала новой игры
    @FXML
    void btnNewGame(ActionEvent event) {
        oneHBox.setVisible(false);
        twoHBox.setVisible(true);
        oneAnchorPane.setVisible(false);
        twoAnchorPane.setVisible(false);
        threeAnchorPane.setVisible(false);
        newPlayGame(event);
    }

    // Слушатели для поля 3x3
    //---------------------------------------------------------------------------------------------------------------------

    @FXML
    void handleSquareOneClick(MouseEvent event) {
        humanTurn(0, 0);
    }

    @FXML
    void handleSquareTwoClick(MouseEvent event) {
        humanTurn(1, 0);
    }

    @FXML
    void handleSquareThreeClick(MouseEvent event) {
        humanTurn(2, 0);
    }

    @FXML
    void handleSquareForeClick(MouseEvent event) {
        humanTurn(0, 1);
    }

    @FXML
    void handleSquareFiveClick(MouseEvent event) {
        humanTurn(1, 1);
    }

    @FXML
    void handleSquareSixClick(MouseEvent event) {
        humanTurn(2, 1);
    }

    @FXML
    void handleSquareSevenClick(MouseEvent event) {
        humanTurn(0, 2);
    }

    @FXML
    void handleSquareEightClick(MouseEvent event) {
        humanTurn(1, 2);
    }

    @FXML
    void handleSquareNineClick(MouseEvent event) {
        humanTurn(2, 2);
    }


// Слушатели для поля 5x5
//---------------------------------------------------------------------------------------------------

    @FXML
    void handleSquare1Click(MouseEvent event) {
        humanTurn(0, 0);
    }

    @FXML
    void handleSquare2Click(MouseEvent event) {
        humanTurn(1, 0);
    }

    @FXML
    void handleSquare3Click(MouseEvent event) {
        humanTurn(2, 0);
    }

    @FXML
    void handleSquare4Click(MouseEvent event) {
        humanTurn(3, 0);
    }

    @FXML
    void handleSquare5Click(MouseEvent event) {
        humanTurn(4, 0);
    }

    @FXML
    void handleSquare6Click(MouseEvent event) {
        humanTurn(0, 1);
    }

    @FXML
    void handleSquare7Click(MouseEvent event) {
        humanTurn(1, 1);
    }

    @FXML
    void handleSquare8Click(MouseEvent event) {
        humanTurn(2, 1);
    }

    @FXML
    void handleSquare9Click(MouseEvent event) {
        humanTurn(3, 1);
    }


    @FXML
    void handleSquare10Click(MouseEvent event) {
        humanTurn(4, 1);
    }

    @FXML
    void handleSquare11Click(MouseEvent event) {
        humanTurn(0, 2);
    }

    @FXML
    void handleSquare12Click(MouseEvent event) {
        humanTurn(1, 2);
    }

    @FXML
    void handleSquare13Click(MouseEvent event) {
        humanTurn(2, 2);
    }

    @FXML
    void handleSquare14Click(MouseEvent event) {
        humanTurn(3, 2);
    }

    @FXML
    void handleSquare15Click(MouseEvent event) {
        humanTurn(4, 2);
    }

    @FXML
    void handleSquare16Click(MouseEvent event) {
        humanTurn(0, 3);
    }

    @FXML
    void handleSquare17Click(MouseEvent event) {
        humanTurn(1, 3);
    }

    @FXML
    void handleSquare18Click(MouseEvent event) {
        humanTurn(2, 3);
    }

    @FXML
    void handleSquare19Click(MouseEvent event) {
        humanTurn(3, 3);
    }

    @FXML
    void handleSquare20Click(MouseEvent event) {
        humanTurn(4, 3);
    }

    @FXML
    void handleSquare21Click(MouseEvent event) {
        humanTurn(0, 4);
    }

    @FXML
    void handleSquare22Click(MouseEvent event) {
        humanTurn(1, 4);
    }

    @FXML
    void handleSquare23Click(MouseEvent event) {
        humanTurn(2, 4);
    }

    @FXML
    void handleSquare24Click(MouseEvent event) {
        humanTurn(3, 4);
    }

    @FXML
    void handleSquare25Click(MouseEvent event) {
        humanTurn(4, 4);
    }


// Слушатели для поля 10x10
//---------------------------------------------------------------------------------------------

    @FXML
    void handleSquareTen1Click(MouseEvent event) {
        humanTurn(0, 0);
    }

    @FXML
    void handleSquareTen2Click(MouseEvent event) {
        humanTurn(1, 0);
    }

    @FXML
    void handleSquareTen3Click(MouseEvent event) {
        humanTurn(2, 0);
    }

    @FXML
    void handleSquareTen4Click(MouseEvent event) {
        humanTurn(3, 0);
    }

    @FXML
    void handleSquareTen5Click(MouseEvent event) {
        humanTurn(4, 0);
    }

    @FXML
    void handleSquareTen6Click(MouseEvent event) {
        humanTurn(5, 0);
    }

    @FXML
    void handleSquareTen7Click(MouseEvent event) {
        humanTurn(6, 0);
    }

    @FXML
    void handleSquareTen8Click(MouseEvent event) {
        humanTurn(7, 0);
    }

    @FXML
    void handleSquareTen9Click(MouseEvent event) {
        humanTurn(8, 0);
    }

    @FXML
    void handleSquareTen10Click(MouseEvent event) {
        humanTurn(9, 0);
    }

    @FXML
    void handleSquareTen11Click(MouseEvent event) {
        humanTurn(0, 1);
    }

    @FXML
    void handleSquareTen12Click(MouseEvent event) {
        humanTurn(1, 1);
    }

    @FXML
    void handleSquareTen13Click(MouseEvent event) {
        humanTurn(2, 1);
    }

    @FXML
    void handleSquareTen14Click(MouseEvent event) {
        humanTurn(3, 1);
    }

    @FXML
    void handleSquareTen15Click(MouseEvent event) {
        humanTurn(4, 1);
    }

    @FXML
    void handleSquareTen16Click(MouseEvent event) {
        humanTurn(5, 1);
    }

    @FXML
    void handleSquareTen17Click(MouseEvent event) {
        humanTurn(6, 1);
    }

    @FXML
    void handleSquareTen18Click(MouseEvent event) {
        humanTurn(7, 1);
    }

    @FXML
    void handleSquareTen19Click(MouseEvent event) {
        humanTurn(8, 1);
    }

    @FXML
    void handleSquareTen20Click(MouseEvent event) {
        humanTurn(9, 1);
    }

    @FXML
    void handleSquareTen21Click(MouseEvent event) {
        humanTurn(0, 2);
    }

    @FXML
    void handleSquareTen22Click(MouseEvent event) {
        humanTurn(1, 2);
    }

    @FXML
    void handleSquareTen23Click(MouseEvent event) {
        humanTurn(2, 2);
    }

    @FXML
    void handleSquareTen24Click(MouseEvent event) {
        humanTurn(3, 2);
    }

    @FXML
    void handleSquareTen25Click(MouseEvent event) {
        humanTurn(4, 2);
    }

    @FXML
    void handleSquareTen26Click(MouseEvent event) {
        humanTurn(5, 2);
    }

    @FXML
    void handleSquareTen27Click(MouseEvent event) {
        humanTurn(6, 2);
    }

    @FXML
    void handleSquareTen28Click(MouseEvent event) {
        humanTurn(7, 2);
    }

    @FXML
    void handleSquareTen29Click(MouseEvent event) {
        humanTurn(8, 2);
    }

    @FXML
    void handleSquareTen30Click(MouseEvent event) {
        humanTurn(9, 2);
    }

    @FXML
    void handleSquareTen31Click(MouseEvent event) {
        humanTurn(0, 3);
    }

    @FXML
    void handleSquareTen32Click(MouseEvent event) {
        humanTurn(1, 3);
    }

    @FXML
    void handleSquareTen33Click(MouseEvent event) {
        humanTurn(2, 3);
    }

    @FXML
    void handleSquareTen34Click(MouseEvent event) {
        humanTurn(3, 3);
    }

    @FXML
    void handleSquareTen35Click(MouseEvent event) {
        humanTurn(4, 3);
    }

    @FXML
    void handleSquareTen36Click(MouseEvent event) {
        humanTurn(5, 3);
    }

    @FXML
    void handleSquareTen37Click(MouseEvent event) {
        humanTurn(6, 3);
    }

    @FXML
    void handleSquareTen38Click(MouseEvent event) {
        humanTurn(7, 3);
    }

    @FXML
    void handleSquareTen39Click(MouseEvent event) {
        humanTurn(8, 3);
    }

    @FXML
    void handleSquareTen40Click(MouseEvent event) {
        humanTurn(9, 3);
    }

    @FXML
    void handleSquareTen41Click(MouseEvent event) {
        humanTurn(0, 4);
    }

    @FXML
    void handleSquareTen42Click(MouseEvent event) {
        humanTurn(1, 4);
    }

    @FXML
    void handleSquareTen43Click(MouseEvent event) {
        humanTurn(2, 4);
    }

    @FXML
    void handleSquareTen44Click(MouseEvent event) {
        humanTurn(3, 4);
    }

    @FXML
    void handleSquareTen45Click(MouseEvent event) {
        humanTurn(4, 4);
    }

    @FXML
    void handleSquareTen46Click(MouseEvent event) {
        humanTurn(5, 4);
    }

    @FXML
    void handleSquareTen47Click(MouseEvent event) {
        humanTurn(6, 4);
    }

    @FXML
    void handleSquareTen48Click(MouseEvent event) {
        humanTurn(7, 4);
    }

    @FXML
    void handleSquareTen49Click(MouseEvent event) {
        humanTurn(8, 4);
    }

    @FXML
    void handleSquareTen50Click(MouseEvent event) {
        humanTurn(9, 4);
    }

    @FXML
    void handleSquareTen51Click(MouseEvent event) {
        humanTurn(0, 5);
    }

    @FXML
    void handleSquareTen52Click(MouseEvent event) {
        humanTurn(1, 5);
    }

    @FXML
    void handleSquareTen53Click(MouseEvent event) {
        humanTurn(2, 5);
    }

    @FXML
    void handleSquareTen54Click(MouseEvent event) {
        humanTurn(3, 5);
    }

    @FXML
    void handleSquareTen55Click(MouseEvent event) {
        humanTurn(4, 5);
    }

    @FXML
    void handleSquareTen56Click(MouseEvent event) {
        humanTurn(5, 5);
    }

    @FXML
    void handleSquareTen57Click(MouseEvent event) {
        humanTurn(6, 5);
    }

    @FXML
    void handleSquareTen58Click(MouseEvent event) {
        humanTurn(7, 5);
    }

    @FXML
    void handleSquareTen59Click(MouseEvent event) {
        humanTurn(8, 5);
    }

    @FXML
    void handleSquareTen60Click(MouseEvent event) {
        humanTurn(9, 5);
    }

    @FXML
    void handleSquareTen61Click(MouseEvent event) {
        humanTurn(0, 6);
    }

    @FXML
    void handleSquareTen62Click(MouseEvent event) {
        humanTurn(1, 6);
    }

    @FXML
    void handleSquareTen63Click(MouseEvent event) {
        humanTurn(2, 6);
    }

    @FXML
    void handleSquareTen64Click(MouseEvent event) {
        humanTurn(3, 6);
    }

    @FXML
    void handleSquareTen65Click(MouseEvent event) {
        humanTurn(4, 6);
    }

    @FXML
    void handleSquareTen66Click(MouseEvent event) {
        humanTurn(5, 6);
    }

    @FXML
    void handleSquareTen67Click(MouseEvent event) {
        humanTurn(6, 6);
    }

    @FXML
    void handleSquareTen68Click(MouseEvent event) {
        humanTurn(7, 6);
    }

    @FXML
    void handleSquareTen69Click(MouseEvent event) {
        humanTurn(8, 6);
    }

    @FXML
    void handleSquareTen70Click(MouseEvent event) {
        humanTurn(9, 6);
    }

    @FXML
    void handleSquareTen71Click(MouseEvent event) {
        humanTurn(0, 7);
    }

    @FXML
    void handleSquareTen72Click(MouseEvent event) {
        humanTurn(1, 7);
    }

    @FXML
    void handleSquareTen73Click(MouseEvent event) {
        humanTurn(2, 7);
    }

    @FXML
    void handleSquareTen74Click(MouseEvent event) {
        humanTurn(3, 7);
    }

    @FXML
    void handleSquareTen75Click(MouseEvent event) {
        humanTurn(4, 7);
    }

    @FXML
    void handleSquareTen76Click(MouseEvent event) {
        humanTurn(5, 7);
    }

    @FXML
    void handleSquareTen77Click(MouseEvent event) {
        humanTurn(6, 7);
    }

    @FXML
    void handleSquareTen78Click(MouseEvent event) {
        humanTurn(7, 7);
    }

    @FXML
    void handleSquareTen79Click(MouseEvent event) {
        humanTurn(8, 7);
    }

    @FXML
    void handleSquareTen80Click(MouseEvent event) {
        humanTurn(9, 7);
    }

    @FXML
    void handleSquareTen81Click(MouseEvent event) {
        humanTurn(0, 8);
    }

    @FXML
    void handleSquareTen82Click(MouseEvent event) {
        humanTurn(1, 8);
    }

    @FXML
    void handleSquareTen83Click(MouseEvent event) {
        humanTurn(2, 8);
    }

    @FXML
    void handleSquareTen84Click(MouseEvent event) {
        humanTurn(3, 8);
    }

    @FXML
    void handleSquareTen85Click(MouseEvent event) {
        humanTurn(4, 8);
    }

    @FXML
    void handleSquareTen86Click(MouseEvent event) {
        humanTurn(5, 8);
    }

    @FXML
    void handleSquareTen87Click(MouseEvent event) {
        humanTurn(6, 8);
    }

    @FXML
    void handleSquareTen88Click(MouseEvent event) {
        humanTurn(7, 8);
    }

    @FXML
    void handleSquareTen89Click(MouseEvent event) {
        humanTurn(8, 8);
    }

    @FXML
    void handleSquareTen90Click(MouseEvent event) {
        humanTurn(9, 8);
    }

    @FXML
    void handleSquareTen91Click(MouseEvent event) {
        humanTurn(0, 9);
    }

    @FXML
    void handleSquareTen92Click(MouseEvent event) {
        humanTurn(1, 9);
    }

    @FXML
    void handleSquareTen93Click(MouseEvent event) {
        humanTurn(2, 9);
    }

    @FXML
    void handleSquareTen94Click(MouseEvent event) {
        humanTurn(3, 9);
    }

    @FXML
    void handleSquareTen95Click(MouseEvent event) {
        humanTurn(4, 9);
    }

    @FXML
    void handleSquareTen96Click(MouseEvent event) {
        humanTurn(5, 9);
    }

    @FXML
    void handleSquareTen97Click(MouseEvent event) {
        humanTurn(6, 9);
    }

    @FXML
    void handleSquareTen98Click(MouseEvent event) {
        humanTurn(7, 9);
    }

    @FXML
    void handleSquareTen99Click(MouseEvent event) {
        humanTurn(8, 9);
    }

    @FXML
    void handleSquareTen100Click(MouseEvent event) {
        humanTurn(9, 9);
    }
}


