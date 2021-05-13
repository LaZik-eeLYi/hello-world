/**
 * @版权所有: 四川曙光集团   
 * @标题: PokerGame.java 
 * @包路径:  com.lupan.javaStudy.chapter6 
 * @描述: TODO
 * @作者: 卢攀  
 * @日期: 2015年9月21日 上午10:56:02
 * @version V1.0   
 */
package com.lupan.javaStudy.chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.lupan.javaStudy.chapter6.enumPo.Number;
import com.lupan.javaStudy.chapter6.enumPo.Position;
import com.lupan.javaStudy.chapter6.enumPo.Shape;

/**
 * TODO
 *
 * @className PokerGame
 * @author lupan
 */
public class PokerGame {

	// 剩下的牌
	private static Poker[] pokers = new Poker[52];
	// 玩家
	private static Player[] players = new Player[5];

	/**
	 * 初始化方法
	 */
	public static void initGame() {
		System.out.println("开始洗牌，玩家就位！");
		// 初始化牌组
		Poker[] pokersTemp = new Poker[52];

		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++) {
				Poker poker = new Poker();
				switch (i) {
				case 0:
					poker.setNumber(Number.A);
					break;
				case 1:
					poker.setNumber(Number.TWO);
					break;
				case 2:
					poker.setNumber(Number.THREE);
					break;
				case 3:
					poker.setNumber(Number.FOUR);
					break;
				case 4:
					poker.setNumber(Number.FIVE);
					break;
				case 5:
					poker.setNumber(Number.SIX);
					break;
				case 6:
					poker.setNumber(Number.SEVEN);
					break;
				case 7:
					poker.setNumber(Number.EIGHT);
					break;
				case 8:
					poker.setNumber(Number.NINE);
					break;
				case 9:
					poker.setNumber(Number.TEN);
					break;
				case 10:
					poker.setNumber(Number.J);
					break;
				case 11:
					poker.setNumber(Number.Q);
					break;
				case 12:
					poker.setNumber(Number.K);
					break;
				default:
					break;
				}

				switch (j) {
				case 0:
					poker.setShape(Shape.CLUB);
					break;
				case 1:
					poker.setShape(Shape.DIAMOND);
					break;
				case 2:
					poker.setShape(Shape.HEART);
					break;
				case 3:
					poker.setShape(Shape.SPADE);
					break;
				default:
					break;
				}
				pokersTemp[i * 4 + j] = poker;
			}
		}

		// 洗牌
		List<Poker> pokerTempList = new ArrayList<Poker>(
				Arrays.asList(pokersTemp));
		Collections.shuffle(pokerTempList);
		pokers = pokerTempList.toArray(pokers);

		// 初始化玩家

		for (int i = 0; i < players.length; i++) {
			Player player = new Player();
			player.setPokers(new ArrayList<Poker>());

			switch (i) {
			case 0:
				player.setPosition(Position.EAST);
				break;
			case 1:
				player.setPosition(Position.SOUTH);
				break;
			case 2:
				player.setPosition(Position.WEST);
				break;
			case 3:
				player.setPosition(Position.NORTH);
				break;
			case 4:
				player.setPosition(Position.CENTER);
				break;
			default:
				break;
			}

			player.setState(true);

			players[i] = player;
		}

		// 设定下家
		for (int i = 0; i < players.length; i++) {
			if (i != players.length - 1) {
				players[i].setNextPlayer(players[i + 1]);
			} else {
				players[i].setNextPlayer(players[0]);
			}
		}

		System.out.println("洗牌结束！");
	}

	/**
	 * 发牌
	 */
	public static void deal(int n, Player nowPlayer) {
		Poker dealPoker = pokers[n];

		if (nowPlayer.isState() == true) {
			nowPlayer.getPokers().add(dealPoker);
		}

		// 请求是否继续要牌
		if (n > 4) {
			if (nowPlayer.isState() == true) {
				System.out.println(nowPlayer.getPosition().toString()
						+ " 是否继续？");
				Scanner scanner = new Scanner(System.in);
				int c = scanner.nextInt();
				if (c == 1) {
				} else {
					nowPlayer.setState(false);
				}
			}

			// scanner.close();
		}

	}

	public static void main(String[] args) {

		initGame();

		// 发牌
		Player nowPlayer = players[0];
		for (int i = 0; i < 5; i++) {
			System.out.println("第" + (i + 1) + "轮：");
			for (int j = 0; j < 5; j++) {
				deal(i * 5 + j, nowPlayer);
				nowPlayer = nowPlayer.getNextPlayer();
			}
		}

		// 统计结果(亮牌)
		for (Player player : players) {
			List<Poker> pokers = player.getPokers();
			System.out.println(player.getPosition() + "的牌是：");
			for (Poker poker : pokers) {
				System.out.print(poker.getShape().getName()
						+ poker.getNumber().getNum() + "  ");
			}
			System.out.println();
		}
	}

}
