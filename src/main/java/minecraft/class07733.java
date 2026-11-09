package minecraft;

import java.io.DataInput;
import java.io.IOException;

class class07733 implements class01444<class07730> {
   @Override
   public int L() {
      return 2;
   }

   class07733() {
      super();
   }

   private static short u(DataInput var0, class07726 var1) throws IOException {
      var1.y(10L);
      return var0.readShort();
   }

   @Override
   public String y() {
      return "TAG_Short";
   }

   public class07730 L(DataInput var1, class07726 var2) throws IOException {
      return class07730.N(u(var1, var2));
   }

   @Override
   public String N() {
      return "SHORT";
   }

   @Override
   public class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException {
      return var2.N(u(var1, var3));
   }
}
