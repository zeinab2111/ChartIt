/*
 * generated by Xtext 2.27.0
 */
package chartIt.mydsl.ide.contentassist.antlr;

import chartIt.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import chartIt.mydsl.services.MyDslGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFunctionAccess().getAlternatives(), "rule__Function__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getCsvLoaderAccess().getGroup(), "rule__CsvLoader__Group__0");
			builder.put(grammarAccess.getDataFilteringAccess().getGroup(), "rule__DataFiltering__Group__0");
			builder.put(grammarAccess.getDataFilteringAccess().getGroup_2(), "rule__DataFiltering__Group_2__0");
			builder.put(grammarAccess.getGraphDrawingAccess().getGroup(), "rule__GraphDrawing__Group__0");
			builder.put(grammarAccess.getGraphDrawingAccess().getGroup_9(), "rule__GraphDrawing__Group_9__0");
			builder.put(grammarAccess.getGraphDrawingAccess().getGroup_13(), "rule__GraphDrawing__Group_13__0");
			builder.put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
			builder.put(grammarAccess.getRowFilterAccess().getGroup(), "rule__RowFilter__Group__0");
			builder.put(grammarAccess.getProgramAccess().getNameAssignment_1(), "rule__Program__NameAssignment_1");
			builder.put(grammarAccess.getProgramAccess().getIdAssignment_4(), "rule__Program__IdAssignment_4");
			builder.put(grammarAccess.getProgramAccess().getFunctionsAssignment_6(), "rule__Program__FunctionsAssignment_6");
			builder.put(grammarAccess.getProgramAccess().getFunctionsAssignment_7(), "rule__Program__FunctionsAssignment_7");
			builder.put(grammarAccess.getCsvLoaderAccess().getPathAssignment_1(), "rule__CsvLoader__PathAssignment_1");
			builder.put(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_1(), "rule__DataFiltering__Column_filterAssignment_1");
			builder.put(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_2_1(), "rule__DataFiltering__Column_filterAssignment_2_1");
			builder.put(grammarAccess.getDataFilteringAccess().getRowfilter_conditionAssignment_5(), "rule__DataFiltering__Rowfilter_conditionAssignment_5");
			builder.put(grammarAccess.getGraphDrawingAccess().getGraph_typeAssignment_2(), "rule__GraphDrawing__Graph_typeAssignment_2");
			builder.put(grammarAccess.getGraphDrawingAccess().getAbs_columnAssignment_5(), "rule__GraphDrawing__Abs_columnAssignment_5");
			builder.put(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_8(), "rule__GraphDrawing__Ord_columnAssignment_8");
			builder.put(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_9_1(), "rule__GraphDrawing__Ord_columnAssignment_9_1");
			builder.put(grammarAccess.getGraphDrawingAccess().getLabelAssignment_12(), "rule__GraphDrawing__LabelAssignment_12");
			builder.put(grammarAccess.getGraphDrawingAccess().getLabelAssignment_13_1(), "rule__GraphDrawing__LabelAssignment_13_1");
			builder.put(grammarAccess.getColumnAccess().getIndexAssignment_1(), "rule__Column__IndexAssignment_1");
			builder.put(grammarAccess.getColumnAccess().getNew_name_columnAssignment_3(), "rule__Column__New_name_columnAssignment_3");
			builder.put(grammarAccess.getRowFilterAccess().getColumn_nameAssignment_0(), "rule__RowFilter__Column_nameAssignment_0");
			builder.put(grammarAccess.getRowFilterAccess().getOperatorAssignment_1(), "rule__RowFilter__OperatorAssignment_1");
			builder.put(grammarAccess.getRowFilterAccess().getString_valueAssignment_2(), "rule__RowFilter__String_valueAssignment_2");
			builder.put(grammarAccess.getRowFilterAccess().getInt_valueAssignment_3(), "rule__RowFilter__Int_valueAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}