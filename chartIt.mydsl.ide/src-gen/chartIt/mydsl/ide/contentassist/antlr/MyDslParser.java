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
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getCsvLoaderAccess().getGroup(), "rule__CsvLoader__Group__0");
			builder.put(grammarAccess.getDataFilteringAccess().getGroup(), "rule__DataFiltering__Group__0");
			builder.put(grammarAccess.getDataFilteringAccess().getGroup_2(), "rule__DataFiltering__Group_2__0");
			builder.put(grammarAccess.getGraphDrawingAccess().getGroup_0(), "rule__GraphDrawing__Group_0__0");
			builder.put(grammarAccess.getGraphDrawingAccess().getGroup_1(), "rule__GraphDrawing__Group_1__0");
			builder.put(grammarAccess.getGraphDrawingAccess().getGroup_2(), "rule__GraphDrawing__Group_2__0");
			builder.put(grammarAccess.getGraphDrawingAccess().getGroup_2_0_0(), "rule__GraphDrawing__Group_2_0_0__0");
			builder.put(grammarAccess.getGraphDrawingAccess().getGroup_2_0_0_3(), "rule__GraphDrawing__Group_2_0_0_3__0");
			builder.put(grammarAccess.getGraphDrawingAccess().getGroup_2_0_1(), "rule__GraphDrawing__Group_2_0_1__0");
			builder.put(grammarAccess.getGraphDrawingAccess().getGroup_2_0_1_3(), "rule__GraphDrawing__Group_2_0_1_3__0");
			builder.put(grammarAccess.getGraphDrawingAccess().getGroup_2_0_2(), "rule__GraphDrawing__Group_2_0_2__0");
			builder.put(grammarAccess.getGraphDrawingAccess().getGroup_2_0_2_3(), "rule__GraphDrawing__Group_2_0_2_3__0");
			builder.put(grammarAccess.getGraphDrawingAccess().getGroup_2_1(), "rule__GraphDrawing__Group_2_1__0");
			builder.put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
			builder.put(grammarAccess.getRowFilterAccess().getGroup(), "rule__RowFilter__Group__0");
			builder.put(grammarAccess.getProgramAccess().getNameAssignment_1(), "rule__Program__NameAssignment_1");
			builder.put(grammarAccess.getProgramAccess().getIdAssignment_5(), "rule__Program__IdAssignment_5");
			builder.put(grammarAccess.getProgramAccess().getFunctionsAssignment_7(), "rule__Program__FunctionsAssignment_7");
			builder.put(grammarAccess.getProgramAccess().getFunctionsAssignment_8(), "rule__Program__FunctionsAssignment_8");
			builder.put(grammarAccess.getCsvLoaderAccess().getPathAssignment_2(), "rule__CsvLoader__PathAssignment_2");
			builder.put(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_1(), "rule__DataFiltering__Column_filterAssignment_1");
			builder.put(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_2_1(), "rule__DataFiltering__Column_filterAssignment_2_1");
			builder.put(grammarAccess.getDataFilteringAccess().getRowfilter_conditionAssignment_5(), "rule__DataFiltering__Rowfilter_conditionAssignment_5");
			builder.put(grammarAccess.getGraphDrawingAccess().getGraph_typeAssignment_0_3(), "rule__GraphDrawing__Graph_typeAssignment_0_3");
			builder.put(grammarAccess.getGraphDrawingAccess().getAbs_columnAssignment_1_2(), "rule__GraphDrawing__Abs_columnAssignment_1_2");
			builder.put(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_2_0_0_2(), "rule__GraphDrawing__Ord_columnAssignment_2_0_0_2");
			builder.put(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_2_0_0_3_1(), "rule__GraphDrawing__Ord_columnAssignment_2_0_0_3_1");
			builder.put(grammarAccess.getGraphDrawingAccess().getLabelAssignment_2_0_1_2(), "rule__GraphDrawing__LabelAssignment_2_0_1_2");
			builder.put(grammarAccess.getGraphDrawingAccess().getLabelAssignment_2_0_1_3_1(), "rule__GraphDrawing__LabelAssignment_2_0_1_3_1");
			builder.put(grammarAccess.getGraphDrawingAccess().getFillAssignment_2_0_2_2(), "rule__GraphDrawing__FillAssignment_2_0_2_2");
			builder.put(grammarAccess.getGraphDrawingAccess().getFillAssignment_2_0_2_3_1(), "rule__GraphDrawing__FillAssignment_2_0_2_3_1");
			builder.put(grammarAccess.getGraphDrawingAccess().getTitleAssignment_2_1_2(), "rule__GraphDrawing__TitleAssignment_2_1_2");
			builder.put(grammarAccess.getColumnAccess().getIndexAssignment_1(), "rule__Column__IndexAssignment_1");
			builder.put(grammarAccess.getColumnAccess().getNew_name_columnAssignment_3(), "rule__Column__New_name_columnAssignment_3");
			builder.put(grammarAccess.getRowFilterAccess().getColumn_nameAssignment_0(), "rule__RowFilter__Column_nameAssignment_0");
			builder.put(grammarAccess.getRowFilterAccess().getOperatorAssignment_1(), "rule__RowFilter__OperatorAssignment_1");
			builder.put(grammarAccess.getRowFilterAccess().getString_valueAssignment_2(), "rule__RowFilter__String_valueAssignment_2");
			builder.put(grammarAccess.getRowFilterAccess().getInt_valueAssignment_3(), "rule__RowFilter__Int_valueAssignment_3");
			builder.put(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), "rule__GraphDrawing__UnorderedGroup");
			builder.put(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), "rule__GraphDrawing__UnorderedGroup_2_0");
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
