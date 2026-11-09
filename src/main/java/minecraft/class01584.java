package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class class01584 {
   private static final Logger y = LogUtils.getLogger();
   public static final Codec<class01584> N = RecordCodecBuilder.create(
         var0 -> var0.group(
               class03541.N(class04227.yb).lenientOptionalFieldOf("structure_overrides").forGetter(var0x -> var0x.L),
               class01627.N.listOf().fieldOf("layers").forGetter(class01584::i),
               Codec.BOOL.fieldOf("lakes").orElse(false).forGetter(var0x -> var0x.Z),
               Codec.BOOL.fieldOf("features").orElse(false).forGetter(var0x -> var0x.B),
               class00780.L.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter(var0x -> Optional.of(var0x.i)),
               class03519.u(class00795.y),
               class03519.u(class03159.M),
               class03519.u(class03159.B)
            )
            .apply(var0, class01584::new)
      )
      .comapFlatMap(class01584::N, Function.identity())
      .stable();
   private final Optional<class03543<class04412>> L;
   private final List<class01627> u = Lists.newArrayList();
   private final class03556<class00780> i;
   private final List<class00500> R;
   private boolean M;
   private boolean B;
   private boolean Z;
   private final List<class03556<class04336>> z;

   public Optional<class03543<class04412>> L() {
      return this.L;
   }

   public void M() {
      this.R.clear();

      for (class01627 class01627 : this.u) {
         for (int ix = 0; ix < class01627.N(); ix++) {
            this.R.add(class01627.y());
         }
      }

      this.M = this.R.stream().allMatch(var0 -> var0.N(class00869.N));
   }

   private class01584(
      Optional<class03543<class04412>> var1,
      List<class01627> var2,
      boolean var3,
      boolean var4,
      Optional<class03556<class00780>> var5,
      class03529<class00780> var6,
      class03556<class04336> var7,
      class03556<class04336> var8
   ) {
      this(var1, N(var5, var6), List.of(var7, var8));
      if (var3) {
         this.y();
      }

      if (var4) {
         this.N();
      }

      this.u.addAll(var2);
      this.M();
   }

   public class01584(Optional<class03543<class04412>> var1, class03556<class00780> var2, List<class03556<class04336>> var3) {
      super();
      this.L = var1;
      this.i = var2;
      this.R = Lists.newArrayList();
      this.z = var3;
   }

   public List<class01627> i() {
      return this.u;
   }

   public class03556<class00780> u() {
      return this.i;
   }

   public static List<class03556<class04336>> y(class02055<class04336> var0) {
      return List.of(var0.y(class03159.M), var0.y(class03159.B));
   }

   public void y() {
      this.Z = true;
   }

   private static class03556<class00780> N(Optional<? extends class03556<class00780>> var0, class03556<class00780> var1) {
      if (var0.isEmpty()) {
         y.error("Unknown biome, defaulting to plains");
         return var1;
      } else {
         return (class03556<class00780>)var0.get();
      }
   }

   public void N() {
      this.B = true;
   }

   public class01029 N(class03556<class00780> var1) {
      if (!var1.equals(this.i)) {
         return ((class00780)var1.N()).L();
      } else {
         class01029 class01029 = this.u().N().L();
         class05448 class05448 = new class05448();
         if (this.Z) {
            for (class03556 class03556x : this.z) {
               class05448.N(class07852.field_25186, class03556x);
            }
         }

         boolean flag = (!this.M || var1.N(class00795.N)) && this.B;
         if (flag) {
            List list = class01029.L();

            for (int ix = 0; ix < list.size(); ix++) {
               if (ix != class07852.field_13172.ordinal() && ix != class07852.field_13173.ordinal() && (!this.Z || ix != class07852.field_25186.ordinal())) {
                  for (class03556 class03556 : (class03543)list.get(ix)) {
                     class05448.N(ix, class03556);
                  }
               }
            }
         }

         List list1 = this.R();

         for (int j = 0; j < list1.size(); j++) {
            class00500 class00500 = (class00500)list1.get(j);
            if (!class07830.field_13197.u().test(class00500)) {
               list1.set(j, null);
               class05448.N(class07852.field_13179, class03170.N(class06391.r, new class05718(j, class00500)));
            }
         }

         return class05448.N();
      }
   }

   private static DataResult<class01584> N(class01584 var0) {
      return var0.u.stream().mapToInt(class01627::N).sum() > class07376.L
         ? DataResult.error(() -> "Sum of layer heights is > " + class07376.L, var0)
         : DataResult.success(var0);
   }

   public static class03556<class00780> N(class02055<class00780> var0) {
      return var0.y(class00795.y);
   }

   public static class01584 N(class02055<class00780> var0, class02055<class04412> var1, class02055<class04336> var2) {
      class03522 class03522 = class03543.N(var1.y(class04409.b), var1.y(class04409.N));
      class01584 class01584 = new class01584(Optional.of(class03522), N(var0), y(var2));
      class01584.i().add(new class01627(1, class00869.q));
      class01584.i().add(new class01627(2, class00869.z));
      class01584.i().add(new class01627(1, class00869.Z));
      class01584.M();
      return class01584;
   }

   public class01584 N(List<class01627> var1, Optional<class03543<class04412>> var2, class03556<class00780> var3) {
      class01584 class01584 = new class01584(var2, var3, this.z);

      for (class01627 class01627 : var1) {
         class01584.u.add(new class01627(class01627.N(), class01627.y().i()));
         class01584.M();
      }

      if (this.B) {
         class01584.N();
      }

      if (this.Z) {
         class01584.y();
      }

      return class01584;
   }

   public List<class00500> R() {
      return this.R;
   }
}
