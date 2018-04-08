package pl.edu.atena.cd1.calculation;

import java.math.BigDecimal;

import pl.edu.atena.cdi1.Policy;

public class StandardCalculation {
	
	public Policy calculate(Policy policy) {
		BigDecimal premium = policy.getRisks().stream().map(item -> item.getBasePremium()).reduce(BigDecimal.ZERO,
				BigDecimal::add);
		
		policy.setPremium(premium);
		return policy;
	}

}
