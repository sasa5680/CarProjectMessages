// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: A2R_MotorControl.proto

package com.sasa5680.ProtoMessages;

public final class A2RMotorControl {
  private A2RMotorControl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface A2R_ControlOrBuilder extends
      // @@protoc_insertion_point(interface_extends:A2R_Control)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 Power = 1;</code>
     */
    int getPower();

    /**
     * <code>float angle = 2;</code>
     */
    float getAngle();
  }
  /**
   * Protobuf type {@code A2R_Control}
   */
  public  static final class A2R_Control extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:A2R_Control)
      A2R_ControlOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use A2R_Control.newBuilder() to construct.
    private A2R_Control(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private A2R_Control() {
      power_ = 0;
      angle_ = 0F;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private A2R_Control(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              power_ = input.readInt32();
              break;
            }
            case 21: {

              angle_ = input.readFloat();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sasa5680.ProtoMessages.A2RMotorControl.internal_static_A2R_Control_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sasa5680.ProtoMessages.A2RMotorControl.internal_static_A2R_Control_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control.class, com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control.Builder.class);
    }

    public static final int POWER_FIELD_NUMBER = 1;
    private int power_;
    /**
     * <code>int32 Power = 1;</code>
     */
    public int getPower() {
      return power_;
    }

    public static final int ANGLE_FIELD_NUMBER = 2;
    private float angle_;
    /**
     * <code>float angle = 2;</code>
     */
    public float getAngle() {
      return angle_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (power_ != 0) {
        output.writeInt32(1, power_);
      }
      if (angle_ != 0F) {
        output.writeFloat(2, angle_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (power_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, power_);
      }
      if (angle_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, angle_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control)) {
        return super.equals(obj);
      }
      com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control other = (com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control) obj;

      boolean result = true;
      result = result && (getPower()
          == other.getPower());
      result = result && (
          java.lang.Float.floatToIntBits(getAngle())
          == java.lang.Float.floatToIntBits(
              other.getAngle()));
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + POWER_FIELD_NUMBER;
      hash = (53 * hash) + getPower();
      hash = (37 * hash) + ANGLE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getAngle());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code A2R_Control}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:A2R_Control)
        com.sasa5680.ProtoMessages.A2RMotorControl.A2R_ControlOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.sasa5680.ProtoMessages.A2RMotorControl.internal_static_A2R_Control_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.sasa5680.ProtoMessages.A2RMotorControl.internal_static_A2R_Control_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control.class, com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control.Builder.class);
      }

      // Construct using com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        power_ = 0;

        angle_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sasa5680.ProtoMessages.A2RMotorControl.internal_static_A2R_Control_descriptor;
      }

      @java.lang.Override
      public com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control getDefaultInstanceForType() {
        return com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control.getDefaultInstance();
      }

      @java.lang.Override
      public com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control build() {
        com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control buildPartial() {
        com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control result = new com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control(this);
        result.power_ = power_;
        result.angle_ = angle_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control) {
          return mergeFrom((com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control other) {
        if (other == com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control.getDefaultInstance()) return this;
        if (other.getPower() != 0) {
          setPower(other.getPower());
        }
        if (other.getAngle() != 0F) {
          setAngle(other.getAngle());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int power_ ;
      /**
       * <code>int32 Power = 1;</code>
       */
      public int getPower() {
        return power_;
      }
      /**
       * <code>int32 Power = 1;</code>
       */
      public Builder setPower(int value) {
        
        power_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 Power = 1;</code>
       */
      public Builder clearPower() {
        
        power_ = 0;
        onChanged();
        return this;
      }

      private float angle_ ;
      /**
       * <code>float angle = 2;</code>
       */
      public float getAngle() {
        return angle_;
      }
      /**
       * <code>float angle = 2;</code>
       */
      public Builder setAngle(float value) {
        
        angle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float angle = 2;</code>
       */
      public Builder clearAngle() {
        
        angle_ = 0F;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:A2R_Control)
    }

    // @@protoc_insertion_point(class_scope:A2R_Control)
    private static final com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control();
    }

    public static com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<A2R_Control>
        PARSER = new com.google.protobuf.AbstractParser<A2R_Control>() {
      @java.lang.Override
      public A2R_Control parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new A2R_Control(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<A2R_Control> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<A2R_Control> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.sasa5680.ProtoMessages.A2RMotorControl.A2R_Control getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_A2R_Control_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_A2R_Control_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026A2R_MotorControl.proto\"+\n\013A2R_Control\022" +
      "\r\n\005Power\030\001 \001(\005\022\r\n\005angle\030\002 \001(\002B\034\n\032com.sas" +
      "a5680.ProtoMessagesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_A2R_Control_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_A2R_Control_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_A2R_Control_descriptor,
        new java.lang.String[] { "Power", "Angle", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}