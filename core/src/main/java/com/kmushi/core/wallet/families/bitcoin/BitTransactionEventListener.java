package com.kmushi.core.wallet.families.bitcoin;

import com.kmushi.core.network.AddressStatus;
import com.kmushi.core.network.ServerClient.UnspentTx;
import com.kmushi.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
