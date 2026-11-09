package minecraft;

import org.jspecify.annotations.Nullable;

public record class08663(class06260 signModel, class05904 woodType, int x0, int y0, int x1, int y1, float scale, class03255 scissorArea, class03255 bounds)
   implements class08647 {
   public class05904 L() {
      return this.woodType;
   }

   @Override
   public int M() {
      return this.x1;
   }

   public class08663(class06260 var1, class05904 var2, int var3, int var4, int var5, int var6, float var7, @Nullable class03255 var8) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, class08647.N(var3, var4, var5, var6, var8));
   }

   public class08663(
      class06260 signModel, class05904 woodType, int x0, int y0, int x1, int y1, float scale, @Nullable class03255 scissorArea, @Nullable class03255 bounds
   ) {
      super();
      this.signModel = signModel;
      this.woodType = woodType;
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

   public class06260 y() {
      return this.signModel;
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
