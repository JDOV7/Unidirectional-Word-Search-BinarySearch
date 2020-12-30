/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Daniel Ochoa
 */
public class UnidirectionalWordSearch {

    public void UnidirectionalWordSearch() {
        String board[][] = {{"H", "E", "L", "L", "O"},
        {"A", "B", "C", "D", "E"}};
        String word = "HELLO";
        for (int i = 0; i < board.length; i++) {
            StringBuilder sTextHori = new StringBuilder();
            for (int j = 0; j < board[i].length; j++) {
                sTextHori.append(board[i][j]);
            }
            if (sTextHori.indexOf(word) != -1) {
                System.out.println("true");
            }
        }
        for (int j = 0; j < board[0].length; j++) {
            StringBuilder sTextVerti = new StringBuilder();
            for (int k = 0; k < board.length; k++) {
                sTextVerti.append(board[k][j]);
            }
            if (sTextVerti.indexOf(word) != -1) {
                System.out.println("true");
            }
        }
        System.out.println("false");
    }
}
