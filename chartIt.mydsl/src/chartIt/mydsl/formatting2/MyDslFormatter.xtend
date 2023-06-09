/*
 * generated by Xtext 2.27.0
 */
package chartIt.mydsl.formatting2

import chartIt.DataFiltering
import chartIt.Program
import chartIt.mydsl.services.MyDslGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(Program program, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (function : program.functions) {
			function.format
		}
	}

	def dispatch void format(DataFiltering dataFiltering, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (column : dataFiltering.column_filter) {
			column.format
		}
		dataFiltering.rowfilter_condition.format
	}
	
}
