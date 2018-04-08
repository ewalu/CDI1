package pl.edu.atena.cd1.calculation.multipliers;

import javax.enterprise.util.AnnotationLiteral;

import pl.edu.atena.cdi1.RiskSymbol;

public class MultiplierLiteral extends AnnotationLiteral<MultiplierForRisk> implements MultiplierForRisk {
	
	private static final long serialVersionUID = 1L;
	
	private RiskSymbol type;
	
	public MultiplierLiteral(RiskSymbol type) {
		this.type = type;
	}
	
	@Override
	public RiskSymbol value() {
		return this.type;
	}
	

}
