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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GrantDbToAccountRequest extends RpcAcsRequest<GrantDbToAccountResponse> {
	
	public GrantDbToAccountRequest() {
		super("retailcloud", "2018-03-13", "GrantDbToAccount");
	}

	private String accountName;

	private String dbName;

	private Integer mainUserId;

	private String dbInstanceId;

	private String accountPrivilege;

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public Integer getMainUserId() {
		return this.mainUserId;
	}

	public void setMainUserId(Integer mainUserId) {
		this.mainUserId = mainUserId;
		if(mainUserId != null){
			putQueryParameter("MainUserId", mainUserId.toString());
		}
	}

	public String getDbInstanceId() {
		return this.dbInstanceId;
	}

	public void setDbInstanceId(String dbInstanceId) {
		this.dbInstanceId = dbInstanceId;
		if(dbInstanceId != null){
			putQueryParameter("DbInstanceId", dbInstanceId);
		}
	}

	public String getAccountPrivilege() {
		return this.accountPrivilege;
	}

	public void setAccountPrivilege(String accountPrivilege) {
		this.accountPrivilege = accountPrivilege;
		if(accountPrivilege != null){
			putQueryParameter("AccountPrivilege", accountPrivilege);
		}
	}

	@Override
	public Class<GrantDbToAccountResponse> getResponseClass() {
		return GrantDbToAccountResponse.class;
	}

}
