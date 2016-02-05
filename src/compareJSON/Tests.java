package compareJSON;
/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 20/07/15
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
public class Tests {
    public static String[] testCases = {
//            "{}",
//            "{ \"v\":\"1\"}",
//            //"{\t\"v\":\"1\"\\r\\n}",
//            "{ \"v\":1}",
//            "{ \"v\":\"ab'c\"}",
//            "{ \"PI\":3.141E-10}",
//            "{ \"PI\":3.141e-10}",
//            "{ \"v\":12345123456789}",
//            "{ \"v\":123456789123456789123456789}",
//            "[ 1,2,3,4]",
//            "[ \"1\",\"2\",\"3\",\"4\"]",
//            "[ { }, { },[]]",
//            "{ \"v\":\"\\u2000\\u20ff\"}",
//            "{ \"v\":\"\\u2000\\u20FF\"}",
//            "{ \"a\":\"Inter.hp://foo\"}",
//            "{ \"a\":null}",
//            "{ \"a\":true}",
//            "{ \"a\" : true }",
//            "{ \"v\":1.7976931348623157E308}",
            //   "{'X':'s",
            //   "{'X"
            "{ \"v\":'ab\"c'}",
            "{ \"v\":str}",
            "{ \"v\":It's'Work}",
            "{ a:1234}",
            "[ a,bc]",
            "{ \"v\":s1 s2}",
            "{ \"v\":s1\ts2\t}",
            "{ \"a\":\"foo.bar\"}#toto",
            "{ 'value':'string'}",
            "{v:15-55}",
            "{v:15%}",
            "{v:15.06%}",




    };

    public static String[] testNames = {
//            "Empty Object",
//            "Object String value",
//            //"Space Tester",
//            "Object int value",
//            "Quote in String",
//            "Object float value",
//            "lowercase float value",
//            "Long number",
//            "Bigint number",
//            "digit array",
//            "string array",
//            "Array of empty Object",
//            "lowercase Unicode Text",
//            "uppercase Unicode Text",
//            "non protected slash text",
//            "null",
//            "boolean",
//            "non trimed data",
//            "Double precision floating point",
            //     "trucated value",
            //      "trucated Key",
            "Double Quote in Simple Quoted Text",
            "non protected String value",
            "simple quote in non protected string value",
            "non protected keys",
            "non protected array value",
            "non protected String value with space",
            "non protected String value having special spaces",
            "gardbage tailling comment",
            "Simple Quote Stings",
            "non protected start like text value minus",
            "non protected start like text value",
            "non protected start like text value double"

    };
}
