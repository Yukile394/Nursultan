package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.floats.FloatList;
import java.util.List;

public final class class04571<C, I extends class04573<C>> {
   private final I N;
   private final class04573<Float> y;
   private final FloatList L = new FloatArrayList();
   private final List<class04562<C, I>> u = Lists.newArrayList();
   private final FloatList i = new FloatArrayList();

   protected class04571(I var1) {
      this((I)var1, class04573.y);
   }

   protected class04571(I var1, class04573<Float> var2) {
      super();
      this.N = (I)var1;
      this.y = var2;
   }

   private class04571<C, I> N(float var1, class04562<C, I> var2, float var3) {
      if (!this.L.isEmpty() && var1 <= this.L.getFloat(this.L.size() - 1)) {
         throw new IllegalArgumentException("Please register points in ascending order");
      } else {
         this.L.add(var1);
         this.u.add(var2);
         this.i.add(var3);
         return this;
      }
   }

   public class04571<C, I> N(float var1, class04562<C, I> var2) {
      return this.N(var1, var2, 0.0F);
   }

   public class04562<C, I> N() {
      if (this.L.isEmpty()) {
         throw new IllegalStateException("No elements added");
      } else {
         return class04564.N(this.N, this.L.toFloatArray(), ImmutableList.copyOf(this.u), this.i.toFloatArray());
      }
   }

   public class04571<C, I> N(float var1, float var2, float var3) {
      return this.N(var1, new class04550<>(this.y.N(var2)), var3);
   }

   public class04571<C, I> N(float var1, float var2) {
      return this.N(var1, new class04550<>(this.y.N(var2)), 0.0F);
   }
}
