package com.flexy.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.*;

public class KeyGeneratorUtil {

    private KeyPairGenerator keyGen;
    private KeyPair pair;
    private PrivateKey privateKey;
    private PublicKey publicKey;

    public KeyGeneratorUtil(int keylength) throws NoSuchAlgorithmException, NoSuchProviderException {
        this.keyGen = KeyPairGenerator.getInstance("RSA");
        this.keyGen.initialize(keylength);
    }

    public void createKeys() {
        this.pair = this.keyGen.generateKeyPair();
        this.privateKey = pair.getPrivate();
        this.publicKey = pair.getPublic();
    }

    public PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    public void writeToFile(String path, byte[] key) throws IOException {
        File  f = new File(path);
        f.getParentFile().mkdirs();

        FileOutputStream fos = new FileOutputStream(f);
        fos.write(key);
        fos.flush();
        fos.close();
    }

    public static void main(String[] args) {
        KeyGeneratorUtil keyGeneratorUtil;
        try {
            keyGeneratorUtil = new KeyGeneratorUtil(1024);
            keyGeneratorUtil.createKeys();
            System.out.println(" keyGeneratorUtil.getPublicKey() : "+ keyGeneratorUtil.getPublicKey().toString());
            System.out.println(" keyGeneratorUtil.privateKey() : "+ keyGeneratorUtil.getPrivateKey().toString());
            keyGeneratorUtil.writeToFile("KeyPair/publicKey.txt", keyGeneratorUtil.getPublicKey().getEncoded());
            keyGeneratorUtil.writeToFile("KeyPair/privateKey.txt", keyGeneratorUtil.getPrivateKey().getEncoded());
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

}
