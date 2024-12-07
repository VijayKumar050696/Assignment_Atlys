package comm.pojo.response;

import java.util.ArrayList;

public class Facet
{
    public String title;
    public String default_title;
    public String attribute;
    public String type;
    public String data_type;
    public ArrayList<Object> data;
    public String desktop_view;
    public String show_on_mobile;
    public ArrayList<Bucket> buckets;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDefault_title() {
        return default_title;
    }

    public void setDefault_title(String default_title) {
        this.default_title = default_title;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public ArrayList<Object> getData() {
        return data;
    }

    public void setData(ArrayList<Object> data) {
        this.data = data;
    }

    public String getDesktop_view() {
        return desktop_view;
    }

    public void setDesktop_view(String desktop_view) {
        this.desktop_view = desktop_view;
    }

    public String getShow_on_mobile() {
        return show_on_mobile;
    }

    public void setShow_on_mobile(String show_on_mobile) {
        this.show_on_mobile = show_on_mobile;
    }

    public ArrayList<Bucket> getBuckets() {
        return buckets;
    }

    public void setBuckets(ArrayList<Bucket> buckets) {
        this.buckets = buckets;
    }
}
