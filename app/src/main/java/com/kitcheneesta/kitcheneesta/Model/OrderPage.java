package com.kitcheneesta.kitcheneesta.Model;

/**
 * Created by Jashan on 18/07/2015.
 */
public class OrderPage {
    String mHeading;
    OrderObject [] objects;

    public OrderPage(String heading, OrderObject [] orderObjects){
        mHeading = heading;
        objects = orderObjects;
    }

    public String getHeading() {
        return mHeading;
    }

    public void setHeading(String heading) {
        mHeading = heading;
    }

    public OrderObject[] getObjects() {
        return objects;
    }

    public void setObjects(OrderObject[] objects) {
        this.objects = objects;
    }
}
