package com.webler.inventory.model.dtos.params;

public class PagingParams {

    private int page = 0;

    private int size = 10;

    public PagingParams() {}

    public PagingParams(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}