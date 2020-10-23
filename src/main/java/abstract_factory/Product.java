package abstract_factory;

import abstract_factory.factory.AbstractFactory;
import abstract_factory.factory.AdidasFactory;

public interface Product {
    void makeProduct();

//    AbstractFactory abstractFactory = new AdidasFactory();
//        abstractFactory.getOutWear().makeProduct();
//        abstractFactory.getShoes().makeProduct();
//    abstractFactory = new NikeFactory();
//        abstractFactory.getShoes().makeProduct();
//        abstractFactory.getOutWear().makeProduct();
}
