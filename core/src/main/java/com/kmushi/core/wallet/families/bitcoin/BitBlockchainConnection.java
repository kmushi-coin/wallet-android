package com.kmushi.core.wallet.families.bitcoin;

import com.kmushi.core.network.AddressStatus;
import com.kmushi.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
