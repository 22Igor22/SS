package com.Bay.ta.tests;

import com.Bay.ta.page.ShoesPage;
import org.testng.annotations.Test;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShoppingTests extends CommonConditions {
    @Test
    public void buyingTwoIdenticalPairs()
    {
       new ShoesPage(driver)
               .openPage()
               .chooseTheFirstPair()
               .addToBag()
               .addToBag();
    }
}
