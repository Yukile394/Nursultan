package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class05273 extends class01219 {
   public static final MapCodec<class05273> N = class05265.y.listOf().fieldOf("rules").xmap(class05273::new, var0 -> var0.y);
   private final ImmutableList<class05265> y;

   public class05273(List<? extends class05265> var1) {
      super();
      this.y = ImmutableList.copyOf(var1);
   }

   @Nullable
   @Override
   public class01228 N(class05487 var1, class07209 var2, class07209 var3, class01228 var4, class01228 var5, class01233 var6) {
      class06069 class06069 = class06069.y(class04995.N(var5.N()));
      class00500 class00500 = var1.method_8320(var5.N());
      UnmodifiableIterator<class05265> unmodifiableiterator = this.y.iterator();

      while (unmodifiableiterator.hasNext()) {
         class05265 class05265 = (class05265)unmodifiableiterator.next();
         if (class05265.N(var5.y(), class00500, var4.N(), var5.N(), var3, class06069)) {
            return new class01228(var5.N(), class05265.N(), class05265.N(class06069, var5.L()));
         }
      }

      return var5;
   }

   @Override
   protected class05235<?> N() {
      return class05235.Z;
   }
}
