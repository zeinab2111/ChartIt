/*
 * generated by Xtext 2.27.0
 */
package chartIt.mydsl.serializer;

import chartIt.mydsl.services.MyDslGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DataFiltering_ConditionKeyword_4_q;
	protected AbstractElementAlias match_GraphDrawing___TitleKeyword_2_1_0_EqualsSignKeyword_2_1_1_SemicolonKeyword_2_1_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_DataFiltering_ConditionKeyword_4_q = new TokenAlias(false, true, grammarAccess.getDataFilteringAccess().getConditionKeyword_4());
		match_GraphDrawing___TitleKeyword_2_1_0_EqualsSignKeyword_2_1_1_SemicolonKeyword_2_1_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGraphDrawingAccess().getTitleKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_2_1_1()), new TokenAlias(false, false, grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2_1_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_DataFiltering_ConditionKeyword_4_q.equals(syntax))
				emit_DataFiltering_ConditionKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_GraphDrawing___TitleKeyword_2_1_0_EqualsSignKeyword_2_1_1_SemicolonKeyword_2_1_3__q.equals(syntax))
				emit_GraphDrawing___TitleKeyword_2_1_0_EqualsSignKeyword_2_1_1_SemicolonKeyword_2_1_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'condition :'?
	 *
	 * This ambiguous syntax occurs at:
	 *     column_filter+=Column ';' (ambiguity) (rule end)
	 *     column_filter+=Column ';' (ambiguity) rowfilter_condition=RowFilter
	 
	 * </pre>
	 */
	protected void emit_DataFiltering_ConditionKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('title' '=' ';')?
	 *
	 * This ambiguous syntax occurs at:
	 *     fill+=EBoolean ';' (ambiguity) 'abs_column' '=' abs_column=EString
	 *     fill+=EBoolean ';' (ambiguity) 'draw a plot :' 'graph_type' '=' graph_type=EString
	 *     fill+=EBoolean ';' (ambiguity) 'fill' '=' fill+=EBoolean
	 *     fill+=EBoolean ';' (ambiguity) 'labels' '=' label+=EString
	 *     fill+=EBoolean ';' (ambiguity) 'ord_column' '=' ord_column+=EString
	 *     fill+=EBoolean ';' (ambiguity) (rule end)
	 *     label+=EString ';' (ambiguity) 'abs_column' '=' abs_column=EString
	 *     label+=EString ';' (ambiguity) 'draw a plot :' 'graph_type' '=' graph_type=EString
	 *     label+=EString ';' (ambiguity) 'fill' '=' fill+=EBoolean
	 *     label+=EString ';' (ambiguity) 'labels' '=' label+=EString
	 *     label+=EString ';' (ambiguity) 'ord_column' '=' ord_column+=EString
	 *     label+=EString ';' (ambiguity) (rule end)
	 *     ord_column+=EString ';' (ambiguity) 'abs_column' '=' abs_column=EString
	 *     ord_column+=EString ';' (ambiguity) 'draw a plot :' 'graph_type' '=' graph_type=EString
	 *     ord_column+=EString ';' (ambiguity) 'fill' '=' fill+=EBoolean
	 *     ord_column+=EString ';' (ambiguity) 'labels' '=' label+=EString
	 *     ord_column+=EString ';' (ambiguity) 'ord_column' '=' ord_column+=EString
	 *     ord_column+=EString ';' (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_GraphDrawing___TitleKeyword_2_1_0_EqualsSignKeyword_2_1_1_SemicolonKeyword_2_1_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
