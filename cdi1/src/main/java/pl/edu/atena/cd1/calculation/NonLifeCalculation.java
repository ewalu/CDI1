package pl.edu.atena.cd1.calculation;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.inject.Named;

import pl.edu.atena.cd1.calculation.multipliers.Multiplier;
import pl.edu.atena.cd1.calculation.multipliers.MultiplierForRisk;
import pl.edu.atena.cdi1.Policy;
import pl.edu.atena.cdi1.RiskSymbol;

//@Named("nonlife")
@NonLife
public class NonLifeCalculation implements Calculation{
	
	@Inject
	@MultiplierForRisk(RiskSymbol.OC)
	private Multiplier multiplierOC;
	@Inject
	@MultiplierForRisk(RiskSymbol.AC)
	private Multiplier multiplierAC;
	@Inject
	@MultiplierForRisk(RiskSymbol.NNW)
	private Multiplier multiplierNNW;
	
	@Override
	public Policy calculate(Policy policy) {
		BigDecimal premium = policy.getRisks().stream().map(item -> item.getBasePremium().multiply(BigDecimal.valueOf(0.95))).reduce(BigDecimal.ZERO,
				BigDecimal::add);
		
		if(policy.getRisks().stream().filter(RiskSymbol.OC::equals).findFirst().isPresent()) {
			premium = multiplierOC.multiply(premium);
		}
		
		if(policy.getRisks().stream().filter(RiskSymbol.AC::equals).findFirst().isPresent()) {
			premium = multiplierAC.multiply(premium);
		}
		
		if(policy.getRisks().stream().filter(RiskSymbol.NNW::equals).findFirst().isPresent()) {
			premium = multiplierNNW.multiply(premium);
		}
		
		policy.setPremium(premium);
		return policy;
	}

}
