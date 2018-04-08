package pl.edu.atena.cd1.calculation.multipliers;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import pl.edu.atena.cdi1.RiskSymbol;

@Qualifier
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
public @interface MultiplierForRisk {
	RiskSymbol value();

}
