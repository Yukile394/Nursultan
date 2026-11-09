package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class06793 extends class08520<class06805> {
   private static final Collection<String> Z = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("argument.item.id.invalid", var0));
   static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("arguments.item.tag.unknown", var0));
   static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("arguments.item.component.unknown", var0));
   static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("arguments.item.component.malformed", var0, var1)
   );
   static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(var0 -> class00392.y("arguments.item.predicate.unknown", var0));
   static final Dynamic2CommandExceptionType R = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("arguments.item.predicate.malformed", var0, var1)
   );
   private static final class01894 z = class01894.y("count");
   static final Map<class01894, class06797> M = Stream.of(new class06797(z, var0 -> true, class00836.u.map(var0 -> var1 -> var0.u(var1.c()))))
      .collect(Collectors.toUnmodifiableMap(class06797::N, var0 -> (class06797)var0));
   static final Map<class01894, class06764> B = Stream.of(new class06764(z, class00836.u.map(var0 -> var1 -> var0.u(var1.c()))))
      .collect(Collectors.toUnmodifiableMap(class06764::N, var0 -> (class06764)var0));

   public class06793(class04348 var1) {
      super(class02192.N(new class06803(var1)).N(var0 -> class07536.N(var0)::test));
   }

   public static class06805 N(CommandContext<class07701> var0, String var1) {
      return (class06805)var0.getArgument(var1, class06805.class);
   }

   public static class06793 N(class04348 var0) {
      return new class06793(var0);
   }

   public static class06764 N(class03529<class02477<?>> var0) {
      Predicate predicate = var1x -> var1x.L((class02477<?>)var0.N());
      return new class06764(var0.B().N(), class06244.field_51563.map(var1x -> predicate));
   }

   public Collection<String> getExamples() {
      return Z;
   }
}
