// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

/**
 * Protobuf enum {@code alluxio.grpc.file.WritePType}
 */
public enum WritePType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>WRITE_MUST_CACHE = 0;</code>
   */
  WRITE_MUST_CACHE(0),
  /**
   * <code>WRITE_TRY_CACHE = 1;</code>
   */
  WRITE_TRY_CACHE(1),
  /**
   * <code>WRITE_CACHE_THROUGH = 2;</code>
   */
  WRITE_CACHE_THROUGH(2),
  /**
   * <code>WRITE_THROUGH = 3;</code>
   */
  WRITE_THROUGH(3),
  /**
   * <code>WRITE_ASYNC_THROUGH = 4;</code>
   */
  WRITE_ASYNC_THROUGH(4),
  /**
   * <code>WRITE_NONE = 5;</code>
   */
  WRITE_NONE(5),
  ;

  /**
   * <code>WRITE_MUST_CACHE = 0;</code>
   */
  public static final int WRITE_MUST_CACHE_VALUE = 0;
  /**
   * <code>WRITE_TRY_CACHE = 1;</code>
   */
  public static final int WRITE_TRY_CACHE_VALUE = 1;
  /**
   * <code>WRITE_CACHE_THROUGH = 2;</code>
   */
  public static final int WRITE_CACHE_THROUGH_VALUE = 2;
  /**
   * <code>WRITE_THROUGH = 3;</code>
   */
  public static final int WRITE_THROUGH_VALUE = 3;
  /**
   * <code>WRITE_ASYNC_THROUGH = 4;</code>
   */
  public static final int WRITE_ASYNC_THROUGH_VALUE = 4;
  /**
   * <code>WRITE_NONE = 5;</code>
   */
  public static final int WRITE_NONE_VALUE = 5;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static WritePType valueOf(int value) {
    return forNumber(value);
  }

  public static WritePType forNumber(int value) {
    switch (value) {
      case 0: return WRITE_MUST_CACHE;
      case 1: return WRITE_TRY_CACHE;
      case 2: return WRITE_CACHE_THROUGH;
      case 3: return WRITE_THROUGH;
      case 4: return WRITE_ASYNC_THROUGH;
      case 5: return WRITE_NONE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WritePType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WritePType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WritePType>() {
          public WritePType findValueByNumber(int number) {
            return WritePType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return alluxio.grpc.FileSystemMasterProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final WritePType[] VALUES = values();

  public static WritePType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private WritePType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:alluxio.grpc.file.WritePType)
}

