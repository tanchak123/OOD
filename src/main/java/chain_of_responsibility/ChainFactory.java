package chain_of_responsibility;

public class ChainFactory {
    private ChainOfResponsibility chain;

    public ChainFactory() {
        chain = new PositiveNumberHandler();
        chain.nextChain(new ZeroNumberHandler())
                .nextChain(new NegativeNumberHandler());

    }

    public void requestProcess(Number number) {
        chain.requestProcess(number);
    }
}
