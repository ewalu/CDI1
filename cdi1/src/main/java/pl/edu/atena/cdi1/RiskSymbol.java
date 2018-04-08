package pl.edu.atena.cdi1;

import java.math.BigDecimal;

public enum RiskSymbol {
	OC (BigDecimal.valueOf(300)),
	AC (BigDecimal.valueOf(100)),
	NNW (BigDecimal.valueOf(15))
	;

	private BigDecimal basePremium;
	
	private RiskSymbol(BigDecimal basePremium) {
		this.basePremium = basePremium;
	}
	
	public BigDecimal getBasePremium() {
		return basePremium;
	}
}
