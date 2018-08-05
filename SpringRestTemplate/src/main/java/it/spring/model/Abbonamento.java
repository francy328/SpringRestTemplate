package it.spring.model;

public class Abbonamento {
	
	
	private String nomeAbbonamento;
	private String userIns;
	private String userMod;
	
	public String getNomeAbbonamento() {
		return nomeAbbonamento;
	}
	public void setNomeAbbonamento(String nomeAbbonamento) {
		this.nomeAbbonamento = nomeAbbonamento;
	}
	public String getUserIns() {
		return userIns;
	}
	public void setUserIns(String userIns) {
		this.userIns = userIns;
	}
	public String getUserMod() {
		return userMod;
	}
	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}
	@Override
	public String toString() {
		return "Abbonamento [nomeAbbonamento=" + nomeAbbonamento + ", userIns="
				+ userIns + ", userMod=" + userMod + "]";
	}

	
	
}
