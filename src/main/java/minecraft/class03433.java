package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;

class class03433 {
   public final int N;
   public final int y;

   class03433(int var1, int var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class03433 class03433 = (class03433)var1;
         return this.N == class03433.N && this.y == class03433.y;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.N + "x" + this.y;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.N, this.y);
   }

   static List<class03433> N(int var0, int var1) {
      RenderSystem.assertOnRenderThread();
      int i = RenderSystem.getDevice().getMaxTextureSize();
      return var0 > 0 && var0 <= i && var1 > 0 && var1 <= i ? ImmutableList.of(new class03433(var0, var1), class03453.U) : ImmutableList.of(class03453.U);
   }
}
