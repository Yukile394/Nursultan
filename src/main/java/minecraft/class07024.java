package minecraft;

import java.io.DataInput;
import java.io.IOException;

class class07024 implements class01477<class06995> {
   class07024() {
      super();
   }

   private static int[] u(DataInput var0, class07726 var1) throws IOException {
      var1.y(24L);
      int i = var0.readInt();
      var1.N(4L, i);
      int[] aint = new int[i];

      for (int j = 0; j < i; j++) {
         aint[j] = var0.readInt();
      }

      return aint;
   }

   @Override
   public String y() {
      return "TAG_Int_Array";
   }

   @Override
   public void y(DataInput var1, class07726 var2) throws IOException {
      var1.skipBytes(var1.readInt() * 4);
   }

   @Override
   public class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException {
      return var2.N(u(var1, var3));
   }

   @Override
   public String N() {
      return "INT[]";
   }

   public class06995 L(DataInput var1, class07726 var2) throws IOException {
      return new class06995(u(var1, var2));
   }
}
