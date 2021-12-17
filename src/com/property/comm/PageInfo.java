package com.property.comm;

public class PageInfo {
    private int page;
    private int size;
    private int totalRows;
    private int totalPages;
    private int startRow;

    public PageInfo(int page) {
        this(page,Const.PAGE_DEFAULT_SIZE);
    }

    public PageInfo(int page, int size) {
        this.page = page;
        this.size = size;
        this.startRow = (page-1)*size;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
        this.totalPages = this.totalRows%this.size==0?this.totalRows/this.size:this.totalRows/this.size+1;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getStartRow() {
        return this.startRow;
    }
}
