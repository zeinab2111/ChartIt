/**
 * generated by Xtext 2.27.0
 */
package chartIt.mydsl.formatting2;

import chartIt.Column;
import chartIt.DataFiltering;
import chartIt.Function;
import chartIt.Program;
import chartIt.RowFilter;
import chartIt.mydsl.services.MyDslGrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;

  protected void _format(final Program program, @Extension final IFormattableDocument document) {
    EList<Function> _functions = program.getFunctions();
    for (final Function function : _functions) {
      document.<Function>format(function);
    }
  }

  protected void _format(final DataFiltering dataFiltering, @Extension final IFormattableDocument document) {
    EList<Column> _column_filter = dataFiltering.getColumn_filter();
    for (final Column column : _column_filter) {
      document.<Column>format(column);
    }
    document.<RowFilter>format(dataFiltering.getRowfilter_condition());
  }

  public void format(final Object dataFiltering, final IFormattableDocument document) {
    if (dataFiltering instanceof DataFiltering) {
      _format((DataFiltering)dataFiltering, document);
      return;
    } else if (dataFiltering instanceof XtextResource) {
      _format((XtextResource)dataFiltering, document);
      return;
    } else if (dataFiltering instanceof Program) {
      _format((Program)dataFiltering, document);
      return;
    } else if (dataFiltering instanceof EObject) {
      _format((EObject)dataFiltering, document);
      return;
    } else if (dataFiltering == null) {
      _format((Void)null, document);
      return;
    } else if (dataFiltering != null) {
      _format(dataFiltering, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(dataFiltering, document).toString());
    }
  }
}