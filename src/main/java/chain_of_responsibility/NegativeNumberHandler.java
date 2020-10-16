package chain_of_responsibility;

public class NegativeNumberHandler implements ChainOfResponsibility {

    ChainOfResponsibility chainOfResponsibility;

    @Override
    public ChainOfResponsibility nextChain(ChainOfResponsibility chainOfResponsibility) {
        this.chainOfResponsibility = chainOfResponsibility;
        return chainOfResponsibility;
    }

    @Override
    public void requestProcess(Number number) {
        if (number.getNumber() < 0) {
            System.out.println("This is negative number");
        } else {
            System.out.println("This number not exists");
        }
    }
}
