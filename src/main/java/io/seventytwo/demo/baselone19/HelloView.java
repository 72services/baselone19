package io.seventytwo.demo.baselone19;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route
public class HelloView extends VerticalLayout {

    public HelloView() {
        TextField name = new TextField("Ihr Name: ");
        Span greeting = new Span();

        name.addValueChangeListener(event ->
        greeting.setText("Hallo " + event.getValue()));

        add(name, greeting);
    }
}
