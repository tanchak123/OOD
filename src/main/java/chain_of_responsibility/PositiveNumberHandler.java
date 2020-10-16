package chain_of_responsibility;

public class PositiveNumberHandler implements ChainOfResponsibility {

    ChainOfResponsibility chainOfResponsibility;

    @Override
    public ChainOfResponsibility nextChain(ChainOfResponsibility chainOfResponsibility) {
        this.chainOfResponsibility = chainOfResponsibility;
        return chainOfResponsibility;
    }

    @Override
    public void requestProcess(Number number) {
        if (number.getNumber() > 0) {
            System.out.println("PositiveNumber");
        } else {
            chainOfResponsibility.requestProcess(number);
        }
    }
}
