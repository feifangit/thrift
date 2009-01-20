/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.thrift.reflection.limited;

import java.util.ArrayList;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.thrift.*;

import org.apache.thrift.protocol.*;
import org.apache.thrift.transport.*;

public class ContainerType implements java.io.Serializable {
  public int ttype;
  public SimpleType subtype1;
  public SimpleType subtype2;

  public final Isset __isset = new Isset();
  public static final class Isset {
    public boolean ttype = false;
    public boolean subtype1 = false;
    public boolean subtype2 = false;
  }

  public ContainerType() {
  }

  public ContainerType(
    int ttype,
    SimpleType subtype1,
    SimpleType subtype2)
  {
    this();
    this.ttype = ttype;
    this.__isset.ttype = true;
    this.subtype1 = subtype1;
    this.__isset.subtype1 = true;
    this.subtype2 = subtype2;
    this.__isset.subtype2 = true;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id)
      {
        case 1:
          if (field.type == TType.I32) {
            this.ttype = iprot.readI32();
            this.__isset.ttype = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2:
          if (field.type == TType.STRUCT) {
            this.subtype1 = new SimpleType();
            this.subtype1.read(iprot);
            this.__isset.subtype1 = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3:
          if (field.type == TType.STRUCT) {
            this.subtype2 = new SimpleType();
            this.subtype2.read(iprot);
            this.__isset.subtype2 = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
  }

  public void write(TProtocol oprot) throws TException {
    TStruct struct = new TStruct("ContainerType");
    oprot.writeStructBegin(struct);
    TField field = new TField();
    field.name = "ttype";
    field.type = TType.I32;
    field.id = 1;
    oprot.writeFieldBegin(field);
    oprot.writeI32(this.ttype);
    oprot.writeFieldEnd();
    if (this.subtype1 != null) {
      field.name = "subtype1";
      field.type = TType.STRUCT;
      field.id = 2;
      oprot.writeFieldBegin(field);
      this.subtype1.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.subtype2 != null) {
      field.name = "subtype2";
      field.type = TType.STRUCT;
      field.id = 3;
      oprot.writeFieldBegin(field);
      this.subtype2.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("ContainerType(");
    sb.append("ttype:");
    sb.append(this.ttype);
    sb.append(",subtype1:");
    sb.append(this.subtype1.toString());
    sb.append(",subtype2:");
    sb.append(this.subtype2.toString());
    sb.append(")");
    return sb.toString();
  }

}
