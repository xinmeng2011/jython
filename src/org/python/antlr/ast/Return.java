// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Return extends stmtType {
    public exprType value;

    public static final String[] _fields = new String[] {"value"};

    public Return(Token token, exprType value) {
        super(token);
        this.value = value;
        addChild(value);
    }

    public Return(int ttype, Token token, exprType value) {
        super(ttype, token);
        this.value = value;
        addChild(value);
    }

    public Return(PythonTree tree, exprType value) {
        super(tree);
        this.value = value;
        addChild(value);
    }

    public String toString() {
        return "Return";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Return(");
        sb.append("value=");
        sb.append(dumpThis(value));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitReturn(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (value != null)
            value.accept(visitor);
    }

    public int getLineno() {
        return getLine();
    }

    public int getCol_offset() {
        return getCharPositionInLine();
    }

}
