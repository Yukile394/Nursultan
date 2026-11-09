package minecraft;

import java.io.DataInput;
import java.io.IOException;

class class07026 implements class01444<class07037> {
   @Override
   public int L() {
      return 1;
   }

   class07026() {
      super();
   }

   private static byte u(DataInput var0, class07726 var1) throws IOException {
      var1.y(9L);
      return var0.readByte();
   }

   @Override
   public String y() {
      return "TAG_Byte";
   }

   public class07037 L(DataInput var1, class07726 var2) throws IOException {
      return class07037.N(u(var1, var2));
   }

   @Override
   public String N() {
      return "BYTE";
   }

   @Override
   public class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException {
      return var2.N(u(var1, var3));
   }
}
