// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Num extends exprType {
    public Object n;

    public static final String[] _fields = new String[] {"n"};

    public Num(Token token, Object n) {
        super(token);
        this.n = n;
    }

    public Num(int ttype, Token token, Object n) {
        super(ttype, token);
        this.n = n;
    }

    public Num(PythonTree tree, Object n) {
        super(tree);
        this.n = n;
    }

    public String toString() {
        return "Num";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Num(");
        sb.append("n=");
        sb.append(dumpThis(n));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitNum(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

    public int getLineno() {
        return getLine();
    }

    public int getCol_offset() {
        return getCharPositionInLine();
    }

}
