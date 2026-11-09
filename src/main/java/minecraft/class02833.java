package minecraft;

import Nursultan.class10014;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import org.apache.commons.lang3.function.TriConsumer;

public record class02833(List<class02824> modifiers) {
   public static final class02833 N = new class02833(List.of());
   public static final Codec<class02833> y = class02824.i.listOf().xmap(class02833::new, class02833::y);
   public static final class02362<class04247, class02833> L = class02362.N(class02824.R.N_33(class02389.N()), class02833::y, class02833::new);
   public static final DecimalFormat u = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.ROOT));

   public class02833(List<class02824> modifiers) {
      this.modifiers = modifiers;
   }

   public List<class02824> y() {
      return this.modifiers;
   }

   public double N(class03556<class07468> var1, double var2, class07085 var4) {
      double d0 = var2;

      for (class02824 class02824 : this.modifiers) {
         if (class02824.L().y(var4) && class02824.N() == var1) {
            double d1 = class02824.y().y();

            d0 += switch (class02824.y().L()) {
               case field_6328 -> d1;
               case field_6330 -> d1 * var2;
               case field_6331 -> d1 * d0;
            };
         }
      }

      return d0;
   }

   public class02833 N(class03556<class07468> var1, class07471 var2, class02834 var3) {
      Builder builder = ImmutableList.builderWithExpectedSize(this.modifiers.size() + 1);

      for (class02824 class02824 : this.modifiers) {
         if (!class02824.N(var1, var2.N())) {
            builder.add(class02824);
         }
      }

      builder.add(new class02824(var1, var2, var3));
      return new class02833(builder.build());
   }

   public void N(class02834 var1, TriConsumer<class03556<class07468>, class07471, class02831> var2) {
      for (class02824 class02824 : this.modifiers) {
         if (class02824.L().equals(var1)) {
            var2.accept(class02824.N(), class02824.y(), class02824.u());
         }
      }
   }

   public void N(class02834 var1, BiConsumer<class03556<class07468>, class07471> var2) {
      for (class02824 class02824 : this.modifiers) {
         if (class02824.L().equals(var1)) {
            var2.accept(class02824.N(), class02824.y());
         }
      }
   }

   public void N(class07085 var1, BiConsumer<class03556<class07468>, class07471> var2) {
      for (class02824 class02824 : this.modifiers) {
         if (class02824.L().y(var1)) {
            var2.accept(class02824.N(), class02824.y());
         }
      }
   }

   public static class10014 N() {
      return new class10014();
   }
}
