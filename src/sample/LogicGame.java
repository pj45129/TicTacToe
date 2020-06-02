package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.util.Random;

public class LogicGame {

    public static final char EMPTY_DOT = '\u2022';
    public static char[][] map;
    public  final char X_DOT = 'X';
    public  final char O_DOT = 'O';
    public Random rand = new Random();
    public  int DOTS_TO_WIN = 3;
    public  int SIZE = 3;

    // переключатели для выбора поля.
    public int field3x3 = 0;
    public int field5x5 = 0;
    public int field10x10 = 0;

    // переключатели для выбора соперника.
    public int rivalAi = 0;
    public int rivalPeople = 0;

    // переключатели для выбора игрока в многопользовательском режиме.
    public int turnPeopleOne = 0;

    @FXML
    private ImageView imgWin; // Прозрачная картинка, перекрывающая поле в конце игры. Чтобы игроки не могли продолжать ходить.
    @FXML
    private ImageView circleOne;
    @FXML
    private ImageView circleTwo;
    @FXML
    private ImageView circleThree;
    @FXML
    private ImageView circleFour;
    @FXML
    private ImageView circleFive;
    @FXML
    private ImageView circleSix;
    @FXML
    private ImageView circleSeven;
    @FXML
    private ImageView circleEight;
    @FXML
    private ImageView circleNine;
    @FXML
    private ImageView xOne;
    @FXML
    private ImageView xTwo;
    @FXML
    private ImageView xThree;
    @FXML
    private ImageView xFour;
    @FXML
    private ImageView xFive;
    @FXML
    private ImageView xSix;
    @FXML
    private ImageView xSeven;
    @FXML
    private ImageView xEight;
    @FXML
    private ImageView xNine;
    @FXML
    private ImageView circle1;
    @FXML
    private ImageView x1;
    @FXML
    private ImageView circle2;
    @FXML
    private ImageView x2;
    @FXML
    private ImageView circle3;
    @FXML
    private ImageView x3;
    @FXML
    private ImageView circle4;
    @FXML
    private ImageView x4;
    @FXML
    private ImageView circle5;
    @FXML
    private ImageView x5;
    @FXML
    private ImageView circle6;
    @FXML
    private ImageView x6;
    @FXML
    private ImageView circle7;
    @FXML
    private ImageView x7;
    @FXML
    private ImageView circle8;
    @FXML
    private ImageView x8;
    @FXML
    private ImageView circle9;
    @FXML
    private ImageView x9;
    @FXML
    private ImageView circle10;
    @FXML
    private ImageView x10;
    @FXML
    private ImageView circle11;
    @FXML
    private ImageView x11;
    @FXML
    private ImageView circle12;
    @FXML
    private ImageView x12;
    @FXML
    private ImageView circle13;
    @FXML
    private ImageView x13;
    @FXML
    private ImageView circle14;
    @FXML
    private ImageView x14;
    @FXML
    private ImageView circle15;
    @FXML
    private ImageView x15;
    @FXML
    private ImageView circle16;
    @FXML
    private ImageView x16;
    @FXML
    private ImageView circle17;
    @FXML
    private ImageView x17;
    @FXML
    private ImageView circle18;
    @FXML
    private ImageView x18;
    @FXML
    private ImageView circle19;
    @FXML
    private ImageView x19;
    @FXML
    private ImageView circle20;
    @FXML
    private ImageView x20;
    @FXML
    private ImageView circle21;
    @FXML
    private ImageView x21;
    @FXML
    private ImageView circle22;
    @FXML
    private ImageView x22;
    @FXML
    private ImageView circle23;
    @FXML
    private ImageView x23;
    @FXML
    private ImageView circle24;
    @FXML
    private ImageView x24;
    @FXML
    private ImageView circle25;
    @FXML
    private ImageView x25;
    @FXML
    private ImageView circleTen1;
    @FXML
    private ImageView xTen1;
    @FXML
    private ImageView circleTen2;
    @FXML
    private ImageView xTen2;
    @FXML
    private ImageView circleTen3;
    @FXML
    private ImageView xTen3;
    @FXML
    private ImageView circleTen4;
    @FXML
    private ImageView xTen4;
    @FXML
    private ImageView circleTen5;
    @FXML
    private ImageView xTen5;
    @FXML
    private ImageView circleTen6;
    @FXML
    private ImageView xTen6;
    @FXML
    private ImageView circleTen7;
    @FXML
    private ImageView xTen7;
    @FXML
    private ImageView circleTen8;
    @FXML
    private ImageView xTen8;
    @FXML
    private ImageView circleTen9;
    @FXML
    private ImageView xTen9;
    @FXML
    private ImageView circleTen10;
    @FXML
    private ImageView xTen10;
    @FXML
    private ImageView circleTen11;
    @FXML
    private ImageView xTen11;
    @FXML
    private ImageView circleTen12;
    @FXML
    private ImageView xTen12;
    @FXML
    private ImageView circleTen13;
    @FXML
    private ImageView xTen13;
    @FXML
    private ImageView circleTen14;
    @FXML
    private ImageView xTen14;
    @FXML
    private ImageView circleTen15;
    @FXML
    private ImageView xTen15;
    @FXML
    private ImageView circleTen16;
    @FXML
    private ImageView xTen16;
    @FXML
    private ImageView circleTen17;
    @FXML
    private ImageView xTen17;
    @FXML
    private ImageView circleTen18;
    @FXML
    private ImageView xTen18;
    @FXML
    private ImageView circleTen19;
    @FXML
    private ImageView xTen19;
    @FXML
    private ImageView circleTen20;
    @FXML
    private ImageView xTen20;
    @FXML
    private ImageView circleTen21;
    @FXML
    private ImageView xTen21;
    @FXML
    private ImageView circleTen22;
    @FXML
    private ImageView xTen22;
    @FXML
    private ImageView circleTen23;
    @FXML
    private ImageView xTen23;
    @FXML
    private ImageView circleTen24;
    @FXML
    private ImageView xTen24;
    @FXML
    private ImageView circleTen25;
    @FXML
    private ImageView xTen25;
    @FXML
    private ImageView circleTen26;
    @FXML
    private ImageView xTen26;
    @FXML
    private ImageView circleTen27;
    @FXML
    private ImageView xTen27;
    @FXML
    private ImageView circleTen28;
    @FXML
    private ImageView xTen28;
    @FXML
    private ImageView circleTen29;
    @FXML
    private ImageView xTen29;
    @FXML
    private ImageView circleTen30;
    @FXML
    private ImageView xTen30;
    @FXML
    private ImageView circleTen31;
    @FXML
    private ImageView xTen31;
    @FXML
    private ImageView circleTen32;
    @FXML
    private ImageView xTen32;
    @FXML
    private ImageView circleTen33;
    @FXML
    private ImageView xTen33;
    @FXML
    private ImageView circleTen34;
    @FXML
    private ImageView xTen34;
    @FXML
    private ImageView circleTen35;
    @FXML
    private ImageView xTen35;
    @FXML
    private ImageView circleTen36;
    @FXML
    private ImageView xTen36;
    @FXML
    private ImageView circleTen37;
    @FXML
    private ImageView xTen37;
    @FXML
    private ImageView circleTen38;
    @FXML
    private ImageView xTen38;
    @FXML
    private ImageView circleTen39;
    @FXML
    private ImageView xTen39;
    @FXML
    private ImageView circleTen40;
    @FXML
    private ImageView xTen40;
    @FXML
    private ImageView circleTen41;
    @FXML
    private ImageView xTen41;
    @FXML
    private ImageView circleTen42;
    @FXML
    private ImageView xTen42;
    @FXML
    private ImageView circleTen43;
    @FXML
    private ImageView xTen43;
    @FXML
    private ImageView circleTen44;
    @FXML
    private ImageView xTen44;
    @FXML
    private ImageView circleTen45;
    @FXML
    private ImageView xTen45;
    @FXML
    private ImageView circleTen46;
    @FXML
    private ImageView xTen46;
    @FXML
    private ImageView circleTen47;
    @FXML
    private ImageView xTen47;
    @FXML
    private ImageView circleTen48;
    @FXML
    private ImageView xTen48;
    @FXML
    private ImageView circleTen49;
    @FXML
    private ImageView xTen49;
    @FXML
    private ImageView circleTen50;
    @FXML
    private ImageView xTen50;
    @FXML
    private ImageView circleTen51;
    @FXML
    private ImageView xTen51;
    @FXML
    private ImageView circleTen52;
    @FXML
    private ImageView xTen52;
    @FXML
    private ImageView circleTen53;
    @FXML
    private ImageView xTen53;
    @FXML
    private ImageView circleTen54;
    @FXML
    private ImageView xTen54;
    @FXML
    private ImageView circleTen55;
    @FXML
    private ImageView xTen55;
    @FXML
    private ImageView circleTen56;
    @FXML
    private ImageView xTen56;
    @FXML
    private ImageView circleTen57;
    @FXML
    private ImageView xTen57;
    @FXML
    private ImageView circleTen58;
    @FXML
    private ImageView xTen58;
    @FXML
    private ImageView circleTen59;
    @FXML
    private ImageView xTen59;
    @FXML
    private ImageView circleTen60;
    @FXML
    private ImageView xTen60;
    @FXML
    private ImageView circleTen61;
    @FXML
    private ImageView xTen61;
    @FXML
    private ImageView circleTen62;
    @FXML
    private ImageView xTen62;
    @FXML
    private ImageView circleTen63;
    @FXML
    private ImageView xTen63;
    @FXML
    private ImageView circleTen64;
    @FXML
    private ImageView xTen64;
    @FXML
    private ImageView circleTen65;
    @FXML
    private ImageView xTen65;
    @FXML
    private ImageView circleTen66;
    @FXML
    private ImageView xTen66;
    @FXML
    private ImageView circleTen67;
    @FXML
    private ImageView xTen67;
    @FXML
    private ImageView circleTen68;
    @FXML
    private ImageView xTen68;
    @FXML
    private ImageView circleTen69;
    @FXML
    private ImageView xTen69;
    @FXML
    private ImageView circleTen70;
    @FXML
    private ImageView xTen70;
    @FXML
    private ImageView circleTen71;
    @FXML
    private ImageView xTen71;
    @FXML
    private ImageView circleTen72;
    @FXML
    private ImageView xTen72;
    @FXML
    private ImageView circleTen73;
    @FXML
    private ImageView xTen73;
    @FXML
    private ImageView circleTen74;
    @FXML
    private ImageView xTen74;
    @FXML
    private ImageView circleTen75;
    @FXML
    private ImageView xTen75;
    @FXML
    private ImageView circleTen76;
    @FXML
    private ImageView xTen76;
    @FXML
    private ImageView circleTen77;
    @FXML
    private ImageView xTen77;
    @FXML
    private ImageView circleTen78;
    @FXML
    private ImageView xTen78;
    @FXML
    private ImageView circleTen79;
    @FXML
    private ImageView xTen79;
    @FXML
    private ImageView circleTen80;
    @FXML
    private ImageView xTen80;
    @FXML
    private ImageView circleTen81;
    @FXML
    private ImageView xTen81;
    @FXML
    private ImageView circleTen82;
    @FXML
    private ImageView xTen82;
    @FXML
    private ImageView circleTen83;
    @FXML
    private ImageView xTen83;
    @FXML
    private ImageView circleTen84;
    @FXML
    private ImageView xTen84;
    @FXML
    private ImageView circleTen85;
    @FXML
    private ImageView xTen85;
    @FXML
    private ImageView circleTen86;
    @FXML
    private ImageView xTen86;
    @FXML
    private ImageView circleTen87;
    @FXML
    private ImageView xTen87;
    @FXML
    private ImageView circleTen88;
    @FXML
    private ImageView xTen88;
    @FXML
    private ImageView circleTen89;
    @FXML
    private ImageView xTen89;
    @FXML
    private ImageView circleTen90;
    @FXML
    private ImageView xTen90;
    @FXML
    private ImageView circleTen91;
    @FXML
    private ImageView xTen91;
    @FXML
    private ImageView circleTen92;
    @FXML
    private ImageView xTen92;
    @FXML
    private ImageView circleTen93;
    @FXML
    private ImageView xTen93;
    @FXML
    private ImageView circleTen94;
    @FXML
    private ImageView xTen94;
    @FXML
    private ImageView circleTen95;
    @FXML
    private ImageView xTen95;
    @FXML
    private ImageView circleTen96;
    @FXML
    private ImageView xTen96;
    @FXML
    private ImageView circleTen97;
    @FXML
    private ImageView xTen97;
    @FXML
    private ImageView circleTen98;
    @FXML
    private ImageView xTen98;
    @FXML
    private ImageView circleTen99;
    @FXML
    private ImageView xTen99;
    @FXML
    private ImageView circleTen100;
    @FXML
    private ImageView xTen100;
    @FXML
    private Label lblTextVictory;

