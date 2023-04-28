/**
 * generated by Xtext 2.27.0
 */
package chartIt.mydsl.generator;

import chartIt.Column;
import chartIt.CsvLoader;
import chartIt.DataFiltering;
import chartIt.Function;
import chartIt.GraphDrawing;
import chartIt.Operator;
import chartIt.Program;
import chartIt.RowFilter;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _get = resource.getContents().get(0);
    Program prog = ((Program) _get);
    String id_chart = prog.getId();
    String res = ((((((((((((((((("<!DOCTYPE html>" + "\n") + "<head>") + "\n") + "</head>") + "\n") + "<body>") + "\n") + "<div>") + "\n") + "  <canvas id=") + "\"") + id_chart) + "\"") + "></canvas>") + "\n") + "</div>") + "\n");
    boolean exist_condition = false;
    String path = "";
    final ArrayList<String> csv_parser = CollectionLiterals.<String>newArrayList();
    EList<Function> _functions = prog.getFunctions();
    for (final Function f : _functions) {
      if ((f instanceof CsvLoader)) {
        path = ((CsvLoader)f).getPath();
        List<String> _csvload = this.csvload(path);
        Iterables.<String>addAll(csv_parser, _csvload);
        String _res = res;
        res = (_res + ((((("<script src=" + "\"") + "https://cdn.jsdelivr.net/npm/chart.js") + "\"") + "></script>") + "\n"));
        String _res_1 = res;
        res = (_res_1 + ((((("<!-- <script src=" + "\"") + "https://raw.githubusercontent.com/chartjs/Chart.js/master/docs/scripts/utils.js") + "\"") + "></script> -->") + "\n"));
        String _res_2 = res;
        res = (_res_2 + ("<script>" + "\n"));
      } else {
        if ((f instanceof DataFiltering)) {
          final ArrayList<Integer> columns_index = CollectionLiterals.<Integer>newArrayList();
          final ArrayList<String> columns_name = CollectionLiterals.<String>newArrayList();
          EList<Column> _column_filter = ((DataFiltering)f).getColumn_filter();
          for (final Column col : _column_filter) {
            {
              int _index = col.getIndex();
              columns_index.add(Integer.valueOf(_index));
              String _new_name_column = col.getNew_name_column();
              columns_name.add(_new_name_column);
            }
          }
          String _res_3 = res;
          String _filterprint = this.filterprint(columns_index, columns_name, csv_parser);
          String _plus = (_filterprint + "\n");
          res = (_res_3 + _plus);
          RowFilter _rowfilter_condition = ((DataFiltering)f).getRowfilter_condition();
          boolean _notEquals = (!Objects.equal(_rowfilter_condition, null));
          if (_notEquals) {
            exist_condition = true;
            final RowFilter condition = ((DataFiltering)f).getRowfilter_condition();
            final String column_condition = condition.getColumn_name();
            final Operator op = condition.getOperator();
            final String opr = op.toString();
            String operator = "";
            boolean _equals = Objects.equal(opr, "equal");
            if (_equals) {
              operator = "==";
            } else {
              boolean _equals_1 = Objects.equal(opr, "not_equal");
              if (_equals_1) {
                operator = "!=";
              } else {
                boolean _equals_2 = Objects.equal(opr, "greater_than");
                if (_equals_2) {
                  operator = ">";
                } else {
                  boolean _equals_3 = Objects.equal(opr, "greater_than_or_equal");
                  if (_equals_3) {
                    operator = ">=";
                  } else {
                    boolean _equals_4 = Objects.equal(opr, "smaller_than");
                    if (_equals_4) {
                      operator = "<";
                    } else {
                      boolean _equals_5 = Objects.equal(opr, "smaller_than_or_equal");
                      if (_equals_5) {
                        operator = "<=";
                      }
                    }
                  }
                }
              }
            }
            String string_value = "";
            int int_value = 0;
            String _string_value = condition.getString_value();
            boolean _notEquals_1 = (!Objects.equal(_string_value, null));
            if (_notEquals_1) {
              string_value = condition.getString_value();
              String _res_4 = res;
              res = (_res_4 + ((((((("const filteredData = data.filter(row => row." + column_condition) + operator) + "\"") + string_value) + "\"") + ");") + "\n"));
            } else {
              int_value = condition.getInt_value();
              String _res_5 = res;
              res = (_res_5 + ((((("const filteredData = data.filter(row => row." + column_condition) + operator) + Integer.valueOf(int_value)) + ");") + "\n"));
            }
          }
        } else {
          if ((f instanceof GraphDrawing)) {
            final String id = id_chart;
            final String type = ((GraphDrawing)f).getGraph_type();
            final String abs_column = ((GraphDrawing)f).getAbs_column();
            final EList<String> ord_column = ((GraphDrawing)f).getOrd_column();
            final EList<String> labels = ((GraphDrawing)f).getLabel();
            String title_list = "";
            EList<String> _title = ((GraphDrawing)f).getTitle();
            boolean _notEquals_2 = (!Objects.equal(_title, null));
            if (_notEquals_2) {
              final EList<String> title = ((GraphDrawing)f).getTitle();
              for (final String t : title) {
                String _title_list = title_list;
                title_list = (_title_list + t);
              }
            }
            final EList<Boolean> fill = ((GraphDrawing)f).getFill();
            final List<String> data = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("data", "filteredData"));
            if ((exist_condition == true)) {
              String _res_6 = res;
              String _graphprint = this.graphprint(id, type, abs_column, ord_column, labels, fill, data.get(1), title_list);
              String _plus_1 = (_graphprint + "\n");
              res = (_res_6 + _plus_1);
            } else {
              String _res_7 = res;
              String _graphprint_1 = this.graphprint(id, type, abs_column, ord_column, labels, fill, data.get(0), title_list);
              String _plus_2 = (_graphprint_1 + "\n");
              res = (_res_7 + _plus_2);
            }
          }
        }
      }
    }
    String _res_8 = res;
    res = (_res_8 + (("</script>" + "\n") + "</body>"));
    String _name = prog.getName();
    String _plus_3 = (_name + ".html");
    fsa.generateFile(_plus_3, res);
  }

  public List<String> csvload(final String path) {
    try {
      final String csvFile = path;
      FileReader _fileReader = new FileReader(csvFile);
      final BufferedReader bufferedReader = new BufferedReader(_fileReader);
      final List<String> lines = bufferedReader.lines().collect(Collectors.<String>toList());
      return lines;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public String filterprint(final List<Integer> columns_index, final List<String> columns_name, final List<String> csv_parser) {
    final int nb_columns = columns_index.size();
    final List<String> lines = csv_parser;
    final StringBuilder sb = new StringBuilder();
    sb.append(("const data = [" + "\n"));
    int _size = lines.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(2, _size, true);
    for (final Integer j : _doubleDotLessThan) {
      {
        final String line = lines.get((j).intValue());
        final String[] cells = line.split(";");
        sb.append("{");
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, nb_columns, true);
        for (final Integer i : _doubleDotLessThan_1) {
          {
            sb.append(columns_name.get((i).intValue()));
            sb.append(":");
            final String cell = cells[(columns_index.get((i).intValue())).intValue()];
            if ((cell instanceof String)) {
              sb.append((("\"" + cell) + "\""));
            } else {
              sb.append(cell);
            }
            sb.append(",");
          }
        }
        int _length = sb.length();
        int _minus = (_length - 1);
        sb.setLength(_minus);
        sb.append(("}," + "\n"));
      }
    }
    int _length = sb.length();
    int _minus = (_length - 1);
    sb.setLength(_minus);
    sb.append(("\n" + "];"));
    final String table = sb.toString();
    return table;
  }

  public String graphprint(final String id, final String type, final String abs_column, final List<String> ord_column, final List<String> labels, final List<Boolean> fill, final String data, final String title_list) {
    final StringBuilder sb = new StringBuilder();
    sb.append(("new Chart(" + "\n"));
    sb.append(((((("document.getElementById(" + "\'") + id) + "\'") + "),") + "\n"));
    sb.append(("{" + "\n"));
    sb.append(((((("type: " + "\'") + type) + "\'") + ",") + "\n"));
    sb.append(("data: {" + "\n"));
    sb.append(((((("labels: " + data) + ".map(row => row.") + abs_column) + "),") + "\n"));
    sb.append(("datasets: [" + "\n"));
    final int nb_ord_column = labels.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, nb_ord_column, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        sb.append(("{" + "\n"));
        String _get = labels.get((i).intValue());
        String _plus = (("label: " + "\"") + _get);
        String _plus_1 = (_plus + "\"");
        String _plus_2 = (_plus_1 + ",");
        String _plus_3 = (_plus_2 + "\n");
        sb.append(_plus_3);
        String _get_1 = ord_column.get((i).intValue());
        String _plus_4 = ((("data: " + data) + ".map(row => row.") + _get_1);
        String _plus_5 = (_plus_4 + "),");
        String _plus_6 = (_plus_5 + "\n");
        sb.append(_plus_6);
        Boolean _get_2 = fill.get((i).intValue());
        String _plus_7 = ("fill:" + _get_2);
        String _plus_8 = (_plus_7 + ",");
        String _plus_9 = (_plus_8 + "\n");
        sb.append(_plus_9);
        sb.append(("}," + "\n"));
      }
    }
    sb.append(("]" + "\n"));
    sb.append(("}" + "\n"));
    sb.append(("," + "\n"));
    sb.append(((((("options: {" + "\n") + "plugins: {") + "\n") + "title: {") + "\n"));
    boolean _equals = Objects.equal(title_list, "");
    if (_equals) {
      sb.append(((("display: " + Boolean.valueOf(false)) + ",") + "\n"));
      sb.append((((("text: " + "\'") + title_list) + "\'") + "\n"));
    } else {
      sb.append(((("display: " + Boolean.valueOf(true)) + ",") + "\n"));
      sb.append((((("text: " + "\'") + title_list) + "\'") + "\n"));
    }
    sb.append(((((("}" + "\n") + "}") + "\n") + "}") + "\n"));
    sb.append(("}" + "\n"));
    sb.append((");" + "\n"));
    final String table = sb.toString();
    return table;
  }
}
