package chain_of_responsibility;

public class ZeroNumberHandler implements ChainOfResponsibility {

    private ChainOfResponsibility chainOfResponsibility;

    @Override
    public ChainOfResponsibility nextChain(ChainOfResponsibility chainOfResponsibility) {
        this.chainOfResponsibility = chainOfResponsibility;
        return chainOfResponsibility;
    }

    @Override
    public void requestProcess(Number number) {
        if (number.getNumber() == 0) {
            System.out.println("NUMBER is ZERO");
        }
        else {
            chainOfResponsibility.requestProcess(number);
        }
    }
}
