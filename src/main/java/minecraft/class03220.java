package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03220 {
   private static final Logger i = LogUtils.getLogger();
   public static final Codec<class03220> N = class06338.L(class01392.N, class06338.y(class01392.N.listOf())).xmap(class03220::new, $$0 -> $$0.M);
   public static final class02362<class04247, class03220> y = class02362.N(class01392.y.N_33(class02389.N()), $$0 -> $$0.M, class03220::new);
   public static final class00392 L = class00392.L("item.canBreak").N(class06541.field_1080);
   public static final class00392 u = class00392.L("item.canPlace").N(class06541.field_1080);
   private static final class00392 R = class00392.L("item.canUse.unknown").N(class06541.field_1080);
   private final List<class01392> M;
   @Nullable
   private List<class00392> B;
   @Nullable
   private class06646 Z;
   private boolean z;
   private boolean U;

   public class03220(List<class01392> var1) {
      super();
      this.M = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof class03220 class03220 ? this.M.equals(class03220.M) : false;
      }
   }

   @Override
   public String toString() {
      return "AdventureModePredicate{predicates=" + this.M + "}";
   }

   @Override
   public int hashCode() {
      return this.M.hashCode();
   }

   private static class07001 N(class00394 var0, class01042 var1, class04490 var2) {
      class08303 class08303 = class08303.N(var2.N_46(var0.J()), var1);
      var0.u(class08303);
      return class08303.y();
   }

   public void N(Consumer<class00392> var1) {
      this.N().forEach(var1);
   }

   private static List<class00392> N(List<class01392> var0) {
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         if (((class01392)iterator.next()).y().isEmpty()) {
            return List.of(R);
         }
      }

      return var0.stream().flatMap(var0x -> var0x.y().orElseThrow().N()).distinct().map(var0x -> var0x.N().M().N(class06541.field_1063)).toList();
   }

   private static boolean N(class06646 var0, @Nullable class06646 var1, boolean var2) {
      if (var1 == null || var0.N() != var1.N()) {
         return false;
      } else if (!var2) {
         return true;
      } else if (var0.y() == null && var1.y() == null) {
         return true;
      } else if (var0.y() != null && var1.y() != null) {
         boolean flag;
         try (class04495 class04495 = new class04495(i)) {
            class01042 class01042 = var0.L().method_30349();
            class07001 class07001x = N(var0.y(), class01042, class04495);
            class07001 class07001x = N(var1.y(), class01042, class04495);
            flag = Objects.equals(class07001x, class07001x);
         }

         return flag;
      } else {
         return false;
      }
   }

   private List<class00392> N() {
      if (this.B == null) {
         this.B = N(this.M);
      }

      return this.B;
   }

   public boolean N(class06646 var1) {
      if (N(var1, this.Z, this.U)) {
         return this.z;
      } else {
         this.Z = var1;
         this.U = false;

         for (class01392 class01392 : this.M) {
            if (class01392.N(var1)) {
               this.U = this.U | class01392.N();
               this.z = true;
               return true;
            }
         }

         this.z = false;
         return false;
      }
   }
}
