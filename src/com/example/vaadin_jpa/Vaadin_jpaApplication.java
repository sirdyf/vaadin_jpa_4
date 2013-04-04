package com.example.vaadin_jpa;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class Vaadin_jpaApplication extends Application {
	dictonary tst;

	@Override
	public void init() {
		
		
		Window mainWindow = new Window("Vaadin_jpa Application");
		//Label label = new Label("Hello Vaadin user");
		tst = new dictonary();

		//mainWindow.addComponent(label);
		setMainWindow(mainWindow);
		mainWindow.setContent(tst);
		
	}

}
