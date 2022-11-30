package com.bay.ta.tests;

import com.bay.ta.page.ShoesPage;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static net.bytebuddy.matcher.ElementMatchers.is;

public class ShoppingTests extends CommonConditions {
    @Test
    public void buyingTwoIdenticalPairs()
    {
        assertThat(new ShoesPage(driver)
                .openPage()
                .chooseTheFirstPair()
                .addToBag()).isNotNull();
    }
}
