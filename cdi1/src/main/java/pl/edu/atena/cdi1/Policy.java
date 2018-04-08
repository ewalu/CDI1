package pl.edu.atena.cdi1;

import java.math.BigDecimal;
import java.util.List;

public class Policy {
	
	private String number;
	private BigDecimal premium;
	private List<RiskSymbol> risks;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public BigDecimal getPremium() {
		return premium;
	}
	public void setPremium(BigDecimal premium) {
		this.premium = premium;
	}
	public List<RiskSymbol> getRisks() {
		return risks;
	}
	public void setRisks(List<RiskSymbol> risks) {
		this.risks = risks;
	}

}
