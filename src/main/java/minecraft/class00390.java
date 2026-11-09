package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.CheckReturnValue;
import org.jspecify.annotations.Nullable;

public class class00390 {
   public static final String N = ", ";
   public static final class00392 y = class00392.y(", ").N(class06541.field_1080);
   public static final class00392 L = class00392.y(", ");

   public class00390() {
      super();
   }

   public static <T> class00392 y(Collection<? extends T> var0, Function<T, class00392> var1) {
      return N(var0, y, var1);
   }

   public static boolean y(@Nullable class00392 var0) {
      if (var0 != null && var0.method_10851() instanceof class00388 class00388) {
         String s = class00388.y();
         return class00388.L() != null || class07018.y().N(s);
      } else {
         return true;
      }
   }

   public static class00392 N(Message var0) {
      return (class00392)(var0 instanceof class00392 ? (class00392)var0 : class00392.y(var0.getString()));
   }

   public static class05216 N(class00392 var0) {
      return class00392.N("chat.square_brackets", var0);
   }

   public static <T> class05216 N(Collection<? extends T> var0, class00392 var1, Function<T, class00392> var2) {
      if (var0.isEmpty()) {
         return class00392.i();
      } else if (var0.size() == 1) {
         return ((class00392)var2.apply(var0.iterator().next())).L();
      } else {
         class05216 class05216 = class00392.i();
         boolean flag = true;

         for (Object object : var0) {
            if (!flag) {
               class05216.y(var1);
            }

            class05216.y((class00392)var2.apply(object));
            flag = false;
         }

         return class05216;
      }
   }

   public static <T> class05216 N(Collection<? extends T> var0, Optional<? extends class00392> var1, Function<T, class00392> var2) {
      return N(var0, (class00392)DataFixUtils.orElse(var1, y), var2);
   }

   public static class05216 N(String var0) {
      return N(
         (class00392)class00392.y(var0)
            .N(var1 -> var1.N(class06541.field_1060).N(new class00627(var0)).N(new class00401(class00392.L("chat.copy.click"))).N(var0))
      );
   }

   private static class00405 N(@Nullable class07701 var0, class00405 var1, @Nullable class07049 var2, int var3) throws CommandSyntaxException {
      if (var1.z() instanceof class00401 class00401xx) {
         class00401 class00401x = class00401xx;

         try {
            class00392 = class00401x.y();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         class00392 class00392x = class00392;
         class00401 class00401xx = new class00401(N(var0, class00392x, var2, var3 + 1));
         return var1.N(class00401xx);
      } else {
         return var1;
      }
   }

   public static class05216 N(@Nullable class07701 var0, class00392 var1, @Nullable class07049 var2, int var3) throws CommandSyntaxException {
      if (var3 > 100) {
         return var1.L();
      } else {
         class05216 class05216 = var1.method_10851().N(var0, var2, var3 + 1);

         for (class00392 class00392 : var1.method_10855()) {
            class05216.y(N(var0, class00392, var2, var3 + 1));
         }

         return class05216.L(N(var0, var1.method_10866(), var2, var3));
      }
   }

   public static Optional<class05216> N(@Nullable class07701 var0, Optional<class00392> var1, @Nullable class07049 var2, int var3) throws CommandSyntaxException {
      return var1.isPresent() ? Optional.of(N(var0, (class00392)var1.get(), var2, var3)) : Optional.empty();
   }

   @CheckReturnValue
   public static class00392 N(class00392 var0, class00405 var1) {
      if (var1.B()) {
         return var0;
      } else {
         class00405 class00405 = var0.method_10866();
         if (class00405.B()) {
            return var0.L().y(var1);
         } else {
            return (class00392)(class00405.equals(var1) ? var0 : var0.L().y(class00405.N(var1)));
         }
      }
   }

   public static class00392 N(Collection<? extends class00392> var0, class00392 var1) {
      return N(var0, var1, Function.identity());
   }

   @CheckReturnValue
   public static class05216 N(class05216 var0, class00405 var1) {
      if (var1.B()) {
         return var0;
      } else {
         class00405 class00405 = var0.method_10866();
         if (class00405.B()) {
            return var0.y(var1);
         } else {
            return class00405.equals(var1) ? var0 : var0.y(class00405.N(var1));
         }
      }
   }

   public static <T extends Comparable<T>> class00392 N(Collection<T> var0, Function<T, class00392> var1) {
      if (var0.isEmpty()) {
         return class05220.N;
      } else if (var0.size() == 1) {
         return (class00392)var1.apply((Comparable)var0.iterator().next());
      } else {
         ArrayList arraylist = Lists.newArrayList(var0);
         arraylist.sort(Comparable::compareTo);
         return y(arraylist, var1);
      }
   }

   public static class00392 N(Collection<String> var0) {
      return N(var0, var0x -> class00392.y(var0x).N(class06541.field_1060));
   }
}
