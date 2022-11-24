package com.example.CifradoDao.Logic;

// Entities
import com.example.CifradoDao.Entities.ResponseList;
import com.example.CifradoDao.Entities.RequestList;
import org.springframework.stereotype.Service;

// Librerias - Logica
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

//Libreria - encriptado
import java.util.Base64;


@Service
public class CifradoDaoLogic {

    private Cipher cipher;

    public ResponseList EncripList(RequestList input) throws Exception {

        ResponseList resp = new ResponseList();

        List<String> inputList = input.getInputList();
        String publickey = input.getPublicKey();
        PublicKey keyPublic = createKeyPublic(publickey);

        List<String> outputList = new ArrayList<>();

        Iterator<String> itList = inputList.iterator();
        while (itList.hasNext()) {
            String txtDecrip = itList.next();
            String txtEncrip = encryptMessage(txtDecrip, keyPublic);
            outputList.add(txtEncrip);
        }

        resp.setOutputList(outputList);
        resp.setResult("0");
        resp.setResultDescription("Consulta Exitosa");

        return resp;
    }

    public PrivateKey createKeyPrivate(String privatekey) {
        byte[] keyPriv = Base64.getDecoder().decode(privatekey);
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyPriv);
        PrivateKey privKy = null;
        try {
            KeyFactory kf = KeyFactory.getInstance("RSA");
            privKy = kf.generatePrivate(spec);
        } catch (InvalidKeySpecException|NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return privKy;
    }

    public PublicKey createKeyPublic(String publickey) {
        byte[] keyPub = Base64.getDecoder().decode(publickey);
        PublicKey pubKey = null;
        try {
            this.cipher = Cipher.getInstance("RSA");
            X509EncodedKeySpec spec = new X509EncodedKeySpec(keyPub);

            KeyFactory kf = KeyFactory.getInstance("RSA");
            pubKey = kf.generatePublic(spec);
        } catch (NoSuchAlgorithmException e) {

            e.printStackTrace();
        } catch (InvalidKeySpecException e) {

            e.printStackTrace();
        } catch (NoSuchPaddingException e) {

            e.printStackTrace();
        }

        return pubKey;
    }

    public String decryptMessage(String encryptedText, PrivateKey privKy) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(2, privKy);
        return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedText)));
    }

    public String encryptMessage(String plainText, PublicKey pubKy) {

        String encriptado = "";
        try {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(1, pubKy);
            encriptado = Base64.getEncoder().encodeToString(cipher.doFinal(plainText.getBytes()));
        } catch (NoSuchAlgorithmException e) {

            e.printStackTrace();
        } catch (NoSuchPaddingException e) {

            e.printStackTrace();
        } catch (InvalidKeyException e) {

            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {

            e.printStackTrace();
        } catch (BadPaddingException e) {

            e.printStackTrace();
        }

        return encriptado;
    }
}
