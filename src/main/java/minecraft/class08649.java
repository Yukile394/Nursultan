package minecraft;

import org.jspecify.annotations.Nullable;

public record class08649(
   class01127 bookModel, class01894 texture, float open, float flip, int x0, int y0, int x1, int y1, float scale, class03255 scissorArea, class03255 bounds
) implements class08647 {
   public class01894 L() {
      return this.texture;
   }

   @Override
   public int M() {
      return this.x1;
   }

   public class08649(class01127 var1, class01894 var2, float var3, float var4, int var5, int var6, int var7, int var8, float var9, @Nullable class03255 var10) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, class08647.N(var5, var6, var7, var8, var10));
   }

   public class08649(
      class01127 bookModel,
      class01894 texture,
      float open,
      float flip,
      int x0,
      int y0,
      int x1,
      int y1,
      float scale,
      @Nullable class03255 scissorArea,
      @Nullable class03255 bounds
   ) {
      this.bookModel = bookModel;
      this.texture = texture;
      this.open = open;
      this.flip = flip;
      this.x0 = x0;
      this.y0 = y0;
      this.x1 = x1;
      this.y1 = y1;
      this.scale = scale;
      this.scissorArea = scissorArea;
      this.bounds = bounds;
   }

   @Override
   public int B() {
      return this.y1;
   }

   @Nullable
   @Override
   public class03255 Z() {
      return this.scissorArea;
   }

   @Override
   public int i() {
      return this.x0;
   }

   public float z() {
      return this.flip;
   }

   public float u() {
      return this.open;
   }

   public class01127 y() {
      return this.bookModel;
   }

   @Override
   public float N() {
      return this.scale;
   }

   @Nullable
   @Override
   public class03255 comp_4274() {
      return this.bounds;
   }

   @Override
   public int R() {
      return this.y0;
   }
}
