package org.bcos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.bcos.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.bcos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed72x24 extends Ufixed {
    public static final Ufixed72x24 DEFAULT = new Ufixed72x24(BigInteger.ZERO);

    public Ufixed72x24(BigInteger value) {
        super(72, 24, value);
    }

    public Ufixed72x24(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(72, 24, m, n);
    }
}
