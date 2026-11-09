package minecraft;

import java.io.DataInput;
import java.io.IOException;

class class07745 implements class01444<class07729> {
   @Override
   public int L() {
      return 8;
   }

   class07745() {
      super();
   }

   private static long u(DataInput var0, class07726 var1) throws IOException {
      var1.y(16L);
      return var0.readLong();
   }

   @Override
   public String y() {
      return "TAG_Long";
   }

   public class07729 L(DataInput var1, class07726 var2) throws IOException {
      return class07729.N(u(var1, var2));
   }

   @Override
   public String N() {
      return "LONG";
   }

   @Override
   public class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException {
      return var2.N(u(var1, var3));
   }
}
