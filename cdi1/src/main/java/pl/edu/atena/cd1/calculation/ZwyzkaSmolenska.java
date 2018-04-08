package pl.edu.atena.cd1.calculation;

import java.math.BigDecimal;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import pl.edu.atena.cd1.calculation.multipliers.MultiplierFactory;
import pl.edu.atena.cdi1.Policy;
import pl.edu.atena.cdi1.RiskSymbol;

@Decorator
public class ZwyzkaSmolenska implements Calculation {
	
	@Any
	@Inject
	@Delegate
	private Calculation calculation;
	
	@Inject
	private MultiplierFactory factory;

	@Override
	public Policy calculate(Policy policy) {
		
		policy = calculation.calculate(policy);
		BigDecimal premium = policy.getPremium();
		
		policy.setPremium(premium.multiply(BigDecimal.valueOf(1.1)));
		return policy;
	}

}