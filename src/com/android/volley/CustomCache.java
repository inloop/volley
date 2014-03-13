package com.android.volley;

import java.util.Map;

public interface CustomCache<T> {

    public Cache<T> getCache();
    public Response<T> parseCustomCacheResponse(Object parsedData, Map<String, String> headers);

}
