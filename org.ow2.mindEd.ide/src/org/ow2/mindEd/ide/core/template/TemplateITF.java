

package org.ow2.mindEd.ide.core.template;

/**
 * @since 1.0
 */
public class TemplateITF
 {
  protected static String nl;
  public static synchronized TemplateITF create(String lineSeparator)
  {
    nl = lineSeparator;
    TemplateITF result = new TemplateITF();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "interface ";
  protected final String TEXT_2 = " {" + NL + NL + "}";
  protected final String TEXT_3 = NL;

   public String generate(String qn)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(qn);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
