package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class class07759 implements ArgumentType<class07793> {
   private static final Collection<String> R = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("arguments.nbtpath.node.invalid"));
   public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("arguments.nbtpath.too_deep"));
   public static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("arguments.nbtpath.nothing_found", var0));
   static final DynamicCommandExceptionType u = new DynamicCommandExceptionType(var0 -> class00392.y("commands.data.modify.expected_list", var0));
   static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(var0 -> class00392.y("commands.data.modify.invalid_index", var0));
   private static final char M = '[';
   private static final char B = ']';
   private static final char Z = '{';
   private static final char z = '}';
   private static final char U = '"';
   private static final char E = '\'';

   public class07759() {
      super();
   }

   private static String y(StringReader var0) throws CommandSyntaxException {
      int ix = var0.getCursor();

      while (var0.canRead() && N(var0.peek())) {
         var0.skip();
      }

      if (var0.getCursor() == ix) {
         throw N.createWithContext(var0);
      } else {
         return var0.getString().substring(ix, var0.getCursor());
      }
   }

   private static boolean N(char var0) {
      return var0 != ' ' && var0 != '"' && var0 != '\'' && var0 != '[' && var0 != ']' && var0 != '.' && var0 != '{' && var0 != '}';
   }

   public static class07759 N() {
      return new class07759();
   }

   public class07793 parse(StringReader var1) throws CommandSyntaxException {
      ArrayList arraylist = Lists.newArrayList();
      int ix = var1.getCursor();
      Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();
      boolean flag = true;

      while (var1.canRead() && var1.peek() != ' ') {
         class07773 class07773 = N(var1, flag);
         arraylist.add(class07773);
         object2intopenhashmap.put(class07773, var1.getCursor() - ix);
         flag = false;
         if (var1.canRead()) {
            char c0 = var1.peek();
            if (c0 != ' ' && c0 != '[' && c0 != '{') {
               var1.expect('.');
            }
         }
      }

      return new class07793(var1.getString().substring(ix, var1.getCursor()), arraylist.toArray(new class07773[0]), object2intopenhashmap);
   }

   private static class07773 N(StringReader var0, boolean var1) throws CommandSyntaxException {
      return (class07773)(switch (var0.peek()) {
         case '"', '\'' -> N(var0, var0.readString());
         case '[' -> {
            var0.skip();
            char c0 = var0.peek();
            if (c0 == '{') {
               class07001 class07001 = class07755.L(var0);
               var0.expect(']');
               yield new class07762(class07001);
            } else if (c0 == ']') {
               var0.skip();
               yield class07782.N;
            } else {
               int ix = var0.readInt();
               var0.expect(']');
               yield new class07777(ix);
            }
         }
         case '{' -> {
            if (!var1) {
               throw N.createWithContext(var0);
            }

            class07001 class07001x = class07755.L(var0);
            yield new class07799(class07001x);
         }
         default -> N(var0, y(var0));
      });
   }

   private static class07773 N(StringReader var0, String var1) throws CommandSyntaxException {
      if (var1.isEmpty()) {
         throw N.createWithContext(var0);
      } else if (var0.canRead() && var0.peek() == '{') {
         class07001 class07001 = class07755.L(var0);
         return new class07779(var1, class07001);
      } else {
         return new class07805(var1);
      }
   }

   public static class07793 N(CommandContext<class07701> var0, String var1) {
      return (class07793)var0.getArgument(var1, class07793.class);
   }

   static Predicate<class07709> N(class07001 var0) {
      return var1 -> class07717.N(var0, var1, true);
   }

   public Collection<String> getExamples() {
      return R;
   }
}
