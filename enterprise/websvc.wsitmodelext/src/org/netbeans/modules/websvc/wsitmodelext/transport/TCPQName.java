/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.websvc.wsitmodelext.transport;

import javax.xml.namespace.QName;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Martin Grebac
 */
public enum TCPQName {
    OPTIMIZEDTCPTRANSPORT(createTCPQName("OptimizedTCPTransport")), //NOI18N
    AUTOMATICALLYSELECTOPTIMALTRANSPORT(createTCPClientQName("AutomaticallySelectOptimalTransport")); //NOI18N

    public static final String TCP_NS_URI = "http://java.sun.com/xml/ns/wsit/2006/09/policy/soaptcp/service";    //NOI18N
    public static final String TCP_CLIENT_NS_URI = "http://java.sun.com/xml/ns/wsit/2006/09/policy/transport/client";    //NOI18N
    public static final String TCP_NS_PREFIX = "tcp";       //NOI18N
    
    public static QName createTCPQName(String localName){
        return new QName(TCP_NS_URI, localName, TCP_NS_PREFIX);
    }

    public static QName createTCPClientQName(String localName){
        return new QName(TCP_CLIENT_NS_URI, localName, TCP_NS_PREFIX);
    }
    
    TCPQName(QName name) {
        qName = name;
    }
    
    public QName getQName(){
        return qName;
    }
    private static Set<QName> qnames = null;
    public static Set<QName> getQNames() {
        if (qnames == null) {
            qnames = new HashSet<QName>();
            for (TCPQName wq : values()) {
                qnames.add(wq.getQName());
            }
        }
        return qnames;
    }
    private final QName qName;

}
