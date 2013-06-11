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
package org.openhie.openempi.blocking.privacypreserving;

import java.util.Comparator;


public class BloomFilterBitStatComparatorByImportance implements Comparator<BloomFilterBitStat>
{
	public int compare(BloomFilterBitStat pair1, BloomFilterBitStat pair2) {
		Double importance1 = Double.valueOf(pair1.getBitMatchPairMatch()) /
							(pair1.getBitMatchPairMatch() + pair1.getBitUnmatchPairMatch());
		double importance2 = Double.valueOf(pair2.getBitMatchPairMatch()) /
							(pair2.getBitMatchPairMatch() + pair2.getBitUnmatchPairMatch());
		return importance1.compareTo(importance2);
	}

}