    //---------------------------------------------------------
    // Логика игры

    // этот метод проверяет стоит ли в подаваемой ячейке ПУСТОЙ знак из массива.
    public static boolean isCellEmpty(int x, int y) {
        if (map[y][x] == EMPTY_DOT) return true;
        return false;
    }

    public  void humanTurn(int x, int y) {
        while (LogicGame.isCellEmpty(x, y)) {
            // Ход человека
            if (turnPeopleOne == 0) {
                map[y][x] = X_DOT;
                if (field3x3 == 1) printX3x3(x, y);
                if (field5x5 == 1) printX5x5(x, y);
                if (field10x10 == 1) printX10x10(x, y);
                if (checkWinNew(X_DOT)) { // проверка на победу
                    if (rivalPeople == 1){
                        lblTextVictory.setText("One Win");
                    } else {
                        lblTextVictory.setText("You Win"); // вывод сообщения в консоль
                    }
                    lblTextVictory.setVisible(true);
                    imgWin.setVisible(true);
                    break;
                }
                if (isMapFull()) { // проверка остались ли свободные значения EMPTY_DOT = '\u2022'
                    lblTextVictory.setText("Draw"); // вывод сообщения в консоль
                    lblTextVictory.setVisible(true);
                    imgWin.setVisible(true);
                    break;
                }
                if (rivalPeople == 1) {
                    turnPeopleOne = 1;
                    break;
                }
            }

            // Ход вторго человека в многопользовательском режиме
            if (rivalPeople == 1 && turnPeopleOne == 1) {
                map[y][x] = O_DOT;
                if (field3x3 == 1) printSymbolO3x3(x, y);
                if (field5x5 == 1) printSymbolO5x5(x, y);
                if (field10x10 == 1) printSymbolO10x10(x, y);
                if (checkWinNew(O_DOT)) { // проверка на победу
                    lblTextVictory.setText("Two Win"); // вывод сообщения в консоль
                    lblTextVictory.setVisible(true);
                    imgWin.setVisible(true);
                    break;
                }
                if (isMapFull()) { // проверка остались ли свободные значения EMPTY_DOT = '\u2022'
                    lblTextVictory.setText("Draw"); // вывод сообщения в консоль
                    lblTextVictory.setVisible(true);
                    imgWin.setVisible(true);
                    break;
                }
                turnPeopleOne = 0;
                break;
            }

            // Ход компьютера
            if (rivalAi == 1) {
                aiTurn(); // ходит компьютер
                if (checkWinNew(O_DOT)) { // проверка на победу
                    lblTextVictory.setText("You lose");
                    lblTextVictory.setVisible(true);
                    imgWin.setVisible(true);
                    break;
                }
                if (isMapFull()) { // проверка остались ли свободные значения EMPTY_DOT = '\u2022'
                    lblTextVictory.setText("Draw");
                    lblTextVictory.setVisible(true);
                    imgWin.setVisible(true);
                    break;
                }
            }
            break;
        }
    }

