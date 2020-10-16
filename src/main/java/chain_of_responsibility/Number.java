package chain_of_responsibility;

public class Number {
    int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    //         ChainFactory chainFactory = new ChainFactory();
    //        chainFactory.requestProcess(new Number(2));
    //        chainFactory.requestProcess(new Number(-2));
    //        chainFactory.requestProcess(new Number(0));


    //        ChainOfResponsibility chain1 = new NegativeNumberHandler();
    //        ChainOfResponsibility chain2 = new ZeroNumberHandler();
    //        chain1.nextChain(chain2);
    //        chain2.nextChain(new NegativeNumberHandler());
    //        chain2.requestProcess(new Number(2));
    //        chain2.requestProcess(new Number(-2));
    //        chain1.requestProcess(new Number(-2));
    //        chain1.requestProcess(new Number(0));

}
