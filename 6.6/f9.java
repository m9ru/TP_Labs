import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;
public class f9 {
    public static boolean formula(String str)
    {
        String[] params = str.split("=");
        String a, b;
        if (params.length < 2)
            return false;
	    ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
	    try {
			a = engine.eval(params[0]).toString(); // for first
		} catch (ScriptException e) {
			return false;
		}
        for (int i=1; i<params.length; i++) {
            try {
                b = engine.eval(params[i]).toString(); // others
            } catch (ScriptException e) {
                return false;
            }
            if (!a.equals(b)) // if not equals
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(formula("12 = 7 + 5 = 6 * 2"));
    }
}