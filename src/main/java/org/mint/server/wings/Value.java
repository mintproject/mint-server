package org.mint.server.wings;

public class Value {
  public static enum Type {
    LITERAL, URI
  };

  Type type;
  Object value;
  String datatype;

  public Value() {}
  
  public Value(String id) {
    this.value = id;
    this.type = Type.URI;
  }
  
  public Value(Object value, String datatype) {
    this.value = value;
    this.datatype = datatype;
    this.type = Type.LITERAL;
  }
  
  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public String getDatatype() {
    return datatype;
  }

  public void setDatatype(String datatype) {
    this.datatype = datatype;
  }
}
