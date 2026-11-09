package minecraft;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.DataInput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class class07012 implements class01477<class07001> {
   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static class03154 L(DataInput var0, class03175 var1, class07726 var2) throws IOException {
      var2.y(48L);

      byte b0;
      label35:
      while ((b0 = var0.readByte()) != 0) {
         class01424<?> class01424 = class01465.N(b0);
         switch (var1.N(class01424)) {
            case field_36251:
               return class03154.field_36255;
            case field_36250:
               class07707.N(var0);
               class01424.y(var0, var2);
               break label35;
            case field_36249:
               class07707.N(var0);
               class01424.y(var0, var2);
               break;
            default:
               String s = i(var0, var2);
               switch (var1.N(class01424, s)) {
                  case field_36251:
                     return class03154.field_36255;
                  case field_36250:
                     class01424.y(var0, var2);
                     break label35;
                  case field_36249:
                     class01424.y(var0, var2);
                     break;
                  default:
                     var2.y(36L);
                     switch (class01424.N(var0, var1, var2)) {
                        case field_36255:
                           return class03154.field_36255;
                        case field_36254:
                     }
               }
         }
      }

      if (b0 != 0) {
         while ((b0 = var0.readByte()) != 0) {
            class07707.N(var0);
            class01465.N(b0).y(var0, var2);
         }
      }

      return var1.y();
   }

   private static HashMap L() {
      return null;
   }

   class07012() {
      super();
   }

   private static String i(DataInput var0, class07726 var1) throws IOException {
      String s = var0.readUTF();
      var1.y(28L);
      var1.N(2L, s.length());
      return s;
   }

   private static class07001 u(DataInput var0, class07726 var1) throws IOException {
      var1.y(48L);
      HashMap hashmap = L();
      Map map = N(hashmap);

      byte b0;
      while ((b0 = var0.readByte()) != 0) {
         String s = i(var0, var1);
         class07709 class07709 = class07001.N(class01465.N(b0), s, var0, var1);
         if (map.put(s, class07709) == null) {
            var1.y(36L);
         }
      }

      return new class07001(map);
   }

   @Override
   public void y(DataInput var1, class07726 var2) throws IOException {
      var2.u();

      byte b0;
      try {
         while ((b0 = var1.readByte()) != 0) {
            class07707.N(var1);
            class01465.N(b0).y(var1, var2);
         }
      } finally {
         var2.i();
      }
   }

   @Override
   public String y() {
      return "TAG_Compound";
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

   private static Map N(Map var0) {
      return new Object2ObjectOpenHashMap();
   }

   public class07001 L(DataInput var1, class07726 var2) throws IOException {
      var2.u();

      class07001 class07001;
      try {
         class07001 = u(var1, var2);
      } finally {
         var2.i();
      }

      return class07001;
   }

   @Override
   public String N() {
      return "COMPOUND";
   }
}