    // Ход компьютера
    public  void aiTurn() {
        int x = -1, y = -1;

        // проверка на свою победу.
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (LogicGame.isCellEmpty(i, j)) { // проверяет свободна ли ячейка
                    map[j][i] = O_DOT; // записывает туда свое значение
                    if (checkWinNew(O_DOT)) { // проверяет на победу, если Победа, то сохраняем значения ячейки
                        x = i;
                        y = j;
                    }
                    map[j][i] = EMPTY_DOT; // возвращаем пустой знак вместо значения компьютера.
                }
            }
        }

        // проверка на возможную победу соперника.
        if (x == -1 && y == -1) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (LogicGame.isCellEmpty(i, j)) { // проверяет свободна ли ячейка
                        map[j][i] = X_DOT; // записывает туда значение Человека
                        if (checkWinNew(X_DOT)) { // проверяет на победу, если Победа, то сохраняем значения ячейки
                            x = i;
                            y = j;
                        }
                        map[j][i] = EMPTY_DOT; // возвращаем пустой знак вместо значения компьютера.
                    }
                }
            }
        }

        if (x == -1 && y == -1) { // если не найдены возможные победы, то компьютер выставляет свой знак рандомно
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!LogicGame.isCellEmpty(x, y));
        }
        map[y][x] = O_DOT; // записываем знак ПК в это значение

        if (field3x3 == 1) printSymbolO3x3(x, y);
        if (field5x5 == 1) printSymbolO5x5(x, y);
        if (field10x10 == 1) printSymbolO10x10(x, y);
    }

    // этот метод проверяет остались ли свободные ячейки на поле
    public  boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }

    // создаю карту со значениями EMPTY_DOT
    public  void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    // Проверка на победу
    public  boolean checkWinNew(char dot) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(i, j, 1, 0, dot)) return true;
                if (checkLine(i, j, 0, 1, dot)) return true;
                if (checkLine(i, j, 1, 1, dot)) return true;
                if (checkLine(i, j, 1, -1, dot)) return true;
            }
        }
        return false;
    }

    // метод проверяющий победу.
    public  boolean checkLine(int cx, int cy, int vx, int vy, char dot) {
        if (cx + DOTS_TO_WIN * vx > SIZE || cy + DOTS_TO_WIN * vy > SIZE || cy + DOTS_TO_WIN * vy < -1) return false;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[cy + i * vy][cx + i * vx] != dot) return false;
        }
        return true;
    }

    //---------------------------------------------------------------------------------------------------------------------------
    // Окрашивание ячеек на поле

    // медод для окраски x 3x3
    public void printX3x3(int x, int y) {
        if (x == 0 && y == 0) xOne.setVisible(true);
        if (x == 1 && y == 0) xTwo.setVisible(true);
        if (x == 2 && y == 0) xThree.setVisible(true);
        if (x == 0 && y == 1) xFour.setVisible(true);
        if (x == 1 && y == 1) xFive.setVisible(true);
        if (x == 2 && y == 1) xSix.setVisible(true);
        if (x == 0 && y == 2) xSeven.setVisible(true);
        if (x == 1 && y == 2) xEight.setVisible(true);
        if (x == 2 && y == 2) xNine.setVisible(true);
    }

    // метод окрашиваюшивания x 10х10.
    public  void printX5x5(int x, int y) {
        if (x == 0 && y == 0) x1.setVisible(true);
        if (x == 1 && y == 0) x2.setVisible(true);
        if (x == 2 && y == 0) x3.setVisible(true);
        if (x == 3 && y == 0) x4.setVisible(true);
        if (x == 4 && y == 0) x5.setVisible(true);
        if (x == 0 && y == 1) x6.setVisible(true);
        if (x == 1 && y == 1) x7.setVisible(true);
        if (x == 2 && y == 1) x8.setVisible(true);
        if (x == 3 && y == 1) x9.setVisible(true);
        if (x == 4 && y == 1) x10.setVisible(true);
        if (x == 0 && y == 2) x11.setVisible(true);
        if (x == 1 && y == 2) x12.setVisible(true);
        if (x == 2 && y == 2) x13.setVisible(true);
        if (x == 3 && y == 2) x14.setVisible(true);
        if (x == 4 && y == 2) x15.setVisible(true);
        if (x == 0 && y == 3) x16.setVisible(true);
        if (x == 1 && y == 3) x17.setVisible(true);
        if (x == 2 && y == 3) x18.setVisible(true);
        if (x == 3 && y == 3) x19.setVisible(true);
        if (x == 4 && y == 3) x20.setVisible(true);
        if (x == 0 && y == 4) x21.setVisible(true);
        if (x == 1 && y == 4) x22.setVisible(true);
        if (x == 2 && y == 4) x23.setVisible(true);
        if (x == 3 && y == 4) x24.setVisible(true);
        if (x == 4 && y == 4) x25.setVisible(true);
    }

    // метод окрашиваюшивания x 10х10.
    public  void printX10x10(int x, int y) {
        if (x == 0 && y == 0) xTen1.setVisible(true);
        if (x == 1 && y == 0) xTen2.setVisible(true);
        if (x == 2 && y == 0) xTen3.setVisible(true);
        if (x == 3 && y == 0) xTen4.setVisible(true);
        if (x == 4 && y == 0) xTen5.setVisible(true);
        if (x == 5 && y == 0) xTen6.setVisible(true);
        if (x == 6 && y == 0) xTen7.setVisible(true);
        if (x == 7 && y == 0) xTen8.setVisible(true);
        if (x == 8 && y == 0) xTen9.setVisible(true);
        if (x == 9 && y == 0) xTen10.setVisible(true);
        if (x == 0 && y == 1) xTen11.setVisible(true);
        if (x == 1 && y == 1) xTen12.setVisible(true);
        if (x == 2 && y == 1) xTen13.setVisible(true);
        if (x == 3 && y == 1) xTen14.setVisible(true);
        if (x == 4 && y == 1) xTen15.setVisible(true);
        if (x == 5 && y == 1) xTen16.setVisible(true);
        if (x == 6 && y == 1) xTen17.setVisible(true);
        if (x == 7 && y == 1) xTen18.setVisible(true);
        if (x == 8 && y == 1) xTen19.setVisible(true);
        if (x == 9 && y == 1) xTen20.setVisible(true);
        if (x == 0 && y == 2) xTen21.setVisible(true);
        if (x == 1 && y == 2) xTen22.setVisible(true);
        if (x == 2 && y == 2) xTen23.setVisible(true);
        if (x == 3 && y == 2) xTen24.setVisible(true);
        if (x == 4 && y == 2) xTen25.setVisible(true);
        if (x == 5 && y == 2) xTen26.setVisible(true);
        if (x == 6 && y == 2) xTen27.setVisible(true);
        if (x == 7 && y == 2) xTen28.setVisible(true);
        if (x == 8 && y == 2) xTen29.setVisible(true);
        if (x == 9 && y == 2) xTen30.setVisible(true);
        if (x == 0 && y == 3) xTen31.setVisible(true);
        if (x == 1 && y == 3) xTen32.setVisible(true);
        if (x == 2 && y == 3) xTen33.setVisible(true);
        if (x == 3 && y == 3) xTen34.setVisible(true);
        if (x == 4 && y == 3) xTen35.setVisible(true);
        if (x == 5 && y == 3) xTen36.setVisible(true);
        if (x == 6 && y == 3) xTen37.setVisible(true);
        if (x == 7 && y == 3) xTen38.setVisible(true);
        if (x == 8 && y == 3) xTen39.setVisible(true);
        if (x == 9 && y == 3) xTen40.setVisible(true);
        if (x == 0 && y == 4) xTen41.setVisible(true);
        if (x == 1 && y == 4) xTen42.setVisible(true);
        if (x == 2 && y == 4) xTen43.setVisible(true);
        if (x == 3 && y == 4) xTen44.setVisible(true);
        if (x == 4 && y == 4) xTen45.setVisible(true);
        if (x == 5 && y == 4) xTen46.setVisible(true);
        if (x == 6 && y == 4) xTen47.setVisible(true);
        if (x == 7 && y == 4) xTen48.setVisible(true);
        if (x == 8 && y == 4) xTen49.setVisible(true);
        if (x == 9 && y == 4) xTen50.setVisible(true);
        if (x == 0 && y == 5) xTen51.setVisible(true);
        if (x == 1 && y == 5) xTen52.setVisible(true);
        if (x == 2 && y == 5) xTen53.setVisible(true);
        if (x == 3 && y == 5) xTen54.setVisible(true);
        if (x == 4 && y == 5) xTen55.setVisible(true);
        if (x == 5 && y == 5) xTen56.setVisible(true);
        if (x == 6 && y == 5) xTen57.setVisible(true);
        if (x == 7 && y == 5) xTen58.setVisible(true);
        if (x == 8 && y == 5) xTen59.setVisible(true);
        if (x == 9 && y == 5) xTen60.setVisible(true);
        if (x == 0 && y == 6) xTen61.setVisible(true);
        if (x == 1 && y == 6) xTen62.setVisible(true);
        if (x == 2 && y == 6) xTen63.setVisible(true);
        if (x == 3 && y == 6) xTen64.setVisible(true);
        if (x == 4 && y == 6) xTen65.setVisible(true);
        if (x == 5 && y == 6) xTen66.setVisible(true);
        if (x == 6 && y == 6) xTen67.setVisible(true);
        if (x == 7 && y == 6) xTen68.setVisible(true);
        if (x == 8 && y == 6) xTen69.setVisible(true);
        if (x == 9 && y == 6) xTen70.setVisible(true);
        if (x == 0 && y == 7) xTen71.setVisible(true);
        if (x == 1 && y == 7) xTen72.setVisible(true);
        if (x == 2 && y == 7) xTen73.setVisible(true);
        if (x == 3 && y == 7) xTen74.setVisible(true);
        if (x == 4 && y == 7) xTen75.setVisible(true);
        if (x == 5 && y == 7) xTen76.setVisible(true);
        if (x == 6 && y == 7) xTen77.setVisible(true);
        if (x == 7 && y == 7) xTen78.setVisible(true);
        if (x == 8 && y == 7) xTen79.setVisible(true);
        if (x == 9 && y == 7) xTen80.setVisible(true);
        if (x == 0 && y == 8) xTen81.setVisible(true);
        if (x == 1 && y == 8) xTen82.setVisible(true);
        if (x == 2 && y == 8) xTen83.setVisible(true);
        if (x == 3 && y == 8) xTen84.setVisible(true);
        if (x == 4 && y == 8) xTen85.setVisible(true);
        if (x == 5 && y == 8) xTen86.setVisible(true);
        if (x == 6 && y == 8) xTen87.setVisible(true);
        if (x == 7 && y == 8) xTen88.setVisible(true);
        if (x == 8 && y == 8) xTen89.setVisible(true);
        if (x == 9 && y == 8) xTen90.setVisible(true);
        if (x == 0 && y == 9) xTen91.setVisible(true);
        if (x == 1 && y == 9) xTen92.setVisible(true);
        if (x == 2 && y == 9) xTen93.setVisible(true);
        if (x == 3 && y == 9) xTen94.setVisible(true);
        if (x == 4 && y == 9) xTen95.setVisible(true);
        if (x == 5 && y == 9) xTen96.setVisible(true);
        if (x == 6 && y == 9) xTen97.setVisible(true);
        if (x == 7 && y == 9) xTen98.setVisible(true);
        if (x == 8 && y == 9) xTen99.setVisible(true);
        if (x == 9 && y == 9) xTen100.setVisible(true);
    }

    // метод окрашиваюшивания O 3х3
    public  void printSymbolO3x3(int x, int y) {
        if (x == 0 && y == 0) circleOne.setVisible(true);
        if (x == 1 && y == 0) circleTwo.setVisible(true);
        if (x == 2 && y == 0) circleThree.setVisible(true);
        if (x == 0 && y == 1) circleFour.setVisible(true);
        if (x == 1 && y == 1) circleFive.setVisible(true);
        if (x == 2 && y == 1) circleSix.setVisible(true);
        if (x == 0 && y == 2) circleSeven.setVisible(true);
        if (x == 1 && y == 2) circleEight.setVisible(true);
        if (x == 2 && y == 2) circleNine.setVisible(true);
    }

    // метод окрашиваюшивания O 5х5
    public  void printSymbolO5x5(int x, int y) {
        if (x == 0 && y == 0) circle1.setVisible(true);
        if (x == 1 && y == 0) circle2.setVisible(true);
        if (x == 2 && y == 0) circle3.setVisible(true);
        if (x == 3 && y == 0) circle4.setVisible(true);
        if (x == 4 && y == 0) circle5.setVisible(true);
        if (x == 0 && y == 1) circle6.setVisible(true);
        if (x == 1 && y == 1) circle7.setVisible(true);
        if (x == 2 && y == 1) circle8.setVisible(true);
        if (x == 3 && y == 1) circle9.setVisible(true);
        if (x == 4 && y == 1) circle10.setVisible(true);
        if (x == 0 && y == 2) circle11.setVisible(true);
        if (x == 1 && y == 2) circle12.setVisible(true);
        if (x == 2 && y == 2) circle13.setVisible(true);
        if (x == 3 && y == 2) circle14.setVisible(true);
        if (x == 4 && y == 2) circle15.setVisible(true);
        if (x == 0 && y == 3) circle16.setVisible(true);
        if (x == 1 && y == 3) circle17.setVisible(true);
        if (x == 2 && y == 3) circle18.setVisible(true);
        if (x == 3 && y == 3) circle19.setVisible(true);
        if (x == 4 && y == 3) circle20.setVisible(true);
        if (x == 0 && y == 4) circle21.setVisible(true);
        if (x == 1 && y == 4) circle22.setVisible(true);
        if (x == 2 && y == 4) circle23.setVisible(true);
        if (x == 3 && y == 4) circle24.setVisible(true);
        if (x == 4 && y == 4) circle25.setVisible(true);
    }

    // метод окрашиваюшивания O 10х10
    public  void printSymbolO10x10(int x, int y) {
        if (x == 0 && y == 0) circleTen1.setVisible(true);
        if (x == 1 && y == 0) circleTen2.setVisible(true);
        if (x == 2 && y == 0) circleTen3.setVisible(true);
        if (x == 3 && y == 0) circleTen4.setVisible(true);
        if (x == 4 && y == 0) circleTen5.setVisible(true);
        if (x == 5 && y == 0) circleTen6.setVisible(true);
        if (x == 6 && y == 0) circleTen7.setVisible(true);
        if (x == 7 && y == 0) circleTen8.setVisible(true);
        if (x == 8 && y == 0) circleTen9.setVisible(true);
        if (x == 9 && y == 0) circleTen10.setVisible(true);
        if (x == 0 && y == 1) circleTen11.setVisible(true);
        if (x == 1 && y == 1) circleTen12.setVisible(true);
        if (x == 2 && y == 1) circleTen13.setVisible(true);
        if (x == 3 && y == 1) circleTen14.setVisible(true);
        if (x == 4 && y == 1) circleTen15.setVisible(true);
        if (x == 5 && y == 1) circleTen16.setVisible(true);
        if (x == 6 && y == 1) circleTen17.setVisible(true);
        if (x == 7 && y == 1) circleTen18.setVisible(true);
        if (x == 8 && y == 1) circleTen19.setVisible(true);
        if (x == 9 && y == 1) circleTen20.setVisible(true);
        if (x == 0 && y == 2) circleTen21.setVisible(true);
        if (x == 1 && y == 2) circleTen22.setVisible(true);
        if (x == 2 && y == 2) circleTen23.setVisible(true);
        if (x == 3 && y == 2) circleTen24.setVisible(true);
        if (x == 4 && y == 2) circleTen25.setVisible(true);
        if (x == 5 && y == 2) circleTen26.setVisible(true);
        if (x == 6 && y == 2) circleTen27.setVisible(true);
        if (x == 7 && y == 2) circleTen28.setVisible(true);
        if (x == 8 && y == 2) circleTen29.setVisible(true);
        if (x == 9 && y == 2) circleTen30.setVisible(true);
        if (x == 0 && y == 3) circleTen31.setVisible(true);
        if (x == 1 && y == 3) circleTen32.setVisible(true);
        if (x == 2 && y == 3) circleTen33.setVisible(true);
        if (x == 3 && y == 3) circleTen34.setVisible(true);
        if (x == 4 && y == 3) circleTen35.setVisible(true);
        if (x == 5 && y == 3) circleTen36.setVisible(true);
        if (x == 6 && y == 3) circleTen37.setVisible(true);
        if (x == 7 && y == 3) circleTen38.setVisible(true);
        if (x == 8 && y == 3) circleTen39.setVisible(true);
        if (x == 9 && y == 3) circleTen40.setVisible(true);
        if (x == 0 && y == 4) circleTen41.setVisible(true);
        if (x == 1 && y == 4) circleTen42.setVisible(true);
        if (x == 2 && y == 4) circleTen43.setVisible(true);
        if (x == 3 && y == 4) circleTen44.setVisible(true);
        if (x == 4 && y == 4) circleTen45.setVisible(true);
        if (x == 5 && y == 4) circleTen46.setVisible(true);
        if (x == 6 && y == 4) circleTen47.setVisible(true);
        if (x == 7 && y == 4) circleTen48.setVisible(true);
        if (x == 8 && y == 4) circleTen49.setVisible(true);
        if (x == 9 && y == 4) circleTen50.setVisible(true);
        if (x == 0 && y == 5) circleTen51.setVisible(true);
        if (x == 1 && y == 5) circleTen52.setVisible(true);
        if (x == 2 && y == 5) circleTen53.setVisible(true);
        if (x == 3 && y == 5) circleTen54.setVisible(true);
        if (x == 4 && y == 5) circleTen55.setVisible(true);
        if (x == 5 && y == 5) circleTen56.setVisible(true);
        if (x == 6 && y == 5) circleTen57.setVisible(true);
        if (x == 7 && y == 5) circleTen58.setVisible(true);
        if (x == 8 && y == 5) circleTen59.setVisible(true);
        if (x == 9 && y == 5) circleTen60.setVisible(true);
        if (x == 0 && y == 6) circleTen61.setVisible(true);
        if (x == 1 && y == 6) circleTen62.setVisible(true);
        if (x == 2 && y == 6) circleTen63.setVisible(true);
        if (x == 3 && y == 6) circleTen64.setVisible(true);
        if (x == 4 && y == 6) circleTen65.setVisible(true);
        if (x == 5 && y == 6) circleTen66.setVisible(true);
        if (x == 6 && y == 6) circleTen67.setVisible(true);
        if (x == 7 && y == 6) circleTen68.setVisible(true);
        if (x == 8 && y == 6) circleTen69.setVisible(true);
        if (x == 9 && y == 6) circleTen70.setVisible(true);
        if (x == 0 && y == 7) circleTen71.setVisible(true);
        if (x == 1 && y == 7) circleTen72.setVisible(true);
        if (x == 2 && y == 7) circleTen73.setVisible(true);
        if (x == 3 && y == 7) circleTen74.setVisible(true);
        if (x == 4 && y == 7) circleTen75.setVisible(true);
        if (x == 5 && y == 7) circleTen76.setVisible(true);
        if (x == 6 && y == 7) circleTen77.setVisible(true);
        if (x == 7 && y == 7) circleTen78.setVisible(true);
        if (x == 8 && y == 7) circleTen79.setVisible(true);
        if (x == 9 && y == 7) circleTen80.setVisible(true);
        if (x == 0 && y == 8) circleTen81.setVisible(true);
        if (x == 1 && y == 8) circleTen82.setVisible(true);
        if (x == 2 && y == 8) circleTen83.setVisible(true);
        if (x == 3 && y == 8) circleTen84.setVisible(true);
        if (x == 4 && y == 8) circleTen85.setVisible(true);
        if (x == 5 && y == 8) circleTen86.setVisible(true);
        if (x == 6 && y == 8) circleTen87.setVisible(true);
        if (x == 7 && y == 8) circleTen88.setVisible(true);
        if (x == 8 && y == 8) circleTen89.setVisible(true);
        if (x == 9 && y == 8) circleTen90.setVisible(true);
        if (x == 0 && y == 9) circleTen91.setVisible(true);
        if (x == 1 && y == 9) circleTen92.setVisible(true);
        if (x == 2 && y == 9) circleTen93.setVisible(true);
        if (x == 3 && y == 9) circleTen94.setVisible(true);
        if (x == 4 && y == 9) circleTen95.setVisible(true);
        if (x == 5 && y == 9) circleTen96.setVisible(true);
        if (x == 6 && y == 9) circleTen97.setVisible(true);
        if (x == 7 && y == 9) circleTen98.setVisible(true);
        if (x == 8 && y == 9) circleTen99.setVisible(true);
        if (x == 9 && y == 9) circleTen100.setVisible(true);
    }

    //---------------------------------------------------------------------------------------------------------------------------
        // метод для новой игры в котором очищается поле
        public void newPlayGame(ActionEvent event) {

            circleOne.setVisible(false);
            circleTwo.setVisible(false);
            circleThree.setVisible(false);
            circleFour.setVisible(false);
            circleFive.setVisible(false);
            circleSix.setVisible(false);
            circleSeven.setVisible(false);
            circleEight.setVisible(false);
            circleNine.setVisible(false);

            xOne.setVisible(false);
            xTwo.setVisible(false);
            xThree.setVisible(false);
            xFour.setVisible(false);
            xFive.setVisible(false);
            xSix.setVisible(false);
            xSeven.setVisible(false);
            xEight.setVisible(false);
            xNine.setVisible(false);

            circle1.setVisible(false);
            circle2.setVisible(false);
            circle3.setVisible(false);
            circle4.setVisible(false);
            circle5.setVisible(false);
            circle6.setVisible(false);
            circle7.setVisible(false);
            circle8.setVisible(false);
            circle9.setVisible(false);
            circle10.setVisible(false);
            circle11.setVisible(false);
            circle12.setVisible(false);
            circle13.setVisible(false);
            circle14.setVisible(false);
            circle15.setVisible(false);
            circle16.setVisible(false);
            circle17.setVisible(false);
            circle18.setVisible(false);
            circle19.setVisible(false);
            circle20.setVisible(false);
            circle21.setVisible(false);
            circle22.setVisible(false);
            circle23.setVisible(false);
            circle24.setVisible(false);
            circle25.setVisible(false);

            x1.setVisible(false);
            x2.setVisible(false);
            x3.setVisible(false);
            x4.setVisible(false);
            x5.setVisible(false);
            x6.setVisible(false);
            x7.setVisible(false);
            x8.setVisible(false);
            x9.setVisible(false);
            x10.setVisible(false);
            x11.setVisible(false);
            x12.setVisible(false);
            x13.setVisible(false);
            x14.setVisible(false);
            x15.setVisible(false);
            x16.setVisible(false);
            x17.setVisible(false);
            x18.setVisible(false);
            x19.setVisible(false);
            x20.setVisible(false);
            x21.setVisible(false);
            x22.setVisible(false);
            x23.setVisible(false);
            x24.setVisible(false);
            x25.setVisible(false);

            circleTen1.setVisible(false);
            circleTen2.setVisible(false);
            circleTen3.setVisible(false);
            circleTen4.setVisible(false);
            circleTen5.setVisible(false);
            circleTen6.setVisible(false);
            circleTen7.setVisible(false);
            circleTen8.setVisible(false);
            circleTen9.setVisible(false);
            circleTen10.setVisible(false);
            circleTen11.setVisible(false);
            circleTen12.setVisible(false);
            circleTen13.setVisible(false);
            circleTen14.setVisible(false);
            circleTen15.setVisible(false);
            circleTen16.setVisible(false);
            circleTen17.setVisible(false);
            circleTen18.setVisible(false);
            circleTen19.setVisible(false);
            circleTen20.setVisible(false);
            circleTen21.setVisible(false);
            circleTen22.setVisible(false);
            circleTen23.setVisible(false);
            circleTen24.setVisible(false);
            circleTen25.setVisible(false);
            circleTen26.setVisible(false);
            circleTen27.setVisible(false);
            circleTen28.setVisible(false);
            circleTen29.setVisible(false);
            circleTen30.setVisible(false);
            circleTen31.setVisible(false);
            circleTen32.setVisible(false);
            circleTen33.setVisible(false);
            circleTen34.setVisible(false);
            circleTen35.setVisible(false);
            circleTen36.setVisible(false);
            circleTen37.setVisible(false);
            circleTen38.setVisible(false);
            circleTen39.setVisible(false);
            circleTen40.setVisible(false);
            circleTen41.setVisible(false);
            circleTen42.setVisible(false);
            circleTen43.setVisible(false);
            circleTen44.setVisible(false);
            circleTen45.setVisible(false);
            circleTen46.setVisible(false);
            circleTen47.setVisible(false);
            circleTen48.setVisible(false);
            circleTen49.setVisible(false);
            circleTen50.setVisible(false);
            circleTen51.setVisible(false);
            circleTen52.setVisible(false);
            circleTen53.setVisible(false);
            circleTen54.setVisible(false);
            circleTen55.setVisible(false);
            circleTen56.setVisible(false);
            circleTen57.setVisible(false);
            circleTen58.setVisible(false);
            circleTen59.setVisible(false);
            circleTen60.setVisible(false);
            circleTen61.setVisible(false);
            circleTen62.setVisible(false);
            circleTen63.setVisible(false);
            circleTen64.setVisible(false);
            circleTen65.setVisible(false);
            circleTen66.setVisible(false);
            circleTen67.setVisible(false);
            circleTen68.setVisible(false);
            circleTen69.setVisible(false);
            circleTen70.setVisible(false);
            circleTen71.setVisible(false);
            circleTen72.setVisible(false);
            circleTen73.setVisible(false);
            circleTen74.setVisible(false);
            circleTen75.setVisible(false);
            circleTen76.setVisible(false);
            circleTen77.setVisible(false);
            circleTen78.setVisible(false);
            circleTen79.setVisible(false);
            circleTen80.setVisible(false);
            circleTen81.setVisible(false);
            circleTen82.setVisible(false);
            circleTen83.setVisible(false);
            circleTen84.setVisible(false);
            circleTen85.setVisible(false);
            circleTen86.setVisible(false);
            circleTen87.setVisible(false);
            circleTen88.setVisible(false);
            circleTen89.setVisible(false);
            circleTen90.setVisible(false);
            circleTen91.setVisible(false);
            circleTen92.setVisible(false);
            circleTen93.setVisible(false);
            circleTen94.setVisible(false);
            circleTen95.setVisible(false);
            circleTen96.setVisible(false);
            circleTen97.setVisible(false);
            circleTen98.setVisible(false);
            circleTen99.setVisible(false);
            circleTen100.setVisible(false);

            xTen1.setVisible(false);
            xTen2.setVisible(false);
            xTen3.setVisible(false);
            xTen4.setVisible(false);
            xTen5.setVisible(false);
            xTen6.setVisible(false);
            xTen7.setVisible(false);
            xTen8.setVisible(false);
            xTen9.setVisible(false);
            xTen10.setVisible(false);
            xTen11.setVisible(false);
            xTen12.setVisible(false);
            xTen13.setVisible(false);
            xTen14.setVisible(false);
            xTen15.setVisible(false);
            xTen16.setVisible(false);
            xTen17.setVisible(false);
            xTen18.setVisible(false);
            xTen19.setVisible(false);
            xTen20.setVisible(false);
            xTen21.setVisible(false);
            xTen22.setVisible(false);
            xTen23.setVisible(false);
            xTen24.setVisible(false);
            xTen25.setVisible(false);
            xTen26.setVisible(false);
            xTen27.setVisible(false);
            xTen28.setVisible(false);
            xTen29.setVisible(false);
            xTen30.setVisible(false);
            xTen31.setVisible(false);
            xTen32.setVisible(false);
            xTen33.setVisible(false);
            xTen34.setVisible(false);
            xTen35.setVisible(false);
            xTen36.setVisible(false);
            xTen37.setVisible(false);
            xTen38.setVisible(false);
            xTen39.setVisible(false);
            xTen40.setVisible(false);
            xTen41.setVisible(false);
            xTen42.setVisible(false);
            xTen43.setVisible(false);
            xTen44.setVisible(false);
            xTen45.setVisible(false);
            xTen46.setVisible(false);
            xTen47.setVisible(false);
            xTen48.setVisible(false);
            xTen49.setVisible(false);
            xTen50.setVisible(false);
            xTen51.setVisible(false);
            xTen52.setVisible(false);
            xTen53.setVisible(false);
            xTen54.setVisible(false);
            xTen55.setVisible(false);
            xTen56.setVisible(false);
            xTen57.setVisible(false);
            xTen58.setVisible(false);
            xTen59.setVisible(false);
            xTen60.setVisible(false);
            xTen61.setVisible(false);
            xTen62.setVisible(false);
            xTen63.setVisible(false);
            xTen64.setVisible(false);
            xTen65.setVisible(false);
            xTen66.setVisible(false);
            xTen67.setVisible(false);
            xTen68.setVisible(false);
            xTen69.setVisible(false);
            xTen70.setVisible(false);
            xTen71.setVisible(false);
            xTen72.setVisible(false);
            xTen73.setVisible(false);
            xTen74.setVisible(false);
            xTen75.setVisible(false);
            xTen76.setVisible(false);
            xTen77.setVisible(false);
            xTen78.setVisible(false);
            xTen79.setVisible(false);
            xTen80.setVisible(false);
            xTen81.setVisible(false);
            xTen82.setVisible(false);
            xTen83.setVisible(false);
            xTen84.setVisible(false);
            xTen85.setVisible(false);
            xTen86.setVisible(false);
            xTen87.setVisible(false);
            xTen88.setVisible(false);
            xTen89.setVisible(false);
            xTen90.setVisible(false);
            xTen91.setVisible(false);
            xTen92.setVisible(false);
            xTen93.setVisible(false);
            xTen94.setVisible(false);
            xTen95.setVisible(false);
            xTen96.setVisible(false);
            xTen97.setVisible(false);
            xTen98.setVisible(false);
            xTen99.setVisible(false);
            xTen100.setVisible(false);

            lblTextVictory.setVisible(false);
            lblTextVictory.setText("");

            imgWin.setVisible(false);

            field3x3 = 0;
            field5x5 = 0;
            field10x10 = 0;

            rivalPeople = 0;
            rivalAi = 0;

            turnPeopleOne = 0;
        }
}
