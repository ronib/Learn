package Inter.ping;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 12/10/15
 * Time: 5:41 PM
 * To change this template use File | Settings | File Templates.
 */
class Test1
{
    public int value;
    public int hashCode() { return 42; }
}
class Test2
{
    public int value;
    public int hashcode() { return (int)(value^5); }
}

