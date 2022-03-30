// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Game.proto

package com.fuxin.common.proto;

public final class GameProto {
  private GameProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActorTransformOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.fuxin.common.proto.ActorTransform)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float VectorX = 1;</code>
     * @return The vectorX.
     */
    float getVectorX();

    /**
     * <code>float VectorY = 2;</code>
     * @return The vectorY.
     */
    float getVectorY();

    /**
     * <code>float VectorZ = 3;</code>
     * @return The vectorZ.
     */
    float getVectorZ();

    /**
     * <code>float RotatorYaw = 4;</code>
     * @return The rotatorYaw.
     */
    float getRotatorYaw();

    /**
     * <code>float RotatorRoll = 5;</code>
     * @return The rotatorRoll.
     */
    float getRotatorRoll();

    /**
     * <code>float RotatorPitch = 6;</code>
     * @return The rotatorPitch.
     */
    float getRotatorPitch();
  }
  /**
   * Protobuf type {@code com.fuxin.common.proto.ActorTransform}
   */
  public static final class ActorTransform extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.fuxin.common.proto.ActorTransform)
      ActorTransformOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActorTransform.newBuilder() to construct.
    private ActorTransform(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActorTransform() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActorTransform();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActorTransform(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 13: {

              vectorX_ = input.readFloat();
              break;
            }
            case 21: {

              vectorY_ = input.readFloat();
              break;
            }
            case 29: {

              vectorZ_ = input.readFloat();
              break;
            }
            case 37: {

              rotatorYaw_ = input.readFloat();
              break;
            }
            case 45: {

              rotatorRoll_ = input.readFloat();
              break;
            }
            case 53: {

              rotatorPitch_ = input.readFloat();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return com.fuxin.common.proto.GameProto.internal_static_com_fuxin_common_proto_ActorTransform_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fuxin.common.proto.GameProto.internal_static_com_fuxin_common_proto_ActorTransform_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fuxin.common.proto.GameProto.ActorTransform.class, com.fuxin.common.proto.GameProto.ActorTransform.Builder.class);
    }

    public static final int VECTORX_FIELD_NUMBER = 1;
    private float vectorX_;
    /**
     * <code>float VectorX = 1;</code>
     * @return The vectorX.
     */
    @java.lang.Override
    public float getVectorX() {
      return vectorX_;
    }

    public static final int VECTORY_FIELD_NUMBER = 2;
    private float vectorY_;
    /**
     * <code>float VectorY = 2;</code>
     * @return The vectorY.
     */
    @java.lang.Override
    public float getVectorY() {
      return vectorY_;
    }

    public static final int VECTORZ_FIELD_NUMBER = 3;
    private float vectorZ_;
    /**
     * <code>float VectorZ = 3;</code>
     * @return The vectorZ.
     */
    @java.lang.Override
    public float getVectorZ() {
      return vectorZ_;
    }

    public static final int ROTATORYAW_FIELD_NUMBER = 4;
    private float rotatorYaw_;
    /**
     * <code>float RotatorYaw = 4;</code>
     * @return The rotatorYaw.
     */
    @java.lang.Override
    public float getRotatorYaw() {
      return rotatorYaw_;
    }

    public static final int ROTATORROLL_FIELD_NUMBER = 5;
    private float rotatorRoll_;
    /**
     * <code>float RotatorRoll = 5;</code>
     * @return The rotatorRoll.
     */
    @java.lang.Override
    public float getRotatorRoll() {
      return rotatorRoll_;
    }

    public static final int ROTATORPITCH_FIELD_NUMBER = 6;
    private float rotatorPitch_;
    /**
     * <code>float RotatorPitch = 6;</code>
     * @return The rotatorPitch.
     */
    @java.lang.Override
    public float getRotatorPitch() {
      return rotatorPitch_;
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
      if (java.lang.Float.floatToRawIntBits(vectorX_) != 0) {
        output.writeFloat(1, vectorX_);
      }
      if (java.lang.Float.floatToRawIntBits(vectorY_) != 0) {
        output.writeFloat(2, vectorY_);
      }
      if (java.lang.Float.floatToRawIntBits(vectorZ_) != 0) {
        output.writeFloat(3, vectorZ_);
      }
      if (java.lang.Float.floatToRawIntBits(rotatorYaw_) != 0) {
        output.writeFloat(4, rotatorYaw_);
      }
      if (java.lang.Float.floatToRawIntBits(rotatorRoll_) != 0) {
        output.writeFloat(5, rotatorRoll_);
      }
      if (java.lang.Float.floatToRawIntBits(rotatorPitch_) != 0) {
        output.writeFloat(6, rotatorPitch_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(vectorX_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, vectorX_);
      }
      if (java.lang.Float.floatToRawIntBits(vectorY_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, vectorY_);
      }
      if (java.lang.Float.floatToRawIntBits(vectorZ_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, vectorZ_);
      }
      if (java.lang.Float.floatToRawIntBits(rotatorYaw_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, rotatorYaw_);
      }
      if (java.lang.Float.floatToRawIntBits(rotatorRoll_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, rotatorRoll_);
      }
      if (java.lang.Float.floatToRawIntBits(rotatorPitch_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(6, rotatorPitch_);
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
      if (!(obj instanceof com.fuxin.common.proto.GameProto.ActorTransform)) {
        return super.equals(obj);
      }
      com.fuxin.common.proto.GameProto.ActorTransform other = (com.fuxin.common.proto.GameProto.ActorTransform) obj;

      if (java.lang.Float.floatToIntBits(getVectorX())
          != java.lang.Float.floatToIntBits(
              other.getVectorX())) return false;
      if (java.lang.Float.floatToIntBits(getVectorY())
          != java.lang.Float.floatToIntBits(
              other.getVectorY())) return false;
      if (java.lang.Float.floatToIntBits(getVectorZ())
          != java.lang.Float.floatToIntBits(
              other.getVectorZ())) return false;
      if (java.lang.Float.floatToIntBits(getRotatorYaw())
          != java.lang.Float.floatToIntBits(
              other.getRotatorYaw())) return false;
      if (java.lang.Float.floatToIntBits(getRotatorRoll())
          != java.lang.Float.floatToIntBits(
              other.getRotatorRoll())) return false;
      if (java.lang.Float.floatToIntBits(getRotatorPitch())
          != java.lang.Float.floatToIntBits(
              other.getRotatorPitch())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + VECTORX_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getVectorX());
      hash = (37 * hash) + VECTORY_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getVectorY());
      hash = (37 * hash) + VECTORZ_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getVectorZ());
      hash = (37 * hash) + ROTATORYAW_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getRotatorYaw());
      hash = (37 * hash) + ROTATORROLL_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getRotatorRoll());
      hash = (37 * hash) + ROTATORPITCH_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getRotatorPitch());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fuxin.common.proto.GameProto.ActorTransform parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fuxin.common.proto.GameProto.ActorTransform parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fuxin.common.proto.GameProto.ActorTransform parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fuxin.common.proto.GameProto.ActorTransform parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fuxin.common.proto.GameProto.ActorTransform parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fuxin.common.proto.GameProto.ActorTransform parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fuxin.common.proto.GameProto.ActorTransform parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fuxin.common.proto.GameProto.ActorTransform parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fuxin.common.proto.GameProto.ActorTransform parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fuxin.common.proto.GameProto.ActorTransform parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fuxin.common.proto.GameProto.ActorTransform parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fuxin.common.proto.GameProto.ActorTransform parseFrom(
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
    public static Builder newBuilder(com.fuxin.common.proto.GameProto.ActorTransform prototype) {
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
     * Protobuf type {@code com.fuxin.common.proto.ActorTransform}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.fuxin.common.proto.ActorTransform)
        com.fuxin.common.proto.GameProto.ActorTransformOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fuxin.common.proto.GameProto.internal_static_com_fuxin_common_proto_ActorTransform_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fuxin.common.proto.GameProto.internal_static_com_fuxin_common_proto_ActorTransform_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fuxin.common.proto.GameProto.ActorTransform.class, com.fuxin.common.proto.GameProto.ActorTransform.Builder.class);
      }

      // Construct using com.fuxin.common.proto.GameProto.ActorTransform.newBuilder()
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
        vectorX_ = 0F;

        vectorY_ = 0F;

        vectorZ_ = 0F;

        rotatorYaw_ = 0F;

        rotatorRoll_ = 0F;

        rotatorPitch_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fuxin.common.proto.GameProto.internal_static_com_fuxin_common_proto_ActorTransform_descriptor;
      }

      @java.lang.Override
      public com.fuxin.common.proto.GameProto.ActorTransform getDefaultInstanceForType() {
        return com.fuxin.common.proto.GameProto.ActorTransform.getDefaultInstance();
      }

      @java.lang.Override
      public com.fuxin.common.proto.GameProto.ActorTransform build() {
        com.fuxin.common.proto.GameProto.ActorTransform result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.fuxin.common.proto.GameProto.ActorTransform buildPartial() {
        com.fuxin.common.proto.GameProto.ActorTransform result = new com.fuxin.common.proto.GameProto.ActorTransform(this);
        result.vectorX_ = vectorX_;
        result.vectorY_ = vectorY_;
        result.vectorZ_ = vectorZ_;
        result.rotatorYaw_ = rotatorYaw_;
        result.rotatorRoll_ = rotatorRoll_;
        result.rotatorPitch_ = rotatorPitch_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fuxin.common.proto.GameProto.ActorTransform) {
          return mergeFrom((com.fuxin.common.proto.GameProto.ActorTransform)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fuxin.common.proto.GameProto.ActorTransform other) {
        if (other == com.fuxin.common.proto.GameProto.ActorTransform.getDefaultInstance()) return this;
        if (other.getVectorX() != 0F) {
          setVectorX(other.getVectorX());
        }
        if (other.getVectorY() != 0F) {
          setVectorY(other.getVectorY());
        }
        if (other.getVectorZ() != 0F) {
          setVectorZ(other.getVectorZ());
        }
        if (other.getRotatorYaw() != 0F) {
          setRotatorYaw(other.getRotatorYaw());
        }
        if (other.getRotatorRoll() != 0F) {
          setRotatorRoll(other.getRotatorRoll());
        }
        if (other.getRotatorPitch() != 0F) {
          setRotatorPitch(other.getRotatorPitch());
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
        com.fuxin.common.proto.GameProto.ActorTransform parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fuxin.common.proto.GameProto.ActorTransform) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float vectorX_ ;
      /**
       * <code>float VectorX = 1;</code>
       * @return The vectorX.
       */
      @java.lang.Override
      public float getVectorX() {
        return vectorX_;
      }
      /**
       * <code>float VectorX = 1;</code>
       * @param value The vectorX to set.
       * @return This builder for chaining.
       */
      public Builder setVectorX(float value) {
        
        vectorX_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float VectorX = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearVectorX() {
        
        vectorX_ = 0F;
        onChanged();
        return this;
      }

      private float vectorY_ ;
      /**
       * <code>float VectorY = 2;</code>
       * @return The vectorY.
       */
      @java.lang.Override
      public float getVectorY() {
        return vectorY_;
      }
      /**
       * <code>float VectorY = 2;</code>
       * @param value The vectorY to set.
       * @return This builder for chaining.
       */
      public Builder setVectorY(float value) {
        
        vectorY_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float VectorY = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearVectorY() {
        
        vectorY_ = 0F;
        onChanged();
        return this;
      }

      private float vectorZ_ ;
      /**
       * <code>float VectorZ = 3;</code>
       * @return The vectorZ.
       */
      @java.lang.Override
      public float getVectorZ() {
        return vectorZ_;
      }
      /**
       * <code>float VectorZ = 3;</code>
       * @param value The vectorZ to set.
       * @return This builder for chaining.
       */
      public Builder setVectorZ(float value) {
        
        vectorZ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float VectorZ = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearVectorZ() {
        
        vectorZ_ = 0F;
        onChanged();
        return this;
      }

      private float rotatorYaw_ ;
      /**
       * <code>float RotatorYaw = 4;</code>
       * @return The rotatorYaw.
       */
      @java.lang.Override
      public float getRotatorYaw() {
        return rotatorYaw_;
      }
      /**
       * <code>float RotatorYaw = 4;</code>
       * @param value The rotatorYaw to set.
       * @return This builder for chaining.
       */
      public Builder setRotatorYaw(float value) {
        
        rotatorYaw_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float RotatorYaw = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRotatorYaw() {
        
        rotatorYaw_ = 0F;
        onChanged();
        return this;
      }

      private float rotatorRoll_ ;
      /**
       * <code>float RotatorRoll = 5;</code>
       * @return The rotatorRoll.
       */
      @java.lang.Override
      public float getRotatorRoll() {
        return rotatorRoll_;
      }
      /**
       * <code>float RotatorRoll = 5;</code>
       * @param value The rotatorRoll to set.
       * @return This builder for chaining.
       */
      public Builder setRotatorRoll(float value) {
        
        rotatorRoll_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float RotatorRoll = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRotatorRoll() {
        
        rotatorRoll_ = 0F;
        onChanged();
        return this;
      }

      private float rotatorPitch_ ;
      /**
       * <code>float RotatorPitch = 6;</code>
       * @return The rotatorPitch.
       */
      @java.lang.Override
      public float getRotatorPitch() {
        return rotatorPitch_;
      }
      /**
       * <code>float RotatorPitch = 6;</code>
       * @param value The rotatorPitch to set.
       * @return This builder for chaining.
       */
      public Builder setRotatorPitch(float value) {
        
        rotatorPitch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float RotatorPitch = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRotatorPitch() {
        
        rotatorPitch_ = 0F;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.fuxin.common.proto.ActorTransform)
    }

    // @@protoc_insertion_point(class_scope:com.fuxin.common.proto.ActorTransform)
    private static final com.fuxin.common.proto.GameProto.ActorTransform DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fuxin.common.proto.GameProto.ActorTransform();
    }

    public static com.fuxin.common.proto.GameProto.ActorTransform getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActorTransform>
        PARSER = new com.google.protobuf.AbstractParser<ActorTransform>() {
      @java.lang.Override
      public ActorTransform parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActorTransform(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActorTransform> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActorTransform> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.fuxin.common.proto.GameProto.ActorTransform getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fuxin_common_proto_ActorTransform_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fuxin_common_proto_ActorTransform_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nGame.proto\022\026com.fuxin.common.proto\"\202\001\n" +
      "\016ActorTransform\022\017\n\007VectorX\030\001 \001(\002\022\017\n\007Vect" +
      "orY\030\002 \001(\002\022\017\n\007VectorZ\030\003 \001(\002\022\022\n\nRotatorYaw" +
      "\030\004 \001(\002\022\023\n\013RotatorRoll\030\005 \001(\002\022\024\n\014RotatorPi" +
      "tch\030\006 \001(\002B\013B\tGameProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_fuxin_common_proto_ActorTransform_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_fuxin_common_proto_ActorTransform_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fuxin_common_proto_ActorTransform_descriptor,
        new java.lang.String[] { "VectorX", "VectorY", "VectorZ", "RotatorYaw", "RotatorRoll", "RotatorPitch", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}