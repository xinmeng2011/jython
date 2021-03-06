// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Tuple extends exprType implements Context {
    public exprType[] elts;
    public expr_contextType ctx;

    public static final String[] _fields = new String[] {"elts","ctx"};

    public Tuple(Token token, exprType[] elts, expr_contextType ctx) {
        super(token);
        this.elts = elts;
        if (elts != null) {
            for(int ielts=0;ielts<elts.length;ielts++) {
                addChild(elts[ielts]);
            }
        }
        this.ctx = ctx;
    }

    public Tuple(int ttype, Token token, exprType[] elts, expr_contextType ctx)
    {
        super(ttype, token);
        this.elts = elts;
        if (elts != null) {
            for(int ielts=0;ielts<elts.length;ielts++) {
                addChild(elts[ielts]);
            }
        }
        this.ctx = ctx;
    }

    public Tuple(PythonTree tree, exprType[] elts, expr_contextType ctx) {
        super(tree);
        this.elts = elts;
        if (elts != null) {
            for(int ielts=0;ielts<elts.length;ielts++) {
                addChild(elts[ielts]);
            }
        }
        this.ctx = ctx;
    }

    public String toString() {
        return "Tuple";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Tuple(");
        sb.append("elts=");
        sb.append(dumpThis(elts));
        sb.append(",");
        sb.append("ctx=");
        sb.append(dumpThis(ctx));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitTuple(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (elts != null) {
            for (int i = 0; i < elts.length; i++) {
                if (elts[i] != null)
                    elts[i].accept(visitor);
            }
        }
    }

    public void setContext(expr_contextType c) {
        this.ctx = c;
    }

    public int getLineno() {
        return getLine();
    }

    public int getCol_offset() {
        return getCharPositionInLine();
    }

}
