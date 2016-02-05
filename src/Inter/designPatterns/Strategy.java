package Inter.designPatterns;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 10/29/15
 * Time: 6:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Strategy {

    // main don't care about the strategy - object with the right ability. can be changed at runtime.
    public EngineAlgoStrategy strategyType;
    public static void main(String[] args) {

//        Inter.designPatterns.Strategy l1 = new Inter.designPatterns.Strategy();
//        l1.strategyType = new Inter.designPatterns.ChooseAlgo1();
//        System.out.println("l1 " + l1.operateEngine());
//        Inter.designPatterns.Strategy l2 = new Inter.designPatterns.Strategy();
//        l2.strategyType = new Inter.designPatterns.ChooseAlgo2();
//        System.out.println("l2 " + l2.operateEngine());
//
//        l2.setStrategy(new Inter.designPatterns.ChooseAlgo1());
//        System.out.println("l2 " + l2.operateEngine());






    }
    public String operateEngine(){
        return strategyType.processData();
    }

    public void setStrategy(EngineAlgoStrategy newStrategy){
        strategyType = newStrategy;

    }
}


