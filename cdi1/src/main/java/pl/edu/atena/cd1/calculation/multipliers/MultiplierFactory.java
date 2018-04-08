package pl.edu.atena.cd1.calculation.multipliers;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import pl.edu.atena.cdi1.RiskSymbol;

public class MultiplierFactory {
	
	@Inject
	@Any
	private Instance<Multiplier> multipliers;
	
	public Multiplier getMultiplier(RiskSymbol risk) {
		MultiplierLiteral literal = new MultiplierLiteral(risk);
		Instance<Multiplier> typeMultiplier = multipliers.select(literal);
		return typeMultiplier.get();
	}
	
	//@Produces
	//@MultiplierForRisk(RiskSymbol.OC)
	//public Multiplier multiplierOC() {
		//return new MultiplierOC();
	//}
	
	//@Produces
	//@MultiplierForRisk(RiskSymbol.AC)
	//public Multiplier multiplierAC() {
		//return new MultiplierAC();
	//}
	
	//@Produces
	//@MultiplierForRisk(RiskSymbol.NNW)
	//public Multiplier multiplierNNW() {
		//return new MultiplierNNW();
	//}

}
