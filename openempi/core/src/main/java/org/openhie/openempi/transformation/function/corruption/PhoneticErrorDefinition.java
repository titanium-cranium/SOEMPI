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
package org.openhie.openempi.transformation.function.corruption;

public class PhoneticErrorDefinition
{
	public enum ErrorLocation {
		ANYWHERE,
		AT_THE_BEGINNING,
		IN_THE_MIDDLE,
		AT_THE_END
	}
	public enum PrecededByConstraint {
		NOTHING,
		PRECEEDED_BY_CONSONANT,
		PRECEEDED_BY_VOWEL,
		PRECEEDED_BY_VAN_VON_OR_SCH,
		PRECEEDED_BY_U_OR_3_SPACES_AND_CGLRT,
		PRECEEDED_BY_2_SPACES_AND_BHD,
		PRECEEDED_BY_A_OR_I,
		NOT_PRECEEDED_BY_E_OR_I,
		NOT_PRECEEDED_BY_I,
		NOT_PRECEEDED_BY_T,
		NOT_PRECEEDED_BY_SPACE_AND_A_VOWEL
	}
	
	public enum FollowedByConstraint {
		NOTHING,
		FOLLOWED_BY_CONSONANT,
		FOLLOWED_BY_VOWEL,
		NOT_FOLLOWED_BY_SPACE_AND_HU,
		NOT_FOLLOWED_BY_VOWEL_OR_W,
		NOT_FOLLOWED_BY_E_OR_I,
		NOT_FOLLOWED_BY_RGY_OR_OGY
	}
	
	public enum SpecialConstraint {
		NOTHING,
		IS_SLAVIC,
		NOT_SLAVIC,
		STARTS_WITH_A_VOWEL_AND_NOT_SLAVIC,
		DOESNT_CONTAIN_DANGER_RANGER_MANGER
	}
	
	public StringTriple after;
	public ErrorLocation errorLocation = ErrorLocation.ANYWHERE;
	public PrecededByConstraint preConstr = PrecededByConstraint.NOTHING;
	public FollowedByConstraint postConstr = FollowedByConstraint.NOTHING;
	public SpecialConstraint specConstr = SpecialConstraint.NOTHING;
	
	public PhoneticErrorDefinition(String after) {
		this.after = new StringTriple(after, true);
	}

	public PhoneticErrorDefinition(String after, ErrorLocation errorLocation) {
		this.after = new StringTriple(after, true);
		this.errorLocation = errorLocation;
	}

	public PhoneticErrorDefinition(String after, ErrorLocation errorLocation, SpecialConstraint specConstr) {
		this.after = new StringTriple(after, true);
		this.errorLocation = errorLocation;
		this.specConstr = specConstr;
	}

	public PhoneticErrorDefinition(String after, ErrorLocation errorLocation, PrecededByConstraint preConstr) {
		this.after = new StringTriple(after, true);
		this.errorLocation = errorLocation;
		this.preConstr = preConstr;
	}

	public PhoneticErrorDefinition(String after, ErrorLocation errorLocation, PrecededByConstraint preConstr, SpecialConstraint specConstr) {
		this.after = new StringTriple(after, true);
		this.errorLocation = errorLocation;
		this.preConstr = preConstr;
		this.specConstr = specConstr;
	}

	public PhoneticErrorDefinition(String after, ErrorLocation errorLocation, FollowedByConstraint postConstr) {
		this.after = new StringTriple(after, true);
		this.errorLocation = errorLocation;
		this.preConstr = PrecededByConstraint.NOTHING;
		this.postConstr = postConstr;
	}

	public PhoneticErrorDefinition(String after, ErrorLocation errorLocation, PrecededByConstraint preConstr, FollowedByConstraint postConstr) {
		this.after = new StringTriple(after, true);
		this.errorLocation = errorLocation;
		this.preConstr = preConstr;
		this.postConstr = postConstr;
	}
}
