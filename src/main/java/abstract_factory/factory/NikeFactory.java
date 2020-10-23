package abstract_factory.factory;

import abstract_factory.Product;
import abstract_factory.nike.NikeOutWear;
import abstract_factory.nike.NikeShoes;

public class NikeFactory implements AbstractFactory {
    @Override
    public Product getShoes() {
        return new NikeShoes();
    }

    @Override
    public Product getOutWear() {
        return new NikeOutWear();
    }
}
