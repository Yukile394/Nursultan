package minecraft;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public record class04564<C, I extends class04573<C>>(
   I coordinate, float[] locations, List<class04562<C, I>> values, float[] derivatives, float minValue, float maxValue
) implements class04562<C, I> {

   @Override
   public float L() {
      return this.maxValue;
   }

   public float[] M() {
      return this.derivatives;
   }

   public class04564(I coordinate, float[] locations, List<class04562<C, I>> values, float[] derivatives, float minValue, float maxValue) {
      N(locations, values, derivatives);
      this.coordinate = (I)coordinate;
      this.locations = locations;
      this.values = values;
      this.derivatives = derivatives;
      this.minValue = minValue;
      this.maxValue = maxValue;
   }

   public float[] i() {
      return this.locations;
   }

   public I u() {
      return this.coordinate;
   }

   @Override
   public float y() {
      return this.minValue;
   }

   static <C, I extends class04573<C>> class04564<C, I> N(I var0, float[] var1, List<class04562<C, I>> var2, float[] var3) {
      N(var1, var2, var3);
      int i = var1.length - 1;
      float f = Float.POSITIVE_INFINITY;
      float f1 = Float.NEGATIVE_INFINITY;
      float f2 = var0.y();
      float f3 = var0.L();
      if (f2 < var1[0]) {
         float f4 = N(f2, var1, ((class04562)var2.get(0)).y(), var3, 0);
         float f5 = N(f2, var1, ((class04562)var2.get(0)).L(), var3, 0);
         f = Math.min(f, Math.min(f4, f5));
         f1 = Math.max(f1, Math.max(f4, f5));
      }

      if (f3 > var1[i]) {
         float f23 = N(f3, var1, ((class04562)var2.get(i)).y(), var3, i);
         float f24 = N(f3, var1, ((class04562)var2.get(i)).L(), var3, i);
         f = Math.min(f, Math.min(f23, f24));
         f1 = Math.max(f1, Math.max(f23, f24));
      }

      for (class04562 class04562xx : var2) {
         f = Math.min(f, class04562xx.y());
         f1 = Math.max(f1, class04562xx.L());
      }

      for (int j = 0; j < i; j++) {
         float f25 = var1[j];
         float f6 = var1[j + 1] - f25;
         class04562 class04562 = (class04562)var2.get(j);
         class04562 class04562x = (class04562)var2.get(j + 1);
         float f7 = class04562.y();
         float f8 = class04562.L();
         float f9 = class04562x.y();
         float f10 = class04562x.L();
         float f11 = var3[j];
         float f12 = var3[j + 1];
         if (f11 != 0.0F || f12 != 0.0F) {
            float f13 = f11 * f6;
            float f14 = f12 * f6;
            float f15 = Math.min(f7, f9);
            float f16 = Math.max(f8, f10);
            float f17 = f13 - f10 + f7;
            float f18 = f13 - f9 + f8;
            float f19 = -f14 + f9 - f8;
            float f20 = -f14 + f10 - f7;
            float f21 = Math.min(f17, f19);
            float f22 = Math.max(f18, f20);
            f = Math.min(f, f15 + 0.25F * f21);
            f1 = Math.max(f1, f16 + 0.25F * f22);
         }
      }

      return new class04564<>((I)var0, var1, var2, var3, f, f1);
   }

   private static float N(float var0, float[] var1, float var2, float[] var3, int var4) {
      float f = var3[var4];
      return f == 0.0F ? var2 : var2 + f * (var0 - var1[var4]);
   }

   @Override
   public String N() {
      return "Spline{coordinate="
         + this.coordinate
         + ", locations="
         + this.N(this.locations)
         + ", derivatives="
         + this.N(this.derivatives)
         + ", values="
         + this.values.stream().map(class04562::N).collect(Collectors.joining(", ", "[", "]"))
         + "}";
   }

   private String N(float[] var1) {
      return "["
         + IntStream.range(0, var1.length)
            .mapToDouble(var1x -> var1[var1x])
            .mapToObj(var0 -> String.format(Locale.ROOT, "%.3f", var0))
            .collect(Collectors.joining(", "))
         + "]";
   }

   private static int N(float[] var0, float var1) {
      return class04995.N(0, var0.length, var2 -> var1 < var0[var2]) - 1;
   }

   @Override
   public class04562<C, I> N_48(class04567<I> var1) {
      return N((I)var1.visit(this.coordinate), this.locations, this.R().stream().map(var1x -> var1x.N_48(var1)).toList(), this.derivatives);
   }

   @Override
   public float N(C var1) {
      float f = this.coordinate.N((C)var1);
      int i = N(this.locations, f);
      int j = this.locations.length - 1;
      if (i < 0) {
         return N(f, this.locations, this.values.get(0).N((C)var1), this.derivatives, 0);
      } else if (i == j) {
         return N(f, this.locations, this.values.get(j).N((C)var1), this.derivatives, j);
      } else {
         float f1 = this.locations[i];
         float f2 = this.locations[i + 1];
         float f3 = (f - f1) / (f2 - f1);
         class04573 class04573x = this.values.get(i);
         class04573 class04573x = this.values.get(i + 1);
         float f4 = this.derivatives[i];
         float f5 = this.derivatives[i + 1];
         float f6 = class04573x.N(var1);
         float f7 = class04573x.N(var1);
         float f8 = f4 * (f2 - f1) - (f7 - f6);
         float f9 = -f5 * (f2 - f1) + (f7 - f6);
         return class04995.B(f3, f6, f7) + f3 * (1.0F - f3) * class04995.B(f3, f8, f9);
      }
   }

   private static <C, I extends class04573<C>> void N(float[] var0, List<class04562<C, I>> var1, float[] var2) {
      if (var0.length != var1.size() || var0.length != var2.length) {
         throw new IllegalArgumentException("All lengths must be equal, got: " + var0.length + " " + var1.size() + " " + var2.length);
      } else if (var0.length == 0) {
         throw new IllegalArgumentException("Cannot create a multipoint spline with no points");
      }
   }

   public List<class04562<C, I>> R() {
      return this.values;
   }
}
