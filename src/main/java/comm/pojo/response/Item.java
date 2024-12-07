package comm.pojo.response;

import java.util.ArrayList;

public class Item {
    public String product_id;
    public String title;
    public String description;
    public String link;
    public String price;
    public String list_price;
    public String quantity;
    public String product_code;
    public String image_link;
    public String vendor;
    public String discount;
    public String add_to_cart_id;
    public String total_reviews;
    public String reviews_average_score;
    public ArrayList<ShopifyVariant> shopify_variants;
    public ArrayList<String> shopify_images;
    public ArrayList<String> shopify_images_alt;
    public String tags;
    public String quantity_total;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getList_price() {
        return list_price;
    }

    public void setList_price(String list_price) {
        this.list_price = list_price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getAdd_to_cart_id() {
        return add_to_cart_id;
    }

    public void setAdd_to_cart_id(String add_to_cart_id) {
        this.add_to_cart_id = add_to_cart_id;
    }

    public String getTotal_reviews() {
        return total_reviews;
    }

    public void setTotal_reviews(String total_reviews) {
        this.total_reviews = total_reviews;
    }

    public String getReviews_average_score() {
        return reviews_average_score;
    }

    public void setReviews_average_score(String reviews_average_score) {
        this.reviews_average_score = reviews_average_score;
    }

    public ArrayList<ShopifyVariant> getShopify_variants() {
        return shopify_variants;
    }

    public void setShopify_variants(ArrayList<ShopifyVariant> shopify_variants) {
        this.shopify_variants = shopify_variants;
    }

    public ArrayList<String> getShopify_images() {
        return shopify_images;
    }

    public void setShopify_images(ArrayList<String> shopify_images) {
        this.shopify_images = shopify_images;
    }

    public ArrayList<String> getShopify_images_alt() {
        return shopify_images_alt;
    }

    public void setShopify_images_alt(ArrayList<String> shopify_images_alt) {
        this.shopify_images_alt = shopify_images_alt;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getQuantity_total() {
        return quantity_total;
    }

    public void setQuantity_total(String quantity_total) {
        this.quantity_total = quantity_total;
    }
}
