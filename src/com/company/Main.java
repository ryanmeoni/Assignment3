package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

//Author: Ryan Meoni DOES NOT HANDLE CHECKMATES. Handles everything else.
//Sources: HW2 and some YouTube videos to better understand delete/update link.

public class Main {

    public static int boardSize;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in); //while file has next line
        boolean runTest = true;
        while (runTest) {

            chessBoard theBoard = new chessBoard(); //creates chessBoard
            chessBoard theBoard2 = new chessBoard(); //make another chessboard to check for checks.

            String line1 = scan.nextLine();
            String line2 = scan.nextLine();
            String lineAfter1 = line1.trim() + " ";
            String[] token1 = lineAfter1.split("\\s+");

            boardSize = Integer.parseInt(token1[0]);

            for (int i = 1; i < token1.length; i++) { //for each piece type, add appropriate piece.
                String pieceType;
                int col;
                int row;
                switch (token1[i]) {

                    case "k":
                        pieceType = token1[i];
                        col = Integer.parseInt(token1[i + 1]);
                        row = Integer.parseInt(token1[i + 2]);
                        chessPiece whiteKing = new King(boardSize, pieceType, row, col);
                        chessPiece whiteKing2 = new King(boardSize, pieceType, row, col);
                        theBoard.insert(whiteKing);
                        theBoard2.insert(whiteKing2);
                        break;
                    case "K":
                        pieceType = token1[i];
                        col = Integer.parseInt(token1[i + 1]);
                        row = Integer.parseInt(token1[i + 2]);
                        chessPiece blackKing = new King(boardSize, pieceType, row, col);
                        chessPiece blackKing2 = new King(boardSize, pieceType, row, col);
                        theBoard.insert(blackKing);
                        theBoard2.insert(blackKing2);
                        break;
                    case "q":
                        pieceType = token1[i];
                        col = Integer.parseInt(token1[i + 1]);
                        row = Integer.parseInt(token1[i + 2]);
                        chessPiece whiteQueen = new Queen(boardSize, pieceType, row, col);
                        chessPiece whiteQueen2 = new Queen(boardSize, pieceType, row, col);
                        theBoard.insert(whiteQueen);
                        theBoard2.insert(whiteQueen2);
                        break;
                    case "Q":
                        pieceType = token1[i];
                        col = Integer.parseInt(token1[i + 1]);
                        row = Integer.parseInt(token1[i + 2]);
                        chessPiece blackQueen = new Queen(boardSize, pieceType, row, col);
                        chessPiece blackQueen2 = new Queen(boardSize, pieceType, row, col);
                        theBoard.insert(blackQueen);
                        theBoard2.insert(blackQueen2);
                        break;
                    case "r":
                        pieceType = token1[i];
                        col = Integer.parseInt(token1[i + 1]);
                        row = Integer.parseInt(token1[i + 2]);
                        chessPiece whiteRook = new Rook(boardSize, pieceType, row, col);
                        chessPiece whiteRook2 = new Rook(boardSize, pieceType, row, col);
                        theBoard.insert(whiteRook);
                        theBoard2.insert(whiteRook2);
                        break;
                    case "R":
                        pieceType = token1[i];
                        col = Integer.parseInt(token1[i + 1]);
                        row = Integer.parseInt(token1[i + 2]);
                        chessPiece blackRook = new Rook(boardSize, pieceType, row, col);
                        chessPiece blackRook2 = new Rook(boardSize, pieceType, row, col);
                        theBoard.insert(blackRook);
                        theBoard2.insert(blackRook2);
                        break;
                    case "b":
                        pieceType = token1[i];
                        col = Integer.parseInt(token1[i + 1]);
                        row = Integer.parseInt(token1[i + 2]);
                        chessPiece whiteBishop = new Bishop(boardSize, pieceType, row, col);
                        chessPiece whiteBishop2 = new Bishop(boardSize, pieceType, row, col);
                        theBoard.insert(whiteBishop);
                        theBoard2.insert(whiteBishop2);
                        break;
                    case "B":
                        pieceType = token1[i];
                        col = Integer.parseInt(token1[i + 1]);
                        row = Integer.parseInt(token1[i + 2]);
                        chessPiece blackBishop = new Bishop(boardSize, pieceType, row, col);
                        chessPiece blackBishop2 = new Bishop(boardSize, pieceType, row, col);
                        theBoard.insert(blackBishop);
                        theBoard2.insert(blackBishop2);
                        break;
                    case "n":
                        pieceType = token1[i];
                        col = Integer.parseInt(token1[i + 1]);
                        row = Integer.parseInt(token1[i + 2]);
                        chessPiece whiteKnight = new Knight(boardSize, pieceType, row, col);
                        chessPiece whiteKnight2 = new Knight(boardSize, pieceType, row, col);
                        theBoard.insert(whiteKnight);
                        theBoard2.insert(whiteKnight2);
                        break;
                    case "N":
                        pieceType = token1[i];
                        col = Integer.parseInt(token1[i + 1]);
                        row = Integer.parseInt(token1[i + 2]);
                        chessPiece blackKnight = new Knight(boardSize, pieceType, row, col);
                        chessPiece blackKnight2 = new Knight(boardSize, pieceType, row, col);
                        theBoard.insert(blackKnight);
                        theBoard2.insert(blackKnight2);
                        break;
                    case "P":
                        pieceType = token1[i];
                        col = Integer.parseInt(token1[i + 1]);
                        row = Integer.parseInt(token1[i + 2]);
                        chessPiece blackPawn = new Pawn(boardSize, pieceType, row, col);
                        chessPiece blackPawn2 = new Pawn(boardSize, pieceType, row, col);
                        theBoard.insert(blackPawn);
                        theBoard2.insert(blackPawn2);
                        break;
                    case "p":
                        pieceType = token1[i];
                        col = Integer.parseInt(token1[i + 1]);
                        row = Integer.parseInt(token1[i + 2]);
                        chessPiece whitePawn = new Pawn(boardSize, pieceType, row, col);
                        chessPiece whitePawn2 = new Pawn(boardSize, pieceType, row, col);
                        theBoard.insert(whitePawn);
                        theBoard2.insert(whitePawn2);
                }
            }

            String lineAfter2 = line2.trim() + " ";
            String[] token2 = lineAfter2.split("\\s+");

            for (int a = 0, b = 1, c = 2, d = 3; a < token2.length && b < token2.length && c < token2.length
                    && d < token2.length; a += 4, b += 4, c += 4, d += 4) {

                int MoveFromCol = Integer.parseInt(token2[a]);
                int MoveFromRow = Integer.parseInt(token2[b]);
                int MoveToCol = Integer.parseInt(token2[c]);
                int MoveToRow = Integer.parseInt(token2[d]);
                boolean validMove = false;
                boolean validPiece = true;
                boolean movedToEmptySpace = false;

                chessPiece MovingPiece = theBoard.findMovingPiece(MoveFromCol, MoveFromRow); //get moving piece.
                if (MovingPiece == null) {
                    validPiece = false;
                }
                String SpacePieceType = theBoard.CheckPieceAtSpot(MoveToCol, MoveToRow); //get target piece type.


                if (validPiece && MovingPiece.canMove(theBoard, MoveToCol, MoveToRow, SpacePieceType)) { //if move is valid.
                    System.out.print("Valid ");
                    validMove = true;

                    if (SpacePieceType.equals("no piece") && MovingPiece.canMove(theBoard, MoveToCol, MoveToRow, SpacePieceType)) {
                        theBoard.updateLink(MoveFromCol, MoveFromRow, MoveToCol, MoveToRow);
                        movedToEmptySpace = true;
                    }

                    if (MovingPiece.canMove(theBoard, MoveToCol, MoveToRow, SpacePieceType) && !SpacePieceType.equals("no space") &&
                            !movedToEmptySpace) {

                        theBoard.delete(MoveToCol, MoveToRow);
                        theBoard.updateLink(MoveFromCol, MoveFromRow, MoveToCol, MoveToRow);

                    }
                }
                if (!validMove) {
                    System.out.print("Invalid ");
                    break;
                }
            }

            System.out.println();

            if (theBoard2.checkAttacking(theBoard2).equals("safe")) { //if safe
                System.out.print("All kings safe ");
            }

            if (theBoard2.checkBlackAttacking(theBoard2).equals("black check")) { //if black in check
                System.out.print("Black in check ");
            }

            if (theBoard2.checkWhiteAttacking(theBoard2).equals("white")) { //if white in check
                System.out.print("White in check ");
            }
            System.out.println();

            theBoard2.printLinks();

            System.out.println("Run another board? (y/n)");
            String answer = scan.next();
            if (answer.equals("n")) {
                runTest = false;
            }
        }
    }
}
