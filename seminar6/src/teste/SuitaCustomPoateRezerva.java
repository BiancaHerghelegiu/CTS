package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.categorii.CategorieTestePersoaneMajore;
import teste.categorii.CategorieTestePersoaneMinore;
import teste.categorii.CategorieTestePersoaneTinere;
import teste.categorii.CategorieTestePersoaneVarstnice;

@RunWith(Categories.class)
@SuiteClasses({PachetTuristicTests.class})
@IncludeCategory({CategorieTestePersoaneMajore.class, CategorieTestePersoaneMinore.class})
public class SuitaCustomPoateRezerva {

}
