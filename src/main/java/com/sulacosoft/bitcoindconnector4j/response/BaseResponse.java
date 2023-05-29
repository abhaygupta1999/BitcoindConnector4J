/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sulacosoft.bitcoindconnector4j.response;

import com.google.gson.JsonElement;

/**
 *  @author Sebastian Dziak {@literal (sebastian.dziak@sulacosoft.com)}
 */
public class BaseResponse {

	private long id;
	private JsonElement result;
	private Error error;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public JsonElement getResult() {
		return result;
	}

	public void setResult(JsonElement result) {
		this.result = result;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "BaseResponse{" +
				"id=" + id +
				", result=" + result +
				", error=" + error +
				'}';
	}
}
