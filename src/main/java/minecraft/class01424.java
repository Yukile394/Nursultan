package minecraft;

import Nursultan.class09471;
import java.io.DataInput;
import java.io.IOException;

public interface class01424<T extends class07709> {
   T L(DataInput var1, class07726 var2) throws IOException;

   String y();

   void y(DataInput var1, class07726 var2) throws IOException;

   default void y(DataInput var1, class03175 var2, class07726 var3) throws IOException {
      switch (var2.y(this)) {
         case field_36253:
            this.N(var1, var2, var3);
         case field_36255:
         default:
            break;
         case field_36254:
            this.y(var1, var3);
      }
   }

   static class01424<class06997> N(int var0) {
      return new class09471(var0);
   }

   class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException;

   String N();

   void N(DataInput var1, int var2, class07726 var3) throws IOException;
}
