package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.categorii.CategorieTestePersoaneTinere;
import teste.categorii.CategorieTestePersoaneVarstnice;

@RunWith(Categories.class) //runnerul care ruleaza testele pe care le-am marcat cu adnotarea @Category
@SuiteClasses({PachetTuristicTests.class,PersoanaCheckCNPTests.class,PersoanaGetVarstaTests.class})
//@IncludeCategory({CategorieTestePersoaneVarstnice.class})
@ExcludeCategory({CategorieTestePersoaneTinere.class})
public class SuitaCustom {

}
