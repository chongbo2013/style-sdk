package com.yalin.wallpaper.nightfal_windmill;

import android.content.Context;
import android.service.wallpaper.WallpaperService;

import com.yalin.style.engine.IProvider;

/**
 * @author jinyalin
 * @since 2017/7/28.
 */

public class ProviderImpl implements IProvider {
    @Override
    public WallpaperService provideProxy(Context host) {
        return new LiveWallpaperAndroid(host);
    }
}
