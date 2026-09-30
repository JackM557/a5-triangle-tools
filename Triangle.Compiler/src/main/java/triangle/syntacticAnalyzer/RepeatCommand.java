package triangle.abstractSyntaxTrees.commands;

import triangle.abstractSyntaxTrees.expressions.Expression;
import triangle.abstractSyntaxTrees.visitors.CommandVisitor;
import triangle.syntacticAnalyzer.SourcePosition;

public class WhileCommand extends Command {

    public WhileCommand(Expression eAST, Command cAST, SourcePosition position) {
        super(position);
        E = eAST;
        C = cAST;
    }

    public <TArg, TResult> TResult visit(CommandVisitor<TArg, TResult> v, TArg arg) {
        return v.visitWhileCommand(this, arg);
    }

    public Expression E;
    public final Command C;
}
