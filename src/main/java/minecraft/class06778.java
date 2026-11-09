package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class06778 {
   private static final Dynamic2CommandExceptionType N = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("arguments.item.overstacked", var0, var1)
   );
   private final class03556<class06581> y;
   private final class02678 L;

   public class06778(class03556<class06581> var1, class02678 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   private String y() {
      return this.y.i().map(class05946::N).orElseGet(() -> "unknown[" + this.y + "]").toString();
   }

   private String y(class01929 var1) {
      class03519 class03519 = var1.N(class07713.N);
      return this.L
         .y()
         .stream()
         .flatMap(
            var1x -> {
               class02477 class02477 = var1x.getKey();
               class01894 class01894 = class04206.NW.y(class02477);
               if (class01894 == null) {
                  return Stream.empty();
               } else {
                  Optional optional = var1x.getValue();
                  return optional.isPresent()
                     ? class02480.N(class02477, optional.get()).N(class03519).result().stream().map(var1xx -> class01894.toString() + "=" + var1xx)
                     : Stream.of("!" + class01894.toString());
               }
            }
         )
         .collect(Collectors.joining(String.valueOf(',')));
   }

   public String N(class01929 var1) {
      StringBuilder stringbuilder = new StringBuilder(this.y());
      String s = this.y(var1);
      if (!s.isEmpty()) {
         stringbuilder.append('[');
         stringbuilder.append(s);
         stringbuilder.append(']');
      }

      return stringbuilder.toString();
   }

   public class06581 N() {
      return this.y.N();
   }

   public class06584 N(int var1, boolean var2) throws CommandSyntaxException {
      class06584 class06584 = new class06584(this.y, var1);
      class06584.y(this.L);
      if (var2 && var1 > class06584.U()) {
         throw N.create(this.y(), class06584.U());
      } else {
         return class06584;
      }
   }
}
