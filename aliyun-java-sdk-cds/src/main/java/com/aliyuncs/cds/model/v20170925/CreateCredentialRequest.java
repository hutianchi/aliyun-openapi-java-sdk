/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cds.model.v20170925;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateCredentialRequest extends RoaAcsRequest<CreateCredentialResponse> {
	
	public CreateCredentialRequest() {
		super("Cds", "2017-09-25", "CreateCredential", "cds");
		setUriPattern("/v1/credential/create");
		setMethod(MethodType.POST);
	}

	private String credentialType;

	private String jsonContent;

	public String getCredentialType() {
		return this.credentialType;
	}

	public void setCredentialType(String credentialType) {
		this.credentialType = credentialType;
		if(credentialType != null){
			putQueryParameter("CredentialType", credentialType);
		}
	}

	public String getJsonContent() {
		return this.jsonContent;
	}

	public void setJsonContent(String jsonContent) {
		this.jsonContent = jsonContent;
		if(jsonContent != null){
			putQueryParameter("JsonContent", jsonContent);
		}
	}

	@Override
	public Class<CreateCredentialResponse> getResponseClass() {
		return CreateCredentialResponse.class;
	}

}
