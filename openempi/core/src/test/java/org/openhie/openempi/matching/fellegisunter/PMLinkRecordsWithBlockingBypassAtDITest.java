/**
 * 
 *  Copyright (C) 2013 Vanderbilt University <csaba.toth, b.malin @vanderbilt.edu>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.openhie.openempi.matching.fellegisunter;

import org.openhie.openempi.Constants;
import org.openhie.openempi.recordlinkage.RecordLinkageProtocol;
import org.openhie.openempi.service.BaseServiceTestCase;

public class PMLinkRecordsWithBlockingBypassAtDITest extends BaseServiceTestCase
{
	public void testPMLinkRecordsWithBlockingBypassAtDI() {
		try {
			Integer leftDatasetId = 3100;	// change that
			Integer rightDatasetId = 3101;	// change that

			RecordLinkageProtocol recordLinkageProtocol = (RecordLinkageProtocol)
					getApplicationContext().getBean(Constants.THREE_THIRD_PARTY_CBF_W_RND_BLOCKING_PROTOCOL_NAME);
			recordLinkageProtocol.testPMLinkRecords(leftDatasetId, rightDatasetId,
					Constants.BLOCKING_BYPASS_SERVICE_NAME, Constants.PROBABILISTIC_MATCHING_SERVICE_WITH_SCALED_SCORES_NAME);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
