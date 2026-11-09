package minecraft;

import org.jspecify.annotations.Nullable;

public record class08667(
   class08842 flag, class06563 baseColor, class02708 resultBannerPatterns, int x0, int y0, int x1, int y1, class03255 scissorArea, class03255 bounds
) implements class08647 {
   public class06563 L() {
      return this.baseColor;
   }

   @Override
   public int M() {
      return this.x1;
   }

   public class08667(class08842 var1, class06563 var2, class02708 var3, int var4, int var5, int var6, int var7, @Nullable class03255 var8) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, class08647.N(var4, var5, var6, var7, var8));
   }

   public class08667(
      class08842 flag,
      class06563 baseColor,
      class02708 resultBannerPatterns,
      int x0,
      int y0,
      int x1,
      int y1,
      @Nullable class03255 scissorArea,
      @Nullable class03255 bounds
   ) {
      super();
      this.flag = flag;
      this.baseColor = baseColor;
      this.resultBannerPatterns = resultBannerPatterns;
      this.x0 = x0;
      this.y0 = y0;
      this.x1 = x1;
      this.y1 = y1;
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

   public class02708 u() {
      return this.resultBannerPatterns;
   }

   public class08842 y() {
      return this.flag;
   }

   @Override
   public float N() {
      return 16.0F;
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
