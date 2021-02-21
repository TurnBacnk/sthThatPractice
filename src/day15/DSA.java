package day15;

import org.apache.commons.codec.binary.Hex;

import java.security.*;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;


public class DSA {
    private static String src = "dsa 123";

    public static void main(String[] args) throws Exception {
        jdkDSA();
    }
    //302c021476c4996c6c3b59826151c483b5db34deae0688b302140790f65d6bca26f3539f4867f6bb82ec554b349c
    //302c02141a430af7c60d129f7d8dcd2c6227865982343d7802144de113b217a3e1f83a7a0be90e117b4965aecb5b
    public static void jdkDSA() throws Exception {
        //1.初始化密钥
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(512);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        DSAPublicKey dsaPublicKey = (DSAPublicKey) keyPair.getPublic();
        DSAPrivateKey dsaPrivateKey = (DSAPrivateKey) keyPair.getPrivate();

        //2.执行签名
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(dsaPrivateKey.getEncoded());
        KeyFactory keyFactory = KeyFactory.getInstance("DSA");
        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
        Signature signature = Signature.getInstance("SHA1withDSA");
        signature.initSign(privateKey);
        signature.update(src.getBytes());
        byte[] res = signature.sign();
        System.out.println("签名：" + Hex.encodeHexString(res));

        //3.验证签名
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(dsaPublicKey.getEncoded());
        keyFactory = KeyFactory.getInstance("DSA");
        PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
        signature = Signature.getInstance("SHA1withDSA");
        signature.initVerify(publicKey);
        signature.update(src.getBytes());
        boolean bool = signature.verify(res);
        System.out.println("验证：" + bool);

    }
}

