package pl.edu.atena.cd1.calculation;

import java.math.BigDecimal;

import javax.inject.Named;

import pl.edu.atena.cdi1.Policy;

//@Named("standard")
@Standard
public class StandardCalculation implements Calculation{
	
	@Override
	public Policy calculate(Policy policy) {
		BigDecimal premium = policy.getRisks().stream().map(item -> item.getBasePremium()).reduce(BigDecimal.ZERO,
				BigDecimal::add);
		
		policy.setPremium(premium);
		return policy;
	}

}
