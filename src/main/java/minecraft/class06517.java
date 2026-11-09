package minecraft;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record class06517(Optional<class03556<class06525>> potion, Optional<Integer> customColor, List<class07055> customEffects, Optional<String> customName)
   implements class02694,
   class08237 {
   public static final class06517 N = new class06517(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final class00392 Z = class00392.L("effect.none").N(class06541.field_1080);
   public static final int y = -13083194;
   private static final Codec<class06517> z = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06525.N.optionalFieldOf("potion").forGetter(class06517::i),
            Codec.INT.optionalFieldOf("custom_color").forGetter(class06517::R),
            class07055.u.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(class06517::u),
            Codec.STRING.optionalFieldOf("custom_name").forGetter(class06517::M)
         )
         .apply(var0, class06517::new)
   );
   public static final Codec<class06517> L = Codec.withAlternative(z, class06525.N, class06517::new);
   public static final class02362<class04247, class06517> u = class02362.N(
      class06525.y.N_33(class02389::N),
      class06517::i,
      class02389.M.N_33(class02389::N),
      class06517::R,
      class07055.i.N_33(class02389.N()),
      class06517::u,
      class02389.s.N_33(class02389::N),
      class06517::M,
      class06517::new
   );

   public boolean L() {
      return !this.customEffects.isEmpty() ? true : this.potion.isPresent() && !this.potion.get().N().N().isEmpty();
   }

   public Optional<String> M() {
      return this.customName;
   }

   public class06517(Optional<class03556<class06525>> potion, Optional<Integer> customColor, List<class07055> customEffects, Optional<String> customName) {
      super();
      this.potion = potion;
      this.customColor = customColor;
      this.customEffects = customEffects;
      this.customName = customName;
   }

   public class06517(class03556<class06525> var1) {
      this(Optional.of(var1), Optional.empty(), List.of(), Optional.empty());
   }

   public Optional<class03556<class06525>> i() {
      return this.potion;
   }

   public List<class07055> u() {
      return Lists.transform(this.customEffects, class07055::new);
   }

   public class06517 y(class03556<class06525> var1) {
      return new class06517(Optional.of(var1), this.customColor, this.customEffects, this.customName);
   }

   public int y() {
      return this.N(-13083194);
   }

   public static void N(Iterable<class07055> var0, Consumer<class00392> var1, float var2, float var3) {
      ArrayList arraylist = Lists.newArrayList();
      boolean flag = true;

      for (class07055 class07055 : var0) {
         flag = false;
         class03556<class07084> class03556 = class07055.L();
         int i = class07055.i();
         class03556.N().N(i, (var1x, var2x) -> arraylist.add(new Pair(var1x, var2x)));
         class05216 class05216 = N(class03556, i);
         if (!class07055.N(20)) {
            class05216 = class00392.N("potion.withDuration", class05216, class07063.N(class07055, var2, var3));
         }

         var1.accept(class05216.N(class03556.N().B().N()));
      }

      if (flag) {
         var1.accept(Z);
      }

      if (!arraylist.isEmpty()) {
         var1.accept(class05220.N);
         var1.accept(class00392.L("potion.whenDrank").N(class06541.field_1064));

         for (Pair pair : arraylist) {
            class07471 class07471 = (class07471)pair.getSecond();
            double d1 = class07471.y();
            double d0;
            if (class07471.L() != class07463.field_6330 && class07471.L() != class07463.field_6331) {
               d0 = class07471.y();
            } else {
               d0 = class07471.y() * 100.0;
            }

            if (d1 > 0.0) {
               var1.accept(
                  class00392.N(
                        "attribute.modifier.plus." + class07471.L().N(),
                        class02833.u.format(d0),
                        class00392.L(((class07468)((class03556)pair.getFirst()).N()).L())
                     )
                     .N(class06541.field_1078)
               );
            } else if (d1 < 0.0) {
               d0 *= -1.0;
               var1.accept(
                  class00392.N(
                        "attribute.modifier.take." + class07471.L().N(),
                        class02833.u.format(d0),
                        class00392.L(((class07468)((class03556)pair.getFirst()).N()).L())
                     )
                     .N(class06541.field_1061)
               );
            }
         }
      }
   }

   public boolean N(class03556<class06525> var1) {
      return this.potion.isPresent() && this.potion.get().N(var1) && this.customEffects.isEmpty();
   }

   public static class06584 N(class06581 var0, class03556<class06525> var1) {
      class06584 class06584 = new class06584(var0);
      class06584.N(class02484.h, new class06517(var1));
      return class06584;
   }

   public void N(class07438 var1, float var2) {
      if (var1.method_73183() instanceof class04782 class04782) {
         class08036 class08036 = var1 instanceof class08036 ? (class08036)var1 : null;
         this.N(var3x -> {
            if (var3x.L().N().N()) {
               var3x.L().N().N(class04782, class08036, class08036, var1, var3x.i(), 1.0);
            } else {
               var1.method_6092(var3x);
            }
         }, var2);
      }
   }

   public void N(Consumer<class07055> var1, float var2) {
      if (this.potion.isPresent()) {
         for (class07055 class07055x : this.potion.get().N().N()) {
            var1.accept(class07055x.N(var2));
         }
      }

      for (class07055 class07055 : this.customEffects) {
         var1.accept(class07055.N(var2));
      }
   }

   public static OptionalInt N(Iterable<class07055> var0) {
      int i = 0;
      int j = 0;
      int k = 0;
      int l = 0;

      for (class07055 class07055 : var0) {
         if (class07055.M()) {
            int i1 = class07055.L().N().Z();
            int j1 = class07055.i() + 1;
            i += j1 * class02566.L(i1);
            j += j1 * class02566.u(i1);
            k += j1 * class02566.i(i1);
            l += j1;
         }
      }

      return l == 0 ? OptionalInt.empty() : OptionalInt.of(class02566.N(i / l, j / l, k / l));
   }

   public class00392 N(String var1) {
      String s = this.customName.or(() -> this.potion.map(var0 -> var0.N().y())).orElse("empty");
      return class00392.L(var1 + s);
   }

   public int N(int var1) {
      return this.customColor.isPresent() ? this.customColor.get() : N(this.N()).orElse(var1);
   }

   public class06517 N(class07055 var1) {
      return new class06517(this.potion, this.customColor, class07536.N(this.customEffects, var1), this.customName);
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      N(this.N(), var2, var4.a_(class02484.r, 1.0F), var1.y());
   }

   @Override
   public void N(class07299 var1, class07438 var2, class06584 var3, class08209 var4) {
      this.N(var2, var3.a_(class02484.r, 1.0F));
   }

   public static class05216 N(class03556<class07084> var0, int var1) {
      class05216 class05216 = class00392.L(((class07084)var0.N()).R());
      return var1 > 0 ? class00392.N("potion.withAmplifier", class05216, class00392.L("potion.potency." + var1)) : class05216;
   }

   public Iterable<class07055> N() {
      if (this.potion.isEmpty()) {
         return this.customEffects;
      } else {
         return (Iterable<class07055>)(this.customEffects.isEmpty()
            ? this.potion.get().N().N()
            : Iterables.concat(this.potion.get().N().N(), this.customEffects));
      }
   }

   public Optional<Integer> R() {
      return this.customColor;
   }
}
