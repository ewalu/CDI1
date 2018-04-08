package pl.edu.atena.cd1.calculation.multipliers;

import javax.enterprise.inject.Produces;

import pl.edu.atena.cdi1.RiskSymbol;

public class MultiplierFactory {
	
	@Produces
	@MultiplierForRisk(RiskSymbol.OC)
	public Multiplier multiplierOC() {
		return new MultiplierOC();
	}
	
	@Produces
	@MultiplierForRisk(RiskSymbol.AC)
	public Multiplier multiplierAC() {
		return new MultiplierAC();
	}
	
	@Produces
	@MultiplierForRisk(RiskSymbol.NNW)
	public Multiplier multiplierNNW() {
		return new MultiplierNNW();
	}

}
