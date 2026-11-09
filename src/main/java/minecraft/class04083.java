package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class class04083 {
   private static final ObjectArrayList<class00753> u = class07536.N(
      new ObjectArrayList(18),
      var0 -> class07209.method_20437(new class07209(-1, -1, -1), new class07209(1, 1, 1))
         .filter(var0x -> (var0x.method_10263() == 0 || var0x.method_10264() == 0 || var0x.method_10260() == 0) && !var0x.equals(class07209.field_10980))
         .map(class07209::method_10062)
         .forEach(var0::add)
   );
   public static final int N = 1;
   private class07209 i;
   int y;
   private int R;
   private int M;
   @Nullable
   private Set<class07211> B;
   private static final Codec<Set<class07211>> Z = class07211.field_29502.listOf().xmap(var0 -> Sets.newEnumSet(var0, class07211.class), Lists::newArrayList);
   public static final Codec<class04083> L = RecordCodecBuilder.create(
      var0 -> var0.group(
            class07209.field_25064.fieldOf("pos").forGetter(class04083::N),
            Codec.intRange(0, 1000).fieldOf("charge").orElse(0).forGetter(class04083::y),
            Codec.intRange(0, 1).fieldOf("decay_delay").orElse(1).forGetter(class04083::L),
            Codec.intRange(0, Integer.MAX_VALUE).fieldOf("update_delay").orElse(0).forGetter(var0x -> var0x.R),
            Z.lenientOptionalFieldOf("facings").forGetter(var0x -> Optional.ofNullable(var0x.u()))
         )
         .apply(var0, class04083::new)
   );

   public int L() {
      return this.M;
   }

   private class04083(class07209 var1, int var2, int var3, int var4, Optional<Set<class07211>> var5) {
      super();
      this.i = var1;
      this.y = var2;
      this.M = var3;
      this.R = var4;
      this.B = (Set<class07211>)var5.orElse(null);
   }

   public class04083(class07209 var1, int var2) {
      this(var1, var2, 1, 0, Optional.empty());
   }

   @Nullable
   public Set<class07211> u() {
      return this.B;
   }

   public int y() {
      return this.y;
   }

   public class07209 N() {
      return this.i;
   }

   private static boolean N(class07284 var0, class07209 var1, class07211 var2) {
      class07209 class07209 = var1.method_10093(var2);
      return !var0.method_8320(class07209).L(var0, class07209, var2.b());
   }

   private static List<class00753> N(class06069 var0) {
      return class07536.N(u, var0);
   }

   private static class04065 N(class00500 var0) {
      class00891 class00891 = var0.i();
      return class00891 instanceof class04065 ? (class04065)class00891 : class04065.y_;
   }

   void N(class04083 var1) {
      this.y = this.y + var1.y;
      var1.y = 0;
      this.R = Math.min(this.R, var1.R);
   }

   public void N(class07284 var1, class07209 var2, class06069 var3, class04076 var4, boolean var5) {
      if (this.N(var1, var2, var4.R)) {
         if (this.R > 0) {
            this.R--;
         } else {
            class00500 class00500 = var1.method_8320(this.i);
            class04065 class04065 = N(class00500);
            if (var5 && class04065.N(var1, this.i, class00500, this.B, var4.B())) {
               if (class04065.u()) {
                  class00500 = var1.method_8320(this.i);
                  class04065 = N(class00500);
               }

               var1.method_8396(null, this.i, class04909.dX, class04911.field_15245, 1.0F, 1.0F);
            }

            this.y = class04065.N(this, var1, var2, var3, var4, var5);
            if (this.y <= 0) {
               class04065.N(var1, class00500, this.i, var3);
            } else {
               class07209 class07209 = N(var1, this.i, var3);
               if (class07209 != null) {
                  class04065.N(var1, class00500, this.i, var3);
                  this.i = class07209.method_10062();
                  if (var4.B() && !this.i.method_19771(new class00753(var2.method_10263(), this.i.method_10264(), var2.method_10260()), 15.0)) {
                     this.y = 0;
                     return;
                  }

                  class00500 = var1.method_8320(class07209);
               }

               if (class00500.i() instanceof class04065) {
                  this.B = class05543.U(class00500);
               }

               this.M = class04065.f_(this.M);
               this.R = class04065.L();
            }
         }
      }
   }

   private boolean N(class07284 var1, class07209 var2, boolean var3) {
      if (this.y <= 0) {
         return false;
      } else if (var3) {
         return true;
      } else {
         return var1 instanceof class04782 ? ((class04782)var1).method_41411(var2) : false;
      }
   }

   boolean N(class07209 var1) {
      return this.i.method_65076(var1) > 1024;
   }

   @Nullable
   private static class07209 N(class07284 var0, class07209 var1, class06069 var2) {
      class07218 class07218x = var1.method_25503();
      class07218 class07218x = var1.method_25503();

      for (class00753 class00753 : N(var2)) {
         class07218x.N(var1, class00753);
         class00500 class00500 = var0.method_8320(class07218x);
         if (class00500.i() instanceof class04065 && N(var0, var1, class07218x)) {
            class07218x.N(class07218x);
            if (class04063.N(var0, class00500, class07218x)) {
               break;
            }
         }
      }

      return class07218x.equals(var1) ? null : class07218x;
   }

   private static boolean N(class07284 var0, class07209 var1, class07209 var2) {
      if (var1.method_19455(var2) == 1) {
         return true;
      } else {
         class07209 class07209 = var2.method_10059(var1);
         class07211 class07211xx = class07211.N(class07185.field_11048, class07209.method_10263() < 0 ? class07212.field_11060 : class07212.field_11056);
         class07211 class07211x = class07211.N(class07185.field_11052, class07209.method_10264() < 0 ? class07212.field_11060 : class07212.field_11056);
         class07211 class07211xx = class07211.N(class07185.field_11051, class07209.method_10260() < 0 ? class07212.field_11060 : class07212.field_11056);
         if (class07209.method_10263() == 0) {
            return N(var0, var1, class07211x) || N(var0, var1, class07211xx);
         } else {
            return class07209.method_10264() == 0
               ? N(var0, var1, class07211xx) || N(var0, var1, class07211xx)
               : N(var0, var1, class07211xx) || N(var0, var1, class07211x);
         }
      }
   }
}
