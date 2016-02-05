package Inter.designPatterns;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 10/29/15
 * Time: 6:11 PM
 * To change this template use File | Settings | File Templates.
 */
public interface EngineAlgoStrategy {
    String processData();
}

class ChooseAlgo1 implements EngineAlgoStrategy {

    public String processData() {
        return "processing 1111111111111 strategy";
    }
}

class ChooseAlgo2 implements EngineAlgoStrategy {

    @Override
    public String processData() {
        return "processing 22222222222 strategy";  //To change body of implemented methods use File | Settings | File Templates.
    }
}