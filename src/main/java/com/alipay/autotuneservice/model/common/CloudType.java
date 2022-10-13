/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.autotuneservice.model.common;

import org.apache.commons.lang3.StringUtils;

/**
 * @author huangkaifei
 * @version : CloudType.java, v 0.1 2022年07月14日 5:30 PM huangkaifei Exp $
 */
public enum CloudType {
    AWS("aws cloud"), ALIYUN("ali cloud"), K8S("k8s native");

    private String desc;

    CloudType(String desc) {
        this.desc = desc;
    }

    public static CloudType find(String name) {
        for (CloudType type : values()) {
            if (StringUtils.endsWithIgnoreCase(type.name(), name)) {
                return type;
            }
        }
        throw new UnsupportedOperationException(String.format("%s is not supported.", name));
    }

}