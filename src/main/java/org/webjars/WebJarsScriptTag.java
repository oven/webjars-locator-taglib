package org.webjars;

import javax.servlet.jsp.JspException;
import java.io.IOException;

public class WebJarsScriptTag extends WebJarsTag {
    @Override
    public void doTag() throws JspException, IOException {
        out().print(String.format("<script src='%s/%s'></script>", getContextPath(), getPath()));
    }
}
