package com.bay.ta.tests;

import com.bay.ta.page.ShoesPage;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static net.bytebuddy.matcher.ElementMatchers.is;

public class FilterTests extends CommonConditions {
    @Test
    public void checkSort()
    {
        assertThat(new ShoesPage(driver)
                .openPage()
                .chooseSort()).isNotNull();
    }
    @Test
    public void checkFilter()
    {
        assertThat(new ShoesPage(driver)
                .openPage()
                .chooseFilter()).isNotNull();
    }
}