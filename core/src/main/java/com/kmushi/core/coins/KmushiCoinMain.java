package com.kmushi.core.coins;

import com.kmushi.core.coins.families.PeerFamily;

/**
 * Created by Carmelo Campos 23/08/2019
 */

public class KmushiCoinMain extends PeerFamily {
    private KmushiCoinMain() {
        id = "kmushicoin.main";

        addressHeader = 46;
        p2shHeader = 85;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 128 + addressHeader;

        name = "KmushiCoin";
        symbol = "KTV";
        uriScheme = "kmushicoin";
        bip44Index = 754;
        unitExponent = 8;
        feeValue = value(10000);
        minNonDust = value(20000);
        softDustLimit = value(100000);
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("KmushiCoin Signed Message:\n");
    }

    private static KmushiCoinMain instance = new KmushiCoinMain();

    public static synchronized CoinType get() {
        return instance;
    }
}