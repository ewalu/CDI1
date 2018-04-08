package pl.edu.atena.cd1.calculation.multipliers;

import java.math.BigDecimal;

import javax.enterprise.inject.Alternative;

import pl.edu.atena.cdi1.RiskSymbol;

@MultiplierForRisk(RiskSymbol.OC)
@Alternative
public class MultiplierOC implements Multiplier {

	@Override
	public BigDecimal multiply(BigDecimal value) {
		return value.multiply(BigDecimal.valueOf(1.13));
	}

}
