// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class argumentsType extends PythonTree {
    public exprType[] args;
    public String vararg;
    public String kwarg;
    public exprType[] defaults;

    public static final String[] _fields = new String[]
    {"args","vararg","kwarg","defaults"};

    public argumentsType(Token token, exprType[] args, String vararg, String
    kwarg, exprType[] defaults) {
        super(token);
        this.args = args;
        if (args != null) {
            for(int iargs=0;iargs<args.length;iargs++) {
                addChild(args[iargs]);
            }
        }
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = defaults;
        if (defaults != null) {
            for(int idefaults=0;idefaults<defaults.length;idefaults++) {
                addChild(defaults[idefaults]);
            }
        }
    }

    public argumentsType(int ttype, Token token, exprType[] args, String
    vararg, String kwarg, exprType[] defaults) {
        super(ttype, token);
        this.args = args;
        if (args != null) {
            for(int iargs=0;iargs<args.length;iargs++) {
                addChild(args[iargs]);
            }
        }
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = defaults;
        if (defaults != null) {
            for(int idefaults=0;idefaults<defaults.length;idefaults++) {
                addChild(defaults[idefaults]);
            }
        }
    }

    public argumentsType(PythonTree tree, exprType[] args, String vararg,
    String kwarg, exprType[] defaults) {
        super(tree);
        this.args = args;
        if (args != null) {
            for(int iargs=0;iargs<args.length;iargs++) {
                addChild(args[iargs]);
            }
        }
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = defaults;
        if (defaults != null) {
            for(int idefaults=0;idefaults<defaults.length;idefaults++) {
                addChild(defaults[idefaults]);
            }
        }
    }

    public String toString() {
        return "arguments";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("arguments(");
        sb.append("args=");
        sb.append(dumpThis(args));
        sb.append(",");
        sb.append("vararg=");
        sb.append(dumpThis(vararg));
        sb.append(",");
        sb.append("kwarg=");
        sb.append(dumpThis(kwarg));
        sb.append(",");
        sb.append("defaults=");
        sb.append(dumpThis(defaults));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                if (args[i] != null)
                    args[i].accept(visitor);
            }
        }
        if (defaults != null) {
            for (int i = 0; i < defaults.length; i++) {
                if (defaults[i] != null)
                    defaults[i].accept(visitor);
            }
        }
    }

}
