/**
 * @版权所有: 四川曙光集团   
 * @标题: Player.java 
 * @包路径:  com.lupan.javaStudy.chapter6 
 * @描述: TODO
 * @作者: 卢攀  
 * @日期: 2015年9月21日 上午10:44:52
 * @version V1.0   
 */
package com.lupan.javaStudy.chapter6;

import java.util.List;

import com.lupan.javaStudy.chapter6.enumPo.Position;


/**
 * TODO 游戏玩家
 *
 * @className Player
 * @author lupan
 */
public class Player {


	//手牌
	private List<Poker> pokers;
	//方位
	private Position position;
	//状态
	private boolean state = true;
	//下家
	private Player nextPlayer;
	
	/**
	 * @return the pokers
	 */
	public List<Poker> getPokers() {
		return pokers;
	}
	/**
	 * @param pokers the pokers to set
	 */
	public void setPokers(List<Poker> pokers) {
		this.pokers = pokers;
	}
	/**
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(Position position) {
		this.position = position;
	}
	/**
	 * @return the state
	 */
	public boolean isState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}
	/**
	 * @return the nextPlayer
	 */
	public Player getNextPlayer() {
		return nextPlayer;
	}
	/**
	 * @param nextPlayer the nextPlayer to set
	 */
	public void setNextPlayer(Player nextPlayer) {
		this.nextPlayer = nextPlayer;
	}
}
