/**
 * @版权所有: 四川曙光集团   
 * @标题: FiveChess.java 
 * @包路径:  com.lupan.javaStudy.chapter4 
 * @描述: TODO
 * @作者: 卢攀  
 * @日期: 2015年9月1日 上午9:48:20
 * @version V1.0   
 */
package com.lupan.javaStudy.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.lupan.javaStudy.chapter10.MyException;

/**
 * TODO 控制台五指棋游戏实现
 *
 *      从控制台获取输入，每次输入一个则重新打印一遍棋盘
 * @className FiveChess
 * @author lupan
 */
public class FiveChess {

	//对方的棋的样式
    private static final String COMPUTER_CHESS = "○ ";
	//我的棋样式
	private static final String MY_CHESS = "● ";
	//棋盘宽度
	private static final int BOARD_WIDTH = 16;
	//棋盘网格符号
	private static final String GRID_MARK = "+ ";
	
	//棋盘
	private String[][] board=new String[BOARD_WIDTH][BOARD_WIDTH]; 
	
	/**
	 * 初始化棋盘
	 */
	private void initBorad(){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = GRID_MARK;
			}
		}
	}
	
	/**
	 * 打印棋局
	 */
	private void printBoard(){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	/**
	 * 电脑下棋
	 * @param myBoard 我下完后的棋局
	 * @return
	 */
	private String[][] computerPlay(String[][] myBoard){
		//随机下一个棋
		int x,y;
		do{
		 x = (int) (Math.random()*BOARD_WIDTH);
		 y = (int) (Math.random()*BOARD_WIDTH);
	    
		 //下的点位上没有棋子
		}while(myBoard[x][y] == MY_CHESS && myBoard[x][y] == MY_CHESS);
		
		myBoard[x][y] = COMPUTER_CHESS;
		return myBoard;
	}
	
	/**
	 * 判断是否获胜
	 * @param judgeBoard 用来判断的棋局
	 * @return
	 */
	private boolean isWin(String chessType , String[][] judgeBoard){
		int x,y;
		//扫描棋盘
		for (int i = 0; i < judgeBoard.length; i++) {
			for (int j = 0; j < judgeBoard.length; j++) {
				if(judgeBoard[i][j] == chessType){
					//扫描是否连成五个
					x=i;
					y=j;
				
					//1.左上
					int k = -1;
					while(x-4>=0 && y-4>=0 && ++k<=4){
						if(judgeBoard[x-4+k][y-4+k] != chessType){
							break;
						}
//						k++;
						if(k==4){
							return true;
						}
					}
					
					//2.左下
				     k = -1;
					while(x-4>=0 && y+4<=BOARD_WIDTH-1 && ++k<=4){
						if(judgeBoard[x-4+k][y+4-k] != chessType){
							break;
						}
						if(k==4){
							return true;
						}
					}
					
					//3.右下
				     k = -1;
					while(x+4<=BOARD_WIDTH-1 && y+4<=BOARD_WIDTH-1 && ++k<=4){
						if(judgeBoard[x+4-k][y+4-k] != chessType){
							break;
						}
						if(k==4){
							return true;
						}
					}
					
					//4.右上
				     k = -1;
					while(x+4<=BOARD_WIDTH-1 && y-4>=0 && ++k<=4){
						if(judgeBoard[x+4-k][y-4+k] != chessType){
							break;
						}
						if(k==4){
							return true;
						}
					}
					
					//5.正上
				     k = -1;
					while(y-4>=0 && ++k<=4){
						if(judgeBoard[x][y-4+k] != chessType){
							break;
						}
						if(k==4){
							return true;
						}
					}
					
					//6.正左
				     k = -1;
					while(x-4>=0 && ++k<=4){
						if(judgeBoard[x-4+k][y] != chessType){
							break;
						}
						if(k==4){
							return true;
						}
					}
					
					//7.正下
				     k = -1;
					while(y+4<=BOARD_WIDTH-1 && ++k<=4){
						if(judgeBoard[x][y+4-k] != chessType){
							break;
						}
						if(k==4){
							return true;
						}
					}
					
					//8.正右
				     k = -1;
					while(x+4<=BOARD_WIDTH-1 && ++k<=4){
						if(judgeBoard[x+4-k][y] != chessType){
							break;
						}
						if(k==4){
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * 判断输入是否合法
	 * @param axis
	 * @return
	 */
	public static boolean isInputRight(String axis){
		Pattern p = Pattern.compile("(\\d)+,(\\d)+");
		Matcher m = p.matcher(axis);
		return m.matches();
	}
	
	/**
	 * 下棋主程序
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String args[]) throws IOException{
		FiveChess fiveChess = new FiveChess();
		
		//初始化棋盘
		fiveChess.initBorad();
		fiveChess.printBoard();
		
		//每次下棋的x，y坐标
		int x = 0;
		int y = 0;
		
		//下棋坐标输入（以逗号隔开）
		System.out.println("请输入下一步棋子坐标：");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = "";
		
		//循环进行下棋过程
		try {
			while((inputStr = br.readLine()) != null){
				/************我的回合******************/
				//判断输入是否合法
				if(isInputRight(inputStr) != true){
					System.out.println("输入不合法，请重新输入！");
					continue;
				}
				//获取输入的坐标
				String[] inputArr = inputStr.split(",");
				x = Integer.parseInt(inputArr[0]);
				y = Integer.parseInt(inputArr[1]);
				//放入到棋盘
				fiveChess.board[x][y] = MY_CHESS;
				//打印棋盘
				fiveChess.printBoard();
				//判断输赢
				if(fiveChess.isWin(MY_CHESS,fiveChess.board)){
					System.out.println("你赢了！");
					break;
				}
				
				/********电脑回合**********/
				System.out.println("电脑回合：");
				fiveChess.computerPlay(fiveChess.board);
				fiveChess.printBoard();
				//判断输赢
				if(fiveChess.isWin(COMPUTER_CHESS,fiveChess.board)){
					System.out.println("电脑赢了！");
					break;
				}
				
				System.out.println("请输入下一步棋子坐标：");
			}
		} catch (NumberFormatException e) {
			System.out.println("异常：输入无法转化为数字！");
			e.printStackTrace();
			throw new NumberFormatException();
		} catch (IOException e) {
			System.out.println("异常：IO异常！");
			e.printStackTrace();
//			throw new IOException();
			throw new MyException("自定义的异常！");
		}
	}
	
}
