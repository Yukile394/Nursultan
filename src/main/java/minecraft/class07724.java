package minecraft;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;

class class07724 implements class01477<class07741> {
   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static class03154 L(DataInput var0, class03175 var1, class07726 var2) throws IOException {
      var2.y(36L);
      class01424<?> class01424 = class01465.N(var0.readByte());
      int i = N(var0);
      switch (var1.N(class01424, i)) {
         case field_36255:
            return class03154.field_36255;
         case field_36254:
            class01424.N(var0, i, var2);
            return var1.y();
         default:
            var2.N(4L, i);
            int j = 0;

            while (true) {
               label41: {
                  if (j < i) {
                     switch (var1.y(class01424, j)) {
                        case field_36251:
                           return class03154.field_36255;
                        case field_36250:
                           class01424.y(var0, var2);
                           break;
                        case field_36249:
                           class01424.y(var0, var2);
                           break label41;
                        default:
                           switch (class01424.N(var0, var1, var2)) {
                              case field_36255:
                                 return class03154.field_36255;
                              case field_36254:
                                 break;
                              default:
                                 break label41;
                           }
                     }
                  }

                  int k = i - 1 - j;
                  if (k > 0) {
                     class01424.N(var0, k, var2);
                  }

                  return var1.y();
               }

               j++;
            }
      }
   }

   class07724() {
      super();
   }

   private static class07741 u(DataInput var0, class07726 var1) throws IOException {
      var1.y(36L);
      byte b0 = var0.readByte();
      int i = N(var0);
      if (b0 == 0 && i > 0) {
         throw new class03140("Missing type on ListTag");
      } else {
         var1.N(4L, i);
         class01424<?> class01424 = class01465.N(b0);
         class07741 class07741 = new class07741(new ArrayList<>(i));

         for (int j = 0; j < i; j++) {
            class07741.N(class01424.L(var0, var1));
         }

         return class07741;
      }
   }

   @Override
   public String y() {
      return "TAG_List";
   }

   @Override
   public void y(DataInput var1, class07726 var2) throws IOException {
      var2.u();

      try {
         class01424<?> class01424 = class01465.N(var1.readByte());
         int i = var1.readInt();
         class01424.N(var1, i, var2);
      } finally {
         var2.i();
      }
   }

   @Override
   public String N() {
      return "LIST";
   }

   private static int N(DataInput var0) throws IOException {
      int i = var0.readInt();
      if (i < 0) {
         throw new class03140("ListTag length cannot be negative: " + i);
      } else {
         return i;
      }
   }

   @Override
   public class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException {
      var3.u();

      class03154 class03154;
      try {
         class03154 = L(var1, var2, var3);
      } finally {
         var3.i();
      }

      return class03154;
   }

   public class07741 L(DataInput var1, class07726 var2) throws IOException {
      var2.u();

      class07741 class07741;
      try {
         class07741 = u(var1, var2);
      } finally {
         var2.i();
      }

      return class07741;
   }
}
