package pl.parser.nbp.model;


public enum CurrencyCode {
    USD("USD"),
    AUD("AUD"),
    CAD("CAD"),
    EUR("EUR"),
    HUF("HUF"),
    CHF("CHF"),
    GBP("GBP"),
    JPY("JPY"),
    CZK("CZK"),
    DKK("DKK"),
    NOK("NOK"),
    SEK("SEK"),
    XDR("XDR");

    private final String currencyCode;

    CurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}
