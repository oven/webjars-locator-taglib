webjars-locator-taglib
======================

This project provides a JSP Taglib to locate assets within WebJars. This saves you from entering the version number
of each webjar in each JSP file.

Include the taglib
------------------
    <%@ taglib prefix="w" uri="http://webjars.org/webjars-locator-tags" %>

Use a javascript file in a JSP
------------------------------
    <w:script webjar="tablesorter" partialPath="jquery.tablesorter.js" />

This produces the following output:

    <script src='/myappcontext/webjars/tablesorter/2.15.5/js/jquery.tablesorter.js'></script>

Use a stylesheet in a JSP
-------------------------
    <w:link webjar="tablesorter" partialPath="theme.default.css" />

This produces the following output:

    <link rel='stylesheet' type='text/css' href='/myappcontext/webjars/tablesorter/2.15.5/css/theme.default.css' />

You can override the rel and type attributes.
