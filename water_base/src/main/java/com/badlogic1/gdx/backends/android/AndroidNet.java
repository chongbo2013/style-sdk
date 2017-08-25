/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic1.gdx.backends.android;

import android.content.Intent;
import android.net.Uri;

import com.badlogic1.gdx.Net;
import com.badlogic1.gdx.net.NetJavaImpl;
import com.badlogic1.gdx.net.ServerSocket;
import com.badlogic1.gdx.net.ServerSocketHints;
import com.badlogic1.gdx.net.Socket;
import com.badlogic1.gdx.net.SocketHints;

/** Android implementation of the {@link Net} API.
 * @author acoppes */
public class AndroidNet implements Net {

	// IMPORTANT: The Gdx.net classes are a currently duplicated for LWJGL + Android!
	// If you make changes here, make changes in the other backend as well.
	final AndroidApplication app;
	NetJavaImpl netJavaImpl;

	public AndroidNet (AndroidApplication activity) {
		app = activity;
		netJavaImpl = new NetJavaImpl();
	}

	@Override
	public void sendHttpRequest (HttpRequest httpRequest, final HttpResponseListener httpResponseListener) {
		netJavaImpl.sendHttpRequest(httpRequest, httpResponseListener);
	}

	@Override
	public ServerSocket newServerSocket (Protocol protocol, int port, ServerSocketHints hints) {
		return new AndroidServerSocket(protocol, port, hints);
	}

	@Override
	public Socket newClientSocket (Protocol protocol, String host, int port, SocketHints hints) {
		return new AndroidSocket(protocol, host, port, hints);
	}

	@Override
	public void openURI (String URI) {
		final Uri uri = Uri.parse(URI);
		app.runOnUiThread(new Runnable() {
			@Override
			public void run () {
				app.startActivity(new Intent(Intent.ACTION_VIEW, uri));
			}
		});
	}

}
