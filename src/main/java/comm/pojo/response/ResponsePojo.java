package comm.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ResponsePojo {

    public int totalItems;
    public int startIndex;
    public int itemsPerPage;
    public int currentItemCount;
    public int pageStartIndex;
    public int totalPages;
    public ArrayList<Object> pages;
    public ArrayList<Item> items;
    public ArrayList<Facet> facets;

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public int getCurrentItemCount() {
        return currentItemCount;
    }

    public void setCurrentItemCount(int currentItemCount) {
        this.currentItemCount = currentItemCount;
    }

    public int getPageStartIndex() {
        return pageStartIndex;
    }

    public void setPageStartIndex(int pageStartIndex) {
        this.pageStartIndex = pageStartIndex;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public ArrayList<Object> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Object> pages) {
        this.pages = pages;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Facet> getFacets() {
        return facets;
    }

    public void setFacets(ArrayList<Facet> facets) {
        this.facets = facets;
    }
}
