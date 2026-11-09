package minecraft;

import java.io.DataInput;
import java.io.IOException;

class class07738 implements class01477<class07707> {
   class07738() {
      super();
   }

   private static String u(DataInput var0, class07726 var1) throws IOException {
      var1.y(36L);
      String s = var0.readUTF();
      var1.N(2L, s.length());
      return s;
   }

   @Override
   public String y() {
      return "TAG_String";
   }

   @Override
   public void y(DataInput var1, class07726 var2) throws IOException {
      class07707.N(var1);
   }

   @Override
   public class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException {
      return var2.N(u(var1, var3));
   }

   @Override
   public String N() {
      return "STRING";
   }

   public class07707 L(DataInput var1, class07726 var2) throws IOException {
      return class07707.N(u(var1, var2));
   }
}
