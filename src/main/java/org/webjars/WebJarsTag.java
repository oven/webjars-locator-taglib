package org.webjars;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class WebJarsTag extends SimpleTagSupport {
    protected String webjar, partialPath;
    private static WebJarAssetLocator locator = new WebJarAssetLocator();

    protected JspWriter out() {
        return getJspContext().getOut();
    }

    protected String getContextPath() {
        PageContext context = (PageContext) getJspContext();
        HttpServletRequest request = (HttpServletRequest) context.getRequest();
        return request.getContextPath();
    }

    protected String getPath() {
        String result = null == webjar ? locator.getFullPath(partialPath) : locator.getFullPath(webjar, partialPath);
        result = result.substring("META-INF/resources/".length());
        return result;
    }

    public void setPartialPath(String partialPath) {
        this.partialPath = partialPath;
    }

    public void setWebjar(String webjar) {
        this.webjar = webjar;
    }
}
