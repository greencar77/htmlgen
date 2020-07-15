package com.rabarbers.htmlgen.html;

public class A extends Element {
    public A() {
        super((Element) null, "a");
    }

    public A(Element parent) {
        super(parent, "a");
    }

    @Deprecated
    public A(String href, String title) {
        this();
        setAttr("href", href);
        appendChildContent(title);
    }

    public A(Element parent, String href, String title) {
        this(parent);
        setAttr("href", href);
        appendChildContent(title);
    }
}
