package com.tictactoe;

import java.util.*;

public class tictactoe {
	static char[] board = new char[10];
	static char player,computer;
	public static Scanner sc=new Scanner(System.in);

	static void createBoard(){
		for(int i=0;i<10;i++){
			board[i]=' ';
		}
	}

	static void getPlayerChoice(){
		System.out.println("select x or o:");
		player=Character.toUpperCase(sc.next().charAt(0));

		if (player=='X')
			computer='o';
		else
			computer='x';
		System.out.println("you have selected:" +player);
		System.out.println("computer's choice is:" +computer);
	}

	public static void main(String[] args){
		System.out.println("----- Welcome To The Game Of Tic Tac Toe -----");
		createBoard();
		getPlayerChoice();
	}
}
