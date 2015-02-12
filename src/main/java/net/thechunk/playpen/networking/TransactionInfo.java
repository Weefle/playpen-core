package net.thechunk.playpen.networking;

import lombok.Data;
import net.thechunk.playpen.protocol.Protocol;

@Data
public class TransactionInfo {
    private String id;

    private float timeout = -1;

    private String target = null;

    private Protocol.Transaction transaction = null;

    private ITransactionListener handler = null;
}