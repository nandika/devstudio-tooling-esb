/*
 * Copyright 2016 WSO2, Inc. (http://wso2.com)
 *
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
package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__COORDINATION;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__INTERVAL;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__SEQUENTIAL;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_ACTION_AFTER_FAILURE;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_ACTION_AFTER_PROCESS;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_AUTO_LOCK_RELEASE;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_AUTO_LOCK_RELEASE_INTERVAL;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_BUILD;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_CONTENT_TYPE;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_CREATE_FOLDER;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_DISTRIBUTED_LOCK;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_DISTRIBUTED_TIMEOUT;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_NAME_PATTERN;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_PROCESS_COUNT;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_PROCESS_INTERVAL;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_SORT_ASCENDING;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_SORT_ATTRIBUTE;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_URI;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_LOCKING;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_LOCK_RELEASE_SAME_NODE;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_MAX_RETRY_COUNT;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_MOVE_AFTER_FAILURE;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_MOVE_AFTER_PROCESS;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_MOVE_TIMESTAMP_FORMAT;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_RECONNECT_TIMEOUT;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_STREAMING;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.INBOUND_ENDPOINT__TRANSPORT_VFS_SUB_FOLDER_TIMESTAMP_FORMAT;

import org.eclipse.emf.ecore.EAttribute;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.InboundEndpointConstants;

/**
 * This Enum represent file inbound endpoint parameters with parameter name , related EAttribute and boolean value indicating
 * whether it could hold key attribute
 *
 */
