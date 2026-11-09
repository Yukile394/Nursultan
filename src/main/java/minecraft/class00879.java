package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class class00879 implements ArgumentType<EnumSet<class07185>> {
   private static final Collection<String> N = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("arguments.swizzle.invalid"));

   public class00879() {
      super();
   }

   public EnumSet<class07185> parse(StringReader var1) throws CommandSyntaxException {
      EnumSet<class07185> enumset = EnumSet.noneOf(class07185.class);

      while (var1.canRead() && var1.peek() != ' ') {
         class07185 class07185 = switch (var1.read()) {
            case 'x' -> class07185.field_11048;
            case 'y' -> class07185.field_11052;
            case 'z' -> class07185.field_11051;
            default -> throw y.createWithContext(var1);
         };
         if (enumset.contains(class07185)) {
            throw y.createWithContext(var1);
         }

         enumset.add(class07185);
      }

      return enumset;
   }

   public static class00879 N() {
      return new class00879();
   }

   public static EnumSet<class07185> N(CommandContext<class07701> var0, String var1) {
      return (EnumSet<class07185>)var0.getArgument(var1, EnumSet.class);
   }

   public Collection<String> getExamples() {
      return N;
   }
}
