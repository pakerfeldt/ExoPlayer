package com.google.android.exoplayer.chunk;

import java.util.List;

public interface BaseUrlSelector {

    String getBaseUrl(List<String> baseUrls);

    final class FirstBaseUrlSelector implements BaseUrlSelector {

        @Override
        public String getBaseUrl(List<String> baseUrls) {
            return baseUrls.get(0);
        }
    }
}
