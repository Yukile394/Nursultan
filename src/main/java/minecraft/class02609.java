package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import net.caffeinemc.mods.sodium.mixin.features.render.immediate.buffer_builder.sorting.MeshDataAccessor;
import org.jspecify.annotations.Nullable;

public class class02609 implements AutoCloseable, MeshDataAccessor {
   private final class02613 N;
   private class02613 y;
   private final class02583 L;

   public class02583 L() {
      return this.L;
   }

   public class02609(class02613 var1, class02583 var2) {
      super();
      this.N = var1;
      this.L = var2;
   }

   @Override
   public void close() {
      this.N.close();
      if (this.y != null) {
         this.y.close();
      }
   }

   @Nullable
   public ByteBuffer y() {
      return this.y != null ? this.y.N() : null;
   }

   @Nullable
   public class02578 N(class02579 var1, class03337 var2) {
      if (this.L.u() != DrawMode.QUADS) {
         return null;
      } else {
         class06607 class06607 = N(this.N.N(), this.L.y(), this.L.N());
         class02578 class02578 = new class02578(class06607, this.L.i());
         this.y = class02578.N(var1, var2);
         return class02578;
      }
   }

   private static class06607 N(ByteBuffer var0, int var1, VertexFormat var2) {
      int i = var2.getOffset(VertexFormatElement.POSITION);
      if (i == -1) {
         throw new IllegalArgumentException("Cannot identify quad centers with no position element");
      } else {
         FloatBuffer floatbuffer = var0.asFloatBuffer();
         int j = var2.getVertexSize() / 4;
         int k = j * 4;
         int l = var1 / 4;
         class06607 class06607 = new class06607(l);

         for (int i1 = 0; i1 < l; i1++) {
            int j1 = i1 * k + i;
            int k1 = j1 + j * 2;
            float f = floatbuffer.get(j1 + 0);
            float f1 = floatbuffer.get(j1 + 1);
            float f2 = floatbuffer.get(j1 + 2);
            float f3 = floatbuffer.get(k1 + 0);
            float f4 = floatbuffer.get(k1 + 1);
            float f5 = floatbuffer.get(k1 + 2);
            float f6 = (f + f3) / 2.0F;
            float f7 = (f1 + f4) / 2.0F;
            float f8 = (f2 + f5) / 2.0F;
            class06607.N(i1, f6, f7, f8);
         }

         return class06607;
      }
   }

   public ByteBuffer N() {
      return this.N.N();
   }
}
