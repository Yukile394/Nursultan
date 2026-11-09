package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public record class08660(List<class05005> chartData, int x0, int y0, int x1, int y1, class03255 scissorArea, class03255 bounds) implements class08647 {
   @Override
   public int M() {
      return this.x1;
   }

   public class08660(List<class05005> var1, int var2, int var3, int var4, int var5, @Nullable class03255 var6) {
      this(var1, var2, var3, var4, var5, var6, class08647.N(var2, var3, var4, var5, var6));
   }

   public class08660(List<class05005> chartData, int x0, int y0, int x1, int y1, @Nullable class03255 scissorArea, @Nullable class03255 bounds) {
      this.chartData = chartData;
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

   public List<class05005> y() {
      return this.chartData;
   }

   @Override
   public float N() {
      return 1.0F;
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
