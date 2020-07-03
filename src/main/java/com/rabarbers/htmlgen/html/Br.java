package com.rabarbers.htmlgen.html;

public class Br extends Element {
    public Br() {
        super((Element) null, "br");
    }

    public Br(Element parent) {
        super(parent, "br");
    }

    @Override
    public StringBuilder getContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("<br/>");
        return sb;
    }
}
