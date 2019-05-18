package com.tatsuaki.study.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

@SpringUI(path = "/vaadin/trial/1")
@Theme("valo")
public class StartVaadin extends UI {

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Button("Click me",
                e -> Notification.show("Hello Spring with Vaadin!")));
    }
}
