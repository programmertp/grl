// automatically generated, do not modify

package grl.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class ArmControlSeries extends Table {
  public static ArmControlSeries getRootAsArmControlSeries(ByteBuffer _bb) { return getRootAsArmControlSeries(_bb, new ArmControlSeries()); }
  public static ArmControlSeries getRootAsArmControlSeries(ByteBuffer _bb, ArmControlSeries obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public static boolean ArmControlSeriesBufferHasIdentifier(ByteBuffer _bb) { return __has_identifier(_bb, "armc"); }
  public ArmControlSeries __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public ArmControlState states(int j) { return states(new ArmControlState(), j); }
  public ArmControlState states(ArmControlState obj, int j) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int statesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }

  public static int createArmControlSeries(FlatBufferBuilder builder,
      int states) {
    builder.startObject(1);
    ArmControlSeries.addStates(builder, states);
    return ArmControlSeries.endArmControlSeries(builder);
  }

  public static void startArmControlSeries(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addStates(FlatBufferBuilder builder, int statesOffset) { builder.addOffset(0, statesOffset, 0); }
  public static int createStatesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startStatesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endArmControlSeries(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishArmControlSeriesBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset, "armc"); }
};

