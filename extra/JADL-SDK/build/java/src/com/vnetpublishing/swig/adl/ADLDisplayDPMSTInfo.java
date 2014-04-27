/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLDisplayDPMSTInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLDisplayDPMSTInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLDisplayDPMSTInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLDisplayDPMSTInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDisplayID(ADLDisplayID value) {
    jadl_sdkJNI.ADLDisplayDPMSTInfo_displayID_set(swigCPtr, this, ADLDisplayID.getCPtr(value), value);
  }

  public ADLDisplayID getDisplayID() {
    long cPtr = jadl_sdkJNI.ADLDisplayDPMSTInfo_displayID_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ADLDisplayID(cPtr, false);
  }

  public void setITotalAvailableBandwidthInMpbs(int value) {
    jadl_sdkJNI.ADLDisplayDPMSTInfo_iTotalAvailableBandwidthInMpbs_set(swigCPtr, this, value);
  }

  public int getITotalAvailableBandwidthInMpbs() {
    return jadl_sdkJNI.ADLDisplayDPMSTInfo_iTotalAvailableBandwidthInMpbs_get(swigCPtr, this);
  }

  public void setIAllocatedBandwidthInMbps(int value) {
    jadl_sdkJNI.ADLDisplayDPMSTInfo_iAllocatedBandwidthInMbps_set(swigCPtr, this, value);
  }

  public int getIAllocatedBandwidthInMbps() {
    return jadl_sdkJNI.ADLDisplayDPMSTInfo_iAllocatedBandwidthInMbps_get(swigCPtr, this);
  }

  public void setStrGlobalUniqueIdentifier(String value) {
    jadl_sdkJNI.ADLDisplayDPMSTInfo_strGlobalUniqueIdentifier_set(swigCPtr, this, value);
  }

  public String getStrGlobalUniqueIdentifier() {
    return jadl_sdkJNI.ADLDisplayDPMSTInfo_strGlobalUniqueIdentifier_get(swigCPtr, this);
  }

  public void setRadLinkCount(int value) {
    jadl_sdkJNI.ADLDisplayDPMSTInfo_radLinkCount_set(swigCPtr, this, value);
  }

  public int getRadLinkCount() {
    return jadl_sdkJNI.ADLDisplayDPMSTInfo_radLinkCount_get(swigCPtr, this);
  }

  public void setIPhysicalConnectorID(int value) {
    jadl_sdkJNI.ADLDisplayDPMSTInfo_iPhysicalConnectorID_set(swigCPtr, this, value);
  }

  public int getIPhysicalConnectorID() {
    return jadl_sdkJNI.ADLDisplayDPMSTInfo_iPhysicalConnectorID_get(swigCPtr, this);
  }

  public void setRad(String value) {
    jadl_sdkJNI.ADLDisplayDPMSTInfo_rad_set(swigCPtr, this, value);
  }

  public String getRad() {
    return jadl_sdkJNI.ADLDisplayDPMSTInfo_rad_get(swigCPtr, this);
  }

  public ADLDisplayDPMSTInfo() {
    this(jadl_sdkJNI.new_ADLDisplayDPMSTInfo(), true);
  }

}
