package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class05009 extends class04992 {
   final List<class05037> N;
   private final class05096 y;
   private static final int L = 160;

   private class05009(List<class05037> var1, class05096 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public static class05009 N(class06478 var0, class04370<?> var1, @Nullable class06478 var2, class05096 var3) {
      return var2 == null
         ? new class05009(List.of(new class05037(var0, var1)), var3)
         : new class05009(List.of(new class05037(var0, var1), new class05037(var2)), var3);
   }

   public static class05009 N(class05630 var0, class04370<?> var1, @Nullable class04370<?> var2, class05914 var3) {
      class06478 class06478 = var1.method_57701(var0);
      return var2 == null
         ? new class05009(List.of(new class05037(class06478, var1)), var3)
         : new class05009(List.of(new class05037(class06478, var1), new class05037(var2.method_57701(var0), var2)), var3);
   }

   @Nullable
   public class06478 N(class04370<?> var1) {
      for (class05037 class05037 : this.N) {
         if (class05037.y() == var1) {
            return class05037.N();
         }
      }

      return null;
   }

   public static class05009 N(class05630 var0, class04370<?> var1, class05096 var2) {
      return new class05009(List.of(new class05037(var1.method_18520(var0, 0, 0, 310), var1)), var2);
   }

   public static class05009 N(class06478 var0, @Nullable class06478 var1, class05096 var2) {
      return var1 == null ? new class05009(List.of(new class05037(var0)), var2) : new class05009(List.of(new class05037(var0), new class05037(var1)), var2);
   }

   @Override
   public List<? extends class04654> method_25396() {
      return Lists.transform(this.N, class05037::N);
   }

   @Override
   public List<? extends class03434> method_37025() {
      return Lists.transform(this.N, class05037::N);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      short short1 = 0;
      int i = this.y.field_22789 / 2 - 155;

      for (class05037 class05037 : this.N) {
         class05037.N().y(i + short1, this.method_73382());
         class05037.N().method_25394(var1, var2, var3, var5);
         short1 += 160;
      }
   }
}
