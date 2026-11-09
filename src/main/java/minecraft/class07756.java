package minecraft;

import java.io.DataInput;
import java.io.IOException;

class class07756 implements class01444<class07720> {
   @Override
   public int L() {
      return 4;
   }

   class07756() {
      super();
   }

   private static int u(DataInput var0, class07726 var1) throws IOException {
      var1.y(12L);
      return var0.readInt();
   }

   @Override
   public String y() {
      return "TAG_Int";
   }

   public class07720 L(DataInput var1, class07726 var2) throws IOException {
      return class07720.N(u(var1, var2));
   }

   @Override
   public String N() {
      return "INT";
   }

   @Override
   public class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException {
      return var2.N(u(var1, var3));
   }
}
