package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class class02683 extends class00453 {
   private static final Codec<class06841<class02666>> y = class06841.N(var0 -> var0.N(class02712::new).y(class02711::new).L(class02712::new));
   public static final MapCodec<class02683> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               y.fieldOf("source").forGetter(var0x -> var0x.L),
               class02477.N.listOf().optionalFieldOf("include").forGetter(var0x -> var0x.u),
               class02477.N.listOf().optionalFieldOf("exclude").forGetter(var0x -> var0x.i)
            )
         )
         .apply(var0, class02683::new)
   );
   private final class06841<class02666> L;
   private final Optional<List<class02477<?>>> u;
   private final Optional<List<class02477<?>>> i;
   private final Predicate<class02477<?>> R;

   class02683(List<class05957> var1, class06841<class02666> var2, Optional<List<class02477<?>>> var3, Optional<List<class02477<?>>> var4) {
      super(var1);
      this.L = var2;
      this.u = var3.map(List::copyOf);
      this.i = var4.map(List::copyOf);
      ArrayList arraylist = new ArrayList(2);
      var4.ifPresent(var1x -> arraylist.add(var1xx -> !var1x.contains(var1xx)));
      var3.ifPresent(var1x -> arraylist.add(var1x::contains));
      this.R = class07536.N(arraylist);
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(this.L.N());
   }

   public static class02684 y(class07491<? extends class00394> var0) {
      return new class02684(new class02711(var0));
   }

   @Override
   public class05959<class02683> N() {
      return class07439.K;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      class02666 class02666 = this.L.N(var2);
      if (class02666 != null) {
         if (class02666 instanceof class02695 class02695) {
            var1.y(class02695.N(this.R));
         } else {
            Collection collection = this.i.orElse(List.of());
            this.u.map(Collection::stream).orElse(class04206.NW.z().map(class03556::N)).forEach(var3x -> {
               if (!collection.contains(var3x)) {
                  class02480 class02480 = class02666.u(var3x);
                  if (class02480 != null) {
                     var1.N(class02480);
                  }
               }
            });
         }
      }

      return var1;
   }

   public static class02684 N(class07491<? extends class07049> var0) {
      return new class02684(new class02712(var0));
   }
}
