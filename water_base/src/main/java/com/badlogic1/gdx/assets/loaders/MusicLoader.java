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

package com.badlogic1.gdx.assets.loaders;

import com.badlogic1.gdx.Gdx;
import com.badlogic1.gdx.assets.AssetDescriptor;
import com.badlogic1.gdx.assets.AssetLoaderParameters;
import com.badlogic1.gdx.assets.AssetManager;
import com.badlogic1.gdx.audio.Music;
import com.badlogic1.gdx.utils.Array;

/** {@link AssetLoader} for {@link Music} instances. The Music instance is loaded synchronously.
 * @author mzechner */
public class MusicLoader extends SynchronousAssetLoader<Music, MusicLoader.MusicParameter> {
	public MusicLoader (FileHandleResolver resolver) {
		super(resolver);
	}

	@Override
	public Music load (AssetManager assetManager, String fileName, MusicParameter parameter) {
		return Gdx.audio.newMusic(resolve(fileName));
	}

	@Override
	public Array<AssetDescriptor> getDependencies (String fileName, MusicParameter parameter) {
		return null;
	}

	static public class MusicParameter extends AssetLoaderParameters<Music> {
	}
}
