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
package org.netbeans.modules.php.latte.hints;

import org.netbeans.modules.csl.api.Rule;
import org.netbeans.modules.php.latte.LatteTestBase;

/**
 *
 * @author Ondrej Brejla <obrejla@netbeans.org>
 */
public class LatteHintsTestBase extends LatteTestBase {
    private static final String TEST_DIRECTORY = "testfiles/hints/"; //NOI18N

    public LatteHintsTestBase(String testName) {
        super(testName);
    }

    /**
     * Checks hints in a whole file.
     *
     * @param hint Instantion of hint to test.
     * @param fileName Name of the file which is in "<tt>testfiles/verification/</tt>" directory.
     * @throws Exception
     */
    protected void checkHints(Rule hint, String fileName) throws Exception {
        checkHints(hint, fileName, null);
    }

    protected void checkHints(Rule onLineHint, String fileName, String caretLine) throws Exception {
        checkHints(this, onLineHint, TEST_DIRECTORY + fileName, caretLine);
    }

}
