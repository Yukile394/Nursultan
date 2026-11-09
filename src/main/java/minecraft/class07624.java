package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class07624 extends class00453 {
   public static final MapCodec<class07624> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class05074.N.fieldOf("name").forGetter(var0x -> var0x.y),
               Codec.LONG.optionalFieldOf("seed", 0L).forGetter(var0x -> var0x.L),
               class04206.U.b().fieldOf("type").forGetter(var0x -> var0x.u)
            )
         )
         .apply(var0, class07624::new)
   );
   private final class05946<class05074> y;
   private final long L;
   private final class03556<class00404<?>> u;

   private class07624(List<class05957> var1, class05946<class05074> var2, long var3, class03556<class00404<?>> var5) {
      super(var1);
      this.y = var2;
      this.L = var3;
      this.u = var5;
   }

   @Override
   public void N(class05561 var1) {
      super.N(var1);
      if (!var1.y()) {
         var1.N(new class05566(this.y));
      } else {
         if (var1.N().u(this.y).isEmpty()) {
            var1.N(new class05576(this.y));
         }
      }
   }

   @Override
   public class05959<class07624> N() {
      return class07439.d;
   }

   public static class00471<?> N(class00404<?> var0, class05946<class05074> var1) {
      return N(var2 -> new class07624(var2, var1, 0L, var0.method_53254()));
   }

   public static class00471<?> N(class00404<?> var0, class05946<class05074> var1, long var2) {
      return N(var4 -> new class07624(var4, var1, var2, var0.method_53254()));
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      if (var1.R()) {
         return var1;
      } else {
         var1.N(class02484.Nk, new class02720(this.y, this.L));
         return var1;
      }
   }
}
