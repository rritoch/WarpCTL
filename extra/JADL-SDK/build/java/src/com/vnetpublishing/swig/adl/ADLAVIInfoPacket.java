/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLAVIInfoPacket {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLAVIInfoPacket(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLAVIInfoPacket obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLAVIInfoPacket(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBPB3_ITC(char value) {
    jadl_sdkJNI.ADLAVIInfoPacket_bPB3_ITC_set(swigCPtr, this, value);
  }

  public char getBPB3_ITC() {
    return jadl_sdkJNI.ADLAVIInfoPacket_bPB3_ITC_get(swigCPtr, this);
  }

  public void setBPB5(char value) {
    jadl_sdkJNI.ADLAVIInfoPacket_bPB5_set(swigCPtr, this, value);
  }

  public char getBPB5() {
    return jadl_sdkJNI.ADLAVIInfoPacket_bPB5_get(swigCPtr, this);
  }

  public ADLAVIInfoPacket() {
    this(jadl_sdkJNI.new_ADLAVIInfoPacket(), true);
  }

}
