package Day_34.staticBlocks;

public class staticInit {

    static final int AGE;
    static final int weight;

    static {
        AGE=26;   // İLK STATİC OKUNACĞI İÇİN FİNALE BAŞTA DEĞER VERMESEK BİLE,
                  // SONRADAN STATİC İÇERİSİNDE DEĞER VERDİK
        weight=75;
    }
    // statik bir classta ilk okunan yer olduğu için final olsa bile,
    // statik içerisinde değer verilir.
}
