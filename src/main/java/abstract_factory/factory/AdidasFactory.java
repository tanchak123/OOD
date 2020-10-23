package abstract_factory.factory;

import abstract_factory.Product;
import abstract_factory.adidas.AdidasOutWear;
import abstract_factory.adidas.AdidasShoes;

public class AdidasFactory implements AbstractFactory {

    @Override
    public Product getShoes() {
        return new AdidasShoes();
    }

    @Override
    public Product getOutWear() {
        return new AdidasOutWear();
    }
}
