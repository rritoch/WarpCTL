/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class AdapterInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected AdapterInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AdapterInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_AdapterInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setISize(int value) {
    jadl_sdkJNI.AdapterInfo_iSize_set(swigCPtr, this, value);
  }

  public int getISize() {
    return jadl_sdkJNI.AdapterInfo_iSize_get(swigCPtr, this);
  }

  public void setIAdapterIndex(int value) {
    jadl_sdkJNI.AdapterInfo_iAdapterIndex_set(swigCPtr, this, value);
  }

  public int getIAdapterIndex() {
    return jadl_sdkJNI.AdapterInfo_iAdapterIndex_get(swigCPtr, this);
  }

  public void setStrUDID(String value) {
    jadl_sdkJNI.AdapterInfo_strUDID_set(swigCPtr, this, value);
  }

  public String getStrUDID() {
    return jadl_sdkJNI.AdapterInfo_strUDID_get(swigCPtr, this);
  }

  public void setIBusNumber(int value) {
    jadl_sdkJNI.AdapterInfo_iBusNumber_set(swigCPtr, this, value);
  }

  public int getIBusNumber() {
    return jadl_sdkJNI.AdapterInfo_iBusNumber_get(swigCPtr, this);
  }

  public void setIDeviceNumber(int value) {
    jadl_sdkJNI.AdapterInfo_iDeviceNumber_set(swigCPtr, this, value);
  }

  public int getIDeviceNumber() {
    return jadl_sdkJNI.AdapterInfo_iDeviceNumber_get(swigCPtr, this);
  }

  public void setIFunctionNumber(int value) {
    jadl_sdkJNI.AdapterInfo_iFunctionNumber_set(swigCPtr, this, value);
  }

  public int getIFunctionNumber() {
    return jadl_sdkJNI.AdapterInfo_iFunctionNumber_get(swigCPtr, this);
  }

  public void setIVendorID(int value) {
    jadl_sdkJNI.AdapterInfo_iVendorID_set(swigCPtr, this, value);
  }

  public int getIVendorID() {
    return jadl_sdkJNI.AdapterInfo_iVendorID_get(swigCPtr, this);
  }

  public void setStrAdapterName(String value) {
    jadl_sdkJNI.AdapterInfo_strAdapterName_set(swigCPtr, this, value);
  }

  public String getStrAdapterName() {
    return jadl_sdkJNI.AdapterInfo_strAdapterName_get(swigCPtr, this);
  }

  public void setStrDisplayName(String value) {
    jadl_sdkJNI.AdapterInfo_strDisplayName_set(swigCPtr, this, value);
  }

  public String getStrDisplayName() {
    return jadl_sdkJNI.AdapterInfo_strDisplayName_get(swigCPtr, this);
  }

  public void setIPresent(int value) {
    jadl_sdkJNI.AdapterInfo_iPresent_set(swigCPtr, this, value);
  }

  public int getIPresent() {
    return jadl_sdkJNI.AdapterInfo_iPresent_get(swigCPtr, this);
  }

  public AdapterInfo() {
    this(jadl_sdkJNI.new_AdapterInfo(), true);
  }

}
