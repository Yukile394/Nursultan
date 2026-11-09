package minecraft;

import java.io.DataInput;
import java.io.IOException;

class class07727 implements class01477<class07757> {
   class07727() {
      super();
   }

   private static long[] u(DataInput var0, class07726 var1) throws IOException {
      var1.y(24L);
      int i = var0.readInt();
      var1.N(8L, i);
      long[] along = new long[i];

      for (int j = 0; j < i; j++) {
         along[j] = var0.readLong();
      }

      return along;
   }

   @Override
   public String y() {
      return "TAG_Long_Array";
   }

   @Override
   public void y(DataInput var1, class07726 var2) throws IOException {
      var1.skipBytes(var1.readInt() * 8);
   }

   @Override
   public class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException {
      return var2.N(u(var1, var3));
   }

   @Override
   public String N() {
      return "LONG[]";
   }

   public class07757 L(DataInput var1, class07726 var2) throws IOException {
      return new class07757(u(var1, var2));
   }
}
