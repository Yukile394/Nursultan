package minecraft;

import java.io.DataInput;
import java.io.IOException;

class class07035 implements class01477<class07029> {
   class07035() {
      super();
   }

   private static byte[] u(DataInput var0, class07726 var1) throws IOException {
      var1.y(24L);
      int i = var0.readInt();
      var1.N(1L, i);
      byte[] abyte = new byte[i];
      var0.readFully(abyte);
      return abyte;
   }

   @Override
   public String y() {
      return "TAG_Byte_Array";
   }

   @Override
   public void y(DataInput var1, class07726 var2) throws IOException {
      var1.skipBytes(var1.readInt() * 1);
   }

   @Override
   public class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException {
      return var2.N(u(var1, var3));
   }

   @Override
   public String N() {
      return "BYTE[]";
   }

   public class07029 L(DataInput var1, class07726 var2) throws IOException {
      return new class07029(u(var1, var2));
   }
}
