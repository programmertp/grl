// automatically generated, do not modify

package grl.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class CartesianImpedenceControlMode extends Table {
  public static CartesianImpedenceControlMode getRootAsCartesianImpedenceControlMode(ByteBuffer _bb) { return getRootAsCartesianImpedenceControlMode(_bb, new CartesianImpedenceControlMode()); }
  public static CartesianImpedenceControlMode getRootAsCartesianImpedenceControlMode(ByteBuffer _bb, CartesianImpedenceControlMode obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public CartesianImpedenceControlMode __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  /**
   * actual stiffness to set rot:[nm/rad]
   */
  public EulerPoseParams stiffness() { return stiffness(new EulerPoseParams()); }
  public EulerPoseParams stiffness(EulerPoseParams obj) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  /**
   * maximum deviation from set goal in mm and radians
   */
  public EulerPose maxPathDeviation() { return maxPathDeviation(new EulerPose()); }
  public EulerPose maxPathDeviation(EulerPose obj) { int o = __offset(6); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }
  /**
   * sets the maximum joint speed
   */
  public double maxJointSpeed(int j) { int o = __offset(8); return o != 0 ? bb.getDouble(__vector(o) + j * 8) : 0; }
  public int maxJointSpeedLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer maxJointSpeedAsByteBuffer() { return __vector_as_bytebuffer(8, 8); }
  /**
   * trans: [mm/s] rot: [rad/s]
   */
  public EulerPose maxCartesianVelocity() { return maxCartesianVelocity(new EulerPose()); }
  public EulerPose maxCartesianVelocity(EulerPose obj) { int o = __offset(10); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }
  /**
   * xyz: Newtons rpy:Nm (all >=0)
   */
  public EulerPose maxControlForce() { return maxControlForce(new EulerPose()); }
  public EulerPose maxControlForce(EulerPose obj) { int o = __offset(12); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }
  /**
   * stop if max control force is exceeded
   */
  public boolean maxControlForceExceededStop() { int o = __offset(14); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  /**
   * must be between 0.3-1.0 suggested is 0.7
   */
  public double nullspaceDamping() { int o = __offset(16); return o != 0 ? bb.getDouble(o + bb_pos) : 0; }
  /**
   * [Nm/rad] must be => 0.0
   */
  public double nullspaceStiffness() { int o = __offset(18); return o != 0 ? bb.getDouble(o + bb_pos) : 0; }

  public static void startCartesianImpedenceControlMode(FlatBufferBuilder builder) { builder.startObject(8); }
  public static void addStiffness(FlatBufferBuilder builder, int stiffnessOffset) { builder.addOffset(0, stiffnessOffset, 0); }
  public static void addMaxPathDeviation(FlatBufferBuilder builder, int maxPathDeviationOffset) { builder.addStruct(1, maxPathDeviationOffset, 0); }
  public static void addMaxJointSpeed(FlatBufferBuilder builder, int maxJointSpeedOffset) { builder.addOffset(2, maxJointSpeedOffset, 0); }
  public static int createMaxJointSpeedVector(FlatBufferBuilder builder, double[] data) { builder.startVector(8, data.length, 8); for (int i = data.length - 1; i >= 0; i--) builder.addDouble(data[i]); return builder.endVector(); }
  public static void startMaxJointSpeedVector(FlatBufferBuilder builder, int numElems) { builder.startVector(8, numElems, 8); }
  public static void addMaxCartesianVelocity(FlatBufferBuilder builder, int maxCartesianVelocityOffset) { builder.addStruct(3, maxCartesianVelocityOffset, 0); }
  public static void addMaxControlForce(FlatBufferBuilder builder, int maxControlForceOffset) { builder.addStruct(4, maxControlForceOffset, 0); }
  public static void addMaxControlForceExceededStop(FlatBufferBuilder builder, boolean maxControlForceExceededStop) { builder.addBoolean(5, maxControlForceExceededStop, false); }
  public static void addNullspaceDamping(FlatBufferBuilder builder, double nullspaceDamping) { builder.addDouble(6, nullspaceDamping, 0); }
  public static void addNullspaceStiffness(FlatBufferBuilder builder, double nullspaceStiffness) { builder.addDouble(7, nullspaceStiffness, 0); }
  public static int endCartesianImpedenceControlMode(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

