package minecraft;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public enum class04481 implements class05033 {
   field_47383("inactive", 0, class04519.N, -1.0, false),
   field_47384("waiting_for_players", 4, class04519.y, 200.0, true),
   field_47385("active", 8, class04519.L, 1000.0, true),
   field_47386("waiting_for_reward_ejection", 8, class04519.y, -1.0, false),
   field_47387("ejecting_reward", 8, class04519.y, -1.0, false),
   field_47388("cooldown", 0, class04519.u, -1.0, false);

   private static final float field_47389 = 40.0F;
   private static final int field_47390 = class04995.y(30.0F);
   private final String field_47391;
   private final int field_47392;
   private final double field_47393;
   private final class04519 field_47394;
   private final boolean field_47395;

   public boolean L() {
      return this.field_47393 >= 0.0;
   }

   private class04481(String var3, int var4, class04519 var5, double var6, boolean var8) {
      this.field_47391 = var3;
      this.field_47392 = var4;
      this.field_47394 = var5;
      this.field_47393 = var6;
      this.field_47395 = var8;
   }

   public boolean u() {
      return this.field_47395;
   }

   public double y() {
      return this.field_47393;
   }

   class04481 N(class07209 var1, class04485 var2, class04782 var3) {
      class04479 class04479 = var2.B();
      class04513 class04513 = var2.N();

      return switch (this) {
         case field_47383 -> class04479.N(var2, var3, field_47384) == null ? this : field_47384;
         case field_47384 -> {
            if (!var2.N(var3)) {
               class04479.L();
               yield this;
            } else if (!class04479.N(var2, var3.field_9229)) {
               yield field_47383;
            } else {
               class04479.N(var3, var1, var2);
               yield class04479.N.isEmpty() ? this : field_47385;
            }
         }
         case field_47385 -> {
            if (!var2.N(var3)) {
               class04479.L();
               yield field_47384;
            } else if (!class04479.N(var2, var3.field_9229)) {
               yield field_47383;
            } else {
               int i = class04479.N(var1);
               class04479.N(var3, var1, var2);
               if (var2.u()) {
                  this.N(var3, var1, var2);
               }

               if (class04479.N(class04513, i)) {
                  if (class04479.u()) {
                     class04479.L = var3.N() + var2.i();
                     class04479.i = 0;
                     class04479.u = 0L;
                     yield field_47386;
                  }
               } else if (class04479.N(var3, class04513, i)) {
                  var2.L(var3, var1).ifPresent(var4x -> {
                     class04479.y.add(var4x);
                     class04479.i++;
                     class04479.u = var3.N() + class04513.B();
                     class04513.Z().N(var3.method_8409()).ifPresent(var2xx -> {
                        class04479.R = Optional.of(var2xx);
                        var2.Z();
                     });
                  });
               }

               yield this;
            }
         }
         case field_47386 -> {
            if (class04479.N(var3, 40.0F, var2.i())) {
               var3.N(null, var1, class04909.Pi, class04911.field_15245);
               yield field_47387;
            } else {
               yield this;
            }
         }
         case field_47387 -> {
            if (!class04479.y(var3, field_47390, var2.i())) {
               yield this;
            } else if (class04479.N.isEmpty()) {
               var3.N(null, var1, class04909.PR, class04911.field_15245);
               class04479.M = Optional.empty();
               yield field_47388;
            } else {
               if (class04479.M.isEmpty()) {
                  class04479.M = class04513.z().N(var3.method_8409());
               }

               class04479.M.ifPresent(var3x -> var2.N(var3, var1, (class05946<class05074>)var3x));
               class04479.N.remove(class04479.N.iterator().next());
               yield this;
            }
         }
         case field_47388 -> {
            class04479.N(var3, var1, var2);
            if (!class04479.N.isEmpty()) {
               class04479.i = 0;
               class04479.u = 0L;
               yield field_47385;
            } else if (class04479.N(var3)) {
               var2.y(var3, var1);
               class04479.y();
               yield field_47384;
            } else {
               yield this;
            }
         }
      };
   }

   private boolean N(class04782 var1, class04479 var2) {
      return var1.N() >= var2.L;
   }

   private void N(class04782 var1, class07209 var2, class04485 var3) {
      class04479 class04479 = var3.B();
      class04513 class04513 = var3.N();
      class06584 class06584 = class04479.N(var1, class04513, var2).N(var1.field_9229).orElse(class06584.E);
      if (!class06584.R()) {
         if (this.N(var1, class04479)) {
            N(var1, var2, var3, class04479).ifPresent(var4x -> {
               class02626 class02626 = class02626.N(var1, class06584);
               class02626.method_29495(var4x);
               var1.method_8649(class02626);
               float f = (var1.method_8409().z() - var1.method_8409().z()) * 0.2F + 1.0F;
               var1.method_8396(null, class07209.method_49638(var4x), class04909.mr, class04911.field_15245, 1.0F, f);
               class04479.L = var1.N() + var3.L().N();
            });
         }
      }
   }

   private static Optional<class06889> N(class07049 var0, class04782 var1) {
      class06889 class06889xx = var0.method_73189();
      class06889 class06889x = class06889xx.N(class07211.field_11036, (double)(var0.method_17682() + 2.0F + var1.field_9229.y(4)));
      class06889 class06889xx = var1.N(new class05862(class06889xx, class06889x, class05849.field_23142, class05835.field_1348, class06092.N()))
         .u()
         .method_46558()
         .N(class07211.field_11033, 1.0);
      class07209 class07209 = class07209.method_49638(class06889xx);
      return !var1.method_8320(class07209).M(var1, class07209).method_1110() ? Optional.empty() : Optional.of(class06889xx);
   }

   private static Optional<class06889> N(class04782 var0, class07209 var1, class04485 var2, class04479 var3) {
      List list = var3.N
         .stream()
         .map(var0::N)
         .filter(Objects::nonNull)
         .filter(
            var2x -> !var2x.method_68878() && !var2x.method_7325() && var2x.method_5805() && var2x.method_5707(var1.method_46558()) <= class04995.Z(var2.R())
         )
         .toList();
      if (list.isEmpty()) {
         return Optional.empty();
      } else {
         class07049 class07049 = N(list, var3.y, var2, var1, var0);
         return class07049 == null ? Optional.empty() : N(class07049, var0);
      }
   }

   @Nullable
   private static class07049 N(List<class08036> var0, Set<UUID> var1, class04485 var2, class07209 var3, class04782 var4) {
      Stream stream = var1.stream()
         .map(var4::method_66347)
         .filter(Objects::nonNull)
         .filter(var2x -> var2x.method_5805() && var2x.method_5707(var3.method_46558()) <= class04995.Z(var2.R()));
      List list = var4.field_9229.Z() ? stream.toList() : var0;
      if (list.isEmpty()) {
         return null;
      } else {
         return list.size() == 1 ? (class07049)list.getFirst() : class07536.N_77(list, var4.field_9229);
      }
   }

   public void N(class07299 var1, class07209 var2, boolean var3) {
      this.field_47394.emit(var1, var1.method_8409(), var2, var3);
   }

   public int N() {
      return this.field_47392;
   }

   @Override
   public String method_15434() {
      return this.field_47391;
   }
}
