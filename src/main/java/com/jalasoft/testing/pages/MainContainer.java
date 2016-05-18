package com.jalasoft.testing.pages;

public class MainContainer extends AbstractBasePage {

    public Header goToHeader() {
        return new Header();
    }

    public TabBar goToTabBar() {
        return new TabBar();
    }
}
