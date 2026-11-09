package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public class class01859<T extends class01711<T>> implements class07684<T> {
   private static final DecimalFormat N = class07536.N(
      new DecimalFormat("#", DecimalFormatSymbols.getInstance(Locale.ROOT)), var0 -> var0.setMaximumFractionDigits(15)
   );
   private static final int y = 8;
   private final List<String> L;
   private final Object2ObjectLinkedOpenHashMap<List<String>, class01747<T>> u = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final class01894 i;
   private final List<class01887<T>> R;

   public class01859(class01894 var1, List<class01887<T>> var2, List<String> var3) {
      super();
      this.i = var1;
      this.R = var2;
      this.L = var3;
   }

   private class01747<T> N(List<String> var1, List<String> var2, CommandDispatcher<T> var3) throws class01878 {
      ArrayList arraylist = new ArrayList(this.R.size());
      ArrayList arraylist1 = new ArrayList(var2.size());

      for (class01887 class01887 : this.R) {
         N(var2, class01887.N(), arraylist1);
         arraylist.add(class01887.N(arraylist1, var3, this.i));
      }

      return new class01728<>(this.N().N((UnaryOperator<String>)(var1x -> var1x + "/" + var1.hashCode())), arraylist);
   }

   @Override
   public class01747<T> N(@Nullable class07001 var1, CommandDispatcher<T> var2) throws class01878 {
      if (var1 == null) {
         throw new class01878(class00392.N("commands.function.error.missing_arguments", class00392.N(this.N())));
      } else {
         ArrayList arraylist = new ArrayList(this.L.size());

         for (String s : this.L) {
            class07709 class07709 = var1.N(s);
            if (class07709 == null) {
               throw new class01878(class00392.N("commands.function.error.missing_argument", class00392.N(this.N()), s));
            }

            arraylist.add(N(class07709));
         }

         class01747 class01747x = (class01747)this.u.getAndMoveToLast(arraylist);
         if (class01747x != null) {
            return class01747x;
         } else {
            if (this.u.size() >= 8) {
               this.u.removeFirst();
            }

            class01747 class01747x = this.N(this.L, arraylist, var2);
            this.u.put(arraylist, class01747x);
            return class01747x;
         }
      }
   }

   private static String N(class07709 var0) {
      return switch (var0) {
         case class07009 class07009 -> {
            float f1;
            try {
               f1 = class07009.m();
            } catch (Throwable throwable5) {
               throw new MatchException(throwable5.toString(), throwable5);
            }

            float f = f1;
            yield N.format(f);
         }
         case class07019 class07019 -> {
            class07019 class07019x = class07019;

            try {
               d1 = class07019x.m();
            } catch (Throwable throwable4) {
               throw new MatchException(throwable4.toString(), throwable4);
            }

            double d0 = d1;
            yield N.format(d0);
         }
         case class07037 class07037 -> {
            class07037 class07037x = class07037;

            try {
               b1 = class07037x.m();
            } catch (Throwable throwable3) {
               throw new MatchException(throwable3.toString(), throwable3);
            }

            byte b0 = b1;
            yield String.valueOf((int)b0);
         }
         case class07730 class07730x -> {
            class07730 class07730 = class07730x;

            try {
               short2 = class07730.m();
            } catch (Throwable throwable2) {
               throw new MatchException(throwable2.toString(), throwable2);
            }

            short short1 = short2;
            yield String.valueOf((int)short1);
         }
         case class07729 class07729x -> {
            class07729 class07729 = class07729x;

            try {
               j = class07729.m();
            } catch (Throwable throwable1) {
               throw new MatchException(throwable1.toString(), throwable1);
            }

            long ix = j;
            yield String.valueOf(ix);
         }
         case class07707 class07707 -> {
            class07707 class07707x = class07707;

            try {
               yield class07707x.U();
            } catch (Throwable throwable) {
               throw new MatchException(throwable.toString(), throwable);
            }
         }
         default -> ((class07709)var0).toString();
      };
   }

   private static void N(List<String> var0, IntList var1, List<String> var2) {
      var2.clear();
      var1.forEach(var2x -> var2.add((String)var0.get(var2x)));
   }

   @Override
   public class01894 N() {
      return this.i;
   }
}
