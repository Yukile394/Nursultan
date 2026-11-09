package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class class04872 extends class05248 {
   private static final Comparator<class01203> R = Comparator.comparingInt(class01203::M).reversed();
   private static final Codec<Either<class01894, class01207>> M = Codec.of(class04872::N, class01894.N.map(Either::left));
   public static final MapCodec<class04872> N = RecordCodecBuilder.mapCodec(var0 -> var0.group(u(), y(), R(), L()).apply(var0, class04872::new));
   protected final Either<class01894, class01207> y;
   protected final class03556<class05483> L;
   protected final Optional<class02610> u;

   protected static <E extends class04872> RecordCodecBuilder<E, Optional<class02610>> L() {
      return class02610.field_52239.optionalFieldOf("override_liquid_settings").forGetter(var0 -> var0.u);
   }

   public class04872(Either<class01894, class01207> var1, class03556<class05483> var2, class05246 var3, Optional<class02610> var4) {
      super(var3);
      this.y = var1;
      this.L = var2;
      this.u = var4;
   }

   @Override
   public String toString() {
      return "Single[" + this.y + "]";
   }

   public class01894 i() {
      return (class01894)this.y.orThrow();
   }

   protected static <E extends class04872> RecordCodecBuilder<E, Either<class01894, class01207>> u() {
      return M.fieldOf("location").forGetter(var0 -> var0.y);
   }

   protected static <E extends class04872> RecordCodecBuilder<E, class03556<class05483>> y() {
      return class05235.u.fieldOf("processors").forGetter(var0 -> var0.L);
   }

   @Override
   public class05267<?> N() {
      return class05267.N;
   }

   private static <T> DataResult<T> N(Either<class01894, class01207> var0, DynamicOps<T> var1, T var2) {
      Optional optional = var0.left();
      return optional.isEmpty()
         ? DataResult.error(() -> "Can not serialize a runtime pool element")
         : class01894.N.encode((class01894)optional.get(), var1, var2);
   }

   @Override
   public List<class01203> N(class01224 var1, class07209 var2, class06993 var3, class06069 var4) {
      List list = this.N(var1).N(var2, var3);
      class07536.L(list, var4);
      N(list);
      return list;
   }

   public List<class01228> N(class01224 var1, class07209 var2, class06993 var3, boolean var4) {
      ObjectArrayList objectarraylist = this.N(var1).N(var2, new class01233().N(var3), class00869.sh, var4);
      ArrayList arraylist = Lists.newArrayList();

      for (class01228 class01228 : objectarraylist) {
         class07001 class07001 = class01228.L();
         if (class07001 != null && (class08070)class07001.N_15("mode", class08070.field_56673).orElseThrow() == class08070.field_12696) {
            arraylist.add(class01228);
         }
      }

      return arraylist;
   }

   private class01207 N(class01224 var1) {
      return (class01207)this.y.map(var1::N, Function.identity());
   }

   @Override
   public class00753 N(class01224 var1, class06993 var2) {
      return this.N(var1).N(var2);
   }

   public class01233 N(class06993 var1, class05163 var2, class02610 var3, boolean var4) {
      class01233 class01233 = new class01233();
      class01233.N(var2);
      class01233.N(var1);
      class01233.y(true);
      class01233.N(false);
      class01233.N(class05282.y);
      class01233.L(true);
      class01233.N(this.u.orElse(var3));
      if (!var4) {
         class01233.N(class05255.y);
      }

      this.L.N().N().forEach(class01233::N);
      this.M().y().forEach(class01233::N);
      return class01233;
   }

   @Override
   public boolean N(
      class01224 var1,
      class05974 var2,
      class05324 var3,
      class08088 var4,
      class07209 var5,
      class07209 var6,
      class06993 var7,
      class05163 var8,
      class06069 var9,
      class02610 var10,
      boolean var11
   ) {
      class01207 class01207 = this.N(var1);
      class01233 class01233 = this.N(var7, var8, var10, var11);
      if (!class01207.N(var2, var5, var6, class01233, var9, 18)) {
         return false;
      } else {
         for (class01228 class01228 : class01207.N(var2, var5, var6, class01233, this.N(var1, var5, var7, false))) {
            this.N(var2, class01228, var5, var7, var9, var8);
         }

         return true;
      }
   }

   @Override
   public class05163 N(class01224 var1, class07209 var2, class06993 var3) {
      return this.N(var1).y(new class01233().N(var3), var2);
   }

   static void N(List<class01203> var0) {
      var0.sort(R);
   }
}
