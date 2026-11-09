package minecraft;

import com.mojang.logging.LogUtils;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class04932 {
   public static final String N = "INVALID";
   public static final class04932 y = new class04932(null, new class07321(0, 0), 0, new class03300(List.of()));
   private static final Logger L = LogUtils.getLogger();
   private final class04748 u;
   private final class03300 i;
   private final class07321 R;
   private int M;
   @Nullable
   private volatile class05163 B;

   public class07321 L() {
      return this.R;
   }

   protected int M() {
      return 1;
   }

   public class04932(class04748 var1, class07321 var2, int var3, class03300 var4) {
      super();
      this.u = var1;
      this.R = var2;
      this.M = var3;
      this.i = var4;
   }

   public class04748 B() {
      return this.u;
   }

   public List<class04890> Z() {
      return this.i.L();
   }

   public void i() {
      this.M++;
   }

   public boolean u() {
      return this.M < this.M();
   }

   public boolean y() {
      return !this.i.N();
   }

   @Nullable
   public static class04932 N(class03298 var0, class07001 var1, long var2) {
      String s = var1.y("id", "");
      if ("INVALID".equals(s)) {
         return y;
      } else {
         class04748 class04748 = var0.y().L(class04227.yj).N(class01894.N(s));
         if (class04748 == null) {
            L.error("Unknown stucture id: {}", s);
            return null;
         } else {
            class07321 class07321 = new class07321(var1.y("ChunkX", 0), var1.y("ChunkZ", 0));
            int ix = var1.y("references", 0);
            class07741 class07741 = var1.s("Children");

            try {
               class03300 class03300 = class03300.N(class07741, var0);
               if (class04748 instanceof class06198) {
                  class03300 = class06198.N(class07321, var2, class03300);
               }

               return new class04932(class04748, class07321, ix, class03300);
            } catch (Exception exception) {
               L.error("Failed Start with id {}", s, exception);
               return null;
            }
         }
      }
   }

   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6) {
      List<class04890> list = this.i.L();
      if (!list.isEmpty()) {
         class05163 class05163 = list.get(0).k;
         class07209 class07209x = class05163.M();
         class07209 class07209x = new class07209(class07209x.method_10263(), class05163.Z(), class07209x.method_10260());

         for (class04890 class04890 : list) {
            if (class04890.L().N(var5)) {
               class04890.N(var1, var2, var3, var4, var5, var6, class07209x);
            }
         }

         this.u.N(var1, var2, var3, var4, var5, var6, this.i);
      }
   }

   public class05163 N() {
      class05163 class05163 = this.B;
      if (class05163 == null) {
         class05163 = this.u.N(this.i.y());
         this.B = class05163;
      }

      return class05163;
   }

   public class07001 N(class03298 var1, class07321 var2) {
      class07001 class07001 = new class07001();
      if (this.y()) {
         class07001.N_67("id", var1.y().L(class04227.yj).y(this.u).toString());
         class07001.N("ChunkX", var2.B);
         class07001.N("ChunkZ", var2.Z);
         class07001.N("references", this.M);
         class07001.N("Children", this.i.N(var1));
         return class07001;
      } else {
         class07001.N_67("id", "INVALID");
         return class07001;
      }
   }

   public int R() {
      return this.M;
   }
}
