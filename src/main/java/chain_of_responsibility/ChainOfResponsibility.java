package chain_of_responsibility;

public interface ChainOfResponsibility {

    ChainOfResponsibility nextChain(ChainOfResponsibility chainOfResponsibility);
    void requestProcess(Number number);

}