public enum FileInboundEndpointParameter {
    INTERVAL_TYPE(InboundEndpointConstants.INTERVAL, INBOUND_ENDPOINT__INTERVAL, true),
    SEQUENTIAL_TYPE(InboundEndpointConstants.SEQUENTIAL, INBOUND_ENDPOINT__SEQUENTIAL, false),
    COORDINATION_TYPE(InboundEndpointConstants.COORDINATION, INBOUND_ENDPOINT__COORDINATION, false),
    VFS_FILE_URI_TYPE(InboundEndpointConstants.VFS_FILE_URI, INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_URI, true),
    VFS_CONTENT_TYPE_TYPE(InboundEndpointConstants.VFS_CONTENT_TYPE, INBOUND_ENDPOINT__TRANSPORT_VFS_CONTENT_TYPE, true),
    VFS_FILE_NAME_PATTERN_TYPE(InboundEndpointConstants.VFS_FILE_NAME_PATTERN,
            INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_NAME_PATTERN, true),
    VFS_FILE_PROCESS_INTERVAL_TYPE(InboundEndpointConstants.VFS_FILE_PROCESS_INTERVAL,
            INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_PROCESS_INTERVAL,true),
    VFS_FILE_PROCESS_COUNT_TYPE(InboundEndpointConstants.VFS_FILE_PROCESS_COUNT,
            INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_PROCESS_COUNT, true),
    VFS_MAX_RETRY_COUNT_TYPE(InboundEndpointConstants.VFS_MAX_RETRY_COUNT, 
            INBOUND_ENDPOINT__TRANSPORT_VFS_MAX_RETRY_COUNT, true),
    VFS_RECONNECT_TIMEOUT_TYPE(InboundEndpointConstants.VFS_RECONNECT_TIMEOUT,
            INBOUND_ENDPOINT__TRANSPORT_VFS_RECONNECT_TIMEOUT, true),
    VFS_MOVE_AFTER_PROCESS_TYPE(InboundEndpointConstants.VFS_MOVE_AFTER_PROCESS, 
            INBOUND_ENDPOINT__TRANSPORT_VFS_MOVE_AFTER_PROCESS, true),
    VFS_MOVE_AFTER_FAILURE_TYPE(InboundEndpointConstants.VFS_MOVE_AFTER_FAILURE,
            INBOUND_ENDPOINT__TRANSPORT_VFS_MOVE_AFTER_FAILURE, true),
    VFS_MOVE_TIMESTAMP_FORMAT_TYPE(InboundEndpointConstants.VFS_MOVE_TIMESTAMP_FORMAT, 
            INBOUND_ENDPOINT__TRANSPORT_VFS_MOVE_TIMESTAMP_FORMAT,true),
    VFS_AUTO_LOCK_RELEASE_INTERVAL_TYPE(InboundEndpointConstants.VFS_AUTO_LOCK_RELEASE_INTERVAL,
            INBOUND_ENDPOINT__TRANSPORT_VFS_AUTO_LOCK_RELEASE_INTERVAL, true),
    VFS_DISTRIBUTED_TIMEOUT_TYPE(InboundEndpointConstants.VFS_DISTRIBUTED_TIMEOUT, 
            INBOUND_ENDPOINT__TRANSPORT_VFS_DISTRIBUTED_TIMEOUT, true),
    VFS_SUBFOLDER_TIMESTAMP_FORMAT_TYPE(InboundEndpointConstants.VFS_SUBFOLDER_TIMESTAMP_FORMAT,
            INBOUND_ENDPOINT__TRANSPORT_VFS_SUB_FOLDER_TIMESTAMP_FORMAT, true),
    VFS_LOCKING_TYPE(InboundEndpointConstants.VFS_LOCKING, INBOUND_ENDPOINT__TRANSPORT_VFS_LOCKING, false),
    VFS_ACTION_AFTER_PROCESS_TYPE(InboundEndpointConstants.VFS_ACTION_AFTER_PROCESS,
                    INBOUND_ENDPOINT__TRANSPORT_VFS_ACTION_AFTER_PROCESS,false),
    VFS_ACTION_AFTER_FAILURE_TYPE(InboundEndpointConstants.VFS_ACTION_AFTER_FAILURE,
                    INBOUND_ENDPOINT__TRANSPORT_VFS_ACTION_AFTER_FAILURE, false),
    VFS_AUTO_LOCK_RELEASE_TYPE(InboundEndpointConstants.VFS_AUTO_LOCK_RELEASE,
                    INBOUND_ENDPOINT__TRANSPORT_VFS_AUTO_LOCK_RELEASE, false),
    VFS_LOCK_RELEASE_SAME_NODE_TYPE(InboundEndpointConstants.VFS_LOCK_RELEASE_SAME_NODE,
                    INBOUND_ENDPOINT__TRANSPORT_VFS_LOCK_RELEASE_SAME_NODE, false),
    VFS_DISTRIBUTED_LOCK_TYPE(InboundEndpointConstants.VFS_DISTRIBUTED_LOCK,
                    INBOUND_ENDPOINT__TRANSPORT_VFS_DISTRIBUTED_LOCK, false),
    VFS_FILESORT_ATTRIBUTE_TYPE(InboundEndpointConstants.VFS_FILESORT_ATTRIBUTE,
                    INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_SORT_ATTRIBUTE, false),
    VFS_FILESORT_ASCENDING_TYPE(InboundEndpointConstants.VFS_FILESORT_ASCENDING,
                    INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_SORT_ASCENDING, false),
    VFS_CREATE_FOLDER_TYPE(InboundEndpointConstants.VFS_CREATE_FOLDER,
                    INBOUND_ENDPOINT__TRANSPORT_VFS_CREATE_FOLDER, false),
    VFS_STREAMING_TYPE(InboundEndpointConstants.VFS_STREAMING, INBOUND_ENDPOINT__TRANSPORT_VFS_STREAMING, false),
    VFS_BUILD_TYPE(InboundEndpointConstants.VFS_BUILD, INBOUND_ENDPOINT__TRANSPORT_VFS_BUILD, false);
            
    private final String name;
    private final EAttribute eAttributeValue;
    private final boolean holdsKeyValue;

    FileInboundEndpointParameter(String name, EAttribute eAttributeValue, boolean holdsKeyValue) {
        this.name = name;
        this.eAttributeValue = eAttributeValue;
        this.holdsKeyValue = holdsKeyValue;
    }

    public String getName() {
        return name;
    }

    public EAttribute getEAttributeValue() {
        return eAttributeValue;
    }

    public boolean canHoldKeyValue() {
        return holdsKeyValue;
    }

    public boolean isMatchedWithParameterName(String parameterName) {
        if (this.name.equals(parameterName)) {
            return true;
        } else {
            return false;
        }
    }
}
