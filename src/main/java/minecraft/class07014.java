package minecraft;

import java.io.DataInput;
import java.io.IOException;

class class07014 implements class01444<class07019> {
   @Override
   public int L() {
      return 8;
   }

   class07014() {
      super();
   }

   private static double u(DataInput var0, class07726 var1) throws IOException {
      var1.y(16L);
      return var0.readDouble();
   }

   @Override
   public String y() {
      return "TAG_Double";
   }

   public class07019 L(DataInput var1, class07726 var2) throws IOException {
      return class07019.N(u(var1, var2));
   }

   @Override
   public String N() {
      return "DOUBLE";
   }

   @Override
   public class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException {
      return var2.N(u(var1, var3));
   }
}
