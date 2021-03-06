/**
 *
 *  Copyright (C) 2010 SYSNET International, Inc. <support@sysnetint.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 *
 */
package org.openempi.webapp.client;

import org.openempi.webapp.client.domain.Authentication;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * 
 * Manages all security aspects of the application.
 * Borrowed from Beginning Google Web Toolkit Book
 *
 * @author Uri Boness
 */
public interface SecurityServiceAsync {

	/**
	 * 
	 * @param userName
	 * @throws AuthenticationException if userName is 'badguy'
	 */
    void login(String userName, AsyncCallback<Void> callback);

    /**
     * Logs out the currently authenticated user.
     */
    void logout(AsyncCallback<Void> callback);

    /**
     * Indicates whether there is a logged in user.
     *
     * @param callback the callback to return Whether there is a logged in user.
     */
    void isLoggedIn(AsyncCallback<Boolean> callback);

    /**
     * Returns the currently logged in authentication.
     *
     * @param callback the callback to return The currently logged in authentication.
     */
    void getCurrentAuthentication(AsyncCallback<Authentication> callback);

}
