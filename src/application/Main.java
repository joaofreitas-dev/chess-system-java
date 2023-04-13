package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChassMatch;

public class Main {


    public static void main(String[] args) {
        ChassMatch chessMatch = new ChassMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}