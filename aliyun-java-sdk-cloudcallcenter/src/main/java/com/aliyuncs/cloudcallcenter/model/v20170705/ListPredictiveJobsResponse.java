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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListPredictiveJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPredictiveJobsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Jobs jobs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Jobs getJobs() {
		return this.jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	public static class Jobs {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Job> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<Job> getList() {
			return this.list;
		}

		public void setList(List<Job> list) {
			this.list = list;
		}

		public static class Job {

			private String jobId;

			private String jobGroupId;

			private String strategyId;

			private String status;

			private String failureReason;

			private Integer calledTimes;

			private List<Contact> contacts;

			private List<String> callingNumbers;

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getJobGroupId() {
				return this.jobGroupId;
			}

			public void setJobGroupId(String jobGroupId) {
				this.jobGroupId = jobGroupId;
			}

			public String getStrategyId() {
				return this.strategyId;
			}

			public void setStrategyId(String strategyId) {
				this.strategyId = strategyId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getFailureReason() {
				return this.failureReason;
			}

			public void setFailureReason(String failureReason) {
				this.failureReason = failureReason;
			}

			public Integer getCalledTimes() {
				return this.calledTimes;
			}

			public void setCalledTimes(Integer calledTimes) {
				this.calledTimes = calledTimes;
			}

			public List<Contact> getContacts() {
				return this.contacts;
			}

			public void setContacts(List<Contact> contacts) {
				this.contacts = contacts;
			}

			public List<String> getCallingNumbers() {
				return this.callingNumbers;
			}

			public void setCallingNumbers(List<String> callingNumbers) {
				this.callingNumbers = callingNumbers;
			}

			public static class Contact {

				private String contactId;

				private String contactName;

				private String honorific;

				private String phoneNumber;

				private String referenceId;

				private String jobId;

				public String getContactId() {
					return this.contactId;
				}

				public void setContactId(String contactId) {
					this.contactId = contactId;
				}

				public String getContactName() {
					return this.contactName;
				}

				public void setContactName(String contactName) {
					this.contactName = contactName;
				}

				public String getHonorific() {
					return this.honorific;
				}

				public void setHonorific(String honorific) {
					this.honorific = honorific;
				}

				public String getPhoneNumber() {
					return this.phoneNumber;
				}

				public void setPhoneNumber(String phoneNumber) {
					this.phoneNumber = phoneNumber;
				}

				public String getReferenceId() {
					return this.referenceId;
				}

				public void setReferenceId(String referenceId) {
					this.referenceId = referenceId;
				}

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}
			}
		}
	}

	@Override
	public ListPredictiveJobsResponse getInstance(UnmarshallerContext context) {
		return	ListPredictiveJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
