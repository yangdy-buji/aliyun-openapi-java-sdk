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

package com.aliyuncs.dts.transform.v20180801;

import com.aliyuncs.dts.model.v20180801.DeleteMigrationJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMigrationJobResponseUnmarshaller {

	public static DeleteMigrationJobResponse unmarshall(DeleteMigrationJobResponse deleteMigrationJobResponse, UnmarshallerContext context) {
		
		deleteMigrationJobResponse.setRequestId(context.stringValue("DeleteMigrationJobResponse.RequestId"));
		deleteMigrationJobResponse.setSuccess(context.stringValue("DeleteMigrationJobResponse.Success"));
		deleteMigrationJobResponse.setErrCode(context.stringValue("DeleteMigrationJobResponse.ErrCode"));
		deleteMigrationJobResponse.setErrMessage(context.stringValue("DeleteMigrationJobResponse.ErrMessage"));
	 
	 	return deleteMigrationJobResponse;
	}
}