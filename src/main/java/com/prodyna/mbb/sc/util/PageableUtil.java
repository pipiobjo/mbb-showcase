package com.prodyna.mbb.sc.util;

import org.springframework.data.domain.PageRequest;

public class PageableUtil {

    public static PageRequest getPageable(Integer page, Integer size, Integer defaultPageStart, Integer defaultPageSize) {
        if (page == null) {
            page = defaultPageStart;
        }
        if (size == null) {
            size = defaultPageSize;
        }
        return PageRequest.of(page, size);
    }
}
