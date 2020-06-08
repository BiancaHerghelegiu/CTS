package teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PachetTuristicTests.class, PersoanaCheckCNPTests.class, PersoanaGetVarstaTests.class })
public class SuitaCompleta {

}
