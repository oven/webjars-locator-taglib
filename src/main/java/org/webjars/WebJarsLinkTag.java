package org.webjars;

import javax.servlet.jsp.JspException;
import java.io.IOException;

public class WebJarsLinkTag extends WebJarsTag {

    private String rel = "stylesheet";
    private String type = "text/css";

    @Override
    public void doTag() throws JspException, IOException {
        out().print(String.format("<link rel='%s' type='%s' href='%s/%s'/>", rel, type, getContextPath(), getPath()));
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public void setType(String type) {
        this.type = type;
    }
}
