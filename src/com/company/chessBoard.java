package com.company;

import java.io.FileNotFoundException;


public class chessBoard {


    Link head;

     public void chessBoard() {

        head = null;
    }

    public void insert(chessPiece p) { //inserts chesspiece to link, adds to list

        Link latestPiece = new Link(p);

        latestPiece.next = head;

        head = latestPiece;
    }


    public chessPiece findMovingPiece(int moveFromCol, int moveFromRow) { //find which piece is moving, returns it

        Link current = head;

        while (current != null) {

            if (current.piece.col == moveFromCol && current.piece.row == moveFromRow) {

                return current.piece;
            }
            current = current.next;
        }
        return null;
    }

    public String CheckPieceAtSpot(int MoveToCol, int MoveToRow) { //check piecetype of piece (if one) at target spot.

        Link current = head;

        while (current != null) {

            if (current.piece.col == MoveToCol && current.piece.row == MoveToRow) {

                return current.piece.pieceType;
            }

            current = current.next;
        }
        return "no piece";
    }

    public String checkAttacking(chessBoard theBoard) throws FileNotFoundException { //checks if piece is attacking a King

        Link current = head;

        while (current != null) {

            Link current2 = head;
            while (current2 != null) {

                if (current != current2) {

                    if ((current.piece.isAttacking(current2.piece, theBoard))) {

                        if (current.piece.pieceType.toUpperCase().equals(current.piece.pieceType.toUpperCase())) {

                            return "white";
                        }

                        if ((current.piece.pieceType.toLowerCase().equals(current.piece.pieceType.toLowerCase()))) {

                            return "black";
                        }
                    }

                }
                current2 = current2.next;
            }
            current = current.next;
        }
        return "safe";
    }

    public String checkBlackAttacking(chessBoard theBoard) throws FileNotFoundException { //Checks if black king under attack

        Link current = head;

        while (current != null) {

            Link current2 = head;
            while (current2 != null) {

                if (current != current2) {

                    if ((current.piece.isAttacking(current2.piece, theBoard))) {


                        if ((current.piece.pieceType.equals(current.piece.pieceType.toLowerCase()))) {

                            return "black";
                        }
                    }

                }
                current2 = current2.next;
            }
            current = current.next;
        }
        return "safe";
    }

    public String checkWhiteAttacking(chessBoard theBoard) throws FileNotFoundException { //checks if white king under attack

        Link current = head;

        while (current != null) {

            Link current2 = head;
            while (current2 != null) {

                if (current != current2) {

                    if ((current.piece.isAttacking(current2.piece, theBoard))) {

                        if (current.piece.pieceType.equals(current.piece.pieceType.toUpperCase())) {

                            return "white";
                        }
                    }

                }
                current2 = current2.next;
            }
            current = current.next;
        }
        return "safe";
    }

    public void delete(int Col, int Row) { //delete link in list

        Link previous = null;
        Link current = head;

        while (current != null) {
            if (current.piece.col == Col && current.piece.row == Row) {
                if (previous == null) {
                    head = current.next;
                    break;
                }
                previous.next = current.next;
                break;
            }
            previous = current;
            current = current.next;
        }
    }

    public void updateLink(int oldCol, int oldRow, int newCol, int newRow) { //updates link if moved.

        Link current = head;

        while (current != null) {

            if (oldCol == current.piece.col && oldRow == current.piece.row) {

                current.piece.col = newCol;
                current.piece.row = newRow;
            }
            current = current.next;
        }
    }




    public void printLinks() {

        Link current = head;

        while (current != null) {

            System.out.println(current.piece.pieceType + " " + current.piece.col + " " + current.piece.row + " ");
            current = current.next;

        }
    }
}
