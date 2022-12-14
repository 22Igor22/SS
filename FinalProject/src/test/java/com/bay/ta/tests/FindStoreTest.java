package com.bay.ta.tests;

import com.bay.ta.page.FindAStore;
import com.bay.ta.page.ShoesPage;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static net.bytebuddy.matcher.ElementMatchers.is;

public class FindStoreTest extends CommonConditions {
    @Test
    public void findAStore()
    {
        assertThat(new FindAStore(driver)
                .openPage()
                .findAStore()).isNotNull();
    }
}