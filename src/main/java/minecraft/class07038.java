package minecraft;

import java.io.DataInput;
import java.io.IOException;

class class07038 implements class01444<class07009> {
   @Override
   public int L() {
      return 4;
   }

   class07038() {
      super();
   }

   private static float u(DataInput var0, class07726 var1) throws IOException {
      var1.y(12L);
      return var0.readFloat();
   }

   @Override
   public String y() {
      return "TAG_Float";
   }

   public class07009 L(DataInput var1, class07726 var2) throws IOException {
      return class07009.N(u(var1, var2));
   }

   @Override
   public String N() {
      return "FLOAT";
   }

   @Override
   public class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException {
      return var2.N(u(var1, var3));
   }
}
