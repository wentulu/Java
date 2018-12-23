package cn.ruiz.stu;

import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShowHandGame {
	/*================关于初始化的牌面=======================*/
	private String[] cardType = {"♣️","♠️","♥️","♦️"};
	private String[] cardNo = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private List<String> cards = new ArrayList<String>(54);//一副扑克牌的信息
	/**
	 * 初始化扑克牌
	 * */
	public void initCards() {
		for(int i=0; i<cardType.length; i++) {
			for(int n=0; n<cardNo.length; n++) {
				cards.add(cardType[i]+" "+cardNo[n]);
			}
		}
		cards.add("Joker Big");
		cards.add("Joker little");
		Collections.shuffle(cards);
	}
	/**
	 * 输出一次牌的信息
	 * */
	public void showCards() {
		System.out.println(cards.size() +" : "+cards);
	}
	/*========================================================*/
	private List<String> playersName = new ArrayList<>();
	private LinkedHashMap<String, List<String>> playersCards = new LinkedHashMap();//玩家和牌面
	/**
	 * 添加玩家
	 * */
	public  void addPlayers(String... palayres) {
		for(String player : palayres) {
			playersName.add(player);
			playersCards.put(player, new LinkedList<String>());
		}
	}
	/**
	 * 发牌的方法
	 * */
	public void deliverCard(String first) {
		int foirstPoc = playersName.indexOf(first);
		for(int i = foirstPoc; i<playersName.size(); i++ ) {
			String card = cards.get(0);
			cards.remove(0);
			playersCards.get(playersName.get(i)).add(card);
		}
		for(int i=0; i<foirstPoc; i++) {
			String card = cards.get(0);
			cards.remove(0);
			playersCards.get(playersName.get(i)).add(card);
		}
		Set<String> players = playersCards.keySet();
		for(String player : players) {
			System.out.println(player +" : "+playersCards.get(player));
		}
	}
	
	
//	public void 
	
	
	public static void main(String[] args) {
		ShowHandGame showHandGame = new ShowHandGame();
		showHandGame.initCards();
		showHandGame.showCards();
		showHandGame.addPlayers("001","002","003","004","005");
		showHandGame.deliverCard("002");
		showHandGame.deliverCard("005");
		showHandGame.showCards();
	}
	
	
	

}
