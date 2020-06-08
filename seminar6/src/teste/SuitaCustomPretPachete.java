package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.categorii.CategorieTestePacheteTuristiceIeftine;
import teste.categorii.CategorieTestePacheteTuristiceScumpe;
import teste.categorii.CategorieTestePersoaneMajore;
import teste.categorii.CategorieTestePersoaneMinore;

@RunWith(Categories.class)
@SuiteClasses({ PachetTuristicTests.class })
@IncludeCategory({CategorieTestePacheteTuristiceIeftine.class, CategorieTestePacheteTuristiceScumpe.class})
@ExcludeCategory(CategorieTestePacheteTuristiceScumpe.class)
public class SuitaCustomPretPachete {

}
