package EncrptTest;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.sun.istack.internal.logging.Logger;
import com.sun.xml.internal.ws.util.StringUtils;

public class AESUtil {
    private static final Logger logger = Logger.getLogger(AESUtil.class);
    private static final String defaultCharset = "UTF-8";
    private static final String KEY_AES = "AES";
    private static final String KEY = "123456";
  /**
   * ����
   *
   * @param data ��Ҫ���ܵ�����
   * @param key ��������
   * @return
   */
  public static String encrypt(String data, String key) {
      return doAES(data, key, Cipher.ENCRYPT_MODE);
  }

  /**
   * ����
   *
   * @param data ����������
   * @param key ������Կ
   * @return
   */
  public static String decrypt(String data, String key) {
      return doAES(data, key, Cipher.DECRYPT_MODE);
  }

  /**
   * �ӽ���
   *
   * @param data ����������
   * @param password  ��Կ
   * @param mode �ӽ���mode
   * @return
   */
  private static String doAES(String data, String key, int mode) {
      try {
          if (isBlank(data) || isBlank(key)) {
              return null;
          }
          //�ж��Ǽ��ܻ��ǽ���
          boolean encrypt = mode == Cipher.ENCRYPT_MODE;
          byte[] content;
          //true �������� false ��������
          if (encrypt) {
              content = data.getBytes(defaultCharset);
          } else {
              content = parseHexStr2Byte(data);
          }
          //1.������Կ��������ָ��ΪAES�㷨,�����ִ�Сд
          KeyGenerator kgen = KeyGenerator.getInstance(KEY_AES);
          //2.����ecnodeRules�����ʼ����Կ������
          //����һ��128λ�����Դ,���ݴ�����ֽ�����
          kgen.init(128, new SecureRandom(key.getBytes()));
          //3.����ԭʼ�Գ���Կ
          SecretKey secretKey = kgen.generateKey();
          //4.���ԭʼ�Գ���Կ���ֽ�����
          byte[] enCodeFormat = secretKey.getEncoded();
          //5.�����ֽ���������AES��Կ
          SecretKeySpec keySpec = new SecretKeySpec(enCodeFormat, KEY_AES);
          //6.����ָ���㷨AES�Գ�������
          Cipher cipher = Cipher.getInstance(KEY_AES);// ����������
          //7.��ʼ������������һ������Ϊ����(Encrypt_mode)���߽��ܽ���(Decrypt_mode)�������ڶ�������Ϊʹ�õ�KEY
          cipher.init(mode, keySpec);// ��ʼ��
          byte[] result = cipher.doFinal(content);
          if (encrypt) {
              //��������ת����16����
              return parseByte2HexStr(result);
          } else {
              return new String(result, defaultCharset);
          }
      } catch (Exception e) {
          System.out.println("AES ���Ĵ����쳣"+e.getLocalizedMessage());
      }
      return null;
  }
  /**
   * ��������ת����16����
   *
   * @param buf
   * @return
   */
  public static String parseByte2HexStr(byte buf[]) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < buf.length; i++) {
          String hex = Integer.toHexString(buf[i] & 0xFF);
          if (hex.length() == 1) {
              hex = '0' + hex;
          }
          sb.append(hex.toUpperCase());
      }
      return sb.toString();
  }
  /**
   * ��16����ת��Ϊ������
   *
   * @param hexStr
   * @return
   */
  public static byte[] parseHexStr2Byte(String hexStr) {
      if (hexStr.length() < 1) {
          return null;
      }
      byte[] result = new byte[hexStr.length() / 2];
      for (int i = 0; i < hexStr.length() / 2; i++) {
          int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
          int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
          result[i] = (byte) (high * 16 + low);
      }
      return result;
  }
  
  public static void main(String[] args) throws Exception {  
      String content = "{'repairPhone':'18547854787','customPhone':'12365478965','captchav':'58m7'}";  
      System.out.println("����ǰ��" + content);  
      System.out.println("������Կ�ͽ�����Կ��" + KEY);  
      String encrypt = encrypt(content, KEY);  
      System.out.println("���ܺ�" + encrypt);  
      String decrypt = decrypt(encrypt, KEY);  
      System.out.println("���ܺ�" + decrypt);  
  } 
  
  public static boolean isBlank(String str)
  {
	  if(str == null || str.equals(""))
	  {
		  return true;
	  }
	  return false;
  }
}
