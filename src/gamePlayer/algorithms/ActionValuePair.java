package gamePlayer.algorithms;

import gamePlayer.Action;


public class ActionValuePair implements Comparable<ActionValuePair> {

	Action action;
	ActionValuePair principalVariation;
	int value, previousValue;
	
	public ActionValuePair(Action a, int v) {
		this.action = a;
		this.value = v;
		this.previousValue = 0;
		this.principalVariation = null;
	}

	@Override
	public int compareTo(ActionValuePair other) {
		return Float.compare(this.value, other.value);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("(Action : ");
		sb.append(action);
		try{
		ActionValuePair pv = this.principalVariation;
		while (pv.action != null) {
			sb.append("->");
			sb.append(pv.action);
			pv = pv.principalVariation;
		}
		}catch(Exception e){
			;
		}
		sb.append(" Value: " + value + ")");
		return sb.toString();
	}
	
}
