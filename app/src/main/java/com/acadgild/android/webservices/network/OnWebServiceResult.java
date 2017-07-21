package com.acadgild.android.webservices.network;


import com.acadgild.android.webservices.utils.CommonUtilities;

/**
 * @author Preetika
 *
 */
public interface OnWebServiceResult {
	public void getWebResponse(String result, CommonUtilities.SERVICE_TYPE type);
}
