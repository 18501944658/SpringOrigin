package com.itszt.gold.lookup;

public abstract class ShowSexClass {

    public void showSex() {
        getPeople().showSex();
    }

    /**
     * 不一定是抽象
     **/
    public abstract People getPeople();

}
