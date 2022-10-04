package contentSquareAutomation.constants;

public enum EndPoint {
    STORE("/store"),
    ACCOUNT("/account"),
    ADD_TO_CART("/?wc-ajax=add_to_cart"),
    CHECKOUT("/checkout"),
    WEATHER("/comments"),

    DATA("/comments/1");
    public final String url;

    EndPoint(String url) {
        this.url = url;
    }
}
