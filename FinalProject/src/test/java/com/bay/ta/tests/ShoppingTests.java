package com.bay.ta.tests;

import com.bay.ta.page.ProductPage;
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
    @Test
    public void deliveryClearance()
    {
        assertThat(new ProductPage(driver)
                .openPage()
                .deliveryClearance()).isNotNull();
    }
    @Test
    public void sale()
    {
        assertThat(new ShoesPage(driver)
                .openPage()
                .chooseSale()).isNotNull();
    }
    @Test
    public void addToFavorite()
    {
        assertThat(new ProductPage(driver)
                .openPage()
                .addToFavorite()).isNotNull();
    }
}
