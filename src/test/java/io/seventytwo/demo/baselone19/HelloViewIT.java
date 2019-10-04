package io.seventytwo.demo.baselone19;

import com.vaadin.flow.component.html.testbench.SpanElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import org.junit.Assert;
import org.junit.Test;

public class HelloViewIT extends AbstractViewTest {

    @Test
    public void halloBaselOne() {
        getDriver().get("http://localhost:8080/hello");

        $(TextFieldElement.class).first().setValue("BaselOne");

        Assert.assertEquals("Hallo BaselOne", $(SpanElement.class).waitForFirst().getText());
    }
}
