/*
 * generated by Xtext 2.27.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package chartIt.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package chartIt.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import chartIt.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleProgram
entryRuleProgram
:
{ before(grammarAccess.getProgramRule()); }
	 ruleProgram
{ after(grammarAccess.getProgramRule()); } 
	 EOF 
;

// Rule Program
ruleProgram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProgramAccess().getGroup()); }
		(rule__Program__Group__0)
		{ after(grammarAccess.getProgramAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunction
entryRuleFunction
:
{ before(grammarAccess.getFunctionRule()); }
	 ruleFunction
{ after(grammarAccess.getFunctionRule()); } 
	 EOF 
;

// Rule Function
ruleFunction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunctionAccess().getAlternatives()); }
		(rule__Function__Alternatives)
		{ after(grammarAccess.getFunctionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEInt
entryRuleEInt
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntAccess().getGroup()); }
		(rule__EInt__Group__0)
		{ after(grammarAccess.getEIntAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCsvLoader
entryRuleCsvLoader
:
{ before(grammarAccess.getCsvLoaderRule()); }
	 ruleCsvLoader
{ after(grammarAccess.getCsvLoaderRule()); } 
	 EOF 
;

// Rule CsvLoader
ruleCsvLoader 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCsvLoaderAccess().getGroup()); }
		(rule__CsvLoader__Group__0)
		{ after(grammarAccess.getCsvLoaderAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataFiltering
entryRuleDataFiltering
:
{ before(grammarAccess.getDataFilteringRule()); }
	 ruleDataFiltering
{ after(grammarAccess.getDataFilteringRule()); } 
	 EOF 
;

// Rule DataFiltering
ruleDataFiltering 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataFilteringAccess().getGroup()); }
		(rule__DataFiltering__Group__0)
		{ after(grammarAccess.getDataFilteringAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGraphDrawing
entryRuleGraphDrawing
:
{ before(grammarAccess.getGraphDrawingRule()); }
	 ruleGraphDrawing
{ after(grammarAccess.getGraphDrawingRule()); } 
	 EOF 
;

// Rule GraphDrawing
ruleGraphDrawing 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGraphDrawingAccess().getGroup()); }
		(rule__GraphDrawing__Group__0)
		{ after(grammarAccess.getGraphDrawingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleColumn
entryRuleColumn
:
{ before(grammarAccess.getColumnRule()); }
	 ruleColumn
{ after(grammarAccess.getColumnRule()); } 
	 EOF 
;

// Rule Column
ruleColumn 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getColumnAccess().getGroup()); }
		(rule__Column__Group__0)
		{ after(grammarAccess.getColumnAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRowFilter
entryRuleRowFilter
:
{ before(grammarAccess.getRowFilterRule()); }
	 ruleRowFilter
{ after(grammarAccess.getRowFilterRule()); } 
	 EOF 
;

// Rule RowFilter
ruleRowFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRowFilterAccess().getGroup()); }
		(rule__RowFilter__Group__0)
		{ after(grammarAccess.getRowFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Operator
ruleOperator
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperatorAccess().getAlternatives()); }
		(rule__Operator__Alternatives)
		{ after(grammarAccess.getOperatorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getCsvLoaderParserRuleCall_0()); }
		ruleCsvLoader
		{ after(grammarAccess.getFunctionAccess().getCsvLoaderParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getFunctionAccess().getDataFilteringParserRuleCall_1()); }
		ruleDataFiltering
		{ after(grammarAccess.getFunctionAccess().getDataFilteringParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getFunctionAccess().getGraphDrawingParserRuleCall_2()); }
		ruleGraphDrawing
		{ after(grammarAccess.getFunctionAccess().getGraphDrawingParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operator__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperatorAccess().getGreater_thanEnumLiteralDeclaration_0()); }
		('>')
		{ after(grammarAccess.getOperatorAccess().getGreater_thanEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getSmaller_thanEnumLiteralDeclaration_1()); }
		('<')
		{ after(grammarAccess.getOperatorAccess().getSmaller_thanEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2()); }
		('==')
		{ after(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__0__Impl
	rule__Program__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getProgramKeyword_0()); }
	'Program'
	{ after(grammarAccess.getProgramAccess().getProgramKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__1__Impl
	rule__Program__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getNameAssignment_1()); }
	(rule__Program__NameAssignment_1)
	{ after(grammarAccess.getProgramAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__2__Impl
	rule__Program__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__3__Impl
	rule__Program__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getIdKeyword_3()); }
	'id='
	{ after(grammarAccess.getProgramAccess().getIdKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__4__Impl
	rule__Program__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getIdAssignment_4()); }
	(rule__Program__IdAssignment_4)
	{ after(grammarAccess.getProgramAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__5__Impl
	rule__Program__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getProgramAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__6__Impl
	rule__Program__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getFunctionsAssignment_6()); }
	(rule__Program__FunctionsAssignment_6)
	{ after(grammarAccess.getProgramAccess().getFunctionsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__7__Impl
	rule__Program__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getFunctionsAssignment_7()); }
	(rule__Program__FunctionsAssignment_7)*
	{ after(grammarAccess.getProgramAccess().getFunctionsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CsvLoader__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CsvLoader__Group__0__Impl
	rule__CsvLoader__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CsvLoader__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCsvLoaderAccess().getUsesKeyword_0()); }
	'uses :'
	{ after(grammarAccess.getCsvLoaderAccess().getUsesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CsvLoader__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CsvLoader__Group__1__Impl
	rule__CsvLoader__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CsvLoader__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCsvLoaderAccess().getPathAssignment_1()); }
	(rule__CsvLoader__PathAssignment_1)
	{ after(grammarAccess.getCsvLoaderAccess().getPathAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CsvLoader__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CsvLoader__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CsvLoader__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCsvLoaderAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getCsvLoaderAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataFiltering__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFiltering__Group__0__Impl
	rule__DataFiltering__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFilteringAccess().getFilterKeyword_0()); }
	'filter :'
	{ after(grammarAccess.getDataFilteringAccess().getFilterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFiltering__Group__1__Impl
	rule__DataFiltering__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_1()); }
	(rule__DataFiltering__Column_filterAssignment_1)
	{ after(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFiltering__Group__2__Impl
	rule__DataFiltering__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFilteringAccess().getGroup_2()); }
	(rule__DataFiltering__Group_2__0)*
	{ after(grammarAccess.getDataFilteringAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFiltering__Group__3__Impl
	rule__DataFiltering__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFilteringAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getDataFilteringAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFiltering__Group__4__Impl
	rule__DataFiltering__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFilteringAccess().getConditionKeyword_4()); }
	('condition :')?
	{ after(grammarAccess.getDataFilteringAccess().getConditionKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFiltering__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFilteringAccess().getRowfilter_conditionAssignment_5()); }
	(rule__DataFiltering__Rowfilter_conditionAssignment_5)?
	{ after(grammarAccess.getDataFilteringAccess().getRowfilter_conditionAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataFiltering__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFiltering__Group_2__0__Impl
	rule__DataFiltering__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFilteringAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getDataFilteringAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFiltering__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_2_1()); }
	(rule__DataFiltering__Column_filterAssignment_2_1)
	{ after(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GraphDrawing__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__0__Impl
	rule__GraphDrawing__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getDrawAPlotKeyword_0()); }
	'Draw a plot :'
	{ after(grammarAccess.getGraphDrawingAccess().getDrawAPlotKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__1__Impl
	rule__GraphDrawing__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getGraph_typeKeyword_1()); }
	'graph_type='
	{ after(grammarAccess.getGraphDrawingAccess().getGraph_typeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__2__Impl
	rule__GraphDrawing__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getGraph_typeAssignment_2()); }
	(rule__GraphDrawing__Graph_typeAssignment_2)
	{ after(grammarAccess.getGraphDrawingAccess().getGraph_typeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__3__Impl
	rule__GraphDrawing__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__4__Impl
	rule__GraphDrawing__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getAbs_columnKeyword_4()); }
	'abs_column='
	{ after(grammarAccess.getGraphDrawingAccess().getAbs_columnKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__5__Impl
	rule__GraphDrawing__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getAbs_columnAssignment_5()); }
	(rule__GraphDrawing__Abs_columnAssignment_5)
	{ after(grammarAccess.getGraphDrawingAccess().getAbs_columnAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__6__Impl
	rule__GraphDrawing__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__7__Impl
	rule__GraphDrawing__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getOrd_columnKeyword_7()); }
	'ord_column='
	{ after(grammarAccess.getGraphDrawingAccess().getOrd_columnKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__8__Impl
	rule__GraphDrawing__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_8()); }
	(rule__GraphDrawing__Ord_columnAssignment_8)
	{ after(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__9__Impl
	rule__GraphDrawing__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getGroup_9()); }
	(rule__GraphDrawing__Group_9__0)*
	{ after(grammarAccess.getGraphDrawingAccess().getGroup_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__10__Impl
	rule__GraphDrawing__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_10()); }
	';'
	{ after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__11__Impl
	rule__GraphDrawing__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getLabelsKeyword_11()); }
	'labels='
	{ after(grammarAccess.getGraphDrawingAccess().getLabelsKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__12__Impl
	rule__GraphDrawing__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getLabelAssignment_12()); }
	(rule__GraphDrawing__LabelAssignment_12)
	{ after(grammarAccess.getGraphDrawingAccess().getLabelAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__13__Impl
	rule__GraphDrawing__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getGroup_13()); }
	(rule__GraphDrawing__Group_13__0)*
	{ after(grammarAccess.getGraphDrawingAccess().getGroup_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group__14__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GraphDrawing__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group_9__0__Impl
	rule__GraphDrawing__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getCommaKeyword_9_0()); }
	','
	{ after(grammarAccess.getGraphDrawingAccess().getCommaKeyword_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_9_1()); }
	(rule__GraphDrawing__Ord_columnAssignment_9_1)
	{ after(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GraphDrawing__Group_13__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group_13__0__Impl
	rule__GraphDrawing__Group_13__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group_13__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getCommaKeyword_13_0()); }
	','
	{ after(grammarAccess.getGraphDrawingAccess().getCommaKeyword_13_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group_13__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GraphDrawing__Group_13__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Group_13__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGraphDrawingAccess().getLabelAssignment_13_1()); }
	(rule__GraphDrawing__LabelAssignment_13_1)
	{ after(grammarAccess.getGraphDrawingAccess().getLabelAssignment_13_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Column__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group__0__Impl
	rule__Column__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getColumnKeyword_0()); }
	'column'
	{ after(grammarAccess.getColumnAccess().getColumnKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group__1__Impl
	rule__Column__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getIndexAssignment_1()); }
	(rule__Column__IndexAssignment_1)
	{ after(grammarAccess.getColumnAccess().getIndexAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group__2__Impl
	rule__Column__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getAsKeyword_2()); }
	'as'
	{ after(grammarAccess.getColumnAccess().getAsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Column__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getColumnAccess().getNew_name_columnAssignment_3()); }
	(rule__Column__New_name_columnAssignment_3)
	{ after(grammarAccess.getColumnAccess().getNew_name_columnAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RowFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RowFilter__Group__0__Impl
	rule__RowFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RowFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRowFilterAccess().getColumn_nameAssignment_0()); }
	(rule__RowFilter__Column_nameAssignment_0)
	{ after(grammarAccess.getRowFilterAccess().getColumn_nameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RowFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RowFilter__Group__1__Impl
	rule__RowFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RowFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRowFilterAccess().getOperatorAssignment_1()); }
	(rule__RowFilter__OperatorAssignment_1)
	{ after(grammarAccess.getRowFilterAccess().getOperatorAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RowFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RowFilter__Group__2__Impl
	rule__RowFilter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RowFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRowFilterAccess().getString_valueAssignment_2()); }
	(rule__RowFilter__String_valueAssignment_2)?
	{ after(grammarAccess.getRowFilterAccess().getString_valueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RowFilter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RowFilter__Group__3__Impl
	rule__RowFilter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RowFilter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRowFilterAccess().getInt_valueAssignment_3()); }
	(rule__RowFilter__Int_valueAssignment_3)?
	{ after(grammarAccess.getRowFilterAccess().getInt_valueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RowFilter__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RowFilter__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RowFilter__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRowFilterAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getRowFilterAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Program__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getIdEStringParserRuleCall_4_0()); }
		ruleEString
		{ after(grammarAccess.getProgramAccess().getIdEStringParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__FunctionsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_6_0()); }
		ruleFunction
		{ after(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__FunctionsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_7_0()); }
		ruleFunction
		{ after(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CsvLoader__PathAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCsvLoaderAccess().getPathEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getCsvLoaderAccess().getPathEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Column_filterAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_1_0()); }
		ruleColumn
		{ after(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Column_filterAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_2_1_0()); }
		ruleColumn
		{ after(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFiltering__Rowfilter_conditionAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataFilteringAccess().getRowfilter_conditionRowFilterParserRuleCall_5_0()); }
		ruleRowFilter
		{ after(grammarAccess.getDataFilteringAccess().getRowfilter_conditionRowFilterParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Graph_typeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGraphDrawingAccess().getGraph_typeEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getGraphDrawingAccess().getGraph_typeEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Abs_columnAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGraphDrawingAccess().getAbs_columnEStringParserRuleCall_5_0()); }
		ruleEString
		{ after(grammarAccess.getGraphDrawingAccess().getAbs_columnEStringParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Ord_columnAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_8_0()); }
		ruleEString
		{ after(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__Ord_columnAssignment_9_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_9_1_0()); }
		ruleEString
		{ after(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_9_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__LabelAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGraphDrawingAccess().getLabelEStringParserRuleCall_12_0()); }
		ruleEString
		{ after(grammarAccess.getGraphDrawingAccess().getLabelEStringParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GraphDrawing__LabelAssignment_13_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGraphDrawingAccess().getLabelEStringParserRuleCall_13_1_0()); }
		ruleEString
		{ after(grammarAccess.getGraphDrawingAccess().getLabelEStringParserRuleCall_13_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__IndexAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColumnAccess().getIndexEIntParserRuleCall_1_0()); }
		ruleEInt
		{ after(grammarAccess.getColumnAccess().getIndexEIntParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__New_name_columnAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColumnAccess().getNew_name_columnEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getColumnAccess().getNew_name_columnEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RowFilter__Column_nameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRowFilterAccess().getColumn_nameEStringParserRuleCall_0_0()); }
		ruleEString
		{ after(grammarAccess.getRowFilterAccess().getColumn_nameEStringParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RowFilter__OperatorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRowFilterAccess().getOperatorOperatorEnumRuleCall_1_0()); }
		ruleOperator
		{ after(grammarAccess.getRowFilterAccess().getOperatorOperatorEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RowFilter__String_valueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRowFilterAccess().getString_valueEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getRowFilterAccess().getString_valueEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RowFilter__Int_valueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRowFilterAccess().getInt_valueEIntParserRuleCall_3_0()); }
		ruleEInt
		{ after(grammarAccess.getRowFilterAccess().getInt_valueEIntParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
